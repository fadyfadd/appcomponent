package fadyfadd.appcomponent.xml;

 import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BasicXmlHandler extends DefaultHandler {
    private static final String ARTICLES = "articles";
    private static final String ARTICLE = "article";
    private static final String TITLE = "title";
    private static final String CONTENT = "content";

    private StringBuilder elementValue;  
    public WebStore webStore = null; 
   

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length); 
        }
    } 
    
    @Override
    public void startDocument() {
    	webStore = new WebStore();
    }
    
    @Override
    public void endDocument() {
    
    }   
    
    
    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
        switch (qName) {
            case ARTICLES:
                webStore.setArticles(new ArrayList<Article>());
                break;
            case ARTICLE:
               webStore.getArticles().add(new Article());
                break;
            case TITLE:
                elementValue = new StringBuilder();
                break;
            case CONTENT:
                elementValue = new StringBuilder();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case TITLE:
                latestArticle().setTitle(elementValue.toString());
                break;
            case CONTENT:
                latestArticle().setContent(elementValue.toString());
                break;
        }
    }

    private Article latestArticle() {
        List<Article> articleList = webStore.getArticles();
        int latestArticleIndex = articleList.size() - 1;
        return articleList.get(latestArticleIndex);
    }

    public WebStore getWebsite() {
        return webStore;
    }
}