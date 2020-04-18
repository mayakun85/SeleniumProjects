package silliconvalley.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/DenysTheMenace/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
    }
}
