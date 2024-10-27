package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a")).click();
		Point xypoint=	driver.findElement(By.id("position")).getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("x value is"+xvalue+" and y value is "+yvalue);
		String cssvalue=	driver.findElement(By.id("color")).getCssValue("");
		System.out.println("css value is" + cssvalue);
		WebElement sizeofbutton= driver.findElement(By.id("size"));
	int heightofbutton=	sizeofbutton.getSize().getHeight();
	int weidthofbutton= sizeofbutton.getSize().getWidth();
	System.out.println("Height of btton is "+heightofbutton+" weidth of button is "+weidthofbutton);
	}

}
