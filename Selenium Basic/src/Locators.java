import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\download-data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Shalini");
		driver.findElement(By.id("u_0_o")).sendKeys("Khetan");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("shalinik@gmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("shalinikhetan20@gmail.com");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("12345678");
		driver.findElement(By.linkText("Create a Page")).click();
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.partialLinkText("Create")).click();
		driver.navigate().back();
		driver.findElement(By.tagName("button")).click();
		
		
		

	}

}
