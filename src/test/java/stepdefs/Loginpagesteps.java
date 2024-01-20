package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.trendy.pages.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.trendy.pages.Loginpage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Loginpagesteps {


    private WebDriver driver;
    private Loginpage loginpage;
    @BeforeClass

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

        loginpage = new Loginpage(driver);

        driver.get("https://www.trendyol.com/giris?cb=%2F");

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
public void girisyap() {


       loginpage.emailgirisyap("test12.com");

        System.out.println("dsfadgf");

        loginpage.sifregirisyap("abcdasdad");

        System.out.println("sdfasdfdff");

        loginpage.loginclick();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.trendyol.com/giris?cb=%2F", "positive");


        }

    @Test
    public void girisyap2() {

        WebElement errormessage= driver.findElement(By.xpath("//body/div[@id='container']/div[@id='login-register']/div[3]/div[1]/span[2]"));
        String act=errormessage.getText();

        Assert.assertEquals(act,"Lütfen geçerli bir e-posta adresi giriniz.");
        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);



    }}