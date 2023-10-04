package July;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable  {
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.ilovepdf.com/pdf_to_word");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  TakesScreenshot sct=(TakesScreenshot)driver;
  File source= sct.getScreenshotAs(OutputType.FILE);
  File destination=new File("./target/demo.png");
  FileUtils.copyFile(source, destination);
	}

}
