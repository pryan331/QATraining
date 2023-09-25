package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenOrangeTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openOrange(){
        String URL= "https://www.google.com";
        driver.get(URL);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String Actual = driver.getCurrentUrl();
        String Expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        Assert.assertEquals(Actual, Expected);
    }
    @DataProvider(name = "userCredentials")
    public Object[][] userCredentials() {

        return new Object[][]{
                {"admin", "admin123"},
                {"Admin", "admin123"},
                {"Admin123", "admin"},
                {"admin", "admin1234"},
                {"admin", "Admin123"},
                {"admin", " "},
                {" ", "admin123"},
        };
    }

    @Test(dependsOnMethods = "openOrange",dataProvider = "userCredentials")
    public void loginOrange(String username,String password){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));


        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement dashboardTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")));

        Assert.assertTrue(dashboardTitle.isDisplayed(), "Login was not successful.");

    }

    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}

//write test plan, steps and test case with scenario to
//login to slack
// send me a DM saying "hi harsh this is an automated test message"
// write an automated test for the above test
//CreativeCodingcollect