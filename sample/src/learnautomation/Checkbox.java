package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
	WebElement boxischecked=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
	boolean Box=	boxischecked.isSelected();
	System.out.println("Box is selected "+ Box);
	
	WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
	WebElement secondelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
	boolean status1=	firstelement.isSelected();
	boolean status2= secondelement.isSelected();
	if (status1==true) {
		System.out.println("First element is selected");
		firstelement.click();
	}
	else {
		firstelement.click();
	}
	if (status2==true) {
		System.out.println("secound element is selected");	
		secondelement.click();
	}
	else {
		secondelement.click();
	}
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();//*[@id="contentblock"]/section/div[4]/div[2]/input
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
	
	}

}
