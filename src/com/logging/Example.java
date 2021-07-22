package com.logging;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;  
  
public class Example{  
  
   /* Get the class name to be printed on */  
   static Logger myLogger = Logger.getLogger(Example.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{ 
	   System.out.println("Inside main....");
	   String log4jConfPath = "//C:/Users/SHWETA/workspace/Log4jProject/Properties/log.properties";

	   PropertyConfigurator.configure(log4jConfPath);
	     // BasicConfigurator.configure();
	      myLogger.fatal("Hello this is an fatal message"); 
	      myLogger.error("Hello this is an error message"); 
	      myLogger.warn("Hello this is an warn message");
	      myLogger.info("Hello this is an info message");
	      myLogger.debug("Hello this is a debug message");  
	      myLogger.trace("Hello this is a trace message");  
	      
   }  
}  
