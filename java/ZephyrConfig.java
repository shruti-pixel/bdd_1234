import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZephyrConfig {
    WebDriver driver;

    @Test
    public void test1()
    {
        System.out.println("exec ");

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.google.co.in");
        driver.close();
    }
}
