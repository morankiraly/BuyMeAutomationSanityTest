import org.openqa.selenium.WebDriver;

public class SenderRecieverInformationPage {

    public static void informationForDelivery(WebDriver driver){

        driver.findElement(Constants.FOR_SOMEONE_RADIO_BUTTON).click();
        driver.findElement(Constants.RECEIVER_NAME).sendKeys("אור");
        driver.findElement(Constants.SENDER_NAME).sendKeys("מורן");
        driver.findElement(Constants.GIFT_SUBJECT).click();
        driver.findElement(Constants.BLESSING_INPUT).clear();
        driver.findElement(Constants.BLESSING_INPUT).sendKeys("חג שמח");
        driver.findElement(Constants.UPLOAD_PICTURE).sendKeys("C:\\Users\\Moran\\Desktop/wed_thumb.JPG");
        driver.findElement(Constants.SEND_NOW_RADIO_BUTTON).click();
        driver.findElement(Constants.VIA_EMAIL).click();
        driver.findElement(Constants.RECEIVER_EMAIL).sendKeys("ork@gmail.com");
        driver.findElement(Constants.SAVE_EMAIL_BUTTON).click();
        driver.findElement(Constants.SUBMIT_PAYMENT_BUTTON).click();
    }
}
