package advanced;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[19]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input")).click();
		
	//String filelocation=‪"C:\\Users\\Sperumal\\Documents\\19-11.txt";
	
	}

}
