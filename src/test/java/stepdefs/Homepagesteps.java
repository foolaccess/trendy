package stepdefs;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.trendy.pages.Homepage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


    public class Homepagesteps{

    // driver//
    private WebDriver driver;
    private Homepage homepage;



    @BeforeClass

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        homepage = new Homepage(driver);

        driver.get("https://www.trendyol.com/");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement genderpopup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@title='Kapat'])[1]")));
        genderpopup.click();

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


}
