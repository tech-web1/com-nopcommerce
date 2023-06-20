package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2";


        //Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        //open the Url into Browser
        driver.get(baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the page
        String title=driver.getTitle();
        System.out.println("page Title is"+title);
        //Print the Current Url
        System.out.println("Current URL"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source"+driver.getPageSource());

        //Find the Email Field Element
        WebElement emailfield=driver.findElement(By.id("Email"));
        emailfield.sendKeys("yana.l@gmail.com");

        //Type the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("Prime123");



        //Close The Browser
        driver.close();
    }
}
