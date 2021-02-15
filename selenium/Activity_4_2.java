package seleinumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.training-support.net/selenium/simple-form");
	     System.out.println(driver.getTitle());
	     WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
	     WebElement lastName = driver.findElement(By.xpath("//input[@id ='lastName']"));
	     firstName.sendKeys("Kushal");
	     lastName.sendKeys("Kumar");
	     driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kushal.mittal@gmail.com");
	     driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("7387000895");
	     driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	     Thread.sleep(5000);
	}

}
