package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver webDriver;
    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    //Кнопка Заказать в правом верхнем углу главного экрана
    private final By orderButton = By.className("Button_Button__ra12g");
    //Кнопка Заказать в середине страницы
    private final By orderButtonMiddle = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()= 'Заказать']");
    //Нажать кнопку заказать в правом верхнем углу главного экрана
    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }
    //Нажать на кнопку заказать в середине страницы
    public void clickOrderButtonMiddle(){
        webDriver.findElement(orderButtonMiddle).click();
    }
}
