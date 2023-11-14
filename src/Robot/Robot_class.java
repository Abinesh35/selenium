package Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Robot_class {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Abinesh");

        Actions act = new Actions(driver);
        act.doubleClick(email).perform();
        act.contextClick(email).perform();

        Robot rob= new Robot();
        for (int i = 0; i < 3; i++) {
            rob.keyPress(KeyEvent.VK_DOWN);
            rob.keyRelease(KeyEvent.VK_DOWN);
        }
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);

        WebElement pass = driver.findElement(By.id("pass"));
        pass.click();
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_V);
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyRelease(KeyEvent.VK_V);


    }
}
