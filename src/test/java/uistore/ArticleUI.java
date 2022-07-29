package uistore;

import org.openqa.selenium.By;

public class ArticleUI {

	
	public static By heading5=By.xpath("(//h3)[5]");
	
	public static By mainHeading = By.xpath("//h1[@class='article-intro-title']");
    
	public static By careClothes = By.xpath("//p[normalize-space()='How to Use and Care for Cloth Diapers']");
    
	public static By articleHeading = By.xpath("//h1");
	
	public static By tabHeading = By.xpath("//div[@class='col-lg-6 col-12 left-column']//div[contains(@class,'richtext-container')]");

}
