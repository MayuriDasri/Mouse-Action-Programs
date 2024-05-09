package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemoTwo {

	public static void main(String[] args) {
		
		//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Actions actions = new Actions(driver);
		
		WebElement rightClickOption = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
		
		actions.contextClick(rightClickOption).perform();
		
	}

}
