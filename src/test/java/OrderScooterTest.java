import PageObjectModel.EntryDataPage;
import PageObjectModel.PageAboutRent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    WebDriver driver = new ChromeDriver();
    private final String name;
    private final String secondName;
    private final String address;
    private final String metroStation;
    private final String numberPhone;
    private final String whenDeliver;
    private final By orderButton;
    private final By checkboxColor;

    public OrderScooterTest(String name,String secondName,String address,String metroStation,String numberPhone,String whenDeliver,By orderButton, By checkboxColor) {
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.metroStation = metroStation;
        this.numberPhone = numberPhone;
        this.whenDeliver = whenDeliver;
        this.orderButton = orderButton;
        this.checkboxColor = checkboxColor;
    }
    @Parameterized.Parameters
    public static Object[][] getTextQuestions(){
        return new Object[][]{
                {"Дмитрий","Алексеев","город Грусть","Домодедовская","89999999999","05.05.2023",By.className("Button_Button__ra12g"),By.id("black")},
                {"Яна","Тестовая","проспект разочарования","Царицыно","81111111111","07.07.2023",By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Заказать']"),By.id("grey")},
                {"Yana","Test","Moscow","Random","800000000000000000","05.05.2023",By.className("Button_Button__ra12g"),By.id("black")}
        };
    }
    @Test
    public void successfulScooterOrder(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
        EntryDataPage data = new EntryDataPage();
        driver.findElement(orderButton).click();
        driver.findElement(data.fieldName).sendKeys(name);
        driver.findElement(data.fieldSecondName).sendKeys(secondName);
        driver.findElement(data.fieldAddress).sendKeys(address);
        driver.findElement(data.fieldMetroStation).sendKeys(metroStation);
        driver.findElement(By.className("select-search__select")).click();
        driver.findElement(data.fieldNumberPhone).sendKeys(numberPhone);
        driver.findElement(data.buttonNext).click();
        PageAboutRent rent = new PageAboutRent();
        driver.findElement(rent.fieldWhenDeliverScooter).sendKeys(whenDeliver);
        driver.findElement(rent.fieldWhenDeliverScooter).sendKeys(Keys.ENTER);
        driver.findElement(rent.fieldPeriodRent).click();
        driver.findElement(By.xpath("//div[@class='Dropdown-option' and text()= 'сутки']")).click();
        driver.findElement(checkboxColor).click();
        driver.findElement(rent.buttonOrder).click();
        driver.findElement(rent.buttonYes).click();
        driver.findElement(rent.popupSuccessfullyOrder).isDisplayed(); //не работает
        driver.quit();
    }
}
