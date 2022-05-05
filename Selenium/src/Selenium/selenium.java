package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//WebDriverManager.chrome.driver.setup();
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		wb.manage().window().maximize(); //Used to maximize the orange hrm tab
		String ExpectedTitle = "OrangeHRM";
		//wb.findElement(By.xpath("//*[@id= 'txtUsername']")).sendKeys("Admin");
		WebElement UN = wb.findElement(By.xpath("//*[@id= 'txtUsername']"));
		if(UN.isEnabled())
		{
			UN.sendKeys("Aishwarya");
			Thread.sleep(4000);
			UN.clear();
			UN.sendKeys("Admin");
		}
		if(UN.isDisplayed())
		{
			wb.findElement(By.xpath("//*[@id= 'txtPassword']")).sendKeys("admin123");
			wb.findElement(By.xpath("//*[@id= 'btnLogin']")).click();
			wb.findElement(By.partialLinkText("Adm")).click();
			wb.findElement(By.xpath("//*[@id= 'ohrmList_chkSelectRecord_27']")).click();
		}
			if 
			(wb.findElement(By.xpath("//*[@id= 'ohrmList_chkSelectRecord_27']")).isSelected()) 
			{
			System.out.println("This member is Selected");
			}
		//wb.findElement(By.xpath("//*[@id= 'txtPassword']")).sendKeys("admin123");
		//wb.findElement(By.xpath("//*[@id= 'btnLogin']")).click();
			List<WebElement> link = wb.findElements(By.tagName("a"));
			System.out.println(link.size());
			//i want to print the name of the link
			for(int i=0;i<link.size();i++)
			{
				System.out.println(link.get(i).getText());
			}
	
String ActualTitle = wb.getTitle();
if(ExpectedTitle.equals(ActualTitle))
{
Thread.sleep(2000);
wb.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(8000);
wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
}
else
{
System.out.println("The titles are not the same");
Thread.sleep(1000);
}
	wb.quit();
wb.close();
	}
}
		

	


