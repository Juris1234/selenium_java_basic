package selenium.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    WebDriver driver;

    @Before
    public void openPage() {
        String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kristinek.github.io/test-sample/tasks/provide_feedback");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void initialFeedbackPage() throws Exception {
        // check that all field are empty and no tick are clicked
        // "Don't know" is selected in "Genre"
        // "Choose your option" in "How do you like us?"
        // check that the button send is blue with white letters
    }
    @Test
    public void emptyFeedbackPage() throws Exception {
        // click "Send" without entering any data
        // check fields and check button colors
    }
    @Test
    public void notEmptyFeedbackPage() throws Exception {
        // fill the whole form, click "Send"
        // check fields and check button colors
    }
    @Test
    public void yesOnWithNameFeedbackPage() throws Exception {
        // enter name, click "Send", click "Yes"
        // check message text, colors
    }
    @Test
    public void yesOnWithoutNameFeedbackPage() throws Exception {
        // click "Send", click "Yes"
        // check message text, colors
    }
    @Test
    public void noOnFeedbackPage() throws Exception {
        // fill the whole form, click "Send"
        // check that everything is still filled correctly
    }
}
