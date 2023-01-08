package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class EntryDataPage {
    private final WebDriver webDriver;

    public EntryDataPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Поле Имя
    private final By fieldName = By.xpath("//input[@placeholder='* Имя']");
    //Поле Фамилия
    private final By fieldSecondName = By.xpath("//input[@placeholder='* Фамилия']");
    //Поле Адрес: куда привезти заказ
    private final By fieldAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле Станция метро
    private final By fieldMetroStation = By.xpath("//input[@placeholder='* Станция метро']");
    //Поле Телефон: на него позвонит курьер
    private final By fieldNumberPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка Далее
    public final By buttonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Далее']");
    //Заполнение поля Имя
    public void fillingFieldName(String name){
        webDriver.findElement(fieldName).sendKeys(name);
    }
    //Заполнение поля Фамилия
    public void fillingFieldSecondName(String secondName){
        webDriver.findElement(fieldSecondName).sendKeys(secondName);
    }
    //Заполнение поля Адрес: куда привезти заказ
    public void fillingFieldAddress(String address){
        webDriver.findElement(fieldAddress).sendKeys(address);
    }
    //Заполнение поля Станция метро
    public void fillingFieldMetroStation(String station){
        webDriver.findElement(fieldMetroStation).click();
        webDriver.findElement(By.className("select-search__input")).sendKeys(station);
        webDriver.findElement(By.className("select-search__select")).click();
    }
    //Заполнение поля Телефон: на него позвонит курьер
    public void fillingFieldNumberPhone(String number){
        webDriver.findElement(fieldNumberPhone).sendKeys(number);
    }
    //Нажатие кнопки Далее
    public void touchButtonNext(){
        webDriver.findElement(buttonNext).click();
    }
}
