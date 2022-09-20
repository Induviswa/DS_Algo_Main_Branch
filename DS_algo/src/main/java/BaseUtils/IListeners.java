package BaseUtils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class IListeners extends BrowserConfig implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
            saveScreenshotOnFailure(driver);
    }

    @Attachment(value = "Screenshot",type = "image/png")
    public void saveScreenshotOnFailure(WebDriver driver) {
        //Attach screen shot in allure report
        Allure.addAttachment("ScreenShot",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

        //Attach screen shot in program
        /*TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
        String getdir = System.getProperty("user.dir");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String filepath = getdir+"/src/Screenshot/"+"screenshot1"+timestamp+".png";
        System.out.println(filepath);
        File desscreenshot = new File(filepath);
        FileUtils.copyFile(srcfile,desscreenshot);
        return srcfile;
         */
    }
}
