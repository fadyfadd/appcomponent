package fadyfadd.appcomponent.xml;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.*;
import java.io.*;

public class SimpleParser {

	static String xmlValue = "<baeldung>" +
    "<articles>" +
	        "<article>" +
	            "<title>Parsing an XML File Using SAX Parser</title>" +            
	            "<content>SAX Parser's Lorem ipsum...</content>" +
	        "</article>" +
	        "<article>" +
	            "<title>Parsing an XML File Using DOM Parser</title>" +
	            "<content>DOM Parser's Lorem ipsum...</content>" +
	        "</article>" +
	        "<article>" +
	            "<title>Parsing an XML File Using StAX Parser</title>" +
	            "<content>StAX's Lorem ipsum...</content>" +
	        "</article>" +
	    "</articles>" +
    "</baeldung>";
	
	public static void main(String[] args) {
		
		   SAXParserFactory spf = SAXParserFactory.newInstance();
		    spf.setNamespaceAware(true);
		    try {
				SAXParser saxParser = spf.newSAXParser();
				spf.setNamespaceAware(true);
	            InputSource src = new InputSource(new StringReader(xmlValue));
	          
			saxParser.parse(src , new DefaultHandler());
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
