package com.mpool.common.model;

import java.util.Date;

public class Roles {
	/**
	 * 主键角色Id
	 */
	private Integer roleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 权限组
	 */
	private String grantId;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 0 删除 1有效
	 */
	private String releFlag;
}
