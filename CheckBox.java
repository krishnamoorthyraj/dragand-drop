package Draganddrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91989\\Desktop\\geckodriver.exe");
		                           WebDriver Driver = new FirefoxDriver();
		                           Driver.get("http://www.leafground.com/pages/checkbox.html");// TODO Auto-generated method stub
		                           WebElement Checkbox = Driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));
		                           Checkbox.click();
		                           WebElement Selenium = Driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		                           boolean select = Selenium.isSelected();
		                           System.out.println(select);
		                           WebElement firstElement = Driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]"));
		                           if (firstElement.isSelected()) {
		                                         firstElement.click();
		                           }
		                            WebElement secondElement = Driver
		                                                       .findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		                           if (secondElement.isSelected())
                                   {
		                              secondElement.click();
		                           }
                         	                         
		                           List<WebElement> AllSelect = Driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']//following-sibling::div/input"));
	 		                       System.out.println("Number of Check boxes : "+ Integer.toString(AllSelect.size()));
	 		                       for(WebElement cb:AllSelect)
		                            {
		                             cb.click();
		                             System.out.println("All check boxes have been checked");
		                            }

		
		                    
	}

}
