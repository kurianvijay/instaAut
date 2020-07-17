import CommonFunctions.CommonFunctions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends CommonFunctions {

    @Before
    public void beforeTest(){

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        cFObject.openBrowser();
    }

    @After
    public void afterTest(){
//        driver.quit();
        cFObject.closeBrowser();
    }
}
