package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v130.browser.Browser;

public class CreateAccount {

	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(options);
	
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Janaki");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.name("numberEmployees")).sendKeys("10");
	driver.findElement(By.id("officeSiteName")).sendKeys("Leaf Taps");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
		
		
}

}