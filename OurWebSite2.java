package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OurWebSite2  {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		driver=new FirefoxDriver();
	}
	@Test(priority=1)
	public void OpenUrl() {
		driver.get("file:///C:/allproject/OurWebSite.html");
	}
	@Test(priority=2)
	public void EnterFirstName() {
		driver.findElement(By.name("FName")).sendKeys("sumi");
	}
	@Test(priority=3)
	public void EnterLastName() {
	driver.findElement(By.name("LName")).sendKeys("Akter");
	}
	@Test(priority=4)
	public void EnterEmail() {
	driver.findElement(By.name("Email")).sendKeys("mahmudaislam24@yahoo.com");
	}
	@Test(priority=5)
	public void EnterAgEmail() {
	driver.findElement(By.name("AgEmail")).sendKeys("mahmudaislam24@yahoo.com");
		
	}
	@Test(priority=6)
	public void EnterPWord() {
	driver.findElement(By.name("PWord")).sendKeys("12345");
	}
	@Test(priority=7)
	public void EnterClickOnMail() {
		driver.findElement(By.xpath("//input[7]")).click();
		
		
		
	}
   @AfterTest
   public void CloseBrowser() {
	   driver.close();
   }
}
