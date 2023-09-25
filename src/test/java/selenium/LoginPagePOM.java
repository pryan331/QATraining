package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {

    private WebDriver driver;
    private By userNameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    public LoginPagePOM(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }


}