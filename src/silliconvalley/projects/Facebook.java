package silliconvalley.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/DenysTheMenace/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
       // driver.findElement(By.className("inputtext")).sendKeys("This is my first input");
        // driver.findElement(By.className("inputtext")).sendKeys("123456");
        //driver.findElement(By.linkText("Forgot account?")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
        driver.findElement(By.xpath("//a[(text()='Forgot account?')]")).click();

    }
}
