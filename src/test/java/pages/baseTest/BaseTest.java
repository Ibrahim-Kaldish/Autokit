package pages.baseTest;
import driverFactory.GetChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    public static WebDriver driver;
    public SoftAssert softAssert;

    @BeforeMethod
    public void setUp(){
        driver = GetChromeDriver.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        GetChromeDriver.quitDriver();
        driver = null;
    }
}
