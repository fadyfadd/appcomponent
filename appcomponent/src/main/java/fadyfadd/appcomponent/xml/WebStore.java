package fadyfadd.appcomponent.xml;

import java.util.ArrayList;
import java.io.Serializable;

import java.util.List;

 
public class WebStore implements Serializable {

	private List<Article> articles = new ArrayList<Article>();

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	public void addArticle(Article article) {		
		articles.add(article);
	}
 
	
}
