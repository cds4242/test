/*
 * Copyright (C) 2012 - 2013, KONA I Co.Ltd.
 * All rights reserved.
 *
 * This program is a property of KONA I. you can not redistribute it and/or modify it
 * without any permission of KONA I.
 *
 * @Author			: Choi Dong-sik (dschoi@konai.com)
 */
package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.TbWatcherInfo;
import com.example.jpa.TbWatcherInfoId;

// TODO: Auto-generated Javadoc
/**
 * The Interface TbWatcherInfoDao.
 */
public interface TbWatcherInfoDao extends JpaRepository<TbWatcherInfo, TbWatcherInfoId> {

	/* (non-Javadoc)
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	@Override
	List<TbWatcherInfo> findAll();
}
