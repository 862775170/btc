package com.btc.app.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.btc.app.config.realm.UserRealm;
import com.btc.app.config.shiro.CustomCredentialsMatcher;
import com.btc.app.config.shiro.RestAPIAuthFilter;
import com.btc.app.config.shiro.TokenWebSecurityManager;


@Configuration
public class ShiroConfiguration {

	private static final Logger log = LoggerFactory.getLogger(ShiroConfiguration.class);

	@Bean
	public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
		log.info("securityManager={}", securityManager);
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		Map<String, Filter> filters = new HashMap<String, Filter>();
		filters.put("r", new RestAPIAuthFilter());
		shiroFilterFactoryBean.setFilters(filters);
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		// 注意过滤器配置顺序 不能颠倒
		// 配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了，登出后跳转配置的loginUrl
		filterChainDefinitionMap.put("/logout", "anon");
		// 配置不会被拦截的链接 顺序判断
		filterChainDefinitionMap.put("/user/login", "anon");
		filterChainDefinitionMap.put("/swagger-ui.html", "anon");
		filterChainDefinitionMap.put("/v2/**", "anon");
		filterChainDefinitionMap.put("/configuration/**", "anon");
		filterChainDefinitionMap.put("/getjwt", "anon");
		filterChainDefinitionMap.put("/favicon.ico", "anon");
		filterChainDefinitionMap.put("/webjars/**", "anon");
		filterChainDefinitionMap.put("/images/**", "anon");
		filterChainDefinitionMap.put("/swagger-resources", "anon");
		filterChainDefinitionMap.put("/menu", "anon");
		filterChainDefinitionMap.put("/**", "anon");
		//filterChainDefinitionMap.put("/**", "r");
		shiroFilterFactoryBean.setLoginUrl("/user/login");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	}

	@Bean
	public CustomCredentialsMatcher customCredentialsMatcher() {
		CustomCredentialsMatcher customCredentialsMatcher = new CustomCredentialsMatcher();
		return customCredentialsMatcher;
	}

	@Bean
	public UserRealm userRealm() {
		UserRealm myShiroRealm = new UserRealm();
		myShiroRealm.setCredentialsMatcher(customCredentialsMatcher());
		return myShiroRealm;
	}

	@Bean
	public SecurityManager securityManager() {
		TokenWebSecurityManager securityManager = new TokenWebSecurityManager();
		securityManager.setRealm(userRealm());
		// 自定义session管理 使用redis
		// securityManager.setSessionManager(sessionManager());
		// 自定义缓存实现 使用redis
		// securityManager.setCacheManager(cacheManager());
		return securityManager;
	}
}