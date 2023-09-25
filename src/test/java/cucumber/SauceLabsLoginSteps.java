package cucumber;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class SauceLabsLoginSteps {
    private WebDriver driver;

    @Given("The user is on the Sauce Labs login page")
    public void TheUserIsOnTheSauceLabsLoginPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters the {string} and {string}")
    public void theUserEntersTheAnd(String arg0, String arg1) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys(arg0);
        passwordField.sendKeys(arg1);
    }

    @And("clicks the Sauce Labs login button")
    public void clicksTheSauceLabsLoginButton() {
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
    }

    @Then("the user should be logged into Sauce Labs successfully")
    public void theUserShouldBeLoggedIntoSauceLabsSuccessfully() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement productPageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span")));

        Assert.assertTrue(productPageTitle.isDisplayed(), "Login was not successful.");
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
