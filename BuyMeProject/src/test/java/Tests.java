import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.runners.MethodSorters.NAME_ASCENDING;

@FixMethodOrder (NAME_ASCENDING)
public class Tests {
/*
//EXTENT REPORT

    private static ExtentReports extent = new ExtentReports();
    private static ExtentTest test = extent.createTest("buyMeProjectReport", "Test report for BUYME automation test project");
    private static String reportPath = "C://Users//moran//IdeaProjects//extent.html";
    private static String folderPath = "C://Users//moran//IdeaProjects//";
*/
    private static WebDriver driver;


//BROWSER TYPE AND URL FROM XML FILE

    private static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException {
        File XmlFile = new File("C:\\Browser File.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(XmlFile);
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }


    @BeforeClass
    public static void SetUp() throws IOException, SAXException, ParserConfigurationException {
         /*
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Environment", "Production");
        if (1 < 0) {
            test.log(Status.FATAL, "Before class , driver is null - no reason to continue");
        } else {
            test.log(Status.PASS, "Before class, driver is ready");
*/
            String browserType = getData("browserType");
            if (browserType.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserType.equals("FireFox")) {
                System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(getData("URL"));
            //test.log(Status.INFO, "Driver is connected");
        }

/*
    @Test

    public void loginDetails_test_01(){
        boolean passTest_01 = false;
        try {
            LoginPage login = new LoginPage();
            login.myLogin(driver, test);
            passTest_01 = true;
        }finally {
            if (passTest_01){
                test.log(Status.PASS, "test_01 passed");
         } else {
                test.log(Status.FAIL, "test_01 failed");
            }
        }
    }

    */
/*
    @Test
    public void test_01_loginDetails() {
        LoginPage login = new LoginPage();
        login.myLogin(driver);
    }

*/
    @Test
    public void test_02_homePageSearch() throws InterruptedException {


        HomePage search = new HomePage();
     //   search.popUp(driver);
        search.amountInput(driver);

    }

/*
    @Test
    public void test_03_homePageSearchResults() throws InterruptedException {
        GiftPage searchResults = new GiftPage();
        searchResults.chosenGift(driver);
    }
*/
/*
    @Test
    public void test_04_senderAndReceiver(){
        SenderRecieverInformationPage details = new SenderRecieverInformationPage();
         details.informationForDelivery(driver);
    }

    /*
    @AfterClass
    public static void tearDown(){
       // driver.quit();
       // extent.flush();
    }
*/
}
