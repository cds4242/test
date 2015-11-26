/*
 * Copyright (C) 2012 - 2013, KONA I Co.Ltd.
 * All rights reserved.
 *
 * This program is a property of KONA I. you can not redistribute it and/or modify it
 * without any permission of KONA I.
 *
 * @Author			: Choi Dong-sik (dschoi@konai.com)
 */
package com.example.jpa;

// Generated 2015. 8. 21 ���� 2:52:45 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

// TODO: Auto-generated Javadoc
/**
 * The Class TbWatcherInfoId.
 */
@Embeddable
public class TbWatcherInfoId implements java.io.Serializable {

	/** The info id. */
	private String infoId;
	
	/** The info sub id. */
	private String infoSubId;
	
	/** The info target. */
	private String infoTarget;

	/**
	 * Instantiates a new tb watcher info id.
	 */
	public TbWatcherInfoId() {
	}

	/**
	 * Instantiates a new tb watcher info id.
	 *
	 * @param infoId the info id
	 * @param infoSubId the info sub id
	 * @param infoTarget the info target
	 */
	public TbWatcherInfoId(String infoId, String infoSubId, String infoTarget) {
		this.infoId = infoId;
		this.infoSubId = infoSubId;
		this.infoTarget = infoTarget;
	}

	/**
	 * Gets the info id.
	 *
	 * @return the info id
	 */
	@Column(name = "INFO_ID", nullable = false, length = 20)
	public String getInfoId() {
		return this.infoId;
	}

	/**
	 * Sets the info id.
	 *
	 * @param infoId the new info id
	 */
	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	/**
	 * Gets the info sub id.
	 *
	 * @return the info sub id
	 */
	@Column(name = "INFO_SUB_ID", nullable = false, length = 50)
	public String getInfoSubId() {
		return this.infoSubId;
	}

	/**
	 * Sets the info sub id.
	 *
	 * @param infoSubId the new info sub id
	 */
	public void setInfoSubId(String infoSubId) {
		this.infoSubId = infoSubId;
	}

	/**
	 * Gets the info target.
	 *
	 * @return the info target
	 */
	@Column(name = "INFO_TARGET", nullable = false, length = 100)
	public String getInfoTarget() {
		return this.infoTarget;
	}

	/**
	 * Sets the info target.
	 *
	 * @param infoTarget the new info target
	 */
	public void setInfoTarget(String infoTarget) {
		this.infoTarget = infoTarget;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbWatcherInfoId))
			return false;
		TbWatcherInfoId castOther = (TbWatcherInfoId) other;

		return ((this.getInfoId() == castOther.getInfoId()) || (this.getInfoId() != null && castOther.getInfoId() != null && this.getInfoId().equals(
				castOther.getInfoId())))
				&& ((this.getInfoSubId() == castOther.getInfoSubId()) || (this.getInfoSubId() != null && castOther.getInfoSubId() != null && this
						.getInfoSubId().equals(castOther.getInfoSubId())))
				&& ((this.getInfoTarget() == castOther.getInfoTarget()) || (this.getInfoTarget() != null && castOther.getInfoTarget() != null && this
						.getInfoTarget().equals(castOther.getInfoTarget())));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getInfoId() == null ? 0 : this.getInfoId().hashCode());
		result = 37 * result + (getInfoSubId() == null ? 0 : this.getInfoSubId().hashCode());
		result = 37 * result + (getInfoTarget() == null ? 0 : this.getInfoTarget().hashCode());
		return result;
	}

}
