
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class GiftPage {

    public static void chosenGift(WebDriver driver) throws InterruptedException {
        /*
        searchUrl(Constants.GIFT_PAGE_URL, driver);

    }

    public static void searchUrl(String url, WebDriver driver) {
        Constants.WAIT.until(ExpectedConditions.urlContains("search"));
        try {
            Assert.assertEquals(url, driver.getCurrentUrl());
        } catch (AssertionError e) {
            System.out.println("error");
        }
        */

        WebElement elementToClick = driver.findElement(Constants.CHOSEN_GIFT);
        new Actions(driver).moveToElement(elementToClick).click().perform();
        Thread.sleep(1000);

        driver.findElement(Constants.CHOSEN_GIFT_2).click();
        driver.findElement(Constants.GIFT_CARD_AMOUNT).sendKeys("200");


        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(Constants.GIFT_CARD_AMOUNT_SUBMIT_BUTTON)).click();

    }

}