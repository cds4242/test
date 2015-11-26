package com.example.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.example.jpa.TbWatcherInfo;
import com.example.repo.TbWatcherInfoDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TestService {


	private static final Logger logger = LoggerFactory.getLogger(TestService.class);

	@Autowired
	private TbWatcherInfoDao tbWatcherInfoDao;

//	@PostConstruct
	public void info() throws JsonProcessingException
	{
		List<TbWatcherInfo> list = tbWatcherInfoDao.findAll();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		logger.info("================================Watcher Data=====================================");
		for (TbWatcherInfo tbWatcherInfo : list) {

			logger.info("WatcherData : {}", new ObjectMapper().writeValueAsString(tbWatcherInfo));
		}
		logger.info("=================================================================================");
		stopWatch.stop();
		logger.info("\n"+stopWatch.prettyPrint());

	}

	@Scheduled(fixedDelay=5000)
	public void sched() throws JsonProcessingException
	{
		info();
	}
}
