import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[@id='followall']")).click();
		Set<String> allwin=driver.getWindowHandles();
		for(String w:allwin)
		{
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}

}
