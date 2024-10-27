package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[20]/a")).click();
	WebElement tooltip=	driver.findElement(By.id("age"));
	String tooltipinformation=	tooltip.getAttribute("title");
	System.out.println("information in tool is " + tooltipinformation);
	}

}
