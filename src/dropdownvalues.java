import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownvalues {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int a;
		String str="123";
		a=Integer.valueOf(str);
		System.out.println(a);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		
		/*List<WebElement> l=s.getOptions();
		
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i).getText());
		}*/

	}

}
