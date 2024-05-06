package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement ddown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(ddown);
		select.selectByValue("az");
		Thread.sleep(5000);
		select.selectByVisibleText("Name (Z to A)");
		Thread.sleep(5000);
		select.selectByIndex(4);
		Thread.sleep(5000);
		
		
		driver.quit();

	}

}
