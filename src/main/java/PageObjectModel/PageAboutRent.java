package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageAboutRent {
    private final WebDriver webDriver;

    public PageAboutRent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    //Поле Когда привезти самокат
    private final By fieldWhenDeliverScooter = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //Поле Срок аренды
    private final By fieldPeriodRent = By.className("Dropdown-root");
    //Выбор Цвет самоката - Чёрный жемчуг
    private final By checkboxColorBlack = By.id("black");
    //Выбор Цвет самоката - Серая безысходность
    private final By checkboxColorGrey = By.id("grey");
    //Кнопка Заказать
    private final By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Заказать']");
    //Кнопка Да - подтверждение оформления заказа
    private final By buttonYes = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Да']");
    //Всплывающее окно после успешного оформления заказа
    public final By popupSuccessfullyOrder = By.xpath("//div[@class='Order_ModalHeader__3FDaJ' and text()= 'Заказ оформлен']");


    //Заполнение поля Когда привезти самокат
    public void clickFieldWhenDeliverScooter(String dataDeliver) {
        webDriver.findElement(fieldWhenDeliverScooter).click();
        webDriver.findElement(fieldWhenDeliverScooter).sendKeys(dataDeliver);
        webDriver.findElement(fieldWhenDeliverScooter).sendKeys(Keys.ENTER);
    }

    //Заполнение поля Срок аренды
    public void clickFieldPeriodRent() {
        webDriver.findElement(fieldPeriodRent).click();
        webDriver.findElement(By.xpath("//div[@class='Dropdown-option' and text()= 'сутки']")).click();
    }
    //Выбор чекбокс цвет самоката - чёрный жемчуг
    public void clickCheckboxColorBlack(){
        webDriver.findElement(checkboxColorBlack).click();
    }
    //Выбор чекбокс цвет самоката - серая безысходность
    public void clickCheckboxColorGrey(){
        webDriver.findElement(checkboxColorGrey).click();
    }
    //Нажать кнопку заказать после заполнение данных об аренде самоката
    public void clickButtonOrder(){
        webDriver.findElement(buttonOrder).click();
    }
    //Нажать на кнопку Да - подтверждение оформления заказа
    public void clickButtonYes(){
        webDriver.findElement(buttonYes).click();
    }
    //Проверка всплывающего окна после успешного оформления заказа
    public void checkPopupSuccessfullyOrder(){
        webDriver.findElement(popupSuccessfullyOrder).isDisplayed();
    }
}

