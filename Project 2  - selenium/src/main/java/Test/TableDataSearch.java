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

public class TableDataSearch {

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
    public  void filterDataStatus()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
        driver.findElement(By.xpath("//*[@id='task-table-filter']")).sendKeys("John");
        assertTrue(driver.getPageSource().contains("Smith"));
        System.out.println("Succes Test");

    }

    @Test()
    public  void filterInputs()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
        driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/div/div/button")).click();
        driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[1]/input")).sendKeys( "2");
        assertTrue(driver.getPageSource().contains("jacobs"));
        assertTrue(driver.getPageSource().contains("Daniel"));
        assertTrue(driver.getPageSource().contains("Karano"));
        System.out.println("Succes Test");


    }




}