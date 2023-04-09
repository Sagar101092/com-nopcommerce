import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserNopCommerce {
    public static void main(String[] args) {


        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// maximize the browser
        // Open the url into browser
        driver.get(baseUrl);

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        System.out.println("Current Url :- " + driver.getCurrentUrl());

        // get page source
        System.out.println(driver.getPageSource());

        //find the login link element
        WebElement loginLink = driver.findElement(By.xpath("//*[@class='header-links']//li//a[text()=\"Log in\"]"));
        loginLink.click();

        //find the email element
        WebElement emailid = driver.findElement(By.id("Email"));
        emailid.sendKeys("xyz@email.com");

        // find the password element
        driver.findElement(By.id("Password")).sendKeys("xyz15346");

        // close the driver
         driver.close();
    }
}
