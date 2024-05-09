package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClickDemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		WebElement doubleClickOption = driver.findElement(By.xpath("//h2[normalize-space()='Double Click Me!']"));

		Actions actions = new Actions(driver);
		actions.doubleClick(doubleClickOption).perform();
		
	}

}
