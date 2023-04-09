package Utils;

import Steps.PageInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){
        ConfigReader.readProperty(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getProperty("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        initializePageObject();
    }
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void selectDropdown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
        select.selectByValue(text);
    }

    public static void closeBrowser(){
        driver.quit();
    }




}
