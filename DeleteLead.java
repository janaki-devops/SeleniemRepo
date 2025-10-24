package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
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
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("919994793951");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.id("ext-gen926")).click();
	driver.findElement(By.className("subMenuButtonDangerous")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("919994793951");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.close();
	
	
	
	
	
}
}
