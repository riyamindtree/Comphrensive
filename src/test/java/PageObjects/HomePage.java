package PageObjects;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.HomeUI;
import utilities.Logs;

public class HomePage {
	
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public HomePage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
public void searchingBox(String text) {
		helper.explicitWaitForInvisibilty(HomeUI.searchBox, 80);
		helper.sendText(HomeUI.searchBox, text);
		
	}
	
	
	
	
public void clickSearchButton() {
		
		helper.explicitWaitForInvisibilty(HomeUI.button,80);
		helper.clickButton(HomeUI.button);
		
	}

public void clickClosePopUp() {
	
	helper.explicitWaitForInvisibilty(HomeUI.closePopUp, 80);
	helper.clickButton(HomeUI.closePopUp);
	
}


public void hoverOnShopProduct() {
	helper.explicitWaitForInvisibilty(HomeUI.shopProducts, 80);
	helper.hover(HomeUI.shopProducts);
	
}

public void clickOnLiquid() {
	helper.explicitWaitForInvisibilty(HomeUI.liquid, 20);
	helper.clickButton(HomeUI.liquid);
	
}


public void clickAdditivesFromByNeed() {
	helper.scrollUntilVisible(HomeUI.byNeed, 80);
	helper.clickButton(HomeUI.byNeed);
	log.info(" Clicked on Additives in footer section  ");
	
}

public void clickOnLearnMoreButton() {
	helper.explicitWaitForInvisibilty(HomeUI.learnMore, 20);
	helper.clickButton(HomeUI.learnMore);
	
}

public void clickOnWhatNewTab() {
	helper.explicitWaitForInvisibilty(HomeUI.whatNew, 20);
	helper.clickButton(HomeUI.whatNew);
	log.info(" Clicked on what's new ");
}


public void clickOnDeepClean() {
	
	helper.scrollUntilVisible(HomeUI.senstive, 90);
	helper.clickButton(HomeUI.senstive);
	log.info(" Clicked on deep clean ");
}

public void clickOnContactTab() {
	helper.explicitWaitForInvisibilty(HomeUI.contact, 20);
	helper.clickButton(HomeUI.contact);
	log.info(" Clicked on the contact tab ");
}

public void hoverOnCommitment() {
	helper.explicitWaitForInvisibilty(HomeUI.commitment, 80);
	helper.hover(HomeUI.commitment);

}

public void clickOnSafety() {
	
	helper.explicitWaitForInvisibilty(HomeUI.safety, 80);
	helper.clickButton(HomeUI.safety);
}

public void washClothesTab() {
	
	helper.explicitWaitForInvisibilty(HomeUI.washClothes, 80);
	helper.clickButton(HomeUI.washClothes);
	
}

public void clickFabricTab() {
	
	helper.explicitWaitForInvisibilty(HomeUI.fabric, 80);
	helper.clickButton(HomeUI.fabric);
	
}

public void clickOnCoupons() {
	
	helper.explicitWaitForInvisibilty(HomeUI.coupons, 80);
	helper.clickButton(HomeUI.coupons);
	
}

public void clickOnLaundryInFooter() {
	

    helper.scrollUntilVisible(HomeUI.whiteness, 80);
	helper.clickButton(HomeUI.whiteness);
	
}


}


