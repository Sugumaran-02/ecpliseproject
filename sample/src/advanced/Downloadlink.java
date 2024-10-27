package advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sperumal\\Desktop\\SECUDE FILES\\selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		File filelocation=new File("C:\\Users\\Sperumal\\Downloads");
		Thread.sleep(3000);
		File[] listfiles=	filelocation.listFiles();
		for (File file : listfiles) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("file is download");
				break;
			}
			
		}
	}

}
