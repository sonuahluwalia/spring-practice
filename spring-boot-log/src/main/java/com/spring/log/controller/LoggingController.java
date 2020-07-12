package com.spring.log.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

@Component
//@Slf4j
//@Log4j2
public class LoggingController {

	// sl4j default spring
//    Logger logger = LoggerFactory.getLogger(LoggingController.class);

	// Log4j2 native
//    Logger logger = LogManager.getLogger(LoggingController.class);
	@Bean
	public void index() {
//        logger.trace("A TRACE Message");
//        logger.debug("A DEBUG Message");
//        logger.info("An INFO Message");
//        logger.warn("A WARN Message");
//        logger.error("An ERROR Message");

		// @Slf4j //@Log4j2
//		log.trace("A TRACE Message");
//		log.debug("A DEBUG Message");
//		log.info("An INFO Message");
//		log.warn("A WARN Message");
//		log.error("An ERROR Message");
		
	}
}