package com.mpool.common.model.account;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public class FoundBlocks implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer puid;
	private Long workerId;
	private String workerFullName;
	private Long jobId;
	private Integer height;
	private Integer isOrphaned;
	private String hash;
	private Long rewards;
	private Integer size;
	private String prevHash;
	private Integer bits;
	private Integer version;
	private Date createdAt;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPuid() {
		return puid;
	}

	public void setPuid(Integer puid) {
		this.puid = puid;
	}

	public Long getWorkerId() {
		return workerId;
	}

	public void setWorkerId(Long workerId) {
		this.workerId = workerId;
	}

	public String getWorkerFullName() {
		return workerFullName;
	}

	public void setWorkerFullName(String workerFullName) {
		this.workerFullName = workerFullName;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getIsOrphaned() {
		return isOrphaned;
	}

	public void setIsOrphaned(Integer isOrphaned) {
		this.isOrphaned = isOrphaned;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Long getRewards() {
		return rewards;
	}

	public void setRewards(Long rewards) {
		this.rewards = rewards;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getPrevHash() {
		return prevHash;
	}

	public void setPrevHash(String prevHash) {
		this.prevHash = prevHash;
	}

	public Integer getBits() {
		return bits;
	}

	public void setBits(Integer bits) {
		this.bits = bits;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "FoundBlocks{" +
			"id=" + id +
			", puid=" + puid +
			", workerId=" + workerId +
			", workerFullName=" + workerFullName +
			", jobId=" + jobId +
			", height=" + height +
			", isOrphaned=" + isOrphaned +
			", hash=" + hash +
			", rewards=" + rewards +
			", size=" + size +
			", prevHash=" + prevHash +
			", bits=" + bits +
			", version=" + version +
			", createdAt=" + createdAt +
			"}";
	}
}
