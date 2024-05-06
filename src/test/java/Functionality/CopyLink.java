package Functionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CopyLink {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/?utm_source=sugarcrm.com&utm_medium=referral");
		driver.manage().window().maximize();
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are: "+alltags.size());
		
		for(int i=0; i<alltags.size();i++)
		{
			System.out.println("Links on Page are "+alltags.get(i).getAttribute("href"));
			System.out.println("Links on Page are "+alltags.get(i).getText());
		}
		
	
		

	}

}
