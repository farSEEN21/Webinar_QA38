package QA38.ilcaro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeTest
    public void SetUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.navigate().to("http://ilcarro.web.app/");

    }

    public boolean isElementDisplead(By locator) {
         return wd.findElement(locator).isDisplayed();
     }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);

    }
}
