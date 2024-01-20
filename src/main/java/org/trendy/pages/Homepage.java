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
protected WebDriver driver;

 //constructor//

    public Homepage(WebDriver driver)

    {this.driver= driver;}


    /* methods with locators*/

    public void gotologinpage(){
        WebElement logincontainer= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(logincontainer).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginpagebutton= driver.findElement(By.cssSelector("div.wrapper div.header div.account-navigation-wrapper div.account-nav-item.user-login-container:nth-child(1) div.new-login-dropdown div.user-notloggedin-container.container-padding > div.login-button"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginpagebutton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    }


