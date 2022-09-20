package utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void CaptureScreenShot(WebDriver chromedriver, String filePath) throws IOException 
	{
		File file = ((TakesScreenshot)chromedriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(filePath));
		
	}
}
