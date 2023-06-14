package QA38.ilcaro.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{


    @Test
    public void positiveLogTest() {

        click(By.xpath("//a[text()=' Log in ']"));
        type(By.xpath("//input[@id='email']"), "maxmayzel@gmail.com");
        type(By.id("password"), "Rfrnec7_*");
//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("Rfrnec7_*");
        click(By.xpath("//button[@type='submit']"));
//        wd.findElement(By.xpath("//button[@type='submit']")).click();
        pause(5000);
        Assert.assertTrue(isElementDisplead(By.xpath("//div[@class='dialog-container']//h2")));


    }

    @Test
    public void negativloginTest() {
        click(By.xpath("//a[text()=' Log in ']"));
        type(By.xpath("//input[@id='email']"), "maxmayzel@gmail.com");
        type(By.id("password"), "Rfrnec _*");
        click(By.xpath("//button[@type='submit']"));
        pause(5000);
        Assert.assertTrue(isElementDisplead(By.xpath("//h2[normalize-space()='\"Login or Password incorrect\"']")));
        click(By.cssSelector("button[type='button']"));
    }

//    @AfterTest
//
//    public void tearDown(){wd.close();}

}
