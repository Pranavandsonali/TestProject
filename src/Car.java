import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.carwale.com/tata-cars/");
		driver.manage().window().maximize();
		
		/*----//div[@class="o-dpDliG o-eAyrtt o-fpkJwH o-dCyDMp o-cglRxs _3JY4jH o-fzovSM"]/ul/li---
		---//div[@class="o-dpDliG o-eAyrtt o-fpkJwH o-dCyDMp o-cglRxs _3JY4jH o-fzovSM"]/ul/li[1]//div//div/div//a/h2--
		//div[@class="o-cpNAVm o-fznJzb"]/span[1]
		 * */
		
		int no=driver.findElements(By.xpath("//div[@class='o-dpDliG o-eAyrtt o-fpkJwH o-dCyDMp o-cglRxs _3JY4jH o-fzovSM']/ul/li")).size();
		List<WebElement> List=driver.findElements(By.xpath("//div[@class='o-dpDliG o-eAyrtt o-fpkJwH o-dCyDMp o-cglRxs _3JY4jH o-fzovSM']/ul/li//div//div/div//a/h2"));
		List<WebElement> List2=driver.findElements(By.xpath("//div[@class=\"o-cpNAVm o-fznJzb\"]/span[1]"));
		for(int i=0;i<no;i++)
		{
			System.out.println(List.get(i).getText());
			String price=List.get(i).getText();
			price=price.substring(1);
			System.out.println(price);
		}
		
		
		
		
		
	}

}
