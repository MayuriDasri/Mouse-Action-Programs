package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClickDemoOne {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		WebElement doubleClickOption = driver.findElement(By.id("testdoubleclick"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(doubleClickOption).perform();
	}

}
