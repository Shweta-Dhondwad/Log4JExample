package com.mkyong;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
		
		logger.trace("This is trace  ");
		logger.debug("This is debug  ");
		logger.info("This is info  ");
		logger.warn("This is warn  " );
		logger.error("This is error  " );
		logger.fatal("This is fatal  ");

	}
	
}