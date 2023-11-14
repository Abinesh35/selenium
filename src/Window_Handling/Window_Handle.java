package Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Window_Handle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/");
        driver.manage().window().maximize();

        WebElement freetrialbtn = driver.findElement(By.xpath("//a[@class='cta_button']"));
        freetrialbtn.click();

        Set<String> windowHandles = driver.getWindowHandles();

        Iterator<String> iterator = windowHandles.iterator();

        String parent = iterator.next();
        String child = iterator.next();

        driver.switchTo().window(child);

        WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        name.click();

        driver.switchTo().window(parent);

    }
}
