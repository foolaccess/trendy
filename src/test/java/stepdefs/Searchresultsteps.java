package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.trendy.pages.Homepage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.trendy.pages.Searchresultpage;



public class Searchresultsteps {


    // driver//
    private WebDriver driver;
    private Homepage Searchresultspage;



    @BeforeClass

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        Searchresultspage = new Homepage(driver);

        driver.get("https://www.trendyol.com/");

        driver.manage().window().maximize();

        System.out.println("Test executed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    
    @Test(description = "test description")
    public void testName() {


        Searchresultpage.sendkeys();
        Assert.assertTrue(true, "String message");

    }





}
