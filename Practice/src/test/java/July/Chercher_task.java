package July;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chercher_task {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    Thread.sleep(3000);
    driver.findElement(By.id("alert")).click();
    
	}

}
