package Selenium;
import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.web.Values;
import org.openqa.selenium.support.ui.Select;

public class Frames {
	
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//WebDriver wb;
			//WebDriverManager.Chromedriver().setup();
			//wb= new ChromeDriver();
			String ExpectedTitle= "OrangeHRM";
			wb.navigate().to("https://demoqa.com/frames");
			//how many farmes are here
			List<WebElement> Frames = wb.findElements(By.tagName("iframe"));
			//so that will give
			System.out.println(Frames.size());
			//how to we get name of frames
			for(int i=0; i<Frames.size();i++)
			{
				String name =Frames.get(i).getAttribute("id");
				System.out.println(name);
						
			}
			//i want to go frame1
			wb.switchTo().frame("frame1");
			System.out.println(wb.findElement(By.id("sampleHeading")).getText());
			//aftervthat we go for main page
			wb.switchTo().defaultContent();
			
			//i wnt to go frame2
			wb.switchTo().frame("frame2");
			System.out.println(wb.findElement(By.id("sampleHeading")).getText());
			JavascriptExecutor js = (JavascriptExecutor) wb;
			js.executeScript("return document.getElementById('frame2Wrapper')");
			//Thread.sleep(2000);
			
			//to scroll the page down(end of the page)
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			//Thread.sleep(2000);
			
			//to scroll the page upwards(top of the page)
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			//Thread.sleep(2000);
	}}


