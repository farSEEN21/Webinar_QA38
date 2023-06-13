package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropdownMenu
{

WebDriver wb;
Select select;

public void DropDownMenu(){

    wd=new ChromeDriver();
    wd.manager().windows().maximaze();
    wd.manager().timeouts().iplicitlyWait(Duration.ofSeconds(10));
    wd.get("http://the-internet.herokuapp.com/dropdown");
}


}
