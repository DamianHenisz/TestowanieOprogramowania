package pl.lodz.uni.math.selenium;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RadioButtonsDemo {

    protected static WebDriver driver;
    @BeforeClass()
    public static void BeforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "C:/TestSelenium/chromedriver.exe");


    }
    @After()
    public  void AfterClass()
    {
        driver.close();

    }

    @Test()
    public  void radioButtonDemo()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("buttoncheck")).click();

        assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
        System.out.println("Succes Test");

    }


    @Test()
    public  void groupRadioButtonsDemo()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.findElement(By.xpath("//input[@value='Male'][@name='gender']")).click();
        driver.findElement(By.xpath("//input[@value='5 - 15']")).click();

        driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();
        assertTrue(driver.getPageSource().contains("Sex : Male"));
        assertTrue(driver.getPageSource().contains("Age group: 5 - 15"));
        System.out.println("Succes Test");

    }



}
