package learnautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SECUDE FILES\\\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
		
	WebElement dropdownbox1=driver.findElement(By.id("dropdown1"));
	Select SELECT=new Select(dropdownbox1);
	SELECT.selectByIndex(2);
	Thread.sleep(3000);
	SELECT.selectByValue("1");
	Thread.sleep(3000);
	SELECT.selectByVisibleText("Loadrunner");
	Thread.sleep(3000);
	dropdownbox1.sendKeys("UFT/QTP");
	
	List<WebElement> listofoptions=	SELECT.getOptions();
int Noofoptions=	listofoptions.size();
System.out.println("NUMBER OF OPTION IN BOX ARE"+ Noofoptions);
 WebElement multiple= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
 Select multiplebox=new Select(multiple);
 multiplebox.selectByIndex(0);
 multiplebox.selectByIndex(1);
 multiplebox.selectByIndex(2);
 multiplebox.selectByIndex(3);
	
	
	
		
	}

}
