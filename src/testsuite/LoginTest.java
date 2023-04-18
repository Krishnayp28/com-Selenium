package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

        @Before
                public void setUp(){
            openBrowser(baseUrl);
        }
        @Test
                public void userShouldNavigateToLoginPageSuccessfully(){
            // Find login link  and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            String expectedMessage = "Welcome, Please Sign In!";

            WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Not redirected to login page" ,expectedMessage,actualMessage);
        }
        @Test
       public void userShouldLoginSuccessfullyWithValidCredentials(){
            // Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
           // Find  the email filed Element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Type the email address to email field element
            emailField.sendKeys("jignayp@yahoo.co.uk");
            // Find the Password filed element and sent  password on password field
            driver.findElement(By.name("Password")).sendKeys("Jigna123");
           // Find the Login button element and click
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginButton.click();
            //Find the logout link element and click on logout
           WebElement logoutLink =  driver.findElement(By.xpath("//a[@class ='ico-logout']"));
           logoutLink.click();

        }
        @Test
         public void verifyTheErrorMessage(){
            // Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            // Find  the email filed Element
           WebElement emailField = driver.findElement(By.id("Email"));
            // Type the email address to email field element
            emailField.sendKeys("jignayp@yahoo.co.uk");
            // Find the Password filed element and sent  password on password field
            driver.findElement(By.name("Password")).sendKeys("Jigna213");
            // Find the Login button element and click
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginButton.click();
            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                    "No customer account found";
            WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Error message not displayed",actualMessage,expectedMessage);


        }
        @After
        public void close(){
           closeBrowser();
        }
}

