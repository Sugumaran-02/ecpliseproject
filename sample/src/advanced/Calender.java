package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]/a")).click();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
	}

}
