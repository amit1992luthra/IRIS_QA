package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleprogram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irissoftware.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtFirstName']")).sendKeys("Iris");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtLastName']")).sendKeys("Software");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtCompanyName']")).sendKeys("Iris Software");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtEmailId']")).sendKeys("POC@irissoftware.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtPhoneNo']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtCountry']")).sendKeys("INDIA");
		Thread.sleep(3000);
		System.out.println("hello from console");
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
