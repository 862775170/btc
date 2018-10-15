package com.mpool.common.model;

import java.util.Date;

public class LogEmail {
	/**
	 * 主键
	 */
	private Integer emaliId;

	/**
	 * 发送目标ID
	 */
	private Integer emaliUserId;

	/**
	 * 邮箱内容
	 */
	private String emaliContent;

	/**
	 * 邮箱号
	 */
	private String emali;

	/**
	 * 邮件服务地址
	 */
	private String emaliFunc;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 邮件中的验证码
	 */
	private String emaliCode;
}
