package July;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meeshow_task {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.meesho.com/");
    driver.manage().window().maximize();
   WebElement men= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
   men.sendKeys("shirts");
   men.click();
   Thread.sleep(4000);
   List<WebElement> tg= driver.findElements(By.xpath("//div[@class='sc-cOxWqc bLdIZq']/p"));  
  System.out.print(tg.size());
  Thread.sleep(4000);
  for(WebElement list:tg) {
	  System.out.println(list.getText());
	  if(list.getText().equals("shirts for men")) {
		  list.click();
		  break;
	  }
  }
    
  
	}

}
