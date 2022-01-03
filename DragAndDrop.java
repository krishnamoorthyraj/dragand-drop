package Draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91989\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		//driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag =driver.findElement(By.id("draggable"));
		
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.v
		System.out.println("wait for 30 sec");
		WebElement drop =driver.findElement(By.id("droppable"));
	//	WebElement rdrop=driver.findElement(By.id("mydiv"));
Actions action = new Actions(driver);

	action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	//action.clickAndHold(drag).moveToElement(rdrop).release(rdrop).build().perform();
	//action.dragAndDrop(rdrop, drag);
	//driver.wait(3000);
	//driver.close();
	//driver.quit();
	}

}
