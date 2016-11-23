/**
 * 
 */
package fr.epita.iam.iamlog.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

import fr.epita.iam.iamlog.IamLogger;

/**
 * @author tbrou
 *
 */
public class IamLogManagerLogj2Internal {
	
	
	public static IamLogger getLogger(Class<?> clazz){
		LoggerContext context = (LoggerContext) LogManager.getContext(clazz.getClassLoader(), false);
		return new IamLoggerLog4j2Impl(context, clazz.getName(), LogManager.getLogger().getMessageFactory());
	}
	
	public static IamLogger getLogger(String className){
		LoggerContext context = (LoggerContext) LogManager.getContext(IamLogManagerLogj2Internal.class.getClassLoader(), false);
		return new IamLoggerLog4j2Impl(context, className, LogManager.getLogger().getMessageFactory());
	}

}
