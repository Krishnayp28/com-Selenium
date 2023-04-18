package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTes extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click();//Find the Computers link and click on it
        String expectedMessage = "Computers";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();// Find the Computers text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Computers page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        driver.findElement(By.linkText("Electronics")).click();// Find Electronics link and click on it
        String expectedMessage = "Electronics";
        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();// Find the Electronics text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Electronics page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToApparelPageSuccessfully() {

        driver.findElement(By.xpath("//a[@href='/apparel']")).click();//Find the Apparel link and click on it
        String expectedMessage = "Apparel";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//a[@href='/apparel']")).getText();// Find the Apparel text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Apparel page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();//Find the Digital Downloads link and click on it
        String expectedMessage = "Digital downloads";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//a[@href='/digital-downloads']")).getText();// Find the Digital Downloads text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Digital Downloads page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToBooksPageSuccessfully() {

        driver.findElement(By.xpath("//a[@href='/books']")).click();//Find the books link and click on it
        String expectedMessage = "Books";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//a[@href='/books']")).getText();// Find the Books text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Books page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToJewelryPageSuccessfully() {

        driver.findElement(By.xpath("//a[@href='/jewelry']"));//Find the Jewelry link and click on it
        String expectedMessage = "Jewelry";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//a[@href='/jewelry']")).getText();// Find the Jewelry text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Jewelry page.",expectedMessage, actualMessage);// Validating actual and expected message
    }

    @Test // JUnit Annotation which will allow executing this method
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        driver.findElement(By.xpath("//a[@href='/gift-cards']")).click();//Find the Gift Cards link and click on it
        String expectedMessage = "Gift Cards";//Expected text from requirement
        String actualMessage = driver.findElement(By.xpath("//a[@href='/gift-cards']")).getText();// Find the Gift Cards text element and get the text storing in reference variable
        Assert.assertEquals("User was not navigated to Gift Cards page.",expectedMessage, actualMessage);// Validating actual and expected message
    }
    @After
    public void close(){
        closeBrowser();
    }


}


