package HWClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Web Orders Login")) {
            System.out.println("The Title of the Page is as expected");
        } else {
            System.out.println("title doesn`t match");
        }

        driver.quit();










    }
}
