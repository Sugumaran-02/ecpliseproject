package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://leafground.com/");              
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
		WebElement link1=driver.findElement(By.partialLinkText("Home Page"));
		link1.click();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement whereiamGO= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String iamgo=	whereiamGO.getAttribute("href");
		System.out.println(" I AM GO TO PAGE OF"+ iamgo);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).click();
		String titleofpage= driver.getTitle();
		Thread.sleep(3000);
	if (titleofpage.contains("404")) {
		System.out.println("Page is Broken");
	} else {
System.out.println("Page is not broken");
	}
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement link4=driver.findElement(By.partialLinkText("Home Page"));
		link4.click();
		driver.navigate().back();
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	int nooflinks= links.size();
	System.out.println("Number of links inside the page " +nooflinks);
	
	driver.quit();
		
		
	}

}
