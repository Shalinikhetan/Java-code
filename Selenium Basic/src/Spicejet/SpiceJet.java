package Spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\download-data\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(10);
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='rbtnl_Trip_1']")).isSelected());
		driver.findElement(By.cssSelector("[id*='rbtnl_Trip_1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='rbtnl_Trip_1']")).isSelected());
		driver.findElement(By.xpath("//*[contains(@id,'rbtnl_Trip_0')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//span[contains(@id,'originStation1_CTXT')]")).click();
		Thread.sleep(15);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOP']")).click();
		driver.findElement(By.cssSelector("[class*=' ui-state-active']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("Style"));
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("Style").contains("1"))
		{
			System.out.println("Enabled");
		}
		else {
			System.out.println("disabled");
		}
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(1);
		Select Schild =  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Schild.selectByValue("1");
		Select Sinfant =  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Sinfant.selectByVisibleText("1");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		driver.switchTo().alert().accept();
		

	}
	

}
