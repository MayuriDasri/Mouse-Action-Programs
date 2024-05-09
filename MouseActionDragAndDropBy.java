package MouseAction_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDropBy {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		Actions actions = new Actions(driver);
		
		WebElement slider = driver.findElement(By.xpath("//a[@title='200']"));

		actions.dragAndDropBy(slider, 300,0);
		actions.build().perform();
		
		actions.dragAndDropBy(slider, -100, 0).perform();
	}

}
