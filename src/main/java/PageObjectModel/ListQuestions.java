package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListQuestions {
    private final WebDriver webDriver;

    public ListQuestions(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    //--ВОПРОСЫ--
    //Вопрос 1: Сколько это стоит? И как оплатить?
    private final By buttonQuestion1 = By.id("accordion__heading-0");
    //Вопрос 2: Хочу сразу несколько самокатов! Так можно?
    private final By buttonQuestion2 = By.id("accordion__heading-1");
    //Вопрос 3: Как рассчитывается время аренды?
    private final By buttonQuestion3 = By.id("accordion__heading-2");
    //Вопрос 4: Можно ли заказать самокат прямо на сегодня?
    private final By buttonQuestion4 = By.id("accordion__heading-3");
    //Вопрос 5: Можно ли продлить заказ или вернуть самокат раньше?
    private final By buttonQuestion5 = By.id("accordion__heading-4");
    //Вопрос 6: Вы привозите зарядку вместе с самокатом?
    private final By buttonQuestion6 = By.id("accordion__heading-5");
    //Вопрос 7: Можно ли отменить заказ?
    private final By buttonQuestion7 = By.id("accordion__heading-6");
    //Вопрос 8: Я жизу за МКАДом, привезёте?
    private final By buttonQuestion8 = By.id("accordion__heading-7");

    //--ОТВЕТЫ--
    //Ответ на вопрос 1
    public final By answerQuestion1 = By.id("accordion__panel-0");
    //Ожидаемый текст ответа на вопрос 1
    public String expectedTextAnswer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Ответ на вопрос 2
    public final By answerQuestion2 = By.id("accordion__panel-1");
    //Ожидаемый текст ответа на вопрос 2
    public String expectedTextAnswer2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Ответ на вопрос 3
    public final By answerQuestion3 = By.id("accordion__panel-2");
    //Ожидаемый текст ответа на вопрос 3
    public String expectedTextAnswer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Ответ на вопрос 4
    public final By answerQuestion4 = By.id("accordion__panel-3");
    //Ожидаемый текст ответа на вопрос 4
    public String expectedTextAnswer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Ответ на вопрос 5
    public final By answerQuestion5 = By.id("accordion__panel-4");
    //Ожидаемый текст ответа на вопрос 5
    public String expectedTextAnswer5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Ответ на вопрос 6
    public final By answerQuestion6 = By.id("accordion__panel-5");
    //Ожидаемый текст ответа на вопрос 6
    public String expectedTextAnswer6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Ответ на вопрос 7
    public final By answerQuestion7 = By.id("accordion__panel-6");
    //Ожидаемый текст ответа на вопрос 7
    public String expectedTextAnswer7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Ответ на вопрос 8
    public final By answerQuestion8 = By.id("accordion__panel-7");
    //Ожидаемый текст ответа на вопрос 8
    public String expectedTextAnswer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //НАЖАТИЕ НА ВОПРОСЫ И ПОЛУЧЕНИЕ ТЕКСТОВ ОТВЕТА
    //Клик на вопрос 1
    public void clickButtonQuestion1(){
        webDriver.findElement(buttonQuestion1).click();
    }
    //Текст ответа на вопрос 1.
    public String  actualTextAnswerQuestion1(){
        return webDriver.findElement(answerQuestion1).getText();
    }
    //Клик на вопрос 2
    public void clickButtonQuestion2(){
        webDriver.findElement(buttonQuestion2).click();
    }
    //Текст ответа на вопрос 2
    public String  actualTextAnswerQuestion2(){
        return webDriver.findElement(answerQuestion2).getText();
    }
    //Клик на вопрос 3
    public void clickButtonQuestion3(){
        webDriver.findElement(buttonQuestion3).click();
    }
    //Текст ответа на вопрос 3
    public String  actualTextAnswerQuestion3(){
        return webDriver.findElement(answerQuestion3).getText();
    }
    //Клик на вопрос 4
    public void clickButtonQuestion4(){
        webDriver.findElement(buttonQuestion4).click();
    }
    //Текст ответа на вопрос 4
    public String  actualTextAnswerQuestion4(){
        return webDriver.findElement(answerQuestion4).getText();
    }
    //Клик на вопрос 5
    public void clickButtonQuestion5(){
        webDriver.findElement(buttonQuestion5).click();
    }
    //Текст ответа на вопрос 5
    public String  actualTextAnswerQuestion5(){
        return webDriver.findElement(answerQuestion5).getText();
    }
    //Клик на вопрос 6
    public void clickButtonQuestion6(){
        webDriver.findElement(buttonQuestion6).click();
    }
    //Текст ответа на вопрос 6
    public String  actualTextAnswerQuestion6(){
        return webDriver.findElement(answerQuestion6).getText();
    }
    //Клик на вопрос 7
    public void clickButtonQuestion7(){
        webDriver.findElement(buttonQuestion7).click();
    }
    //Текст ответа на вопрос 7
    public String  actualTextAnswerQuestion7(){
        return webDriver.findElement(answerQuestion7).getText();
    }
    //Клик на вопрос 8
    public void clickButtonQuestion8(){
        webDriver.findElement(buttonQuestion8).click();
    }
    //Текст ответа на вопрос 8
    public String  actualTextAnswerQuestion8(){
        return webDriver.findElement(answerQuestion8).getText();
    }
}
