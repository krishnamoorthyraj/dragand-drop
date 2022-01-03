package Draganddrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91989\\Desktop\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/table");
		  WebElement table = driver.findElement(By.id("simpletable"));

		//WebElement table = driver.findElement(
				//By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));

		List<WebElement> headers = table.findElements(By.tagName("th"));

		for (WebElement header : headers) {

			String text = header.getText();

			System.out.println(text);

		}

		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));

		int size = allrows.size();

		System.out.println("Rows size: " + size);

		if (size == 3) {

			System.out.println("Pass");

		} else
			System.out.println("fail");

		
		  for (WebElement row : allrows) {
		  
		  List<WebElement> colums = row.findElements(By.tagName("td"));
		  
		  WebElement firstColumn = colums.get(0);
		  
		  System.out.println(firstColumn.getText());
		  
		  }
		 
		
		  for (int i = 0 ; i < size; i++) {
		  
		  List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
		  
		  WebElement lastname = rows.get(1);
		  
		  String text = lastname.getText();
		  
		  System.out.println(text);
		  
		  if(text.equals("Chatterjee")) {
		  
		  WebElement input = rows.get(3).findElement(By.tagName("input"));
		  
		  input.click();
		  
		  break;
		  
		  }
		 

	}

//driver.quit();

}
	
	
}


