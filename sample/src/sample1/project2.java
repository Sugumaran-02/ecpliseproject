package sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img")).click();
		List<WebElement> nocolumn=	driver.findElements(By.tagName("td"));
		int numberofcolumn=nocolumn.size();
		System.out.println("NO OF COLUMN "+ numberofcolumn);
		List<WebElement> norow=	driver.findElements(By.tagName("td"));
		int numberofrows=norow.size();
		System.out.println("NO OF COLUMN "+ numberofrows);
	WebElement file1=	driver.findElement(By.xpath("//td[contains(text(),'Learn to interact with Elements')]//following::td[1]"));
	String progressvalue= file1.getText();
	System.out.println("the progress value is "+progressvalue);
	
List<WebElement>progressvalues=driver.findElements(By.xpath("//td[2]"));

List<Integer> allvalue=new ArrayList<Integer>();
for (WebElement webElement : progressvalues) {
String VALUES=	webElement.getText().replace("%", "");
allvalue.add(Integer.parseInt(VALUES));
}

System.out.println(allvalue);

 int min= Collections.min(allvalue);
 String minvalue= Integer.toString(min)+"%";
 driver.findElement(By.xpath("//td[normalize-space()="+"\""+minvalue+"\""+"]//following::td[1]//input")).click();
 
 
	
	}

}
