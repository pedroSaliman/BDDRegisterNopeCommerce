package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends Base{
    public Register(WebDriver driver) {
        super(driver);
    }
    private By gender=By.id("gender-male");
    private By fname=By.id("FirstName");
    private By lname=By.id("LastName");
    private By email=By.id("Email");
    private By pass=By.id("Password");
    private By conpass=By.id("ConfirmPassword");
    private By registerbtn=By.id("register-button");
    private By result=By.className("result");

    public void checkgender()
    {
        driver.findElement(gender).click();
    }
////////////////////////////////////
    public void setfname(String thefname)
    {
        driver.findElement(fname).sendKeys(thefname);
    }
    ////////////////////////////
    public void setlname(String thelname)
    {
        driver.findElement(lname).sendKeys(thelname);
    }
    //////////////////////////////////
    public void setemail(String theemail)
    {
        driver.findElement(email).sendKeys(theemail);
    }
    /////////////////////////////////
    public void setpass(String thepass)
    {
        driver.findElement(pass).sendKeys(thepass);
    }
    /////////////////////////////
    public void setconpassword(String theconpass)
    {
        driver.findElement(conpass).sendKeys(theconpass);
    }
    ///
    public void registerbtn()
    {
        driver.findElement(registerbtn).click();
    }
    ////////////////////
    public String text()
    {
        String txt=driver.findElement(result).getText();
        return txt;
    }



}
