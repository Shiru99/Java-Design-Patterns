package Creational.abstract_factory;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class AbstractFactoryEverydayDemo {

	public static void main (String args[]) throws Exception {
		
		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream byteStream = new ByteArrayInputStream(xml.getBytes());
		
		DocumentBuilderFactory abstract_factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstract_factory.newDocumentBuilder();
		Document doc = factory.parse(byteStream);

		doc.getDocumentElement().normalize();
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		System.out.println(abstract_factory.getClass());
		System.out.println(factory.getClass());
	}
}
