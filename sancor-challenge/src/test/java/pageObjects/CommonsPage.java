package pageObjects;

import org.openqa.selenium.By;

public class CommonsPage {
    public static By getInputUsername() {
        return By.xpath(".//input[@id='email']");
    }

    public static By getInputPassword() {
        return By.xpath(".//input[@id='password']");
    }

    public static By getSubmitLogin() {
        return By.xpath(".//button[@id='cd_login_button']");
    }

    public static By getLoader() {
        return By.xpath(".//img[@alt='sancor loading']");
    }
}