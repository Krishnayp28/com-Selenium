package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        //Find the Register link and click  on register link
        WebElement registerLink = driver.findElement(By.xpath("//a[@class ='ico-register']"));
        registerLink.click();
        String expectedMessage ="Register";

        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
    }
    public static String getRandomEmail() { // Method generating Random email everytime
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder random = new StringBuilder();
        Random rnd = new Random();
        while (random.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            random.append(chars.charAt(index));
        }
        String email = random.toString() + "@gmail.com";
        return email;
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        // Click on register link
        WebElement registerLink = driver.findElement(By.xpath("//a[@class ='ico-register']"));
        registerLink.click();
        // select gender radio  field button
        WebElement genderField = driver.findElement(By.name("Gender"));
        genderField.sendKeys("Male");
        // Type the firstname and enter firstname field
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Jigna");
        // Type lastname and enter last name field
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel");
        //select Day Month and Year and enter
        WebElement dayFiled = driver.findElement(By.name("DateOfBirthDay"));
        dayFiled.sendKeys("15");
        WebElement monthFiled = driver.findElement(By.name("DateOfBirthDay"));
        monthFiled.sendKeys("August");
        WebElement yearFiled = driver.findElement(By.name("DateOfBirthDay"));
        yearFiled.sendKeys("1981");
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys(getRandomEmail());
        //Find the Password Field Element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("Jigna123");
        // Find the Confirm Password field element and send confirm password on confirm password field
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Jigna123");
        // Find the register Button element and click
        WebElement registerButton = driver.findElement(By.name("register-button"));
        registerButton.click();
        String expectMessage = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class = 'result']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(" user was  not able to register",expectMessage,actualMessage);

    }
       @After
       public void close(){
            closeBrowser();
    }
}
