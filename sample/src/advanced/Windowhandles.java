package advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
		
		String oldwindow=driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		Set<String> newwindows=	driver.getWindowHandles();
		
		for (String newwindow : newwindows) {
			driver.switchTo().window(newwindow);
			
		}
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		driver.close();
		driver.switchTo().window(oldwindow);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Set<String> listofwindows=	driver.getWindowHandles();
	int noofwindows=	listofwindows.size();
		System.out.println("no of windows opened" + noofwindows);
		Thread.sleep(3000);
		
		driver.findElement(By.id("color")).click();
		Thread.sleep(3000);
		Set<String> openedwindows=	driver.getWindowHandles();
		Thread.sleep(3000);
		for (String currentwindow : openedwindows) {
			if (!currentwindow.equals(oldwindow)) {
				driver.switchTo().window(currentwindow);
				driver.close();
			}
			
		}
	}

}
