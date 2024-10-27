package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("sss");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("text");
		String textinbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).getAttribute("value");
		System.out.println("text in the box is "+textinbox);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
	}

}
