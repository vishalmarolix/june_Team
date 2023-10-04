package July;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args)  {
 
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// Enter name
		driver.findElement(By.id("name")).sendKeys("vishal");
		//enter Email
		
		driver.findElement(By.id("email")).sendKeys("vishal.marolix@gmail.com");
		//enter phone
		driver.findElement(By.id("phone")).sendKeys("900180298");
		//address
		driver.findElement(By.id("textarea")).sendKeys("hyderabad");
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		//gender male
		driver.findElement(By.id("male")).click();
		List<WebElement> tag= driver.findElements(By.cssSelector("input[value$='day']"));
		for (int i=1;i<tag.size();i++) {
		tag.get(i).click();
		//break;
		}
		Select drpCountry = new Select(driver.findElement(By.id("country")));
		//drpCountry.selectByVisibleText("INDIA");
		drpCountry.selectByValue("india");
		//selecting colour
		Select drpColors = new Select(driver.findElement(By.id("colors")));
		drpColors.selectByValue("blue");
		
		driver.findElement(By.id("datepicker")).click();
		
		/*WebElement month= (WebElement) driver.findElements(By.xpath("ui-datepicker-calendar"));
		while (!month.getText().contains("august 2023"))
				{
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
			}
				List<WebElement> ele= driver.findElements(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
				for (int i = 0; i <ele.size(); i++) {
					String targetday = ele.get(i).getText();
					if (targetday.equalsIgnoreCase("17")) {
						ele.get(i).click();
						break;
					}
					}
				}
	Thread.sleep(5000);
		Select j =new Select(driver.findElement(By.id("country")));*/
	}}		

