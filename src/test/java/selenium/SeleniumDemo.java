package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SeleniumDemo extends MainDriver{
    @Test
    public void LoginCorrect() throws InterruptedException {
       WebElement usernameField = driver.findElement(By.cssSelector("[name = 'user-name']"));
       WebElement passwordField = driver.findElement(By.cssSelector("[name = 'password']"));

       usernameField.sendKeys("standard_user");
       passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("[name = 'login-button']"));
        loginButton.click();

      WebElement productText = driver.findElement(By.cssSelector("title"));
      assertEquals(productText.getText(), "Product");
    }


    @Test
    public void LoginFailed() {

        WebElement usernameField = driver.findElement(By.cssSelector("[name = 'user-name']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[name = 'password']"));

        usernameField.sendKeys("locked_out_user");
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("[name = 'login-button']"));
        loginButton.click();

        WebElement errorMsg = driver.findElement(By.cssSelector(".error-message-container"));
        assertTrue(errorMsg.isDisplayed());


    }

}
