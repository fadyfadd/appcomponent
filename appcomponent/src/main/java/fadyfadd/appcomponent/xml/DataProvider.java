package fadyfadd.appcomponent.xml;

public class DataProvider {

	

	static private String xmlValue = "<store>" +
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
    "</store>";
	
	public static String GetStoreItems() {
		return xmlValue; 
		
	}
}
