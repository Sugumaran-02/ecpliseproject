package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img")).click();
		 
	WebElement alertbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
	alertbox.click();
	org.openqa.selenium.Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	alert.accept();
	
	WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
	confirmbox.click();
	org.openqa.selenium.Alert Confirmalert=driver.switchTo().alert();
	Confirmalert.dismiss();
	
	WebElement promptbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
	promptbox.click();
	org.openqa.selenium.Alert promptalert=driver.switchTo().alert();
	promptalert.sendKeys("sugu");
	Thread.sleep(3000);
	promptalert.accept();
	
	 
	}

}
