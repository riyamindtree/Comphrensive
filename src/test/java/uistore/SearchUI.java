package uistore;

import org.openqa.selenium.By;

public class SearchUI {
	
    public static By result1 = By.xpath("(//a[@class='product-preview-title'])[1]");
   
    public static By result4  = By.xpath("(//a[@class='product-preview-title'])[4]");
    
    public static By topHeading = By.xpath("\\h1");
    
    public static By secondTab = By.xpath("//span[@aria-label='Link to Joining forces to drive next impactful eco-habit section']");
    
    public static By readMore =By.xpath("(//a[@class='article-preview-link'])[6]");
    
    public static By sensitiveSkinHeading = By.xpath("//strong[normalize-space()='Detergent for Sensitive Skin']");
    
    public static By learnMore4 = By.xpath("//a[@href='/en-us/our-commitment/ingredients-and-safety/tide-detergent-ingredients-a-to-z'][normalize-space()='Learn More']");
    
    public static By tagPnG = By.xpath("//strong[normalize-space()='Your purchases can go even further with']");
    
    public static By findRetailer = By.xpath("(//span[contains(text(),'Find Retailers')])[3]");
    
    public static By productStatus = By.xpath("//div[@class='ps-container ps-lightbox ps-59923902a81961211a377174 ps-open']//h1[@class='ps-product-name'][contains(text(),'Tide Brights + Whites Rescue™ - Active Fresh')]");
}
