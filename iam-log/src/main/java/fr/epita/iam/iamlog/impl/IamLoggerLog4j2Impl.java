/**
 * 
 */
package fr.epita.iam.iamlog.impl;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.message.MessageFactory;

import fr.epita.iam.iamlog.IamLogger;

/**
 * @author tbrou
 *
 */
public class IamLoggerLog4j2Impl extends Logger implements IamLogger{

	/**
	 * @param context
	 * @param name
	 * @param messageFactory
	 */
	protected IamLoggerLog4j2Impl(LoggerContext context, String name, MessageFactory messageFactory) {
		super(context, name, messageFactory);
	}
	
	
	
	
	
	
	

}
