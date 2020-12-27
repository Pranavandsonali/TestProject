import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class multiplelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crmnext.com");
		driver.manage().window().maximize();
		int no=driver.findElements(By.xpath("//div[@class='col-md-2 col-sm-4 col-xs-6'][1]/ul/li")).size();
		Dimension d=new Dimension(200,800); 
		driver.findElement(By.xpath("//div[@class='col-md-2 col-sm-4 col-xs-6'][1]/ul/li"));
		
		for(int i=1;i<no;i++)
		{
			WebElement a=driver.findElement(By.xpath("//div[@class='col-md-2 col-sm-4 col-xs-6'][1]/ul"));
			String z=Keys.chord(Keys.CONTROL,Keys.ENTER);
			a.findElements(By.tagName("a")).get(i).sendKeys(z);
			
		}
		Set<String> win=driver.getWindowHandles();
		for(String a:win)
		{
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
	}

}
