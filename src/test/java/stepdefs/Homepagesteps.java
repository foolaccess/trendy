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


public class Homepagesteps {

    // driver//
    private WebDriver driver;
    private Homepage homepage;



    @BeforeClass

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        homepage = new Homepage(driver);

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


    @Test
    public void comingTologinPage() {

        homepage.gotologinpage();
        //System.out.println("Test executed!");//

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.trendyol.com/giris?cb=%2F","test conducted");

    }
    @Test
    public void girisyap() {

        homepage.emailgirisyap("test12.com");

        System.out.println("dsfadgf");

        homepage.sifregirisyap("abcdasdad");

        System.out.println("sdfasdfdff");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Logbutton= driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[3]/div[1]/form[1]/button[1]/span[1]"));

        Logbutton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.trendyol.com/dgiris?cb=%2F", "positive");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}}
