package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions actions = new Actions(driver);
		WebElement dragOption = driver.findElement(By.xpath("//p[normalize-space()='DRAG ME TO MY TARGET!']"));
		
		WebElement dropOption = driver.findElement(By.xpath("//p[normalize-space()='DRAG ME TO MY TARGET!']"));
		
		actions.clickAndHold(dragOption).perform();
		actions.dragAndDropBy(dropOption, 150, 150).perform();
		
		
	}

}
