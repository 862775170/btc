package com.mpool.common.model;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Users implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9020204956664763485L;

	/**
	 * 用户Id
	 */
	private Integer userId;

	/**
	 * 登录名字
	 */
	private String username;

	/**
	 * 安全码
	 */
	private String loginSecret;

	/**
	 * 用户密码
	 */
	private String password;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 用户手机
	 */
	private String userPhone;

	/**
	 * 用户邮箱
	 */
	private String userEmail;

	/**
	 * 用户名称
	 */
	private String nickName;

	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 最后一次登录IP
	 */
	private String lastIP;

	/**
	 * 最后一次登录时间
	 */
	private Date lastTime;

	/**
	 * 用户来源
	 */
	private String userFrom;

	/**
	 * 用户性别
	 */
	private String userSex;
	/**
	 * 用户头像
	 */
	private String userPhoto;

	/**
	 * 账号是否锁定
	 */
	private boolean accountNonLocked;
	/**
	 * 用户账号是否过期
	 */
	private boolean accountNonExpired;
	/**
	 * 用户密码是否失效
	 */
	private boolean credentialsNonExpired;
	/**
	 * 账号是否被禁用
	 */
	private boolean enabled;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginSecret() {
		return loginSecret;
	}

	public void setLoginSecret(String loginSecret) {
		this.loginSecret = loginSecret;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLastIP() {
		return lastIP;
	}

	public void setLastIP(String lastIP) {
		this.lastIP = lastIP;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", loginSecret=" + loginSecret + ", password="
				+ password + ", userType=" + userType + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", nickName=" + nickName + ", createTime=" + createTime + ", lastIP=" + lastIP + ", lastTime="
				+ lastTime + ", userFrom=" + userFrom + ", userSex=" + userSex + ", userPhoto=" + userPhoto
				+ ", accountNonLocked=" + accountNonLocked + ", accountNonExpired=" + accountNonExpired
				+ ", credentialsNonExpired=" + credentialsNonExpired + ", enabled=" + enabled + "]";
	}
}
