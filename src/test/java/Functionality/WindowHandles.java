package Functionality;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Thread.sleep(2000);
		Set <String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator <String> Iterator = windowhandles.iterator();
		String parentwindow = Iterator.next();
		String childwindow = Iterator.next();
		driver.switchTo().window(childwindow);
		
		
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Academy");
		driver.switchTo().window(parentwindow);
		
		
		
	
		
		
	
		

	}

}
