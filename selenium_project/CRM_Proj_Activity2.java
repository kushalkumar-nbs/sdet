package project_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Proj_Activity2 {

WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	    
	  @Test
	    public void testCase2() {
		  WebElement getHeaderUrl = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img"));
	        System.out.println("Text in element: " + getHeaderUrl.getAttribute("src"));
	         driver.close();
	    }
	      

}
