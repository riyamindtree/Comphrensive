package PageObjects;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.ArticleUI;
import uistore.SearchUI;
import utilities.Logs;

public class ArticlePage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public ArticlePage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
public String curtainArticleOpen() {
		helper.explicitWaitForInvisibilty(ArticleUI.heading5, 80);
		String text = helper.getText(ArticleUI.heading5);
		return text;
	}
	
	
public String verifyHeading() {
		helper.explicitWaitForInvisibilty(ArticleUI.mainHeading, 80);
		String text = helper.getText(ArticleUI.mainHeading);
		return text;
	}
	
public void clickHowToUseClothes() {
	    helper.explicitWaitForInvisibilty(ArticleUI.careClothes, 80);
		helper.clickButton(ArticleUI.careClothes);
		log.info(" Clicked on how to use the clothes article ");
		
	}
	
public String verifyArticleHeading() {
		helper.explicitWaitForInvisibilty(ArticleUI.articleHeading, 80);
		String text = helper.getText(ArticleUI.articleHeading);
		return text;
	}

public String verifyTabHeading() {
	helper.explicitWaitForInvisibilty(ArticleUI.tabHeading, 80);
	String text = helper.getText(ArticleUI.tabHeading);
	return text;
	
    }
	
	

}
