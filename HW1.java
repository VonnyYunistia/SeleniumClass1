package HWClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.name("Customer first name: ")).sendKeys("Ciwit");
        driver.findElement(By.name("Customer last name: ")).sendKeys("Permadi");
        driver.findElement(By.name("customer.address.street")).sendKeys("my address is...");
        driver.findElement(By.name("customer.address.city")).sendKeys("Cumming");
        driver.findElement(By.name("customer.address.state")).sendKeys("GA");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("30028");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+3454678854");
        driver.findElement(By.name("customer.ssn")).sendKeys("0123456789");
        driver.findElement(By.name("customer.username")).sendKeys("secret");
        driver.findElement(By.name("customer.password")).sendKeys("secret");
        driver.findElement(By.name("repeatedPassword")).sendKeys("secret");

        String url= driver.getCurrentUrl();
        System.out.println(url);

        driver.quit();












    }













}
