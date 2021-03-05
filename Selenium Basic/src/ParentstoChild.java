import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentstoChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\download-data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    //Parents to Child xpath
		driver.findElement(By.xpath("//*[@class='SDkEP']/div/input")).sendKeys("search");
		
		//Child to parents
		driver.findElement(By.xpath("//*[@class='gNO89b']/parent::center")).sendKeys("search");
		
		//Sibling treverse
		driver.findElement(By.xpath("//*[@class='gNO89b']/following-sibling::input[1]")).click();
		//Text
		driver.findElement(By.xpath("//*[@class='gNO89b']/following-sibling::input[1]")).click();
		
		//Contains
		driver.findElement(By.xpath("//*[contains(@class, 'gLFyf')]")).click();		
		//

	}

}
