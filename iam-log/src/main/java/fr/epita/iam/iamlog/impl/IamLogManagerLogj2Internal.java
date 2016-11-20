/**
 * 
 */
package fr.epita.iam.iamlog.impl;

import fr.epita.iam.iamlog.IamLogger;

/**
 * @author tbrou
 *
 */
public class IamLogManagerLogj2Internal {
	
	
	public static IamLogger getLogger(Class<?> clazz){
		return new IamLoggerLog4j2Impl(context, name, messageFactory);
	}
	
	public static IamLogger getLogger(String className){
		return new IamLoggerLog4j2Impl(context, name, messageFactory);
	}

}
