package Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_UK/in/home?ds_rl=1012408&gad_source=1&gclid=CjwKCAjwrIixBhBbEiwACEqDJbUX_7vB6ZqBECpPTxoIgPb0NQ4oYI0vdHJp-FFQqaYH4WJ4anlbTBoCZXYQAvD_BwE&gclsrc=aw.ds#/book/bookflight");
		driver.manage().window().maximize();
		WebElement radio1 = driver.findElement(By.id("redeemFlights"));
		radio1.click();
		
	
		
		
	
		

	}

}
