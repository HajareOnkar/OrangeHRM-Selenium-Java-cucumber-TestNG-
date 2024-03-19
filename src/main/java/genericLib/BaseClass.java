package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	PropertyFile pdata=new PropertyFile();
	
	
	 @BeforeMethod
	   public void openApp() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		}
       	
	
	
//	@BeforeMethod
//	public void openApp() throws IOException {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Onkar.hajare\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(pdata.getPropertyFile("URL"));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		
//	}
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException {
		String name=result.getName();
		int status=result.getStatus();
		if(status==1) {
		Screenshot ss=new Screenshot();
		ss.getScreenshot(driver, name);}
		driver.close();
		driver.quit();
	}

}
