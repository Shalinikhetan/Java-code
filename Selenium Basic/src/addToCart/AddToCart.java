package addToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
		String itemsNeeded[]= {"Cucumber", "Beetroot"};
		System.setProperty("webdriver.chrome.driver", "D:\\download-data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(5);
		List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0; i<products.size(); i++)
		{
			String itemsName[]=products.get(i).getText().split("-");
			String  formattedName=itemsName[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
		}

	}

}
