package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OurWebSite  {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
	}
	@Test
	public void WebSiteTest() {
		driver.get("file:///C:/allproject/OurWebSite.html");
		driver.findElement(By.name("FName")).sendKeys("sumi");
		driver.findElement(By.name("LName")).sendKeys("Akter");
		driver.findElement(By.name("Email")).sendKeys("mahmudaislam24@yahoo.com");
		driver.findElement(By.name("AgEmail")).sendKeys("mahmudaislam24@yahoo.com");
		driver.findElement(By.name("PWord")).sendKeys("12345");
		driver.findElement(By.xpath("//input[7]")).click();
		driver.findElement(By.xpath(".//*[@id='fml']")).click();
		
	}
   @AfterTest
   public void CloseBrowser() {
	   driver.close();
   }
}
