package CarPoint;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class priceRange {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://car-point-8c5e4.web.app/allListings");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement PriceRange=driver.findElement(By.id("carPrice"));
        Select select=new Select(PriceRange);
        select.selectByIndex(6);
    }
}
