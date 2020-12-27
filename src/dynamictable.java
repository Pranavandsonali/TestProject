import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranav Chavan\\Desktop\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rowcount=driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr")).size();
		int colcount=driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr/th")).size();
		System.out.println(rowcount);
		System.out.println(colcount);
		for(int i=0;i<colcount;i++)
		System.out.print(driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr/th")).get(i).getText() +" ");
		for(int i=0;i<rowcount;i++)
			System.out.print(driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr/td")).get(i).getText() +" ");

	}

}

