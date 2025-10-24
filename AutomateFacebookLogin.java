package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateFacebookLogin {
public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@placeholder = 'Email address or phone number']")).sendKeys("testleaf.2023@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Tuna@321");
	driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
	driver.findElement(By.name("login")).click();
	
	String title = driver.getTitle();
	driver.close();
}
}
