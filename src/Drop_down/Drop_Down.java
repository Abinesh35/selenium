package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Drop_Down {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();

        WebElement fruits = driver.findElement(By.id("fruits"));
        Select select = new Select(fruits);
        select.selectByVisibleText("Apple");

        List<WebElement> options = select.getOptions();
        for (WebElement alloptions:options
             ) {
            System.out.println(alloptions.getText());
        }

        WebElement superheros = driver.findElement(By.id("superheros"));
        Select select2 = new Select(superheros);
        select2.selectByIndex(2);
        select2.selectByIndex(3);
        select2.selectByIndex(4);
        select2.selectByIndex(5);



    }
}
