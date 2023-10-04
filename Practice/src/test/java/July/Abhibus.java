package July;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abhibus {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.abhibus.com/");
driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("hyder");
Thread.sleep(2000);
List<WebElement> tg=driver.findElements(By.xpath("//ul[@class='collection auto-complete-list primary sm false']"));
System.out.print(tg.size());
for(WebElement list:tg) {
	  System.out.println(list.getText());
	  if(list.getText().concat("hyderabad") !=null) {
		  list.click();
		  break;
	  }
}
driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("ben");
Thread.sleep(1500);
List<WebElement> tq=driver.findElements(By.xpath("//div[@class='container auto-complete-drop-down ']"));
System.out.print(tq.size());
for(WebElement list:tq) {
	  System.out.println(list.getText());
	  if(list.getText().concat("bengaluru") !=null) {
		  list.click();
		  break;
	  }
	  }/*
Thread.sleep(1500);
String Date="28";
String Month="September";
String Year="2023";
driver.findElement(By.id("datepicker1")).click();
while (true) {
	String monthandyear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	String[] month_year=monthandyear.split("");
	String month=month_year[0];
	String yr=month_year[1];
	
	if(month.equalsIgnoreCase(Month) && (yr.equals(Year)))
	{
		break;
	}
	else {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
}
}*/

	}}
