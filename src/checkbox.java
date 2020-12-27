import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://my.crmnext.com/sn/app/login/login");
	@SuppressWarnings("unused")
	ArrayList<WebElement> links=new ArrayList<WebElement>();
	links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
	for(int i=0;i<=links.size()-1;i++)
	{
		System.out.println(links.get(i).getText());
	}
	
		
	
	
	
	

	}

}
