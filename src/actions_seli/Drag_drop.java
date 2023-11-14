package actions_seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropable");
        driver.manage().window().maximize();

        WebElement b = driver.findElement(By.id("draggable"));
        WebElement c = driver.findElement(By.id("droppable"));
        Actions A = new Actions(driver);
        A.dragAndDrop(b, c).perform();

    }
}
