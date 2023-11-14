package actions_seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        WebElement pass = driver.findElement(By.id("pass"));

        Actions a = new Actions(driver);
        a.click(pass).perform();
        a.contextClick(pass).perform(); //Right Click

    }
}
