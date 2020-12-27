import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crmnext.com");
		driver.manage().window().maximize();
		
		List<WebElement> elementlist= driver.findElements(By.xpath("//div[@class='col-md-2 col-sm-4 col-xs-6'][1]/ul/li"));
		for(WebElement element:elementlist)
		{
			System.out.println(element.getAttribute("href"));
		}
	}

}
