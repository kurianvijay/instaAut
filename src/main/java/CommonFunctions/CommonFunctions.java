package CommonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public void closeBrowser(){ driver.quit(); }
}
