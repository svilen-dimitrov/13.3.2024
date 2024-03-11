package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumDemo extends MainDriver{
    @Test
    public void testOpenBrowser() throws InterruptedException {
//       WebElement  textInput = driver.findElement(By.xpath("//*[@name='my-password']"));
//        textInput.click();
//
//        WebElement  password = driver.findElement(By.xpath("//*[@name='my-text']"));
//        password.click();
//
//        WebElement  textArea = driver.findElement(By.xpath("//*[@name='my-textarea']"));
//        textArea.click();
//
//        WebElement  checkBox1 = driver.findElement(By.id("my-check-1"));
//        checkBox1.click();
//
//        WebElement  myRadio1 = driver.findElement(By.id("my-radio-1"));
//        myRadio1.click();
//
//        WebElement  buttonSubmit = driver.findElement(By.cssSelector("[type=submit]"));
//        buttonSubmit.click();


        List<WebElement> myList = driver.findElements(By.cssSelector("input"));
        myList.get(2).click();

        Thread.sleep(3000);

    }
}
