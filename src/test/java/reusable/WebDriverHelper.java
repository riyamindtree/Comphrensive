package reusable;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class WebDriverHelper extends BaseClass{
	
	
	public void sendText(By element,String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public String getText(By element) {
		String text=null;
		text=driver.findElement(element).getText();
		return text;
	} 
	
	public void clickButton(By element) {
		driver.findElement(element).click();
	}
	public void enterButton(By element) {
		driver.findElement(element).sendKeys(Keys.ENTER);
	}
	
	public void switchHandles(int index) {
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(index));
	}
	
	public void hover(By element) {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(element)).perform();
	}
	
	public void clearText(By element) {
		driver.findElement(element).clear();
	}
	
	public void explicitWaitForInvisibilty(By element,int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
    public void scrollUntilVisible(By element, int x) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)"," ");
	}


}
