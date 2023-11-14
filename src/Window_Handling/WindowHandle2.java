package Window_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/");
        driver.manage().window().maximize();

        WebElement startfree = driver.findElement(By.xpath("//a[@class='cta_button']"));
        startfree.click();

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> all = driver.getWindowHandles();
        System.out.println(all);

        for (String str:all) {
        if (str.equals(parent))
            continue;
        else
            driver.switchTo().window(str);
        }
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Abinesh");
        
    }
}
