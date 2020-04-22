package silliconvalley.projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/DenysTheMenace/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cheapoair.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'One Way')]")).click();
        driver.findElement(By.id("from0")).sendKeys("kiev");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@data-suggestion='KBP']")).click();
        driver.findElement(By.id("to0")).sendKeys("new york");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='suggestion-box__content is-visible']//li[@data-suggestion='JFK']")).click();
        driver.findElement(By.id("cal0")).click();
        driver.findElement(By.xpath("//div[@class='calendar__wrapper clearfix']//div[1]//div[3]//div[27]//a[1]")).click();
        driver.findElement(By.id("searchNow")).click();



    }
}
