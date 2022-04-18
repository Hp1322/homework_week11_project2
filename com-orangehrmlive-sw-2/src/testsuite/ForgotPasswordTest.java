package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Find forgot password link and click on it
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
        forgotPassword.click();

        //Verify the text forgot your password
        //This is from requirement
        String expectedText = "Forgot Your Password?";

        //Find forgot your password text element and get the text
        WebElement actualText1 = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualText = actualText1.getText();

        //Validate actual and expected text
        Assert.assertEquals("Unable to navigate on forgot password page", expectedText, actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }


}
