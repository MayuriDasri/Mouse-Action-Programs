package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMoveToElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Actions action = new Actions(driver);
		
		WebElement blogMenu = driver.findElement(By.id("blogsmenu"));
		//String blogText = blogMenu.getText();
		//System.out.println(blogText);
		
		
		
		WebElement seleniumByArunOption = driver.findElement(By.xpath("//span[normalize-space()='SeleniumByArun']"));
	
		action.moveToElement(blogMenu).moveToElement(seleniumByArunOption).build().perform();
	
	}
	

}
