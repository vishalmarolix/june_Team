package July;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saucedemo {

	public static void main(String[] args) {
   // System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chrome.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver(options);
    String url="https://www.saucedemo.com/";
    driver.get(url);
    driver.manage().window().maximize();
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    driver.findElement(By.cssSelector("//button[contains(@name, 'remove-sauce-labs-backpack')]")).click();
    
	}
	//tagname[@attribute='value']
}
