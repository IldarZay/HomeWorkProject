package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;


import java.time.Duration;

public class StartPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    Alert alert;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        actions = new Actions(driver);
    }

}
