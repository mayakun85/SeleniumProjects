package silliconvalley.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/DenysTheMenace/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.id("Login")).click();


    }

}
