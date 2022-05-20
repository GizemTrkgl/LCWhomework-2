package util;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Hooks {
    WebDriver driver;
    @Before
    public void before() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        driver = DriverFactory.initialize_Driver(browser);
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driver.quit();
    }
}
