package project_CRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Proj_Activity1 {

WebDriver driver;
    
@BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	  @Test
	    public void testCase1() {
	        //This test case will pass
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        Assert.assertEquals(title, "SuiteCRM");
	        driver.close();
	    }

}
