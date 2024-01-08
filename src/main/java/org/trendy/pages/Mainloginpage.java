package org.trendy.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainloginpage {
    //driver //
private WebDriver driver;



    //constructor//

    public Mainloginpage(WebDriver driver)

    {this.driver= driver;}


    /* locators// */



    /* methods with locators*/

    public void emailgirisyap(String email) {
        WebElement emailkutusu = driver.findElement(By.xpath("//input[@id='login-email']"));
        emailkutusu.sendKeys(email);


}

    public void sifregirisyap(String sifre) {
        WebElement sifrekutusu = driver.findElement(By.xpath("//input[@id='login-password-input']"));
        sifrekutusu.sendKeys(sifre);


}}
