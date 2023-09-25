package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class OpenSlackTest {


    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void loginToSlack() throws AWTException {

        driver.get("https://slack.com/signin#/signin");


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        wait.until(ExpectedConditions.titleContains("Login | Slack"));

        String title = driver.getTitle();
        String Expected = "Login | Slack";
        Assert.assertEquals(title,Expected);


        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/span"),"sign in manually instead."));

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\"domain\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"domain\"]")).sendKeys("creativecodingcollect");
        driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"page_contents\"]/div/div/div[2]/div[3]/div[4]/span/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pjr.webdeveloper@att.net");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sl@ck123!");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"signin_btn\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        driver.switchTo().defaultContent();
        actions.sendKeys(Keys.ESCAPE).perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/p/a")).click();

        //Click on the user you want to send a message
        driver.findElement(By.id("D05N16WNC5S")).click();

        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]"));

        element.click();
        element.sendKeys("Did My Homework");
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}