package advanced;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a")).click();
		List<WebElement> noofcolums=	driver.findElements(By.tagName("td"));
		List<WebElement> noofrows=	driver.findElements(By.tagName("tr"));
	int noofcolumn=	noofcolums.size();
	int noofrow= noofrows.size();
		System.out.println("NUMBER OF ROWS "+ noofrow);
		System.out.println("NUMBER OF COLUMS "+ noofcolumn);
	WebElement value=	driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String progressvalue=value.getText();
	System.out.println("progress value is "+ progressvalue);
	List<WebElement> list= driver.findElements(By.xpath("//td[2]"));
	List<Integer> allvalue= new ArrayList<Integer>();
	for (WebElement webElement : list) {
			String indivitual=	webElement.getText().replace("%", "");
	allvalue.add(Integer.parseInt(indivitual));
		}
	System.out.println("total list "+ allvalue);
	int smallvalue= Collections.min(allvalue);
	System.out.println("small value is"+smallvalue);
String small=	Integer.toString(smallvalue)+"%";
	String xpath= "//td[normalize-space()="+"\""+small+"\""+"]//following::td[1]//input";
	System.out.println(xpath);
	driver.findElement(By.xpath("//td[normalize-space()="+"\""+small+"\""+"]//following::td[1]//input")).click();
	}
  
}
