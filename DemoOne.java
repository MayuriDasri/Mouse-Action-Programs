package MouseAction_ActionClass;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	
	public static void main(String[] args) {
	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://tutorialsninja.com/demo/");
	
					if(driver!=null)
					{
						try 
						{
							driver.close();
						}catch(Throwable e)
						{
							System.out.println(e.getMessage());
						}
						finally
						{
							driver.quit();
						}
					}
	}

}

