package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstSelenyumClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //driver.navigate().to("https://www.toyota.com.tr");
        /*driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();*/
        //System.out.println(driver.manage().window().getSize());
        //System.out.println(driver.manage().window().getPosition());
        //driver.manage().window().setPosition(new Point(300,400));
        //driver.manage().window().setSize(new Dimension(400,400));
    }
}
