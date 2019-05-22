import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomePage {

/*
    public static void popUp(WebDriver driver) {

        ((JavascriptExecutor) driver).executeScript("document.getElementById('chat-widget-container').style.display = 'none';");
      }

*/

    public static void amountInput(WebDriver driver) throws InterruptedException {


        List<WebElement> searchDropDown;
        searchDropDown = driver.findElements(Constants.DD_SEARCH_FOR_GIFT);
        int i = 0;
        while (i < 4) {
            searchDropDown.get(i).click();
            Thread.sleep(1000);
          //  driver.findElements(Constants.DD_OPTIONS).get(i).click();

            i++;

            /*
            By amountDropDownOption = (By) driver.findElement(Constants.DD_OPTIONS);
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(amountDropDownOption));

           */
        }

            driver.findElement(Constants.FIND_GIFT_LINK).click();
            // driver.findElement(By.xpath("//*[@data-option-array-index=\"6\"]/div/ul/li[7]")).click();

            // driver.findElement(By.linkText("תמצאו לי מתנה")).click();
        }
    }



