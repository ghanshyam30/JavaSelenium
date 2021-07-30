package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
// Import all required pages for Login
import pages.Login;

public class LoginTest{
    WebDriver driver;
    Login flipkartSignIn;
    @Test
    public void setup(){
        System.setProperty("webdriver.gecko.driver","/home/thebadcoder/TestWorkspace/drivers/geckodriver");
        driver = new FirefoxDriver();
        String baseURL = "https://www.flipkart.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
    }
    
    @Test
    public void credentialsTest(){
        flipkartSignIn = new Login(driver);
        flipkartSignIn.fillUsername("dummyuser");
        flipkartSignIn.fillPassword("dummypassword");
        flipkartSignIn.clickLogin();
    } 

    // @Test
    // public void tearDown(){
    //     driver.close();
    // }
}