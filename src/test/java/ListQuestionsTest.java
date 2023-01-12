import PageObjectModel.ListQuestions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

    @RunWith(Parameterized.class)
    public class ListQuestionsTest{
        private final String expected;
        private final By button;
        private final By actual;
        public ListQuestionsTest(String expected, By button, By actual){
            this.expected = expected;
            this.button = button;
            this.actual = actual;
        }
        @Parameterized.Parameters
        public static Object[][] getTextQuestions(){
            ListQuestions listQuestions = new ListQuestions();
            return new Object[][]{
                    {listQuestions.expectedTextAnswer1, listQuestions.buttonQuestion1, listQuestions.answerQuestion1},
                    {listQuestions.expectedTextAnswer2, listQuestions.buttonQuestion2, listQuestions.answerQuestion2},
                    {listQuestions.expectedTextAnswer3, listQuestions.buttonQuestion3, listQuestions.answerQuestion3},
                    {listQuestions.expectedTextAnswer4, listQuestions.buttonQuestion4, listQuestions.answerQuestion4},
                    {listQuestions.expectedTextAnswer5, listQuestions.buttonQuestion5, listQuestions.answerQuestion5},
                    {listQuestions.expectedTextAnswer6, listQuestions.buttonQuestion6, listQuestions.answerQuestion6},
                    {listQuestions.expectedTextAnswer7, listQuestions.buttonQuestion7, listQuestions.answerQuestion7},
                    {listQuestions.expectedTextAnswer8, listQuestions.buttonQuestion8, listQuestions.answerQuestion8},
            };
        }
        @Test
        public void checkAllQuestions2(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
            driver.findElement(By.id("rcc-confirm-button")).click();
            driver.findElement(button).click();
            driver.findElement(actual).isDisplayed();
            assertEquals(expected, driver.findElement(actual).getText());
            driver.quit();
        }
    }
