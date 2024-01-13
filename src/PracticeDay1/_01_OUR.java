package PracticeDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OUR {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lidl.com");

        WebElement seachBox = driver.findElement(By.id("seach-bar"));
        seachBox.sendKeys("Your seach query");
        seachBox.submit();
        try {
            Thread.sleep((5000));

        } catch (InterruptedException e) {
            e.printStackTrace();


        }
        driver.quit();
    }
}






