/**
 * 
 */
package fr.epita.iam.iamcore.tests;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import fr.epita.iam.webservices.IdentityWebservice;

/**
 * @author tbrou
 *
 */

public class TestWS {

	@Test
	public void testWebservice() throws MalformedURLException {
		URL urlObj = new URL("http://localhost:9080/iam-web/IdentityWebServiceImpl?wsdl");
		String namespaceURI = "http://webservices.iam.epita.fr/";
		QName qname = new QName(namespaceURI, "IdentityWebServiceImplService");
		QName portQName = new QName(namespaceURI, "IdentityWebServiceImplPort");

		Service xmlService = Service.create(urlObj, qname);

		IdentityWebservice auth = (IdentityWebservice) xmlService.getPort(portQName, IdentityWebservice.class);
		int count = auth.countIdentities();
		System.out.println(count);
	}
}
