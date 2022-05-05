package Selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.web.Values;
import org.openqa.selenium.support.ui.Select;

public class RadiobuttonAndDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wb= new ChromeDriver();
		String ExpectedTitle= "OrangeHRMs";
		wb.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		wb.findElement(By.name("userName")).sendKeys("Shyam");
		//get artibue
		//String value = wb.findElement(By.name("username")).getAttribute("value");
		//System.out.println(value);
		Thread.sleep(3000);
		wb.findElement(By.name("password")).sendKeys("Sidhu@123");
		wb.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[contains(text(),'Flights')]")).click();
		Thread.sleep(3000);
		
		//Radio Button is used when there are two options from which one should be chosen, here there is 2 options such as Round trip and one way,
		//we are choosing one way here
		wb.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		
		//Drop down that is if an option has choices then to select one from the dropdown we use this dropdown command, here under passengers there are 4
		//(1 or 2 or 3 or 4 pasengers) options we are selecting one passenger option with this dropdown command here. 
		//inspect the options to get 'passCount'
		WebElement dd = wb.findElement(By.name("passCount"));
		Select sc =new Select(dd);
		
			
		
//		Thread.sleep(3000);
//		List<WebElement> values=sc.getOptions();
//		System.out.println(values.size());
//		for(int i=0; i<values.size();i++)
//		{
//			System.out.println(values.get(i).getText());
//		}
////		sc.selectByIndex(3);
//		System.out.println(sc.getFirstSelectedOption().getText());
//		Thread.sleep(3000);
		
		
}}


