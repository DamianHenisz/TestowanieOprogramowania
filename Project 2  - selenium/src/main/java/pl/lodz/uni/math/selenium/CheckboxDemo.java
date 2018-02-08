package pl.lodz.uni.math.selenium;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class  CheckboxDemo{

    protected static WebDriver driver;
    @BeforeClass()
    public static void BeforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "C:/TestSelenium/chromedriver.exe");

    }
    @AfterClass()
    public static void AfterClass()
    {
        driver.close();

    }

    @Test()
    public  void singleCheckboxDemo()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.id("isAgeSelected")).click();

        assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
        System.out.println("Succes Test");


    }

    @Test()
    public  void multipleCheckboxDemo()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[3]/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


      WebElement button = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
       assertNotNull(button);
        System.out.println("Succes Test");
    }
}
