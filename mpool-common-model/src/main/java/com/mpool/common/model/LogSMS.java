package com.mpool.common.model;

import java.util.Date;

/**
 * @author chen 短信记录表
 */
public class LogSMS {
	/**
	 * 主键
	 */
	private Integer smsId;

	/**
	 * 发送目标ID
	 */
	private Integer smsUserId;

	/**
	 * 短信类容
	 */
	private String smsContent;

	/**
	 * 短信号码
	 */
	private String smsPhoneNumber;

	/**
	 * 短信返回值
	 */
	private String smsReturnCode;

	/**
	 * 调用短信的接口
	 */
	private String smsFunc;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 短信中的验证码
	 */
	private String smsCode;

	/**
	 * 短信发送人IP
	 */
	private String smsIP;
}
