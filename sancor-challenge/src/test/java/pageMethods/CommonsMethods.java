package pageMethods;

import configuration.Iproperties;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.aeonbits.owner.ConfigFactory;
import org.awaitility.Awaitility;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CommonsPage;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Random;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class CommonsMethods {
    public static WebDriver driver;
    public static Iproperties props = ConfigFactory.create(Iproperties.class);

    public static void goToUrl() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(props.url());
    }

    @AfterStep
    public static void takeScreenshots() {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    }

    @After
    public static void driverQuit(Scenario scenario) {
        System.out.println("Finishing");
        if (driver != null) {
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
            }
            driver.quit();
        }
    }

    public static void waitToPageLoad() {
        WebDriverWait wait = new WebDriverWait(CommonsMethods.driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(CommonsPage.getLoader()));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(CommonsPage.getLoader()));
    }

    public static void login() {
        elementWaitDisplayed(CommonsPage.getInputUsername(), 15);
        elementSendText(CommonsPage.getInputUsername(), props.user());
        elementSendText(CommonsPage.getInputPassword(), props.password());

        elementClick(CommonsPage.getSubmitLogin());
    }

    public static void elementClick(By element) {
        WebDriverWait wait = new WebDriverWait(CommonsMethods.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        CommonsMethods.driver.findElement(element).click();
    }

    public static void elementSendText(By element, String text) {
        WebDriverWait wait = new WebDriverWait(CommonsMethods.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        CommonsMethods.driver.findElement(element).sendKeys(text);
    }

    public static void pressKey(Keys key) throws InterruptedException {
        Thread.sleep(500);
        Actions a = new Actions(driver);
        a.sendKeys(key).build().perform();
    }

    public static void scrollToElement(By element) {
        WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elemento);
    }

    public static void checkElementContainsText(By element, String text) {
        Awaitility.await().atMost(15, SECONDS).until(() -> {
            try {
                assertTrue((CommonsMethods.driver.findElement(element).getText()).contains(text));
                System.out.println("Element text " + CommonsMethods.driver.findElement(element).getText() + " contains " + text);
                return true;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                return false;
            }
        });
    }

    public static void checkElementContainsValue(By element, String text) {
        Awaitility.await().atMost(20, SECONDS).until(() -> {
            try {
                assertTrue((CommonsMethods.driver.findElement(element).getAttribute("value")).contains(text));
                System.out.println("Element text " + CommonsMethods.driver.findElement(element).getText() + " contains " + text);
                return true;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                return false;
            }
        });
    }

    public static String generateRandomPhone() {
        Random generator = new Random();
        return "4499999" + generator.nextInt(9999 - 1000) + 1000;
    }

    public static void viewTextElementDisplayed(By element) {
        String txtElement = driver.findElement(element)
                .getText();
        System.out.println("Element '" + txtElement + "' is displayed");
    }

    public static void elementWaitDisplayed(By element, int tiempoEspera) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoEspera));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
