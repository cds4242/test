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

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class TbWatcherInfo.
 */
@Entity
@Table(name = "TB_WATCHER_INFO")
public class TbWatcherInfo implements java.io.Serializable {

	/** The id. */
	private TbWatcherInfoId id;
	
	/** The info value. */
	private String infoValue;

	/**
	 * Instantiates a new tb watcher info.
	 */
	public TbWatcherInfo() {
	}

	/**
	 * Instantiates a new tb watcher info.
	 *
	 * @param id the id
	 */
	public TbWatcherInfo(TbWatcherInfoId id) {
		this.id = id;
	}

	/**
	 * Instantiates a new tb watcher info.
	 *
	 * @param id the id
	 * @param infoValue the info value
	 */
	public TbWatcherInfo(TbWatcherInfoId id, String infoValue) {
		this.id = id;
		this.infoValue = infoValue;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "infoId", column = @Column(name = "INFO_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "infoSubId", column = @Column(name = "INFO_SUB_ID", nullable = false, length = 50)),
			@AttributeOverride(name = "infoTarget", column = @Column(name = "INFO_TARGET", nullable = false, length = 100)) })
	public TbWatcherInfoId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(TbWatcherInfoId id) {
		this.id = id;
	}

	/**
	 * Gets the info value.
	 *
	 * @return the info value
	 */
	@Column(name = "INFO_VALUE", length = 20)
	public String getInfoValue() {
		return this.infoValue;
	}

	/**
	 * Sets the info value.
	 *
	 * @param infoValue the new info value
	 */
	public void setInfoValue(String infoValue) {
		this.infoValue = infoValue;
	}

}
