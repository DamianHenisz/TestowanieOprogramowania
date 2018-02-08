package pl.lodz.uni.math.selenium;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SimpleFormDemo {

    protected static WebDriver driver;
   @Before()
    public void BeforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "C:/TestSelenium/chromedriver.exe");

    }
    @After()
    public  void AfterClass()
    {
        driver.close();

    }

    @Test()
    public  void singleInputField()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.id("user-message")).sendKeys("Damian");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();

        String  element =  driver.findElement(By.id("display")).getText();
        assertEquals(element, "Damian" );
        System.out.println("Succes Test");
    }

    @Test()
    public  void twoInputFields()
    {
        driver = new ChromeDriver();
       driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.id("sum1")).sendKeys("5");
        driver.findElement(By.id("sum2")).sendKeys("2");
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();

      String element1 =  driver.findElement(By.id("displayvalue")).getText();
        assertEquals(element1, "7" );
        System.out.println("Succes Test");


    }
}
