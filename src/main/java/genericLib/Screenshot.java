package genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public void getScreenshot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(AutoConstant.photoPath+name+".png");
		FileUtils.copyFile(src, trg);
	}

}
