package BaseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserConfig extends readdatafromJson{

public static WebDriver driver;

public static void initialization(){
        System.setProperty("webdriver.chrome.driver","/Users/Indu/Indu_Files/DS_algo/src/main/resources/Browsers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://dsportalapp.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closebrowser(){
        driver.quit();
    }
}
