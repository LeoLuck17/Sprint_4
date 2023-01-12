import PageObjectModel.EntryDataPage;
import PageObjectModel.MainPage;
import PageObjectModel.PageAboutRent;
import org.junit.Test;

public class TestOrderScooter extends BeforeAndAfterAllTest{

    @Test
    public void successfulScooterOrder(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOrderButton();

        EntryDataPage entryDataPage = new EntryDataPage(driver);
        //Заполнение страницы - Для кого самокат
        entryDataPage.fillingFieldName("Дмитрий");
        entryDataPage.fillingFieldSecondName("Алексеев");
        entryDataPage.fillingFieldAddress("Печальная область, Тоскливый район, город Грусть");
        entryDataPage.fillingFieldMetroStation("Домодедовская");
        entryDataPage.fillingFieldNumberPhone("89999999999");
        entryDataPage.touchButtonNext();

        PageAboutRent pageAboutRent = new PageAboutRent(driver);
        //Заполнение страницы - Про аренду
        pageAboutRent.clickFieldWhenDeliverScooter("01.01.2023");
        pageAboutRent.clickFieldPeriodRent();
        pageAboutRent.clickCheckboxColorBlack();
        pageAboutRent.clickButtonOrder();
        pageAboutRent.clickButtonYes();
        pageAboutRent.checkPopupSuccessfullyOrder(); //не работает
    }

    @Test
    public void successfulScooterOrderSecondData(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOrderButtonMiddle();

        EntryDataPage entryDataPage = new EntryDataPage(driver);
        //Заполнение страницы - Для кого самокат
        entryDataPage.fillingFieldName("Яна");
        entryDataPage.fillingFieldSecondName("Тестовая");
        entryDataPage.fillingFieldAddress("Город Отчуждение, Проспект РазочарованияБ дом 13");
        entryDataPage.fillingFieldMetroStation("Царицыно");
        entryDataPage.fillingFieldNumberPhone("81111111111");
        entryDataPage.touchButtonNext();

        PageAboutRent pageAboutRent = new PageAboutRent(driver);
        //Заполнение страницы - Про аренду
        pageAboutRent.clickFieldWhenDeliverScooter("05.05.2023");
        pageAboutRent.clickFieldPeriodRent();
        pageAboutRent.clickCheckboxColorBlack();
        pageAboutRent.clickButtonOrder();
        pageAboutRent.clickButtonYes();
        pageAboutRent.checkPopupSuccessfullyOrder(); //не работает
    }
}
