package iframes_seli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_class {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        //SingleFrame
        WebElement sframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(sframe);

        WebElement sinput = driver.findElement(By.xpath("//input[@type='text']"));
        Thread.sleep(3000);
        sinput.sendKeys("Abinesh");

        driver.switchTo().defaultContent();

        //Nested Frame
        WebElement nframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        Thread.sleep(3000);
        nframe.click();

        WebElement frame1 = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])"));
        driver.switchTo().frame(frame1);

        WebElement frame2 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
        driver.switchTo().frame(frame2);

        WebElement ninput = driver.findElement(By.xpath("(//input[@type='text'])"));
        ninput.sendKeys("ABINESH");

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        WebElement rframe = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
        Thread.sleep(3000);
        rframe.click();



    }
}
