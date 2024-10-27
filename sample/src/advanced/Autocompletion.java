package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[17]/a")).click();
		
	WebElement input=	driver.findElement(By.id("tags"));
	
	input.sendKeys("s");
	Thread.sleep(3000);
	List<WebElement> listbox=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	int nooflist=listbox.size();
	System.out.println("no of list in box is " + nooflist);
	for (WebElement Element : listbox) {
		if(Element.getText().equals("Selenium"))
		{
		Element.click();
		System.out.println(Element.getText());
		break;
	}
		else {
			System.out.println(Element.getText());
		}
	}

}
}