package actions_seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move2Element {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement ab = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions A =new Actions(driver);
        A.moveToElement(ab).perform();

    }
}
