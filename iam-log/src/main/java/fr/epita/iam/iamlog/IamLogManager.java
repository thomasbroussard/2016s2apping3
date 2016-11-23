/**
 * 
 */
package fr.epita.iam.iamlog;

import fr.epita.iam.iamlog.impl.IamLogManagerLogj2Internal;

/**
 * @author tbrou
 *
 */
public class IamLogManager {

	static{
		IamLogger iamLogger = getIamLogger(IamLogManager.class);
		iamLogger.info("début de la trace");
		iamLogger.info("implementation : "+ iamLogger.getClass().getSimpleName());
	}
	
	public static IamLogger getIamLogger(Class<?> clazz){
		return IamLogManagerLogj2Internal.getLogger(clazz);
		
	}
	
	public static IamLogger getIamLogger(String className){
		return IamLogManagerLogj2Internal.getLogger(className);
		
	}
	
}
