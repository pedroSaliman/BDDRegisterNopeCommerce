package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By registerbtnlink=By.className("ico-register");
    public Register clicktoregister()
    {
        driver.findElement(registerbtnlink).click();
        return new Register(driver);
    }
}
