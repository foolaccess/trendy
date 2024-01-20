package org.trendy.pages;


import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Loginpage {

    //driver //
    private WebDriver driver;

    //constructor//

    public Loginpage(WebDriver driver)

    {this.driver= driver;}


    /* methods with locators*/

    public void emailgirisyap(String email) {
        WebElement emailkutusu = driver.findElement(By.xpath("//input[@id='login-email']"));
        emailkutusu.sendKeys(email);


    }

    public void sifregirisyap(String sifre) {
        WebElement sifrekutusu = driver.findElement(By.xpath("//input[@id='login-password-input']"));
        sifrekutusu.sendKeys(sifre);

}

    public void loginclick() {

        WebElement loginbutton= driver.findElement(By.xpath("//body/div[@id='container']/div[@id='login-register']/div[3]/div[1]/form[1]/button[1]"));
        loginbutton.click();
    }







}


