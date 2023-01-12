package PageObjectModel;

import org.openqa.selenium.By;

public class EntryDataPage {
    //Поле Имя
    public final By fieldName = By.xpath("//input[@placeholder='* Имя']");
    //Поле Фамилия
    public final By fieldSecondName = By.xpath("//input[@placeholder='* Фамилия']");
    //Поле Адрес: куда привезти заказ
    public final By fieldAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле Станция метро
    public final By fieldMetroStation = By.xpath("//input[@placeholder='* Станция метро']");
    //Поле Телефон: на него позвонит курьер
    public final By fieldNumberPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка Далее
    public final By buttonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Далее']");
}
