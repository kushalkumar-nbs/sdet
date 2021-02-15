package seleinumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Kushal");
        lastName.sendKeys("Mittal");
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
                driver.close();
	}

}
