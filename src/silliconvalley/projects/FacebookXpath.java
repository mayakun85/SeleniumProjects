package silliconvalley.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/DenysTheMenace/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        //syntax for Xpath
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("my own xpath");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        //Syntax for CSS


    }
}
