package July;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_iphone {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    WebElement phone= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    phone.sendKeys("iphone");
    phone.click();
    Thread.sleep(4000);
   List<WebElement> tg= driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));  
   System.out.print(tg.size());
   Thread.sleep(4000);
   for(WebElement list:tg) {
 	  System.out.println(list.getText());
 	  if(list.getText().equals("iphone 14")) {
 		  list.click();
 		  break;
 	  }
	}


}
}
