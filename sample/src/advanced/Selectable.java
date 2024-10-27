package advanced;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[15]/a")).click();
		List<WebElement> selectable=	driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
	int noofli=	selectable.size();
	System.out.println(noofli);
	
	Actions action=new Actions(driver);
	/*action.clickAndHold(selectable.get(0));
	action.clickAndHold(selectable.get(1));
	action.clickAndHold(selectable.get(2));
	action.clickAndHold(selectable.get(3));
	action.clickAndHold(selectable.get(4)).build().perform();*/
	action.keyDown(Keys.CONTROL).click(selectable.get(0))
	.click(selectable.get(1))
	.click(selectable.get(2))
	.click(selectable.get(3))
	.click(selectable.get(4)).build().perform();
	
	}

}
