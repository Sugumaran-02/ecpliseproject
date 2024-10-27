package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SECUDE FILES\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);*/
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text=	driver.findElement(By.id("Click")).getText();
		System.out.println("text inside the frame is " + text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		List<WebElement> listoftags=		driver.findElements(By.tagName("iframe"));
		int nooftags= listoftags.size();
		System.out.println("no of frames inside the page "+ nooftags);
			
		}

}
