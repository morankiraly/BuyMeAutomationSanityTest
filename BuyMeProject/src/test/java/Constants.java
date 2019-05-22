import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;


class Constants {


    static WebDriverWait WAIT;

// Login Page - Sign up to 'buyme' website as a new user

        static final By LOGIN_BUTTON = By.className("seperator-link");
        static final By SIGN_UP_LINK = By.className("text-btn");
        static final By FIRST_NAME = By.xpath("//input[@placeholder='שם פרטי']");
        static final By EMAIL = By.xpath("//*[@data-parsley-type='email']");
        static final By PASSWORD_INPUT = By.xpath("//*[@id='valPass']");
        static final By VALIDATED_PASSWORD_INPUT = By.xpath("//input[@placeholder='אימות סיסמה']");
        static final By TERMS_OF_AGREEMENT_CHECKBOX = By.xpath("//*[@class='confirmTerms ember-view ui-field ui-checkbox']/label/i");
        static final By SUBMIT_USER_BUTTON = By.xpath("//button[@class='ui-btn orange large']");


 // Home Page - Searching parameters for a gift

        static final By DD_SEARCH_FOR_GIFT = By.className("chosen-single");
        static final By DD_OPTIONS = By.xpath("//li[@data-option-array-index='5']");
         // ("//ul[@className='chosen-results']/li[6] and @data-option-array-index='5'");


        static final By FIND_GIFT_LINK = By.linkText("תמצאו לי מתנה");

// Gift Page - Choosing a gift from search results

        static String GIFT_PAGE_URL = "https://buyme.co.il/search";
        static final By CHOSEN_GIFT = By.xpath("//div[@class='card-items']/a[4]/div");
        static final By CHOSEN_GIFT_2 = By.xpath("//div[@class='card-items']/a[1]/div");
        static final By GIFT_CARD_AMOUNT = By.xpath("//*[@data-parsley-min='1']");
        static final By GIFT_CARD_AMOUNT_SUBMIT_BUTTON = By.xpath("//form[@className='moneyForm']/div[2]/div/button");
  //  //div[@className='btn-wrapper']
 //   //button[@type='submit' and @className='btn-theme']

//Sender & receiver information Page - filling all details before payment


        static final By FOR_SOMEONE_RADIO_BUTTON = By.xpath("//*[@data='forSomeone']/span");
        static final By RECEIVER_NAME = By.xpath("//*[@data-parsley-id='53']");
        static final By SENDER_NAME = By.xpath("//*[@data-parsley-id='55']");
        static final By GIFT_SUBJECT = By.xpath("//*[@data-parsley-id='59']");
        static final By BLESSING_INPUT = By.xpath("//*[@data-parsley-id='61']");
        static final By UPLOAD_PICTURE = By.name("fileUpload");
        static final By SEND_NOW_RADIO_BUTTON = By.className("send-now");
        static final By VIA_EMAIL = By.xpath("//*[@id='ember1187']/div[4]/div/div[1]/div[2]/div/button");
        static final By RECEIVER_EMAIL = By.xpath("input[@placeholder='כתובת המייל של מקבל/ת המתנה']");
        static final By SAVE_EMAIL_BUTTON = By.xpath("//*[@type='submit' and @className ='btn-save']");
        static final By SUBMIT_PAYMENT_BUTTON = By.xpath("//*[@data-toggle='modal']");
    }



