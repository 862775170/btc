package com.mpool.account.config.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mpool.account.entity.MpoolUser;
import com.mpool.account.service.MpoolUserService;

public class UserRealm extends AuthorizingRealm {

	private static final Logger log = LoggerFactory.getLogger(UserRealm.class);

	@Resource
	private MpoolUserService mpoolUserService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		// String username = principals.getPrimaryPrincipal().toString();

		Object primaryPrincipal = principals.getPrimaryPrincipal();
		// SysUser user = sysUserService.findByUsername(username);
		// Long userId = user.getId();
		// List<SysUserRole> roles = sysUserRoleService.findByUserId(userId);
		// if (roles == null || roles.size() == 0) {
		// log.warn("user={},role is null", user);
		// }
		// Set<Permission> permissions = new TreeSet<Permission>();
		// for (SysUserRole sysUserRole : roles) {
		// List<SysPermis> sysPermis =
		// sysPermisService.findByRoleId(sysUserRole.getRoleId());
		// permissions.addAll(sysPermis);
		// }
		//
		// SimpleAuthorizationInfo simpleAuthorizationInfo = new
		// SimpleAuthorizationInfo();
		// simpleAuthorizationInfo.setObjectPermissions(permissions);
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		if (token.getPrincipal() == null) {
			throw new AuthenticationException();// 没找到帐号
		}
		String username = token.getPrincipal().toString();
		MpoolUser user = mpoolUserService.findByUsername(username);
		if (user == null) {
			throw new AuthenticationException();// 没找到帐号
		}
		AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), // 密码
				getName() // realm name
		);
		return authenticationInfo;
	}

}
