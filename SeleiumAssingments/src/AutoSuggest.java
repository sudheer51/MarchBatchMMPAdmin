import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//new commit from tester2

public class AutoSuggest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium WebDriver");
		Thread.sleep(5000);
		
		List<WebElement> ulList = driver.findElements(By.cssSelector("ul[role='listbox']>li"));
		System.out.println("number of children under ul "+ ulList.size());
		
		for(int i =0 ;i < ulList.size();i++)
		{
			if(ulList.get(i).getText().contains("interview"))
			{
				System.out.println("Match Found!!!");
				ulList.get(i).click();
				break;
			}
		}
	}

}
