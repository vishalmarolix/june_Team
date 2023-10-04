package July;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AutomationWebtable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://cosmocode.io/automation-practice-webtable/");
driver.manage().window().maximize();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
List<WebElement> allHeader= driver.findElements(By.xpath("//table[@id='countries']//tr//td"));
System.out.println(allHeader.size());
boolean status= false;
for(WebElement  ele:allHeader)
{
	String value=ele.getText();
	System.out.println(value);
	if(value.contains("country")) {
		status=true;
		// colums xpath("//table[@id='countries']//tr")
		// rows xpath("//table[@id='countries']//td")
		//all tabel xpath("//table[@id='countries']//tbody")
	}
	System.out.println();
	
	}
	}


}
