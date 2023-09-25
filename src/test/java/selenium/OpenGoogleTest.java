package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OpenGoogleTest {
    private WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openGoogle(){
        String URL = "https://www.google.com";
        driver.get(URL);
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.google.com/";
        Assert.assertEquals(Actual,Expected);
    }
    @Test(dependsOnMethods = "openGoogle")
    public void Search(){
        driver.findElement(By.className("gLFyf")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("Amazon");
        driver.findElement((By.className("gLFyf"))).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("CCgQ5")).click();

        String Actual = driver.getTitle();
        String Expected = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(Actual,Expected);

    }
    @Test(dependsOnMethods = "Search")
    public void SearchAmazon() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Socks");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        int numberOfSocksDisplayed = driver.findElements(By.xpath("//span[contains(text(),'socks')]")).size();
//        System.out.println(numberOfSocksDisplayed);
//        int expectedNumberOfSocks = 9;
//        Assert.assertEquals(numberOfSocksDisplayed,expectedNumberOfSocks);
        List<WebElement> sockElement = driver.findElements
                (By.xpath("//div[@data-component-type='s-search-result']"));
        int actualNumber = sockElement.size();
        System.out.println(actualNumber);
        int expectedNumber = 60;

        Assert.assertEquals(actualNumber,expectedNumber);
    }
    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}

//Selenium Waits:
//Fluent Wait
//Explicit Wait
//Implicit Wait

//Fluent Wait??
//Fluent waits are similar to explicit waits but it allows user to define custom polling intervals
//you can specify the maximum wait time and polling frequency.
//this is useful when you need more control over how often selenium checks for a given condition.

//Explicit Waits??
//explicit waits are used to wait for a specific condition to be met before processing with the
// script execution
//you can specify maximum wait time and a condition to wait for. eg: element visible or clickable
//the WebDriverWait class and the expected condition module are commonly used for explicit wait

//Implicit Wait??
//Implicit waits are used to set a default time for all elements in the WebDriver instance
//if an element is not immediately available, selenium will wait for the specific amount of time
//before throwing an exception.

//HTML POINTERS to find ELEMENTS in SELENIUM
//by xpath
//by classname
//by id
//by cssSelector
//by name
//by linkText
//by tagName

//xPath
// Absolute xPath
// Relative xPath

//Absolute xPath??
//absolute xPath expression specifies the exact location on an element from the root of the
//document, it starts with a single / .
//while absolute xPath can be very precise they are longer and brittle as they rely on complete
//structure of the html document

//Relative xPath??
//A relative xPath expression specifies the location of the element relative to another element
// on the html document. it does not start from the root of the page but rather from a specific
//reference point or context.
//relative xpaths are more dynamic and less likely to fail and break the structure of the html document
//if the page changes relative xpath finds the reference point between the elements to find the given
// element, they focus on the relationship between the elements.