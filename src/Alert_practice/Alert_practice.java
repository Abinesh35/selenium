package Alert_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        button.click();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        System.out.println("text");
        Thread.sleep(3000);
        alert.accept();

        WebElement button2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        button2.click();

        WebElement button22 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
        button22.click();

        Alert alert2 = driver.switchTo().alert();
        String text1 = alert2.getText();

        System.out.println("text1");
        Thread.sleep(3000);
        alert2.dismiss();


    }
}
