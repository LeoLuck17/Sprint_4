import PageObjectModel.ListQuestions;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestListQuestionsAndAnswers extends BeforeAndAfterAllTest{

    @Test
    public void checkAllQuestions(){
        ListQuestions listQuestions = new ListQuestions(driver);

        listQuestions.clickButtonQuestion1();
        driver.findElement(listQuestions.answerQuestion1).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer1, listQuestions.actualTextAnswerQuestion1());

        listQuestions.clickButtonQuestion2();
        driver.findElement(listQuestions.answerQuestion2).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer2, listQuestions.actualTextAnswerQuestion2());

        listQuestions.clickButtonQuestion3();
        driver.findElement(listQuestions.answerQuestion3).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer3, listQuestions.actualTextAnswerQuestion3());

        listQuestions.clickButtonQuestion4();
        driver.findElement(listQuestions.answerQuestion4).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer4, listQuestions.actualTextAnswerQuestion4());

        listQuestions.clickButtonQuestion5();
        driver.findElement(listQuestions.answerQuestion5).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer5, listQuestions.actualTextAnswerQuestion5());

        listQuestions.clickButtonQuestion6();
        driver.findElement(listQuestions.answerQuestion6).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer6, listQuestions.actualTextAnswerQuestion6());

        listQuestions.clickButtonQuestion7();
        driver.findElement(listQuestions.answerQuestion7).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer7, listQuestions.actualTextAnswerQuestion7());

        listQuestions.clickButtonQuestion8();
        driver.findElement(listQuestions.answerQuestion8).isDisplayed();
        assertEquals(listQuestions.expectedTextAnswer8, listQuestions.actualTextAnswerQuestion8());
    }
}
