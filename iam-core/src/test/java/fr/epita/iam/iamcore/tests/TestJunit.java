/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import org.junit.Test;

import fr.epita.iam.iamlog.IamLogManager;
import fr.epita.iam.iamlog.IamLogger;

/**
 * @author tbrou
 *
 */
public class TestJunit {
	
	
	private static final IamLogger logger = IamLogManager.getIamLogger(TestJunit.class);
	
	
	@Test
	public void testJunitConfiguration(){
		logger.error("essai en erreur");
		
		
		logger.info("essai en info");
		
		logger.debug("essai en debug");
	}

}
