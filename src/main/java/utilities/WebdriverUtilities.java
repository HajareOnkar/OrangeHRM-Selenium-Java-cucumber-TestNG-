package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	//dropdown
	public void dropdownValueSelect(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void dropdownValueDeselect(WebElement ele,String value) {
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	
	//Actions
	public void mousehover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement trg) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,trg);
	}
	
	
	//Scrolldown
	public void scrollDown(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	//frame
	public void frame(WebDriver driver,int x) {
		driver.switchTo().frame(x);
	}
	
	public void backToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//popups
	public void alertPopupAccept(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.accept();
		}
	public void alertPopupDismiss(WebDriver driver) {
		Alert al=driver.switchTo().alert();
		al.dismiss();
		}
	
	public void notificationPopup(WebDriver driver) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--dismiss-notifications");
		driver=new ChromeDriver(options);
		}
	
	public void childBrowser(WebDriver driver) {
		 Set<String> handle = driver.getWindowHandles();
		Iterator<String> itorator = handle.iterator();
		String parent=itorator.next();
		String child1=itorator.next();
		driver.switchTo().window(child1);
			
	}
	public void parentBrowser(WebDriver driver){
		  
		String parent = driver.getWindowHandle();
		
		driver.switchTo().window(parent);
			
	}

}
