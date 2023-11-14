package Js_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Js_Executor {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@role='button']"));
        button.click();

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.click();
        search.sendKeys("mobiles");

        Robot rob= new Robot();
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);


        WebElement discount = driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[21]"));
        WebElement checkbox = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[22]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",discount);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click()",checkbox);

//        checkbox.click();
    }
}
