package TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login_credential {
	WebDriver driver;
	@BeforeMethod
	
	public void setup{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.maxolix.com/#");
		
	}
	@Test
	public void {}

	
	@AfterMethod
	
		public void {
			
		}
	}
