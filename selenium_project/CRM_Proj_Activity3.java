package project_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRM_Proj_Activity3 {

WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void testCase3() {
		  WebElement getfooterText = driver.findElement(By.id("admin_options"));
	        System.out.println("Text in element: " + getfooterText.getText());
	         driver.close();
    
}
}