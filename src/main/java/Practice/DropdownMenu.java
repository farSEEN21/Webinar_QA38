package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class DropdownMenu
{

WebDriver wd;

Select select;
@Test
public void DropDownMenu(){

    wd=new ChromeDriver();
    wd.manage().window().maximize();

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
    wd.get("http://the-internet.herokuapp.com/dropdown");
WebElement ddown=wd.findElement(By.id("dropdown"));
    select= new Select(ddown);
    select.selectByValue("2");



}


}
