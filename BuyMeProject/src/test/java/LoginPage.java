
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    public void myLogin(WebDriver driver) {

            driver.findElement(Constants.LOGIN_BUTTON).click();
            driver.findElement(Constants.SIGN_UP_LINK).click();


        //try {

            driver.findElement(Constants.FIRST_NAME).sendKeys("מורן");
            driver.findElement(Constants.EMAIL).sendKeys("morahk@gmail.com");
            driver.findElement(Constants.PASSWORD_INPUT).sendKeys("Kiraly20197");
            driver.findElement(Constants.VALIDATED_PASSWORD_INPUT).sendKeys("Kiraly20197");

           /*
            test.log(Status.PASS, "Credentials passed");
        } catch (Exception e) {
            test.log(Status.FAIL, "One of the credentials is not valid, login failed.");
        } finally {
        */
            WebElement agreementCheckBox = driver.findElement(Constants.TERMS_OF_AGREEMENT_CHECKBOX);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", agreementCheckBox);

            WebElement elementToClick = driver.findElement(Constants.SUBMIT_USER_BUTTON);
            new Actions(driver).moveToElement(elementToClick).click().perform();

            //test.log(Status.PASS,"successfully login");


        // By disturbingElement = By.className("\"input type=\"checkbox\" required=\"\" class=\"ember-view ember-checkbox\"");
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.invisibilityOfElementLocated(disturbingElement));
    }
  }


