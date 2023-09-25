package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TestDropDown {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().refresh();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.navigate().back();
        driver.navigate().forward();

    }
    @Test
    public void Select(){
        WebElement dropdownElement =
                driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("France");
    }
    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
