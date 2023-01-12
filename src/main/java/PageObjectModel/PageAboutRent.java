package PageObjectModel;

import org.openqa.selenium.By;

public class PageAboutRent {
    //Поле Когда привезти самокат
    public final By fieldWhenDeliverScooter = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //Поле Срок аренды
    public final By fieldPeriodRent = By.className("Dropdown-root");
    //Кнопка Заказать
    public final By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Заказать']");
    //Кнопка Да - подтверждение оформления заказа
    public final By buttonYes = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Да']");
    //Всплывающее окно после успешного оформления заказа
    public final By popupSuccessfullyOrder = By.xpath("//div[@class='Order_ModalHeader__3FDaJ' and text()= 'Заказ оформлен']");
}

