package org.trendy.pages;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Homepage {
    //driver //
private WebDriver driver;




    //constructor//

    public Homepage(WebDriver driver)

    {this.driver= driver;}


    /* methods with locators*/

    public void gotologinpage(){
        WebElement logincontainer= driver.findElement(By.cssSelector("div.wrapper div.header div:nth-child(3) div:nth-child(1) div:nth-child(2) div.account-navigation-wrapper > div.account-nav-item.user-login-container:nth-child(1)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(logincontainer).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginpagebutton= driver.findElement(By.xpath("//div[contains(text(),'Giriş Yap')]"));
        actions.click(loginpagebutton);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }

    public void emailgirisyap(String email) {
        WebElement emailkutusu = driver.findElement(By.xpath("//input[@id='login-email']"));
        emailkutusu.sendKeys(email);


    }

    public void sifregirisyap(String sifre) {
        WebElement sifrekutusu = driver.findElement(By.xpath("//input[@id='login-password-input']"));
        sifrekutusu.sendKeys(sifre);

    }

    public void loginclick(){

    WebElement loginbutton= driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[3]/div[1]/form[1]/button[1]/span[1]"));
    loginbutton.click();
    }


}
