import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class BeforeAndAfterAllTest {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        openWebsite();
        closeButtonCookie();
    }
    //Открытие сайта
    public void openWebsite(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    //Закрытие уведомления о кук файлах
    public void closeButtonCookie(){
        driver.findElement(By.id("rcc-confirm-button")).click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
