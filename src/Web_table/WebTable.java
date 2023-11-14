package Web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/table.html");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//table[@border='1']/tbody/tr[3]/td[1]"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.xpath("//table[@border='1']/tbody/tr"));

        for (WebElement web:elements
             ) {
            System.out.println(web.getText());

        }
        

    }
}
