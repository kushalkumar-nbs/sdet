package project_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Proj_Activity6 {
	WebDriver driver;
	   @BeforeTest
	    public void beforeMethod() {
	        driver = new FirefoxDriver();
	        driver.get("http://alchemy.hguy.co/crm");
	    }
  @Test
  public void testCase6() {
      WebElement firstName = driver.findElement(By.id("user_name"));
      WebElement lastName = driver.findElement(By.id("username_password"));
      firstName.sendKeys("admin");
      lastName.sendKeys("pa$$w0rd");
      driver.findElement(By.id("bigbutton")).click();
      WebElement NavigationnMenu = driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]"));
      Assert.assertEquals(NavigationnMenu.getText(), "ACTIVITIES");
      driver.close();
  }
}
