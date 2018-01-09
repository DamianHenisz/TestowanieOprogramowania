package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


import static jdk.nashorn.internal.objects.Global.undefined;
import static org.junit.Assert.*;


public class Other {
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
    public void inputFormSubmit()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Damian");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Henisz");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("damianh1293@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8455551212");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Matejki 22");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Lodz");
        Select selectday =new Select  (driver.findElement(By.xpath("//select[@name='state']")));
        selectday.selectByVisibleText("Arizona");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("4554");
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("efefrfrfrfrff");

        driver.findElement(By.xpath("//button[@class='btn btn-default'][@type='submit']")).click();
        System.out.println("Succes Test");

    }

    @Test()
    public void ajaxFormSubmitWithLoadingIcon()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Tytul");
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("komentarz");

        driver.findElement(By.id("btn-submit")).click();
        assertTrue(driver.getPageSource().contains("Form submited Successfully!"));

        System.out.println("Succes Test");

    }

    @Test()
    public void dynamicDataLoading()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");

        driver.findElement(By.id("save")).click();
             try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    assertNotNull(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/img")));


           System.out.println("Succes Test");


    }

    @Test
    public void tableSortAndSearch()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/table-sort-search-demo.html");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/label/input")).sendKeys("Junior");
        assertTrue(driver.getPageSource().contains("$86,000/y"));
        System.out.println("Succes Test");
    }

    @Test
    public void bootstrapAlertMessages()
    {
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
       driver.findElement(By.xpath("//button[@id='normal-btn-info']")).click();
       assertFalse(driver.getPageSource().contains("I'm a normal info message. To close use the appropriate button."));
        System.out.println("Succes Test");
    }
}
