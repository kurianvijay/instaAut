package stepDefinitions;

import CommonFunctions.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps extends CommonFunctions {

CommonFunctions commonFunctionsObject = new CommonFunctions();

    @Given("^I on the registration page \"([^\"]*)\"$")
    public void i_on_the_registration_page(String url) {
        commonFunctionsObject.openBrowser();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='Sign up']")).click();

    }

    @Given("^I add my email \"([^\"]*)\"$")
    public void i_add_my_email(String email)  {
        driver.findElement(By.name("emailOrPhone")).sendKeys(email);
    }

    @Given("^I add my full name \"([^\"]*)\"$")
    public void i_add_my_full_name(String fullName)  {
        driver.findElement(By.name("fullName")).sendKeys(fullName);
    }

    @Given("^I add my username \"([^\"]*)\"$")
    public void i_add_my_username(String userName)  {
        driver.findElement(By.name("username")).sendKeys(userName);
    }

    @Given("^I add my password \"([^\"]*)\"$")
    public void i_add_my_password(String password)  {
        driver.findElement(By.name("password")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Given("^I click the button Next$")
    public void i_click_the_button_Next() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[7]/div/button")).click();
    }

    @When("^I should see the birthday page and I add my month of birth \"([^\"]*)\"$")
    public void i_add_my_month_of_birth(String month) {
        new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[1]/select"))).selectByVisibleText(month);
    }

    @When("^I add my day of birth \"([^\"]*)\"$")
    public void i_add_my_day_of_birth(String day) {
        new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[2]/select"))).selectByVisibleText(day);
    }

    @When("^I add my year of birth \"([^\"]*)\"$")
    public void i_add_my_year_of_birth(String year) {
        new Select(driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[3]/select"))).selectByVisibleText(year);
    }

    @When("^I click the Next button$")
    public void i_click_the_Next_button()  {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[5]/div[2]/button")).click();

    }

    @Then("^I should be able to see the message \"([^\"]*)\"$")
    public void i_should_be_able_to_see_the_message(String expectedText)  {

        String actualText =  driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[2]/div/button")).getText();
        Assert.assertEquals(expectedText,actualText);
    }


}
