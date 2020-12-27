import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-MUM&gclid=Cj0KCQjw28T8BRDbARIsAEOMBcyL78Bs_5F5rqWGj6zDjp7PEtJTH_4-lHsTeyJHUB1P3qZgeSHevXEaAr5wEALw_wcB");
		driver.manage().window().maximize();
		ArrayList<String> Vegies=new ArrayList<>();
		Vegies.add("Onion");
		Vegies.add("Tomato");
		for(int i=0;i<=Vegies.size()-1;i++)
		{
			String data=Vegies.get(i);
			driver.findElement(By.xpath("//a[contains(text(),'"+data+"')]//parent::div//following-sibling::div[2]/div/div[5]/div[2]/button[contains(text(),'Add')]")).click();
		}
		
		
		
	}

}
