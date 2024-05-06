package Functionality;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_item']"));
	    System.out.println(webelements);
	    driver.navigate().to("https://www.tutorialspoint.com/");
	    String windowhandle = driver.getWindowHandle();
	    System.out.println(windowhandle);
	    driver.findElement(By.xpath("//a[@class='button nav__signup-link fw-600']")).click();
	    Set<String> windowhandles = driver.getWindowHandles();
	    System.out.println(windowhandles);
		driver.quit();

	}

}
