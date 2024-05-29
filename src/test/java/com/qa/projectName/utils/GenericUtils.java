package com.qa.projectName.utils;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import com.qa.projectName.locators.Locators;
import com.qa.projectName.locators.RewardAndRecogniztionLocators;
import com.thoughtworks.selenium.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.gemini.generic.ui.utils.DriverAction.*;
import static com.gemini.generic.ui.utils.DriverAction.waitUntilElementClickable;
import static gemnodesservices.Utilities.readProperties;

public class GenericUtils {

    @Given("Verify if contripoint url is launched")
    public void verify_if_amazon_url_is_launched() {
        DriverAction.waitSec(20);
        System.out.println("Hello world");
    }


    @Given("^User launches the URL$")
    public void userLaunchesTheURL() {

        try {
            GemTestReporter.addTestStep("Launch the web page", "The web page was successfully launched with the URL " + getCurrentURL() + " and the title " + getTitle(), STATUS.PASS, takeSnapShot());
        } catch (Exception e) {
            GemTestReporter.addTestStep("Launch the web page", "Unable to launch the web page", STATUS.FAIL, takeSnapShot());
            throw e;
        }

    }

    @Then("User presses ctrl+m")
    public void userPressesCtrlM() throws AWTException {

//        DriverAction.waitSec(5);
        Robot robot = new Robot();

        waitUntilElementAppear(RewardAndRecogniztionLocators.LoginPageLogo,20);
        // Simulate pressing Ctrl + M
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        waitUntilElementAppear(RewardAndRecogniztionLocators.ToggleLoginPage,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ToggleLoginPage,10);

        click(RewardAndRecogniztionLocators.ToggleLoginPage);

        waitUntilElementAppear(RewardAndRecogniztionLocators.EmailLoginPage,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.EmailLoginPage,10);

        typeText(RewardAndRecogniztionLocators.EmailLoginPage, "test.user@geminisolutions.com");
        typeText(RewardAndRecogniztionLocators.PasswordLoginPage, "xJ2gmL7UhN");

        //input[@formcontrolname='username']
        waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitLoginPage,10);
        click(RewardAndRecogniztionLocators.SubmitLoginPage);
    }

    @When("^User clicks on signIn Button$")
    public void userClicksOnSignInButton() {
        try {
            DriverAction.waitUntilElementAppear(Locators.signInBtn, 20);
            click(Locators.signInBtn, "Click on Sign In Button", "Clicked Sign In Button"); // Click on Sign in Button
        } catch (Exception exception) {
            GemTestReporter.addTestStep("Check visibility of SignIn Button", "Sign in button is not present", STATUS.FAIL, takeSnapShot());
        }
        waitSec(5);

    }

    @Then("User enters the {string}")
    public static void enterCredentials(String credentialType) throws Exception {
        try {
            WebDriver driver = DriverManager.getWebDriver();
            DriverAction.waitUntilElementAppear(Locators.credentials(credentialType), 20);
            //EventsUtils.waitForElement(Locators.credentials(credentialType), 20);
            switch (credentialType) {
                case "username":
                    waitSec(5);
                    typeText(Locators.credentials(credentialType), "test.user@geminisolutions.com");
                    // typeText(Locators.credentials(credentialType), readProperties(credentialType)); // Enter Username
                    break;
                case "password":
                    typeText(Locators.credentials(credentialType), "xJ2gmL7UhN");
                    // driver.findElement(Locators.credentials(credentialType)).sendKeys(decryptString(readProperties(credentialType)));
                    break;
                default:
                    System.out.println("Please enter a valid Input");
            }
            click(By.xpath("//input[@data-report-value='Submit']"), "Next Button");
            waitSec(5);
        } catch (Exception e) {
            GemTestReporter.addTestStep("Verify if Login window appears on the screen", "Login window does not appear on the screen", STATUS.FAIL, takeSnapShot());
            throw new Exception("Unable to enter the credentials of user with username : " + readProperties(credentialType));
        }
    }

    public static String decryptString(String password) {
        if (password.length() != 0) {
            byte[] decodedPassword = Base64.decodeBase64(password); //enter your encrypted password value
            return (new String(decodedPassword));
        } else {
            GemTestReporter.addTestStep("Verify if encrypted password value is entered", "Encrypted password value is not entered- " + password, STATUS.ERR);
            return password;
        }
    }

    @And("User logins into the application")
    public void userLoginsIntoTheApplication() {
        try {
//            waitSec(3);
//            if(isDisplayed(By.xpath("//*[local-name()='svg' and @preserveAspectRatio='xMidYMid meet']"))) {
//                // Attempt to wait for the element to disappear, if it doesn't disappear it catches the exception and continues
//            if( isExist(By.xpath("//*[local-name()='svg' and @preserveAspectRatio='xMidYMid meet'])"))) {
////                waitUntilElementDisappear(By.xpath("//*[local-name()='svg' and @preserveAspectRatio='xMidYMid meet']"), 10);
//
//            }
            //            }
            // Wait for the pop-up to appear, with a shorter timeout
            waitUntilElementAppear(By.xpath("//p[@class='congrats-text']"), 10);
            if (isExist(By.xpath("//i"))) {
                waitUntilElementClickable(By.xpath("//i"), 10);
                waitSec(3);
                click(By.xpath("//i"));
            }
//            waitUntilElementClickable(By.xpath("//i"),10);
//
//            // If the pop-up close button is found, click it
//            click(By.xpath("//i"));

            System.out.println("Pop-up closed successfully!");
        } catch (Exception e) {
            // If the pop-up close button is not found within the timeout, continue with the rest of the script
            System.out.println("Pop-up not found, continuing with the rest of the script.");
        }
        //div[contains(text(),'My Insights')]

//        waitSec(3);
        waitUntilElementAppear(Locators.myInsight, 10);
        waitUntilElementClickable(Locators.myInsight, 10);

        if (isExist(Locators.myInsight)) {
            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Vefify if user is loggedin to application", "User loggedin failed.", STATUS.FAIL);
        }

    }

    @Then("Verify Contripoint logo and text is present")
    public void verifyContripointLogoAndTextIsPresent() {
        if (isExist(Locators.logo)) {
            GemTestReporter.addTestStep("Verify if contripoint logo is visible", "Contripoint logo is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if contripoint logo is visible", "Contripoint logo is not visible", STATUS.FAIL);
        }

    }


    @Then("verify if FAQ button is visible")
    public void verifyIfFAQIsVisible() {
        if (isExist(Locators.FAQs)) {
            GemTestReporter.addTestStep("Verify if FAQs button is visible", "Contripoint FAQs button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if FAQs button is visible", "Contripoint FAQs button is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify if Demo Videos button is visible")
    public void verifyIfDemoVideosButtonIsVisible() {
        if (isExist(Locators.DemoVideos)) {
            GemTestReporter.addTestStep("Verify if FAQs button is visible", "Contripoint FAQs button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if FAQs button is visible", "Contripoint FAQs button is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify if Help Channel button is visible")
    public void verifyIfHelpChannelButtonIsVisible() {
        if (isExist(Locators.HelpChannel)) {
            GemTestReporter.addTestStep("Verify if Help Channel button is visible", "Contripoint Help Channel button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Help Channel button is visible", "Contripoint Help Channel button is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify if Report Bug button is visible")
    public void verifyIfReportBugButtonIsVisible() {
        if (isExist(Locators.ReportBug)) {
            GemTestReporter.addTestStep("Verify if Report bug button is visible", "Contripoint Report bug button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Report bug button is visible", "Contripoint Report bug button is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify notification icon is present")
    public void verifyNotificationIconIsPresent() {
        if (isExist(Locators.NotificationIcon)) {
            GemTestReporter.addTestStep("Verify if Notification Icon is visible", "Contripoint Notification Icon is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Notification Icon is visible", "Contripoint Notification Icon is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify menu icon is present")
    public void verifyMenuIconIsPresent() {
        if (isExist(Locators.MenuIcon)) {
            GemTestReporter.addTestStep("Verify if Menu Icon is visible", "Contripoint Menu Icon is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Menu Icon is visible", "Contripoint Menu Icon is not visible", STATUS.FAIL);
        }


    }

    @Given("Validate Dashboard icon is visible")
    public void validateDashboardIconIsVisible() {
        DriverAction.waitSec(5);
        if (isExist(Locators.dashboardIcon)) {
            GemTestReporter.addTestStep("Verify if Dashboard Icon is visible", "Contripoint Dashboard Icon  is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Dashboard Icon is visible", "Contripoint Menu Icon is not visible", STATUS.FAIL);
        }
    }

    @Then("Click on Dashboard icon")
    public void clickOnDashboardIcon() {
        DriverAction.click(Locators.dashboardIcon);

    }

    @Then("click on back button")
    public void clickOnBackButton() {
        DriverAction.waitSec(5);
        if (isExist(Locators.backButton3)) {
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is visible", STATUS.PASS);
            DriverAction.click(Locators.backButton3);
            DriverAction.waitSec(5);
        } else {
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is not visible", STATUS.FAIL);
        }

    }
}