package July;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
WebElement fram=driver.findElement(By.id("frm2"));
driver.switchTo().frame(fram);

driver.findElement(By.id("firstName")).sendKeys("vishal");
driver.findElement(By.id("lastName")).sendKeys("aourpally");
driver.findElement(By.id("malerb")).click();
List<WebElement> tag=driver.findElements(By.cssSelector("input[class^='bcCheckBox']"));
for(int i=0;i<2;i++) {
	tag.get(i).click();
}
driver.findElement(By.id("email")).sendKeys("marolix@gmail.com");
driver.findElement(By.id("password")).sendKeys("12345");
driver.switchTo().defaultContent();
driver.findElement(By.id("name")).sendKeys("completed");

	}

}
