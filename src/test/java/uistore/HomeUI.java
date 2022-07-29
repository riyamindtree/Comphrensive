package uistore;

import org.openqa.selenium.By;

public class HomeUI {
	
	public static By searchBox=By.xpath("//input[@placeholder='Search']");
	
	public static By button=By.xpath("//button[@type='submit']");
	
	public static By closePopUp = By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']");
	
	public static By results=By.xpath("//div[@class='product-preview-content'] //a[@class='product-preview-title']");
	
	public static By shopProducts=By.xpath("//a[@data-action-detail='Shop Products']");
    
	public static By liquid = By.xpath("(//a[@data-action-detail='Liquid'])[1]");
    
    public static By byNeed =By.xpath("//a[@data-action-detail='/en-us/shop/type/laundry-pods/tide-hygienic-clean-heavy-duty-10x-power-pods-original']");
  
    public static By learnMore =By.xpath("//div[@class='hero-card theme-cta-secondary active']//a[@class='button-link event_button_click secondary']");
    
    public static By whatNew =By.xpath("//a[contains(text(),'What’s New')]");
   
    public static By senstive = By.xpath("//div[@class='expandable-content__content']//span[@itemprop='name'][normalize-space()='Sensitive']");
   
    public static By contact = By.xpath("//div[@aria-label='Menu']/child::a[@href='/en-us/contact-us']");

    public static By commitment = By.xpath("//a[normalize-space()='Our Commitment']");
   
    public static By safety = By.xpath("//a[normalize-space()='Ingredients and Safety']");
    
    public static By washClothes = By.xpath("//a[normalize-space()='How to Wash Clothes']");

    public static By fabric = By.xpath("//p[normalize-space()='The Art of Washing Different Fabrics and Colors']");

    public static By coupons = By.xpath("//a[normalize-space()='Coupons and Rewards']");

    public static By whiteness = By.xpath("//div[contains(@class,'expandable-content__content')]//span[contains(@itemprop,'name')][normalize-space()='Whiteness']");
}
