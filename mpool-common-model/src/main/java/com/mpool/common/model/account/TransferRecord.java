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
public class TransferRecord implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer puid;
	private Date transferAt;
	private Integer transferSotashi;
	private String transferId;


	public Integer getPuid() {
		return puid;
	}

	public void setPuid(Integer puid) {
		this.puid = puid;
	}

	public Date getTransferAt() {
		return transferAt;
	}

	public void setTransferAt(Date transferAt) {
		this.transferAt = transferAt;
	}

	public Integer getTransferSotashi() {
		return transferSotashi;
	}

	public void setTransferSotashi(Integer transferSotashi) {
		this.transferSotashi = transferSotashi;
	}

	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	@Override
	public String toString() {
		return "TransferRecord{" +
			"puid=" + puid +
			", transferAt=" + transferAt +
			", transferSotashi=" + transferSotashi +
			", transferId=" + transferId +
			"}";
	}
}
