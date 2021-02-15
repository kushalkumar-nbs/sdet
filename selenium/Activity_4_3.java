package seleinumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.training-support.net/selenium/target-practice");
	     System.out.println(driver.getTitle());
	     WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id=\"third-header\"]"));
	     System.out.println(thirdHeader.getText());
	     WebElement fifthHeader = driver.findElement(By.xpath("//h5[contains(@class, 'green')]"));
	    System.out.println(fifthHeader.getCssValue("color"));
	    
	    WebElement violetButton = driver.findElement(By.xpath("//button[contains(@class, 'violet')]"));
	    System.out.println(violetButton.getAttribute("class"));
	   
	    WebElement greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
	    System.out.println(greyButton.getText());
	    
	    Thread.sleep(4000); 
	    driver.close();
	}
	
	

}
