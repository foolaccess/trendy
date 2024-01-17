package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.trendy.pages.Homepage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Homepagesteps {

    // driver//
    private WebDriver driver;
    private Homepage mainpage;



    @BeforeClass

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        mainpage = new Homepage(driver);

        driver.get("https://www.trendyol.com/");

        driver.manage().window().fullscreen();

        System.out.println("Test executed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void comingTologinPage() {

        mainpage.gotologinpage();
        //System.out.println("Test executed!");//

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.trendyol.com/giris?cb=%2F","test conducted");


    }
    @Test
    public void girisyap() {

        mainpage.emailgirisyap("test12.com");

        System.out.println("dsfadgf");

        mainpage.sifregirisyap("abcdasdad");

        System.out.println("sdfasdfdff");

        mainpage.loginclick();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.trendyol.com/giris?cb=%2F", "positive");
        


}}
