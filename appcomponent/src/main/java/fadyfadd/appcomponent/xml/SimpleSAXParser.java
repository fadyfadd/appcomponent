package fadyfadd.appcomponent.xml;
import javax.xml.parsers.*;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;
import java.io.*;

public class SimpleSAXParser {

	
	public static void main(String[] args) {		
		
	 
		   SAXParserFactory spf = SAXParserFactory.newInstance();
		    spf.setNamespaceAware(true);
		    try {
				SAXParser saxParser = spf.newSAXParser();
				spf.setNamespaceAware(true);
	            InputSource src = new InputSource(new StringReader(DataProvider.GetStoreItems()));
	           
	        BasicXmlHandler hand =  new BasicXmlHandler();  
			saxParser.parse(src , hand);
			WebStore store =  hand.getWebsite();
			System.out.print(store);
			
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
