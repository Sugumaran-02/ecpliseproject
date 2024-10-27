package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[14]/a/img")).click();
	WebElement dragelement=	driver.findElement(By.id("draggable"));
	WebElement dropelement=	driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	//action.dragAndDrop(dragelement, dropelement).build().perform();
	action.clickAndHold(dragelement).moveToElement(dropelement).release(dropelement).build().perform();
	}

}
