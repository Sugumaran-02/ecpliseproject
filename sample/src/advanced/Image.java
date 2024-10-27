package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a")).click();
		WebElement brokenimg= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if (brokenimg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("IMAGE IS BROKEN");
		}
		else {
			System.out.println("IMAGE IS NOT BROKEN");
		}

	}

}
