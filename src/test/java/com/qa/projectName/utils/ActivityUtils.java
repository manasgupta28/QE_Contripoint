//package com.qa.projectName.utils;
//
//import com.gemini.generic.reporting.GemTestReporter;
//import com.gemini.generic.reporting.STATUS;
//import com.gemini.generic.ui.utils.DriverAction;
//import com.gemini.generic.ui.utils.DriverManager;
//import com.qa.projectName.locators.ActivityLocators;
//import com.qa.projectName.locators.Locators;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.apache.commons.codec.binary.Base64;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import java.util.Objects;
//
//import static com.gemini.generic.ui.utils.DriverAction.*;
//import static gemnodesservices.Utilities.readProperties;
//
//public class ActivityUtils {
//
////    @Given("Verify if contripoint url is launched")
////    public void verify_if_amazon_url_is_launched() {
////        DriverAction.waitSec(20);
////        System.out.println("Hello world");
////    }
//
//    @Given("user click on the menu icon")
//    public void user_click_menu() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.menuIcon, 20);
//            click(ActivityLocators.menuIcon, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("User scroll to the certification category")
//    public void user_scroll_to_certification() {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certification)){
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//        System.out.println("Hello world");
//    }
//
//    @And("The certification details are visible {string}")
//    public void certifiation_card_body(String body) {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certificationCardBody)){
//            if(Objects.equals(getElementText(ActivityLocators.certificationCardBody), body))
//                GemTestReporter.addTestStep("Card Body is correct", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("user is able to add a certificate of goal type {string}")
//    public void certificatio_card_body(String body) {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certificationCardBody)){
//            if(Objects.equals(getElementText(ActivityLocators.certificationCardBody), body))
//                GemTestReporter.addTestStep("Card Body is correct", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("user is able to add a certificate of goal type {string} text file attachment")
//    public void crtification_card_body(String body) {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certificationCardBody)){
//            if(Objects.equals(getElementText(ActivityLocators.certificationCardBody), body))
//                GemTestReporter.addTestStep("Card Body is correct", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("verify the certificate gets added")
//    public void certifiction_card_body(String body) {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certificationCardBody)){
//            if(Objects.equals(getElementText(ActivityLocators.certificationCardBody), body))
//                GemTestReporter.addTestStep("Card Body is correct", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @Then("verify the certificate doesnt get added and an error is generated")
//    public void certification_card_body(String body) {
//        waitSec(20);
//        DriverAction.scrollIntoView(ActivityLocators.certification);
//        if (isExist(ActivityLocators.certificationCardBody)){
//            if(Objects.equals(getElementText(ActivityLocators.certificationCardBody), body))
//                GemTestReporter.addTestStep("Card Body is correct", "User loggedin successfully.", STATUS.PASS);
//        }
//        else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//
////    @Given("^User launches the URL$")
////    public void userLaunchesTheURL() {
////
////        try {
////            GemTestReporter.addTestStep("Launch the web page", "The web page was successfully launched with the URL " + getCurrentURL() + " and the title " + getTitle(), STATUS.PASS, takeSnapShot());
////        } catch (Exception e) {
////            GemTestReporter.addTestStep("Launch the web page", "Unable to launch the web page", STATUS.FAIL, takeSnapShot());
////            throw e;
////        }
////
////    }
//
////    @When("^User clicks on signIn Button$")
////    public void userClicksOnSignInButton() {
////        try {
////            DriverAction.waitUntilElementAppear(Locators.signInBtn, 20);
////            click(Locators.signInBtn, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
////        } catch (Exception exception) {
////            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
////        }
////        waitSec(5);
////
////    }
//
//    @Then("User enters the {string}")
//    public static void enterCredentials(String credentialType) throws Exception {
//        try {
//            WebDriver driver = DriverManager.getWebDriver();
//            DriverAction.waitUntilElementAppear(Locators.credentials(credentialType), 20);
//            //EventsUtils.waitForElement(Locators.credentials(credentialType), 20);
//            switch (credentialType) {
//                case "username":
//                    waitSec(5);
//                    typeText(Locators.credentials(credentialType), "kartikay.tomar@geminisolutions.com");
//                    // typeText(Locators.credentials(credentialType), readProperties(credentialType)); // Enter Username
//                    break;
//                case "password":
//                    typeText(Locators.credentials(credentialType), "");
//                    // driver.findElement(Locators.credentials(credentialType)).sendKeys(decryptString(readProperties(credentialType)));
//                    break;
//                default:
//                    System.out.println("Please enter a valid Input");
//            }
//            click(By.xpath("//input[@data-report-value=\"Submit\"]"), "Next Button");
//            waitSec(5);
//        } catch (Exception e) {
//            GemTestReporter.addTestStep("Verify if Login window appears on the screen", "Login window does not appear on the screen", STATUS.FAIL, takeSnapShot());
//            throw new Exception("Unable to enter the credentials of user with username : " + readProperties(credentialType));
//        }
//    }
//
//    public static String decryptString(String password) {
//        if (password.length() != 0) {
//            byte[] decodedPassword = Base64.decodeBase64(password); //enter your encrypted password value
//            return (new String(decodedPassword));
//        } else {
//            GemTestReporter.addTestStep("Verify if encrypted password value is entered", "Encrypted password value is not entered- " + password, STATUS.ERR);
//            return password;
//        }
//    }
//
////    @And("User logins into the application")
////    public void userLoginsIntoTheApplication() {
////        if (isExist(Locators.myInsight)){
////            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
////        }
////        else {
////            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
////        }
////
////    }
//
//    @And("user click on the notification icon")
//    public void click_on_notification() {
//        try {
//            DriverAction.waitUntilElementAppear(Locators.notificationIcon, 20);
//            click(Locators.notificationIcon, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("verifies the notification frame is opened")
//    public void notification_frame() {
//        DriverAction.waitUntilElementAppear(ActivityLocators.notificationFrame, 20);
//
//        if (isExist(ActivityLocators.notificationFrame)) {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
//        } else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("verifies the Menu frame is displayed")
//    public void menu_displayed() {
//        DriverAction.waitUntilElementAppear(ActivityLocators.menuFrame, 20);
//
//        if (isExist(ActivityLocators.menuFrame)) {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
//        } else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("verifies the menu frame is opened")
//    public void menu_frame() {
//        DriverAction.waitUntilElementAppear(ActivityLocators.notificationFrame, 20);
//
//        if (isExist(ActivityLocators.notificationFrame)) {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
//        } else {
//            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
//        }
//    }
//
//    @And("user click on Interview Taken card")
//    public void click_on_InterviewTaken() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.interviewTaken, 20);
//            click(ActivityLocators.interviewTaken, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user click on Training and Sessions card")
//    public void click_on_TrainingCard() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.trainingCard, 20);
//            click(ActivityLocators.trainingCard, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user click 'add new' button")
//    public void click_on_addNew() {
//        try {
//            waitSec(50);
//            DriverAction.waitUntilElementAppear(ActivityLocators.addNew, 20);
//            click(ActivityLocators.addNew, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user add description")
//    public void add_description() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.description, 20);
//            typeText(ActivityLocators.description,"Hello");
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user add no. of Interview Taken")
//    public void add_interview_no() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.interviewText, 20);
//            typeText(ActivityLocators.interviewText,"2");
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user add value for field {}")
//    public void add_interview_no( String field ) {
//        try {
//            By numberField =By.xpath("//span[text()='fieldorg ']//..//input".replace("fieldorg",field));
//            DriverAction.waitUntilElementAppear(numberField, 20);
//            typeText(numberField,"2");
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user click on cancel button")
//    public void click_on_cancel() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.cancelBtn, 20);
//            click(ActivityLocators.cancelBtn, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user select goal type EC")
//    public void select_goalType() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.cancelBtn, 20);
//            click(ActivityLocators.cancelBtn, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user add the position for Interview")
//    public void position_of_interview() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.interviewPosition, 20);
//            click(ActivityLocators.arrowIcon);
//            click(ActivityLocators.interviewPosition);
////            click(By.xpath("//img[@class='interview-heading']"));
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user select {} for dropdown {}")
//    public void selectDropdown(String value, String field) {
//        try {
//            By numberField =By.xpath("//span[text()='text']".replace("text",value));
//            click(ActivityLocators.arrowIconTrain);
//            click(numberField);
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user add interviewee level of experiance")
//    public void level_of_exp() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.interviewPosition, 20);
//            click(ActivityLocators.arrowIconExp);
//            click(ActivityLocators.expLevel);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user select Interview month")
//    public void l() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.arrowIconMonth, 20);
//            click(ActivityLocators.arrowIconMonth);
//            click(ActivityLocators.month);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("Select Goal type as EC")
//    public void ec_goal() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.goalType, 20);
//            click(ActivityLocators.goalType);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("Select Goal type as DC")
//    public void dc_goal() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.goalType, 20);
//            click(ActivityLocators.goalType);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//
//
//    @And("save as draft")
//    public void save_draft() {
////        waitSec(5);
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.saveAsDraft, 20);
//            click(ActivityLocators.saveAsDraft);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("Submit the form")
//    public void submit_form() {
//        waitSec(5);
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.submitBtn, 20);
//            click(ActivityLocators.submitBtn);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("Verify the draft popup is visible")
//    public void checkIfDraftPopUpisVisible() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.saveAsDraft, 20);
//            // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user click on Projects card")
//    public void click_on_projectsCard() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.projectCard, 20);
//            click(ActivityLocators.projectCard, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user click on Team Building card")
//    public void click_on_teamBuilding() {
//        try {
//            DriverAction.waitUntilElementAppear(ActivityLocators.teamBuildingCard, 20);
//            click(ActivityLocators.teamBuildingCard, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @And("user select date {}")
//    public void add_date(String field) {
//        try {
//            By numberField =By.xpath("//form//input[@formcontrolname='Date']".replace("Date",field));
////            WebElement dateBox = DriverAction.getElement(numberField);
//            click(numberField, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
////            click(Locators.date, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
//
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//
//    }
//
//    @And("user select radio type {} for field")
//    public void select_radio( String field ) {
//        try {
//            By numberField =By.xpath("//span[text()='value']".replace("value",field));
//            DriverAction.waitUntilElementAppear(numberField, 20);
//            click(numberField);
//        } catch (Exception exception) {
//            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
//        }
//        waitSec(5);
//    }
//
//    @Then("check success popup is visible")
//    public void checkSuccessPopupIsVisible() {
//        if (isDisplayed(Locators.successPopup)){
//            waitSec(3);
//            GemTestReporter.addTestStep("Verify if success popup is visible", "Success popup visible", STATUS.PASS);
//            waitSec(3);
//        }
//        else {
//            GemTestReporter.addTestStep("Verify if success popup is visible", "Success popup didn't come on UI", STATUS.FAIL);
//        }
//
//
//    }
//
//}