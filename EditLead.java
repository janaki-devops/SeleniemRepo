package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Barclays");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Janaki");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Nagappan");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Janu");
	driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("123@yahoo.com");
	WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select sel = new Select(stateDD);
	sel.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Prefer to be contacted by email only.");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
}
}
