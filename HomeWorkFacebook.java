package pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeWorkFacebook {
WebDriver driver;

@BeforeTest
public void OpenBrowser() {
	driver=new FirefoxDriver();
}
@Test
public void Facebook() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("firstname")).sendKeys("Sumi");
	driver.findElement(By.name("lastname")).sendKeys("Akter");
	driver.findElement(By.name("reg_email__")).sendKeys("mahmudaislam24@yahoo.com");
	
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
	
	Select monthSelect=new Select(driver.findElement(By.name("birthday_month")));
	monthSelect.selectByIndex(8);
	
	Select daySelect=new Select(driver.findElement(By.name("birthday_day")));
	daySelect.selectByVisibleText("9");
	
	Select yearSelect=new Select(driver.findElement(By.name("birthday_year")));
	yearSelect.selectByVisibleText("1994");
	
	driver.findElement(By.name("sex")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	

}


}

