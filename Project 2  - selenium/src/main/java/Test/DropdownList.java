package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DropdownList {

    protected static WebDriver driver;
    @BeforeClass()
    public static void Before()
    {
        System.setProperty("webdriver.chrome.driver", "C:/TestSelenium/chromedriver.exe");

    }
    @After()
    public  void After()
    {
        driver.close();

    }

    @Test()
    public  void selectListDemo ()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Select selectday =new Select  (driver.findElement(By.id("select-demo")));
        selectday.selectByVisibleText("Monday");

        assertTrue(driver.getPageSource().contains("Day selected :- Monday"));
        System.out.println("Succes Test");
    }

    @Test()
    public  void multiSelectListDemo()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        Select selectday =new Select  (driver.findElement(By.id("multi-select")));
        selectday.selectByVisibleText("Florida");
        driver.findElement(By.id("printMe")).click();
        assertFalse(driver.getPageSource().contains("First selected option is: Florida"));
        System.out.println("Succes Test");


    }




}


