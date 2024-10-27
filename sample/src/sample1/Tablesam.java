package sample1;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://leafground.com/");
driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img")).click();
driver.findElement(By.xpath("//td[contains(text(),'Learn XPath')]//following::td[2]")).click();
WebElement value1= driver.findElement(By.xpath("//td[contains(text(),'Learn XPath')]//following::td[3]"));
 String nameofmentor= value1.getText();
 System.out.println("Name of the mentor "+nameofmentor);
  
 List<Integer> allvalue=new ArrayList<Integer>();
List<WebElement> progressvalues=driver.findElements(By.xpath("//td[2]"));
for (WebElement webElement : progressvalues) {
	String indivitualvalue= webElement.getText().replace("%", "");
	allvalue.add(Integer.parseInt(indivitualvalue));
	
}
 System.out.println("final list " + allvalue);
//MAXIMUM VALUE
 int maxvalue=Collections.max(allvalue);
 System.out.println(maxvalue);
  String  Max= Integer.toString(maxvalue)+"%";
  String maxXpath="//td[normalize-space()="+"\""+Max+"\""+"]//following::td[1]//input";
  System.out.println(maxXpath);
  driver.findElement(By.xpath(maxXpath)).click();
  
  //Minmum value
 int minvalue= Collections.min(allvalue);
 String min= Integer.toString(minvalue)+"%";
String minxpath="//td[normalize-space()="+"\""+min+"\""+"]//following::td[1]//input";
System.out.println(minxpath);
driver.findElement(By.xpath(minxpath)).click();

	}

}

//*[@id="post-153"]/div[2]/div/ul/li[8]/a/img