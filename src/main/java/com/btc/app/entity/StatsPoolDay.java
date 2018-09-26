package com.btc.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2018-09-26
 */
public class StatsPoolDay implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer day;
	private Long shareAccept;
	private Long shareReject;
	private Double rejectRate;
	private BigDecimal score;
	private Long earn;
	private Double lucky;
	private Date createdAt;
	private Date updatedAt;


	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Long getShareAccept() {
		return shareAccept;
	}

	public void setShareAccept(Long shareAccept) {
		this.shareAccept = shareAccept;
	}

	public Long getShareReject() {
		return shareReject;
	}

	public void setShareReject(Long shareReject) {
		this.shareReject = shareReject;
	}

	public Double getRejectRate() {
		return rejectRate;
	}

	public void setRejectRate(Double rejectRate) {
		this.rejectRate = rejectRate;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public Long getEarn() {
		return earn;
	}

	public void setEarn(Long earn) {
		this.earn = earn;
	}

	public Double getLucky() {
		return lucky;
	}

	public void setLucky(Double lucky) {
		this.lucky = lucky;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "StatsPoolDay{" +
			"day=" + day +
			", shareAccept=" + shareAccept +
			", shareReject=" + shareReject +
			", rejectRate=" + rejectRate +
			", score=" + score +
			", earn=" + earn +
			", lucky=" + lucky +
			", createdAt=" + createdAt +
			", updatedAt=" + updatedAt +
			"}";
	}
}
