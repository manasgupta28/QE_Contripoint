package com.qa.projectName.stepDefinitions;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.qa.projectName.locators.RewardAndRecogniztionLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.gemini.generic.ui.utils.DriverAction.*;
import static java.lang.Integer.parseInt;

public class RewardAndRecogniztionStepDefinition {

    @When("User click on HR portal icon")
    public void verifyHrPortalIsClickable() {
        // Wait for loading animation to disappear if it is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Wait until the HR portal icon appears and is clickable
        waitUntilElementAppear(RewardAndRecogniztionLocators.HRPortalIcon, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HRPortalIcon, 10);

        // Check if the HR portal icon is displayed and clickable
        if (isDisplayed(RewardAndRecogniztionLocators.HRPortalIcon)) {
            waitUntilElementIsClickable(RewardAndRecogniztionLocators.HRPortalIcon);
            click(RewardAndRecogniztionLocators.HRPortalIcon);
            GemTestReporter.addTestStep("Verify if HR Portal Icon is visible", "Contripoint HR Portal Icon is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if HR Portal Icon is visible", "Contripoint HR Portal Icon is not visible", STATUS.FAIL);
        }
    }


    @Then("Check the award category card is visible on UI")
    public void checkAwardCategotyButtonVisibility() {
        // Wait for loading animation to disappear if it is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Wait until the Award Category card appears and is clickable
        waitUntilElementAppear(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard, 10);

        // Check if the Award Category card is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard)) {
            GemTestReporter.addTestStep("Verify if Award Category Card is visible", "Contripoint Award Category Card is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Award Category Card is visible", "Contripoint Award Category Card is not visible", STATUS.FAIL);
        }
    }


    @Then("Click on award category card UI")
    public void clickAwardCategotyButton() {
        // Wait for loading animation to disappear if it is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Wait until the Award Category card appears and is clickable
        waitUntilElementAppear(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard, 10);

        // Check if the Award Category card exists and is displayed
        if (isExist(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard) && isDisplayed(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard)) {
            // Ensure the element is clickable, wait a moment, and then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard, 10);
            waitSec(3);
            click(RewardAndRecogniztionLocators.HRPortalAwardCategoryCard);
            GemTestReporter.addTestStep("Verify if Award Category Card is visible", "Contripoint Award Category Card is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Award Category Card is visible", "Contripoint Award Category Card is not visible", STATUS.FAIL);
        }
    }


    @Then("User Click on grid icon")
    public void clickOnGridIconToToggle() {
        // Wait until the Grid Icon appears
        waitUntilElementAppear(RewardAndRecogniztionLocators.GridIcon, 10);

        // Check if the Grid Icon is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.GridIcon)) {
            // Ensure the Grid Icon is clickable, then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.GridIcon, 10);
            click(RewardAndRecogniztionLocators.GridIcon);
            GemTestReporter.addTestStep("Verify if grid icon is visible", "Contripoint grid icon is visible", STATUS.PASS);
        } else {
            // Report failure if the Grid Icon is not visible
            GemTestReporter.addTestStep("Verify if grid icon is visible", "Contripoint grid icon is not visible", STATUS.FAIL);
        }
    }


    @Then("User click on list icon")
    public void clickOnGridIconToToggleBack() {
        // Wait until the List Icon appears within a 10-second timeout
        waitUntilElementAppear(RewardAndRecogniztionLocators.ListIcon, 10);

        // Check if the List Icon is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.ListIcon)) {
            // Ensure the List Icon is clickable, then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.ListIcon, 10);
            click(RewardAndRecogniztionLocators.ListIcon);
            GemTestReporter.addTestStep("Verify if List icon is visible", "Contripoint List icon is visible", STATUS.PASS);
        } else {
            // Report failure if the List Icon is not visible
            GemTestReporter.addTestStep("Verify if List icon is visible", "Contripoint List icon is not visible", STATUS.FAIL);
        }
    }


    @When("User Click on create new award category button")
    public void clickOnCreateNewAward() {
        // Wait until the Create New Award button appears within a 10-second timeout
        waitUntilElementAppear(RewardAndRecogniztionLocators.CreateNewAwardButton, 10);

        // Check if the Create New Award button is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.CreateNewAwardButton)) {
            // Ensure the Create New Award button is clickable, wait briefly, then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.CreateNewAwardButton, 10);
            waitSec(3);
            click(RewardAndRecogniztionLocators.CreateNewAwardButton);
            GemTestReporter.addTestStep("Verify if CreateNewAwardButton is visible", "Contripoint CreateNewAwardButton is visible", STATUS.PASS);
        } else {
            // Report failure if the Create New Award button is not visible
            GemTestReporter.addTestStep("Verify if CreateNewAwardButton is visible", "Contripoint CreateNewAwardButton is not visible", STATUS.FAIL);
        }
    }

    @When("^the user enters \"(.*)\", \"(.*)\", award Visibility as inactive, \"(.*)\" and clicks on submit button$")
    public void createUserEntersAwardDetails(String awardName, String rewardAmount, String description) {
        // Wait until the Award Name field appears and is clickable within a 10-second timeout
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);

        // Check if all required form elements are displayed and exist
        if (isDisplayed(RewardAndRecogniztionLocators.AwardNameInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.InactiveButtonInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.DescrptionInCreateNewAward)) {

            // Type the award name
            typeText(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, awardName);

            // Type the reward amount
            typeText(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward, rewardAmount);

            // Wait until the Inactive button is clickable, then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.InactiveButtonInCreateNewAward, 10);
            click(RewardAndRecogniztionLocators.InactiveButtonInCreateNewAward);

            // Type the description
            typeText(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, description);

            // Wait until the Submit button is clickable, then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward, 10);
            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);

            // Log the result of the form submission
            GemTestReporter.addTestStep("Verify if form items are visible", "Contripoint form items are visible", STATUS.PASS);
        } else {
            // Report failure if any form elements are not visible
            GemTestReporter.addTestStep("Verify if form items are visible", "Contripoint form items are not visible", STATUS.FAIL);
        }
    }
    @Then("^User Change the state of award \"(.*)\" to active$")
    public void changeStateToActive(String award_name) {
        // Wait until the success animation disappears, with a timeout of 10 seconds
        waitUntilElementDisappear(RewardAndRecogniztionLocators.SuccessAnimationInAwardList, 10);

        // Wait for the search bar to be clickable and appear, with a timeout of 10 seconds
        waitUntilElementClickable(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);

        // Enter the award name in the search bar
        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, award_name);

        // Wait for the toggle button to change the state to active to appear
        waitUntilElementAppear(RewardAndRecogniztionLocators.ToggleButtonInActivetoActiveInAwardInAwardList(award_name), 10);

        // Check if the toggle button to change the state to active is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.ToggleButtonInActivetoActiveInAwardInAwardList(award_name))) {
            // If the toggle button is displayed, wait for it to be clickable and then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.ToggleButtonInActivetoActiveInAwardInAwardList(award_name), 10);
            click(RewardAndRecogniztionLocators.ToggleButtonInActivetoActiveInAwardInAwardList(award_name));
            // Log the success
            GemTestReporter.addTestStep("Verify if list item and toggle button are visible", "Contripoint list item and toggle button are visible", STATUS.PASS);
        } else {
            // Log the failure
            GemTestReporter.addTestStep("Verify if list item and toggle button are visible", "Contripoint list item and toggle button are not visible", STATUS.FAIL);
        }
    }


    @Then("User Change the state of award to active during search")
    public void changeStateToActiveDuringSearch() {
        // Wait until the success animation disappears, with a timeout of 10 seconds
        waitUntilElementDisappear(RewardAndRecogniztionLocators.SuccessAnimationInAwardList, 10);

        // Wait for the search bar to be clickable and appear, with a timeout of 10 seconds
        waitUntilElementClickable(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);

        // Enter the award name for the inactivetoactive during search
        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, RewardAndRecogniztionLocators.awardNameforInactivetoActiveDuringSearch);

        // Wait for the award in recommendation form to turn active during search
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActiveDuringSearch, 10);

        // Check if the award in recommendation form turned active during search is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActiveDuringSearch)) {
            // If displayed, wait for it to be clickable and then click it
            waitUntilElementClickable(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActiveDuringSearch, 10);
            waitSec(3);
            click(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActiveDuringSearch);
            // Log the success
            GemTestReporter.addTestStep("Verify if list item and toggle button are visible", "Contripoint list item and toggle button are visible", STATUS.PASS);
        } else {
            // Log the failure
            GemTestReporter.addTestStep("Verify if list item and toggle button are visible", "Contripoint list item and toggle button are not visible", STATUS.FAIL);
        }
    }

    @When("^the user enters \"(.*)\", \"(.*)\", award Visibility as active, \"(.*)\" and clicks on submit button$")
    public void createUserEntersAwardDetailsWithActiveAward(String awardName, String rewardAmount, String description) {
        // Wait until the Award Name field is clickable, with a timeout of 10 seconds
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);

        // Check if all required form elements are displayed and exist
        if (isDisplayed(RewardAndRecogniztionLocators.AwardNameInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.ActiveButtonInCreateNewAward) &&
                isExist(RewardAndRecogniztionLocators.DescrptionInCreateNewAward)) {

            // Type the award name
            typeText(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, awardName);

            // Type the reward amount
            typeText(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward, rewardAmount);

            // Click the Active button to set award visibility as active
            click(RewardAndRecogniztionLocators.ActiveButtonInCreateNewAward);

            // Type the description
            typeText(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, description);

            // Wait for 2 seconds for stability (this might be for a specific reason, but it's good to document it)
            DriverAction.waitSec(2);

            // Click the Submit button
            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);

            // Log the success
            GemTestReporter.addTestStep("Verify if form items are visible", "Contripoint form items are visible", STATUS.PASS);
        } else {
            // Log the failure if any form elements are not visible
            GemTestReporter.addTestStep("Verify if form items are visible", "Contripoint form items are not visible", STATUS.FAIL);
        }
    }

    @Then("^User Change the state of award \"(.*)\" to inactive$")
    public void changeStateToInActive(String award_name) {


        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        waitUntilElementDisappear(RewardAndRecogniztionLocators.SuccessAnimationInAwardList,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);

        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, award_name);
       waitSec(3);
        waitUntilElementAppear(RewardAndRecogniztionLocators.ToggleButtonInAwardInAwardList(award_name), 5);
        if (isDisplayed(RewardAndRecogniztionLocators.ToggleButtonInAwardInAwardList(award_name))) {
            waitUntilElementClickable(RewardAndRecogniztionLocators.ToggleButtonInAwardInAwardList(award_name),10);
            click(RewardAndRecogniztionLocators.ToggleButtonInAwardInAwardList(award_name));
            GemTestReporter.addTestStep("Verify if list item and toggle button is visible", "Contripoint list item and toggle button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if list item and toggle button is visible", "Contripoint list item and toggle button is visible", STATUS.FAIL);
        }
    }




    @Then("user set category to gem award")
    public void setCateogyToGemAward() {

       // waitUntilElementAppear(RewardAndRecogniztionLocators.GemAwardCheckBox,10);
        waitSec(10);

        isDisplayed(RewardAndRecogniztionLocators.GemAwardCheckBox);
        click(RewardAndRecogniztionLocators.GemAwardCheckBox,"Verify clickable","clicakble");


        if (isExist(RewardAndRecogniztionLocators.GemAwardCheckBox)) {
            Point checkBoxLocation = getButtonLocation(RewardAndRecogniztionLocators.GemAwardCheckBox);
            clickWithRobot(checkBoxLocation);
            GemTestReporter.addTestStep("Verify if GemAwardCheckBox is visible", "Contripoint GemAwardCheckBox is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if GemAwardCheckBox is visible", "Contripoint GemAwardCheckBox is visible", STATUS.FAIL);
        }
        waitSec(10);
    }


    private void clickWithRobot(Point location) {
        try {
            Robot robot = new Robot();
            robot.mouseMove((int) location.getX(), (int) location.getY());
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Then("Navigate to the list of awards in gem category with Inactive award.")
    public void navigateTheNameOfAwardInGemInactiveList() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);

        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, RewardAndRecogniztionLocators.AwardNameinGemWithInactive);

        waitUntilElementAppear(RewardAndRecogniztionLocators.IteminAwardListGemInactive, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.IteminAwardListGemInactive, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.IteminAwardListGemInactive)) {

            GemTestReporter.addTestStep("Verify if award is visible", "Contripoint award is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if award is visible", "Contripoint award is visible", STATUS.FAIL);
        }
    }


    @Then("Navigate to the list of awards in gem category with Active award.")
    public void navigateTheNameOfAwardInGemActiveList() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SearchBarInAwardList, 10);

        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, RewardAndRecogniztionLocators.AwardNameinGemWithActive);

        waitUntilElementAppear(RewardAndRecogniztionLocators.IteminAwardListGemActive, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.IteminAwardListGemActive, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.IteminAwardListGemActive)) {
            GemTestReporter.addTestStep("Verify if award is visible", "Contripoint award is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if award is visible", "Contripoint award is visible", STATUS.FAIL);
        }
    }


    @When("User Click On Submit Button")
    public void UserClickOnAwardFormSubmit() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward)) {
            waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward, 10);
            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);
            GemTestReporter.addTestStep("Verify if submit button is visible", "Contripoint submit button is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if submit button is visible", "Contripoint submit button is visible", STATUS.FAIL);

        }
    }

    @When("Verify if any error messages appear indicating missing mandatory fields.")
    public void verifyErrorMessageAppearedAwardForm() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.ErrorMessageInAwardForm, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ErrorMessageInAwardForm, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.ErrorMessageInAwardForm)) {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.FAIL);
        }
    }

    @Then("Enter valid data for some fields like Name and Description but leave visibility blank")
    public void enterNameAndDescriptionInAwardForm() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.AwardNameInCreateNewAward) && isDisplayed(RewardAndRecogniztionLocators.DescrptionInCreateNewAward)) {
            typeText(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, "test1Award");
            typeText(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, "Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work ");
            GemTestReporter.addTestStep("Verify if form elements are visible", "Contripoint form elements visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if form elements is visible", "Contripoint form elements are visible", STATUS.FAIL);
        }
    }


    @When("^the user enters \"(.*)\", award Visibility as active, \"(.*)\" and clicks on the submit button$")
    public void UserEntersAwardDetailsWithActiveAward(String awardName, String description) {
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.AwardNameInCreateNewAward) && isExist(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward) && isExist(RewardAndRecogniztionLocators.InactiveButtonInCreateNewAward) && isExist(RewardAndRecogniztionLocators.DescrptionInCreateNewAward)) {
            waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);
            typeText(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, awardName);
            click(RewardAndRecogniztionLocators.ActiveButtonInCreateNewAward);
            typeText(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, description);
            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.FAIL);
        }
    }


    @When("Verify if any error messages appear indicating error in reward amount field.")
    public void verifyErrorMessageAppearedForRewardInAwardForm() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.ErrorMessageForRewardInAwardForm, 10);

//        waitUntilElementClickable(RewardAndRecogniztionLocators.ErrorMessageForRewardInAwardForm, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ErrorMessageForRewardInAwardForm)) {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.FAIL);
        }
    }

    @When("Verify if any error messages appear indicating error in Description field.")
    public void verifyErrorMessageAppearedForDescriptionInAwardForm() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.ErrorMessageForDescriptionInAwardForm, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ErrorMessageForDescriptionInAwardForm)) {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.FAIL);
        }
    }

    @When("Verify if any error messages does not appear indicating error in Description field.")
    public void verifyErrorMessageNotAppearedForDescriptionInAwardForm() {

        waitSec(3);
//        waitUntilElementAppear(RewardAndRecogniztionLocators.ErrorMessageForDescriptionInAwardForm, 10);
        if (!isDisplayed(RewardAndRecogniztionLocators.ErrorMessageForDescriptionInAwardForm)) {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.FAIL);
        }
    }

    @When("^User enter char like \"(.*)\" in reward amount$")
    public void UserEntersReawrdAmountInChar(String rewardInChar) {
        waitUntilElementAppear(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward)) {
            typeText(RewardAndRecogniztionLocators.RewardAmountInCreateNewAward, rewardInChar);
            waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward, 10);
            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.FAIL);
        }
    }

    @When("^User enter char like \"(.*)\" in Description$")
    public void UserEntersDescriptionVeryShort(String shortDescription) {

        waitUntilElementAppear(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.DescrptionInCreateNewAward)) {
            typeText(RewardAndRecogniztionLocators.DescrptionInCreateNewAward, shortDescription);
            waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward, 10);

            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.FAIL);
        }
    }

    @When("^User enter char like \"(.*)\" in award name$")
    public void UserEntersAlphaNumericInAwardName(String awardNameWithSpecialChar) {
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.AwardNameInCreateNewAward)) {
            DriverAction.waitSec(2);
            typeText(RewardAndRecogniztionLocators.AwardNameInCreateNewAward, awardNameWithSpecialChar);

            click(RewardAndRecogniztionLocators.SubmitButtonInCreateNewAward);
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if form items is visible", "Contripoint form items is visible", STATUS.FAIL);
        }
    }


    @When("Verify if any error messages does not appear indicating error in award field.")
    public void verifyErrorMessageNotAppearedForAwardNameInAwardForm() {
        waitSec(2);
//        waitUntilElementAppear(RewardAndRecogniztionLocators.ErrorMessageForAwardNameInAwardForm, 10);
        if (!isDisplayed(RewardAndRecogniztionLocators.ErrorMessageForAwardNameInAwardForm)) {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if Error message is visible", "Contripoint Error message is visible", STATUS.FAIL);
        }
    }

    @When("Select EC-DC option")
    public void selectEcDcOption() {

        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
//       if( isExist(RewardAndRecogniztionLocators.LoadingAnimation) || isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
//           waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
//       }
        waitUntilElementAppear(RewardAndRecogniztionLocators.HRPortalPage, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HRPortalPage, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.HrAnalyticsSection, 10);

        waitUntilElementAppear(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown) && isExist(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown)) {
            // Perform the selection action here
            waitUntilElementAppear(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown, 10);

            waitUntilElementIsClickable(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown);
            waitSec(3);
            click(RewardAndRecogniztionLocators.HrAnalyticsSelectEcDcDropdown);

            GemTestReporter.addTestStep("Open EC-DC DropDown", "Successfully opened EC-DC dropdown", STATUS.PASS);

            waitUntilElementAppear(RewardAndRecogniztionLocators.EcDcOptionInDropDown, 10);

            if (isDisplayed(RewardAndRecogniztionLocators.EcDcOptionInDropDown)) {

                waitUntilElementClickable(RewardAndRecogniztionLocators.EcDcOptionInDropDown, 10);
                click(RewardAndRecogniztionLocators.EcDcOptionInDropDown);

                GemTestReporter.addTestStep("Select All EC-DC Option", "Successfully selected All EC-DC option", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Select EC-DC Option", "Failed to select All EC-DC option", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Open EC-DC DropDown", "Failed to open EC-DC dropdown", STATUS.FAIL);
        }
    }

    @When("Verify if all EC-DC options is displayed and selectable")
    public void verifyAllEcDcisSelected() {

        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectedEcDcOption, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SelectedEcDcOption)) {
            GemTestReporter.addTestStep("Verify All EC-DC Options", "All EC-DC options are displayed and selectable", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify All EC-DC Options", "Not all EC-DC options are displayed and selectable", STATUS.FAIL);
        }
    }


    @Then("Select Onshore option")
    public void selectOnshoreOption() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);


        if (isDisplayed(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown)) {
            waitUntilElementIsClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
            waitSec(3);
            click(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
            GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Successfully opened Onshore-Offshore dropdown", STATUS.PASS);


            // Selecting Onshore option
            waitUntilElementAppear(RewardAndRecogniztionLocators.OnshoreInDropDown, 10);
            waitUntilElementClickable(RewardAndRecogniztionLocators.OnshoreInDropDown, 10);
            if (isDisplayed(RewardAndRecogniztionLocators.OnshoreInDropDown)) {

                waitUntilElementIsClickable(RewardAndRecogniztionLocators.OnshoreInDropDown);

                click(RewardAndRecogniztionLocators.OnshoreInDropDown);
                GemTestReporter.addTestStep("Select Onshore Option", "Successfully selected Onshore option", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Select Onshore Option", "Failed to select Onshore option: Element not visible", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Failed to open Onshore-Offshore dropdown: Element not visible", STATUS.FAIL);
        }
    }

    @Then("Select Offshore option")
    public void selectOffshoreOption() {

        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);


        if (isDisplayed(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown)) {
            waitUntilElementIsClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
            click(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
            GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Successfully opened Onshore-Offshore dropdown", STATUS.PASS);

            // Selecting Onshore option
            waitUntilElementAppear(RewardAndRecogniztionLocators.OffshoreInDropDown, 10);
            waitUntilElementClickable(RewardAndRecogniztionLocators.OffshoreInDropDown, 10);
            if (isDisplayed(RewardAndRecogniztionLocators.OffshoreInDropDown)) {
                waitUntilElementIsClickable(RewardAndRecogniztionLocators.OffshoreInDropDown);
                if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
                    waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
                }
//                waitSec(3);
                click(RewardAndRecogniztionLocators.OffshoreInDropDown);
                GemTestReporter.addTestStep("Select Offshore Option", "Successfully selected Offshore option", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Select Offshore Option", "Failed to select Offshore option: Element not visible", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Failed to open Onshore-Offshore dropdown: Element not visible", STATUS.FAIL);
        }
    }


    @Then("Verify if onshore-offshore options is displayed and selectable")
    public void verifyIfOnshoreOffshoreOptionsIsDisplayedAndSelectable() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SelectedOnshoreOption, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectedOnshoreOption, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.SelectedOnshoreOption)) {
            GemTestReporter.addTestStep("Verify Onshore-Offshore Options", "Onshore-Offshore options are displayed and selectable", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify Onshore-Offshore Options", "Onshore-Offshore options are not displayed or not selectable", STATUS.FAIL);
        }
    }

    @Then("Click on select date range icon")
    public void clickOnSelectDateRangeIcon() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.DateRangeIcon, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.DateRangeIcon, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.DateRangeIcon)) {
            waitUntilElementIsClickable(RewardAndRecogniztionLocators.DateRangeIcon);


            click(RewardAndRecogniztionLocators.DateRangeIcon);
            GemTestReporter.addTestStep("Click on Date Range Icon", "Successfully clicked on the Date Range Icon", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Click on Date Range Icon", "Failed to click on the Date Range Icon: Element not visible", STATUS.FAIL);
        }
    }

    @Then("select date range with desired quarters")
    public void selectDateRangeWithDesiredQuarters() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.QuartersForDateRange, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.QuartersForDateRange, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.QuartersForDateRange)) {
            waitUntilElementIsClickable(RewardAndRecogniztionLocators.QuartersForDateRange);
            waitSec(2);
            click(RewardAndRecogniztionLocators.QuartersForDateRange);
            GemTestReporter.addTestStep("Click on Desired Quarters", "Successfully clicked on the desired quarters", STATUS.PASS);

            waitUntilElementAppear(RewardAndRecogniztionLocators.DoneButtonInDateRange, 10);
            waitUntilElementClickable(RewardAndRecogniztionLocators.DoneButtonInDateRange, 10);

            // Check if the "Done" button is displayed and click it if present
            if (isDisplayed(RewardAndRecogniztionLocators.DoneButtonInDateRange)) {
                click(RewardAndRecogniztionLocators.DoneButtonInDateRange);
                GemTestReporter.addTestStep("Click on Done Button", "Successfully clicked on the Done button", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Click on Done Button", "Done button not displayed after selecting quarters", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Click on Desired Quarters", "Failed to click on the desired quarters: Element not visible", STATUS.FAIL);
        }
    }

    @Then("Verify if the total number of employees in the selected EC-DC is displayed.")
    public void verifyIfTheTotalNumberOfEmployeesInTheSelectedECDCIsDisplayed() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NoOfEmplyees, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfEmplyees, 10);
        waitSec(2);
        if (isDisplayed(RewardAndRecogniztionLocators.NoOfEmplyees)) {
            GemTestReporter.addTestStep("Verify if the total number of employees is displayed",
                    "Total number of employees is displayed on the page", STATUS.PASS);

        } else {
            GemTestReporter.addTestStep("Verify if the total number of employees is displayed",
                    "Total number of employees is not displayed on the page", STATUS.FAIL);
        }
    }

    @Then("Verify if the total number of nominations in the selected EC-DC is displayed.")
    public void verifyIfTheTotalNumberOfNominationsInTheSelectedECDCIsDisplayed() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NoOfNominations, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfNominations, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NoOfNominations)) {
            GemTestReporter.addTestStep("Verify if the total number of nominations is displayed",
                    "Total number of nominations is displayed on the page", STATUS.PASS);

        } else {
            GemTestReporter.addTestStep("Verify if the total number of nominations is displayed",
                    "Total number of nominations is not displayed on the page", STATUS.FAIL);
        }
    }

    @Then("Verify if the total number of Awardees in the selected EC-DC is displayed.")
    public void verifyIfTheTotalNumberOfAwardeesInTheSelectedECDCIsDisplayed() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NoOfAwardees, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfAwardees, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NoOfAwardees)) {
            GemTestReporter.addTestStep("Verify if the total number of Awardees is displayed",
                    "Total number of Awardees is displayed on the page", STATUS.PASS);

        } else {
            GemTestReporter.addTestStep("Verify if the total number of Awardees is displayed",
                    "Total number of Awardees is not displayed on the page", STATUS.FAIL);
        }
    }

    public static int onshoreEmployeesNum, offShoreEmployeesNum, bothEmployeesNum;

    @Then("Select Onshore option Offshore option and then both option and verify the sum")
    public void selectOnshoreOptionOffshoreOptionAndThenBothOptionAndVerifyTheSum() {
        // Wait for loading animation to disappear if it is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Wait until the dropdown for Onshore/Offshore selection appears and is clickable, then open it
        waitUntilElementAppear(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitSec(7);
        click(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
        GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Successfully opened Onshore-Offshore dropdown", STATUS.PASS);

        // Wait until the Onshore option appears and is clickable, then select it
        waitUntilElementAppear(RewardAndRecogniztionLocators.OnshoreInDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.OnshoreInDropDown, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        click(RewardAndRecogniztionLocators.OnshoreInDropDown);
        GemTestReporter.addTestStep("Select Onshore Option", "Successfully selected Onshore option", STATUS.PASS);

        // Get the number of Onshore employees
        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfEmplyees, 10);
        String numberOfEmployeeText = String.valueOf(getElementsText(RewardAndRecogniztionLocators.NoOfEmplyees));
        Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher = pattern.matcher(numberOfEmployeeText);
        int onshoreEmployeesNum = 0;
        if (matcher.find()) {
            onshoreEmployeesNum = parseInt(matcher.group());
        }

        // Wait for loading animation to disappear if it is displayed again
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Open the Onshore/Offshore dropdown again
        waitUntilElementAppear(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        click(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
        GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Successfully opened Onshore-Offshore dropdown", STATUS.PASS);

        // Select the Offshore option
        waitUntilElementAppear(RewardAndRecogniztionLocators.OffshoreInDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.OffshoreInDropDown, 10);
        click(RewardAndRecogniztionLocators.OffshoreInDropDown);
        GemTestReporter.addTestStep("Select Offshore Option", "Successfully selected Offshore option", STATUS.PASS);

        // Get the number of Offshore employees
        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfEmplyees, 10);
        numberOfEmployeeText = String.valueOf(getElementsText(RewardAndRecogniztionLocators.NoOfEmplyees));
        pattern = Pattern.compile("^\\d+");
        matcher = pattern.matcher(numberOfEmployeeText);
        int offShoreEmployeesNum = 0;
        if (matcher.find()) {
            offShoreEmployeesNum = parseInt(matcher.group());
        }

        // Wait for loading animation to disappear if it is displayed again
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Open the Onshore/Offshore dropdown again
        waitUntilElementAppear(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown, 10);
        waitSec(10);
        click(RewardAndRecogniztionLocators.selectOnshoreOffshoreDropDown);
        GemTestReporter.addTestStep("Open Onshore-Offshore DropDown", "Successfully opened Onshore-Offshore dropdown", STATUS.PASS);

        // Select the Both option
        waitUntilElementClickable(RewardAndRecogniztionLocators.BothInDropDown, 10);
        click(RewardAndRecogniztionLocators.BothInDropDown);
        GemTestReporter.addTestStep("Select Both Option", "Successfully selected Both option", STATUS.PASS);

        // Get the number of employees when Both option is selected
        waitUntilElementAppear(RewardAndRecogniztionLocators.NoOfEmplyees, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.NoOfEmplyees, 10);
        numberOfEmployeeText = String.valueOf(getElementsText(RewardAndRecogniztionLocators.NoOfEmplyees));
        pattern = Pattern.compile("^\\d+");
        matcher = pattern.matcher(numberOfEmployeeText);
        int bothEmployeesNum = 0;
        if (matcher.find()) {
            bothEmployeesNum = parseInt(matcher.group());
        }

        // Verify if the sum of Onshore and Offshore employees matches the number of Both employees
        int totalEmployees = onshoreEmployeesNum + offShoreEmployeesNum;
        if (totalEmployees == bothEmployeesNum) {
            GemTestReporter.addTestStep("Verify the sum of Onshore and Offshore employees",
                    "The sum of Onshore and Offshore employees matches Both employees: " + totalEmployees, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify the sum of Onshore and Offshore employees",
                    "The sum of Onshore and Offshore employees does not match Both employees: " + totalEmployees + " and: " + bothEmployeesNum, STATUS.FAIL);
        }
    }


    @Then("Select the desired quarters and checks if the number of nominations are equal to nominations present in list")
    public void selectTheDesiredQuarters() {

        // Wait for the loading animation to disappear if it is displayed
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        // Wait until the start date dropdown is clickable and then click it
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectStartDateDropDown, 10);
        click(RewardAndRecogniztionLocators.SelectStartDateDropDown);

        // Scroll to and select the start date
        scrollIntoView(RewardAndRecogniztionLocators.SelectStartDate);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectStartDate, 10);
        click(RewardAndRecogniztionLocators.SelectStartDate);

        // Wait until the end date dropdown is clickable and then click it
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectEndDateDropDown, 10);
        click(RewardAndRecogniztionLocators.SelectEndDateDropDown);

        // Scroll to and select the end date
        scrollIntoView(RewardAndRecogniztionLocators.SelectEndDate);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectEndDate, 10);
        click(RewardAndRecogniztionLocators.SelectEndDate);

        // Select the start and end quarters for the date range
        waitUntilElementClickable(RewardAndRecogniztionLocators.QuartersForStartDateRange, 10);
        click(RewardAndRecogniztionLocators.QuartersForStartDateRange);
        click(RewardAndRecogniztionLocators.QuartersForEndDateRange);

        // Click the done button to apply the date range
        waitUntilElementClickable(RewardAndRecogniztionLocators.DoneButtonInDateRange, 10);
        click(RewardAndRecogniztionLocators.DoneButtonInDateRange);

        // Wait for the loading animation to disappear after applying the date range
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 60);
        }

        // Wait until the list of nominations is clickable
        waitUntilElementClickable(RewardAndRecogniztionLocators.listOfNominations, 60);

        // Scroll to the list of nominations and get the text of each nomination item
        scrollIntoView(RewardAndRecogniztionLocators.listOfNominations);
        List<String> list = getElementsText(RewardAndRecogniztionLocators.listOfNominations);

        // Initialize a sum variable to store the total number of nominations from the list
        int sum = 0;

        // Get the total number of nominations from the specified element
        int totalNomination = parseInt(getElementText(RewardAndRecogniztionLocators.NoOfNominations));

        // Loop through each item in the list of nominations
        for (String item : list) {
            try {
                // Attempt to parse each item as an integer and add it to the sum
                int number = parseInt(item.trim());
                sum += number;
            } catch (NumberFormatException e) {
                // Log an error if an item cannot be parsed as an integer
                System.err.println("Error: Invalid integer value or non-integer item found: " + item);
            }
        }

        // Print the total nominations and the sum of nominations from the list
        System.out.println("Total Nominations: " + totalNomination + ", Sum of Nominations: " + sum);

        // Compare the total nominations with the sum of the list nominations and report the result
        if (totalNomination == sum) {
            GemTestReporter.addTestStep("Verify the sum of Nominations",
                    "The sum of nominations in the list matches total nominations", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify the sum of Nominations",
                    "The sum of nominations in the list does not match total nominations", STATUS.FAIL);
        }
    }


    @When("User Clicks on Award Nomination Icon")
    public void userClicksOnAwardNominationIcon() {

        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardNominationsIcon, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardNominationsIcon, 10);
       waitSec(3);
        if (isDisplayed(RewardAndRecogniztionLocators.AwardNominationsIcon)) {
            click(RewardAndRecogniztionLocators.AwardNominationsIcon);
            GemTestReporter.addTestStep("Verify if AwardNominationsIcon is visible", "Contripoint AwardNominationsIcon is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if AwardNominationsIcon is visible", "Contripoint AwardNominationsIcon is visible", STATUS.FAIL);
        }
    }

    @Then("User Access the Recommended by Me section.")
    public void userAccessTheSection() {

        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.RecommendedByMeSection, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.RecommendedByMeSection, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.RecommendedByMeSection)) {
            click(RewardAndRecogniztionLocators.RecommendedByMeSection);
            GemTestReporter.addTestStep("Verify if RecommendedByMeSection is visible", "Contripoint AwardNominationsIcon is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if RecommendedByMeSection is visible", "Contripoint AwardNominationsIcon is visible", STATUS.FAIL);
        }
    }

    @And("Verifies if there is a list displaying recommendations made by the user.")
    public void verifiesIfThereIsAListDisplayingRecommendationsMadeByTheUser() {
        waitUntilElementClickable(RewardAndRecogniztionLocators.RecommendedByMeList, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.RecommendedByMeList)) {
//            List<String> list = getElementsText(RewardAndRecogniztionLocators.RecommendedByMeList);
//            if(list.size()>0){
            GemTestReporter.addTestStep("Verify if List is visible", "Contripoint List is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if List is visible", "Contripoint List is visible", STATUS.FAIL);
        }
    }

    @When("User Clicks On Add New Button")
    public void userClicksOnAddNewButton() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.AddNewButtonInRecommendedByMe, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.AddNewButtonInRecommendedByMe, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AddNewButtonInRecommendedByMe)) {
            click(RewardAndRecogniztionLocators.AddNewButtonInRecommendedByMe);
            GemTestReporter.addTestStep("Verify if List is visible", "Contripoint List is visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify if List is visible", "Contripoint List is visible", STATUS.FAIL);
        }
    }

    @Then("^User Enters the Name Of The Employee \"(.*)\"$")
    public void userEntersTheNameOfTheEmployee(String nameOfEmployee) {
        waitUntilElementAppear(RewardAndRecogniztionLocators.NameOfEmployeeDropDown, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.NameOfEmployeeDropDown, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NameOfEmployeeDropDown)) {
            click(RewardAndRecogniztionLocators.NameOfEmployeeDropDown);

            if (isDisplayed(RewardAndRecogniztionLocators.SearchBarInNameOfEmployee)) {
                typeText(RewardAndRecogniztionLocators.SearchBarInNameOfEmployee, nameOfEmployee);
                waitSec(2);
                try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    GemTestReporter.addTestStep("Press Enter", "Enter key pressed successfully", STATUS.PASS);
                } catch (AWTException e) {
                    GemTestReporter.addTestStep("Press Enter", "Failed to press Enter key: AWTException occurred", STATUS.FAIL);
                }
            } else {
                GemTestReporter.addTestStep("Search Bar", "Search bar not visible for entering employee name", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Employee Dropdown", "Employee dropdown not visible", STATUS.FAIL);
        }
    }


    @Then("^User Enters the Praise \"(.*)\" For the Employee$")
    public void userEntersThePraiseForTheEmployee(String praise) {
        waitUntilElementAppear(RewardAndRecogniztionLocators.PraiseInAddNewRecommendation, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.PraiseInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.PraiseInAddNewRecommendation)) {
            typeText(RewardAndRecogniztionLocators.PraiseInAddNewRecommendation, praise);
            GemTestReporter.addTestStep("Enter Praise", "Praise entered successfully: " + praise, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Enter Praise", "Failed to enter praise", STATUS.FAIL);
        }
    }


    @Then("User Selects Share praise with EC")
    public void userSelectsSharePraiseWithEC(){
        waitUntilElementAppear(RewardAndRecogniztionLocators.EcbuttoninAddNewRecommendation, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.EcbuttoninAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.EcbuttoninAddNewRecommendation)) {

                waitSec(3);
                click(RewardAndRecogniztionLocators.EcbuttoninAddNewRecommendation);

                GemTestReporter.addTestStep("Share Praise with EC", "Praise shared with EC successfully", STATUS.PASS);

        } else {
            GemTestReporter.addTestStep("Share Praise with EC", "Failed to share praise with EC: Button not visible", STATUS.FAIL);
        }
    }

    // Helper method to get the location of the button
    private Point getButtonLocation(By locator) {

        WebElement element = getElement(RewardAndRecogniztionLocators.EcbuttoninAddNewRecommendation);
        Point location = element.getLocation();
        int xOffset = element.getSize().getWidth() / 2;
        int yOffset = element.getSize().getHeight() / 2;
        return new Point(location.getX() + xOffset, location.getY() + yOffset);
    }

    @Then("User Clicks on next button")
    public void userClicksOnNextButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation)) {
            waitSec(3);
            click(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation);
            GemTestReporter.addTestStep("Click Next Button", "Next button clicked successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Click Next Button", "Failed to click Next button", STATUS.FAIL);
        }
    }
    @Then("Select an award from the list")
    public void selectAnAwardFromTheList() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardCardInAddNewRecommendation, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardCardInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AwardCardInAddNewRecommendation)) {
            click(RewardAndRecogniztionLocators.AwardCardInAddNewRecommendation);
            GemTestReporter.addTestStep("Select Award", "Award selected successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Select Award", "Failed to select award", STATUS.FAIL);
        }
    }

    @Then("^Select an award \"(.*)\" from the list that is turned to active$")
    public void selectAnAwardFromTheListTurnedActive(String award_name) {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive(award_name), 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive(award_name), 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive(award_name))) {
            scrollIntoView(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive(award_name));
            click(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive(award_name));
            GemTestReporter.addTestStep("Select Award", "Award selected successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Select Award", "Failed to select award", STATUS.FAIL);
        }
    }

    @Then("Press Submit in award category")
    public void pressSubmitInAwardCategory() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SubmitButtonInAwardSelectionInAddNewRecommendation, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SubmitButtonInAwardSelectionInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SubmitButtonInAwardSelectionInAddNewRecommendation)) {
            click(RewardAndRecogniztionLocators.SubmitButtonInAwardSelectionInAddNewRecommendation);
            GemTestReporter.addTestStep("Click Submit", "Submit button clicked successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Click Submit", "Failed to click Submit button", STATUS.FAIL);
        }
    }

    @Then("^Verify the Name of employees \"(.*)\" listed after adding the recommendation$")
    public void verifyTheNameOfEmployeeListedAfterAddingTheRecommendation(String emp_name) {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.EmployeeInList(emp_name), 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.EmployeeInList(emp_name), 10);
        waitSec(3);
        if (isDisplayed(RewardAndRecogniztionLocators.EmployeeInList(emp_name))) {
            GemTestReporter.addTestStep("Verify Employee List", "Employees are listed after adding the recommendation", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify Employee List", "No employees are listed after adding the recommendation", STATUS.FAIL);
        }
    }

    @Then("User Clicks on Filter button in Recommended By me section")
    public void userClicksOnFilterButtonInRecommendedByMeSection() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.FilterButtonInRecommendedByMe, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.FilterButtonInRecommendedByMe, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.FilterButtonInRecommendedByMe)) {
            click(RewardAndRecogniztionLocators.FilterButtonInRecommendedByMe);
            GemTestReporter.addTestStep("Verify Filter Button", "Clicked on the Filter button in Recommended By Me section", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify Filter Button", "Failed to click on the Filter button in Recommended By Me section", STATUS.FAIL);
        }
    }

    @Then("User Selects the desired Filter")
    public void userSelectsTheDesiredFilter() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.EcButtonInFilterInRecommendedByMe, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.EcButtonInFilterInRecommendedByMe, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.EcButtonInFilterInRecommendedByMe)) {
            click(RewardAndRecogniztionLocators.EcButtonInFilterInRecommendedByMe);
            GemTestReporter.addTestStep("Select Desired Filter", "Selected the desired filter", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Select Desired Filter", "Failed to select the desired filter", STATUS.FAIL);
        }
        waitSec(1);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ApplyButtonInFilterInRecommendedByMe, 10);
        scrollIntoView(RewardAndRecogniztionLocators.ApplyButtonInFilterInRecommendedByMe);
        if (isDisplayed(RewardAndRecogniztionLocators.ApplyButtonInFilterInRecommendedByMe)) {
            click(RewardAndRecogniztionLocators.ApplyButtonInFilterInRecommendedByMe);
            GemTestReporter.addTestStep("Apply Filter", "Applied the desired filter", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Apply Filter", "Failed to apply the desired filter", STATUS.FAIL);
        }
    }

    @Then("Users Checks if the desired filter are applied")
    public void usersChecksIfTheDesiredFilterAreApplied() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.FilterOptionInEmployeeListInRecommendedByMe, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.FilterOptionInEmployeeListInRecommendedByMe, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.FilterOptionInEmployeeListInRecommendedByMe)) {
            GemTestReporter.addTestStep("Verify Filter Applied", "The desired filter is applied", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verify Filter Applied", "Failed to apply the desired filter", STATUS.FAIL);
        }
    }

    @Then("User clicks on previous button in Select an Award Category")
    public void userClicksOnPreviousButtonInSelectAnAwardCategory() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.PreviousButtonInAwardSelectionInAddNewRecommendation, 10);

        waitUntilElementClickable(RewardAndRecogniztionLocators.PreviousButtonInAwardSelectionInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.PreviousButtonInAwardSelectionInAddNewRecommendation)) {
            click(RewardAndRecogniztionLocators.PreviousButtonInAwardSelectionInAddNewRecommendation);
            GemTestReporter.addTestStep("Navigate Back", "Clicked on the previous button in Select an Award Category", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Navigate Back", "Failed to click on the previous button in Select an Award Category", STATUS.FAIL);
        }
    }

    @Then("User Clicks on next button in Add new Recommendation")
    public void userClicksOnNextButtonInAddNewRecommendation() {
        waitUntilElementClickable(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation)) {
            click(RewardAndRecogniztionLocators.NextButtonInAddNewRecommendation);
            GemTestReporter.addTestStep("Navigate Forward", "Clicked on the next button in Add New Recommendation", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Navigate Forward", "Failed to click on the next button in Add New Recommendation", STATUS.FAIL);
        }
    }

    @Then("User Clicks on Save as Draft in Select an Award Category and verify")
    public void userClicksOnSaveAsDraftInSelectAnAwardCategory() {
        waitUntilElementClickable(RewardAndRecogniztionLocators.SaveAsDraftButtonInAwardSelectionInAddNewRecommendation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SaveAsDraftButtonInAwardSelectionInAddNewRecommendation)) {
            click(RewardAndRecogniztionLocators.SaveAsDraftButtonInAwardSelectionInAddNewRecommendation);
            if(isDisplayed(RewardAndRecogniztionLocators.SaveAsDraftAnimation)){
                GemTestReporter.addTestStep("Save as Draft", "Clicked on Save as Draft in Select an Award Category", STATUS.PASS);
            }
            else{
                GemTestReporter.addTestStep("Save as Draft", "Failed to click on Save as Draft in Select an Award Category", STATUS.FAIL);

            }
            GemTestReporter.addTestStep("Save as Draft", "button is visible an Award Category", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Save as Draft", "button is not displayed in Award Category", STATUS.FAIL);
        }
    }

    @When("user types the name of the award in the search bar and check if the list gets updated")
    public void userTypesTheNameOfTheAwardInTheSearchBar() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SearchBarInAwardList,10);
        typeText(RewardAndRecogniztionLocators.SearchBarInAwardList, "Influence");
        waitUntilElementAppear(RewardAndRecogniztionLocators.FirstNameInAwardList,10);
        waitSec(3);
        String name = String.valueOf(getElementsText(RewardAndRecogniztionLocators.FirstNameInAwardList));
        if (name.contains("Influence")) {
            GemTestReporter.addTestStep("Award List", "List is updating successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Award List", "Failed to update the list with text containing 'Influence'"+ name, STATUS.FAIL);
        }
    }


    @When("click on the ec-dc option")
    public void clickOnTheEcDcOption() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.EcButtonReviewRecommendation,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.EcButtonReviewRecommendation,10);
        waitSec(3);
        click(RewardAndRecogniztionLocators.EcButtonReviewRecommendation);
    }

    @Then("verify that the ec option is selected")
    public void verifyThatTheEcOptionIsSelected() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.VerifyByClassEcButtonIsSelectedReviewRecommendation,10);
        if(isExist(RewardAndRecogniztionLocators.VerifyByClassEcButtonIsSelectedReviewRecommendation)){
            GemTestReporter.addTestStep("Ec button", "ec button clicked successfully", STATUS.PASS);
        }
        else{
            GemTestReporter.addTestStep("Ec button", "ec button is not selected !!Failed", STATUS.FAIL);
        }
    }

    @Then("verify that the dropdown is updated to ec")
    public void verifyThatTheDropdownIsUpdatedToEc() {
        if( isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        if(isExist(RewardAndRecogniztionLocators.VerifyEcDropdownReviewRecommendation)){
            GemTestReporter.addTestStep("Ec dropdown", "ec dropdown updated successfully", STATUS.PASS);
        }
        else{
            GemTestReporter.addTestStep("Ec dropdown", "ec dropdown is not updated !!Failed", STATUS.FAIL);
        }
    }

    @Then("select the specific council")
    public void selectTheSpecificCouncil() {
        waitSec(2);
        click(RewardAndRecogniztionLocators.OpenDropdownToSelectCouncilReviewRecommendation);
        waitSec(1);
        click(RewardAndRecogniztionLocators.ItemInCouncilDropDownReviewRecommendation);
    }

    @Then("^Award \"(.*)\" should not be visible in the list$")
    public void awardShouldNotBeVisibleInTheList(String award_name) {

        waitSec(3);
        if (!isDisplayed(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToInActive(award_name))) {
//            scrollIntoView(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive);
//            click(RewardAndRecogniztionLocators.AwardInRecommendationFormTurnedToActive);
            GemTestReporter.addTestStep("Award should not be visible", "Award is not visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Award should not be visible", "Failed award is visible", STATUS.FAIL);
        }

    }

    @Then("click on hr rules button on top")
    public void clickOnHrRulesButtonOnTop() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.HrRulesButton,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.HrRulesButton,10);

        if(isDisplayed(RewardAndRecogniztionLocators.HrRulesButton)){
            click(RewardAndRecogniztionLocators.HrRulesButton);
            waitUntilElementAppear(RewardAndRecogniztionLocators.HrRulesButtonValidation,10);
            if(isDisplayed(RewardAndRecogniztionLocators.HrRulesButtonValidation)){
                GemTestReporter.addTestStep("Verify HR rules button Clicked", "HR rules button is Clicked Successfully", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Verify HR rules button Clicked", "Failed to click button", STATUS.FAIL);
            }
        }

    }

    @Then("check if user is directed to Recommendation form")
    public void checkIfUserIsOnRecommendationForm() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.ValidationAddNewRecommendationPage,10);

        if(isDisplayed(RewardAndRecogniztionLocators.ValidationAddNewRecommendationPage)){
            GemTestReporter.addTestStep("Recommendation form opened", "previous button is Clicked Successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Recommendation form opened", "Failed to previous click button", STATUS.FAIL);
        }

    }

    @Then("User Click on dropdown button present in employee card")
    public void userClickOnDropdownButtonPresentInEmployeeCard() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.DropDownButtonInEmployeeList,10);
        if(isDisplayed(RewardAndRecogniztionLocators.DropDownButtonInEmployeeList)){
            click(RewardAndRecogniztionLocators.DropDownButtonInEmployeeList);
            GemTestReporter.addTestStep("Dropdown button clicked", "Dropdown button clicked successfully", STATUS.PASS);
        }
        else{
            GemTestReporter.addTestStep("Dropdown button clicked", "Failed to click dropdown button", STATUS.FAIL);
        }
    }

    @Then("user checks if the dropdown is opened")
    public void userChecksIfTheDropdownIsOpened() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.ValidationDropDownButtonInEmployeeList, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ValidationDropDownButtonInEmployeeList)) {
            GemTestReporter.addTestStep("Dropdown opened", "Dropdown opened successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Dropdown opened", "Failed to open dropdown", STATUS.FAIL);
        }
    }


    @Then("user clicks on three dots button")
    public void userClicksOnDotsButton() {
        waitUntilElementDisappear(RewardAndRecogniztionLocators.SaveAsDraftAnimation,10);
        waitUntilElementAppear(RewardAndRecogniztionLocators.ThreeDotButtonInDraftItem,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ThreeDotButtonInDraftItem,10);
        if(isDisplayed(RewardAndRecogniztionLocators.ThreeDotButtonInDraftItem)){
            click(RewardAndRecogniztionLocators.ThreeDotButtonInDraftItem);
            GemTestReporter.addTestStep("Three dots button clicked", "Three dots button clicked successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Three dots button clicked", "Failed to click three dots button", STATUS.FAIL);
        }
    }

    @Then("user checks if the three dots button is clicked and options are visible")
    public void userChecksIfTheDotsButtonIsClickedAndOptionsAreVisible() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.ButtonsUnderThreeDotsButton,10);
        List<WebElement> ls = getElements(RewardAndRecogniztionLocators.ButtonsUnderThreeDotsButton);

        if(ls.size()==3){
            GemTestReporter.addTestStep("Dropdown options visible", "Dropdown options are visible", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Dropdown options visible", "Failed to show dropdown options" + ls.size(), STATUS.FAIL);
        }
    }

    @Then("user clicks on edit button present under three dots button")
    public void userClicksOnEditButtonPresentUnderThreeDotsButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.EditButtonUnderThreeDotsButton, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.EditButtonUnderThreeDotsButton)) {
            click(RewardAndRecogniztionLocators.EditButtonUnderThreeDotsButton);
            GemTestReporter.addTestStep("Edit button clicked", "Edit button clicked successfully", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Edit button clicked", "Failed to click edit button", STATUS.FAIL);
        }
    }


    @Then("user clicks on recommend button present under three dots button")
    public void userClicksOnRecommendButtonPresentUnderThreeDotsButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.RecommendButtonUnderThreeDotsButton, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.RecommendButtonUnderThreeDotsButton)) {
            click(RewardAndRecogniztionLocators.RecommendButtonUnderThreeDotsButton);
            GemTestReporter.addTestStep("Recommend button clicked", "Recommend button clicked successfully", STATUS.PASS);
            waitUntilElementAppear(RewardAndRecogniztionLocators.SuccessAnimation, 10);
            if (isDisplayed(RewardAndRecogniztionLocators.SuccessAnimation)) {
                GemTestReporter.addTestStep("Recommendation success", "Recommendation successful", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Recommendation success", "Failed to recommend employee", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Recommend button clicked", "Failed to click recommend button", STATUS.FAIL);
        }
    }

    @Then("user clicks on Dismiss button present under three dots button")
    public void userClicksOnDismissButtonPresentUnderThreeDotsButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.DismissButtonUnderThreeDotsButton, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.DismissButtonUnderThreeDotsButton)) {
            click(RewardAndRecogniztionLocators.DismissButtonUnderThreeDotsButton);
            GemTestReporter.addTestStep("Dismiss button clicked", "Dismiss button clicked successfully", STATUS.PASS);
            waitUntilElementAppear(RewardAndRecogniztionLocators.YesButtonForDismiss, 10);
            if(isDisplayed(RewardAndRecogniztionLocators.YesButtonForDismiss)){
                click(RewardAndRecogniztionLocators.YesButtonForDismiss);
                GemTestReporter.addTestStep("Dismiss action success", "Employee dismissed successfully", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Dismiss action success", "Failed to dismiss employee", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Dismiss button clicked", "Failed to click dismiss button", STATUS.FAIL);
        }
    }

    @Then("^select the start date \"(.*)\" under date range$")
    public void selectTheStartDateUnderDateRange(String date) {

        waitUntilElementAppear(RewardAndRecogniztionLocators.SelectStartDateDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectStartDateDropDown, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SelectStartDateDropDown)) {
            click(RewardAndRecogniztionLocators.SelectStartDateDropDown);

            waitUntilElementAppear(RewardAndRecogniztionLocators.SelectStartDate(date), 10);
            scrollIntoView(RewardAndRecogniztionLocators.SelectStartDate(date));
            click(RewardAndRecogniztionLocators.SelectStartDate(date));

            GemTestReporter.addTestStep("Start Date Selection", "Start date selected successfully: " + date, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Start Date Selection", "Failed to select start date: " + date, STATUS.FAIL);
        }
    }

    @Then("^select the year with same end date \"(.*)\"$")
    public void selectTheYearWithSameEndDate(String date) {

        waitUntilElementAppear(RewardAndRecogniztionLocators.SelectEndDateDropDown, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectEndDateDropDown, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SelectEndDateDropDown)) {
            click(RewardAndRecogniztionLocators.SelectEndDateDropDown);

            waitUntilElementAppear(RewardAndRecogniztionLocators.SelectEndDate(date), 10);
            scrollIntoView(RewardAndRecogniztionLocators.SelectEndDate(date));
            click(RewardAndRecogniztionLocators.SelectEndDate(date));

            GemTestReporter.addTestStep("End Date Selection", "End date selected successfully: " + date, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("End Date Selection", "Failed to select end date: " + date, STATUS.FAIL);
        }
    }

    @Then("^verify that the number of quarters that can be selected are \"(.*)\"$")
    public void verifyThatTheNumberOfQuartersThatCanBeSelectedAreFour(String quarters) {

        waitUntilElementAppear(RewardAndRecogniztionLocators.TotalQuarters,10);
        List<WebElement> ls = getElements(RewardAndRecogniztionLocators.TotalQuarters);
        if (ls.size() == parseInt(quarters)) {
            GemTestReporter.addTestStep("Quarters Verification", "The number of selectable quarters is correct:" + ls.size(), STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Quarters Verification", "The number of selectable quarters is incorrect. Expected:, Found:" +quarters.toString()+" " + ls.size(), STATUS.FAIL);
        }
    }


    @Then("check if success animation appears")
    public void checkIfSuccessAnimationAppears() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SuccessAnimation, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SuccessAnimation)) {
            GemTestReporter.addTestStep("Recommendation success", "Recommendation successful", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Recommendation success", "Failed to recommend employee", STATUS.FAIL);
        }
    }

    @Then("check if the number of recommendations present in the list are equal to the count")
    public void checkIfTheNumberOfRecommendationsPresentInTheListAreEqualToTheCount() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.CountForReviewRecommendations,10);
        List<WebElement> ls = getElements(RewardAndRecogniztionLocators.CountForReviewRecommendations);

        // Step 1: Get the text from the elements
        String totalRecommendationsText = getElementText(RewardAndRecogniztionLocators.TotalRecommendation);
        String nominationsText = getElementText(RewardAndRecogniztionLocators.NominatedCandidates);

        // Step 2: Remove spaces and non-numeric characters
        String cleanedTotalRecommendationsText = totalRecommendationsText.replaceAll("\\D+", "");
        String cleanedNominationsText = nominationsText.replaceAll("\\D+", "");

        // Step 3: Convert the cleaned string to an integer
        int totalRecommendations = Integer.parseInt(cleanedTotalRecommendationsText);
        int nominations = Integer.parseInt(cleanedNominationsText);

        if (ls.size() == totalRecommendations - nominations) {
            GemTestReporter.addTestStep("Recommendations Verification", "The number of recommendations matches the count. Total: " + totalRecommendations + ", Nominations: " + nominations, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Recommendations Verification", "The number of recommendations does not match the count. Expected: " + (totalRecommendations - nominations) + ", Found: " + ls.size(), STATUS.FAIL);
        }
    }

    @Then("user clicks on the Review Recommendations button for any employee in the list.")
    public void userClicksOnTheReviewRecommendationsButtonForAnyEmployeeInTheList() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.ButtonReviewRecommendation,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ButtonReviewRecommendation,10);
        if(isDisplayed(RewardAndRecogniztionLocators.ButtonReviewRecommendation)){
            click(RewardAndRecogniztionLocators.ButtonReviewRecommendation);
            GemTestReporter.addTestStep("Review Recommendations", "Successfully clicked the Review Recommendations button.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Review Recommendations", "Failed to click the Review Recommendations button as it is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user verifies that they are directed to the nomination page.")
    public void userVerifiesThatTheyAreDirectedToTheNominationPage() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitSec(2);

        waitUntilElementAppear(RewardAndRecogniztionLocators.NominateEmployeePage,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.NominateEmployeePage,10);
        if(isDisplayed(RewardAndRecogniztionLocators.NominateEmployeePage)){
            GemTestReporter.addTestStep("Navigation Verification", "Successfully navigated to the nomination page.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Navigation Verification", "Failed to navigate to the nomination page.", STATUS.FAIL);
        }
    }

    @Then("user enters the name of the employee from the list and checks if list gets updated dynamically")
    public void userEntersTheNameOfTheEmployeeFromTheList() {

        // Wait for the employee names to appear
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesEmployeeReviewRecommendation, 10);

        // Get the name of the first employee in the list
        String name = getElementText(RewardAndRecogniztionLocators.NamesEmployeeReviewRecommendation);

        // Enter the name in the search field
        typeText(RewardAndRecogniztionLocators.SearchReviewRecommendation, name);

        // Wait for the list to update dynamically
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesEmployeeReviewRecommendation, 10);

        // Get the name of the first employee in the updated list
        String updatedName = getElementText(RewardAndRecogniztionLocators.NamesEmployeeReviewRecommendation);

        // Verify if the list gets updated dynamically
        if (updatedName.equals(name)) {
            GemTestReporter.addTestStep("List Update Verification", "The list updated dynamically with the searched name: " + name, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("List Update Verification", "The list did not update dynamically. Expected name: " + name + ", Found name: " + updatedName, STATUS.FAIL);
        }
    }


    @Then("user clicks on unrecognized talent button")
    public void userClicksOnUnrecognizedTalentButton() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.UnrecognizedBtn, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.UnrecognizedBtn, 10);
        scrollIntoView(RewardAndRecogniztionLocators.UnrecognizedBtn);

        if (isDisplayed(RewardAndRecogniztionLocators.UnrecognizedBtn)) {
            click(RewardAndRecogniztionLocators.UnrecognizedBtn);
            GemTestReporter.addTestStep("Unrecognized Talent Button Click", "Successfully clicked the Unrecognized Talent button.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Unrecognized Talent Button Click", "Failed to click the Unrecognized Talent button as it is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if the unrecognized talent page appears")
    public void userChecksIfTheUnrecognizedTalentPageAppears() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.UnrecognizedTalentPage, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.UnrecognizedTalentPage, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.UnrecognizedTalentPage)) {
            GemTestReporter.addTestStep("Unrecognized Talent Page Verification", "The Unrecognized Talent page is displayed.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Unrecognized Talent Page Verification", "The Unrecognized Talent page is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on View Draft List button")
    public void userClicksOnViewDraftListButton() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.ViewDraftListBtn, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ViewDraftListBtn, 10);
        scrollIntoView(RewardAndRecogniztionLocators.ViewDraftListBtn);

        if (isDisplayed(RewardAndRecogniztionLocators.ViewDraftListBtn)) {
            click(RewardAndRecogniztionLocators.ViewDraftListBtn);
            GemTestReporter.addTestStep("View Draft List Button Click", "Successfully clicked the View Draft List button.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("View Draft List Button Click", "Failed to click the View Draft List button as it is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if the View Draft List page appears")
    public void userChecksIfTheViewDraftListPageAppears() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.ViewDraftListPage, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ViewDraftListPage, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.ViewDraftListPage)) {
            GemTestReporter.addTestStep("View Draft List Page Verification", "The View Draft List page is displayed.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("View Draft List Page Verification", "The View Draft List page is not displayed.", STATUS.FAIL);
        }
    }

    @Then("verify that option present on unrecognized talent page appears")
    public void verifyThatOptionPresentOnUnrecognizedTalentPageAppears() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.OptionsUnrecognizedTalentPage, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.OptionsUnrecognizedTalentPage, 10);

        List<WebElement> options = getElements(RewardAndRecogniztionLocators.OptionsUnrecognizedTalentPage);

        if (options.size() == 3) {
            GemTestReporter.addTestStep("Unrecognized Talent Page Options Verification", "All expected options are present on the Unrecognized Talent page.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Unrecognized Talent Page Options Verification", "Expected 3 options on the Unrecognized Talent page, but found " + options.size() + ".", STATUS.FAIL);
        }
    }

    @Then("user clicks on the dropdown button under employee card in the list")
    public void userClicksOnTheDropdownButtonUnderEmployeeCardInTheList() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.DropDownBtnNominationDraftList,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.DropDownBtnNominationDraftList,10);
        if(isDisplayed(RewardAndRecogniztionLocators.DropDownBtnNominationDraftList)){
            click(RewardAndRecogniztionLocators.DropDownBtnNominationDraftList);
            waitUntilElementAppear(RewardAndRecogniztionLocators.DropDownContentNominationDraftList,10);
            if(isDisplayed(RewardAndRecogniztionLocators.DropDownContentNominationDraftList)){
                GemTestReporter.addTestStep("Dropdown Options Verification", "All expected options are present in the dropdown.", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Dropdown Options Verification", "Expected options in the dropdown, but some are missing.", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Dropdown Button Verification", "Dropdown button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on three dots button present under nomination draft list")
    public void userClicksOnThreeDotsButtonPresentUnderNominationDraftList() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.ThreeDotsBtnNominationDraftList,10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ThreeDotsBtnNominationDraftList,10);
        if(isDisplayed(RewardAndRecogniztionLocators.ThreeDotsBtnNominationDraftList)){
            click(RewardAndRecogniztionLocators.ThreeDotsBtnNominationDraftList);
            List<WebElement> options = getElements(RewardAndRecogniztionLocators.ThreeDotsOptionsNominationDraftList);
            if(options.size() == 3){
                GemTestReporter.addTestStep("Three Dots Options Verification", "All expected options are present under the three dots menu.", STATUS.PASS);
            } else {
                GemTestReporter.addTestStep("Three Dots Options Verification", "Expected 3 options under the three dots menu, but found " + options.size() + ".", STATUS.FAIL);
            }
        } else {
            GemTestReporter.addTestStep("Three Dots Button Verification", "Three dots button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on submit nomination button present under three dots button")
    public void userClicksOnSubmitNominationButtonPresentUnderThreeDotsButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.SubmitNominationThreeDotsNominationDraftList, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SubmitNominationThreeDotsNominationDraftList)) {
            click(RewardAndRecogniztionLocators.SubmitNominationThreeDotsNominationDraftList);
            GemTestReporter.addTestStep("Submit Nomination Button Click", "Submit nomination button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Submit Nomination Button Click", "Submit nomination button is not displayed.", STATUS.FAIL);
        }
    }


    @Then("user enters the name of the employee from the list and checks if list gets updated dynamically in Unrecognized Talent")
    public void userEntersTheNameOfTheEmployeeFromTheListAndChecksIfListGetsUpdatedDynamicallyNominatedButNeverAwarded() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        // Wait for the employee names to appear
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesUnrecognizedTal, 10);

        // Get the name of the first employee in the list
        String name = getElementText(RewardAndRecogniztionLocators.NamesUnrecognizedTal).trim();

        // Enter the name in the search field
        typeText(RewardAndRecogniztionLocators.SearchBarUnrecognizedTal, name);

        // Wait for the list to update dynamically
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesUnrecognizedTal, 10);

        // Get the name of the first employee in the updated list
        String updatedName = getElementText(RewardAndRecogniztionLocators.NamesUnrecognizedTal);

        // Verify if the list gets updated dynamically
        if (updatedName.equals(name)) {
            GemTestReporter.addTestStep("List Update Verification", "The list updated dynamically with the searched name: " + name, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("List Update Verification", "The list did not update dynamically. Expected name: " + name + ", Found name: " + updatedName, STATUS.FAIL);
        }

    }

    @Then("user clicks on eye button present under the employee card")
    public void userClicksOnEyeButtonPresentUnderTheEmployeeCard() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.EyeBtnNBNA, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.EyeBtnNBNA, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.EyeBtnNBNA)) {
            click(RewardAndRecogniztionLocators.EyeBtnNBNA);
            GemTestReporter.addTestStep("Eye Button Click", "Eye button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Eye Button Click", "Eye button is not displayed.", STATUS.FAIL);
        }
    }


    @Then("user verifies that employee status card appears")
    public void userVerifiesThatEmployeeStatusCardAppears() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.EmployeeStatus, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.EmployeeStatus, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.EmployeeStatus)) {
            GemTestReporter.addTestStep("Employee Status Card Verification", "Employee status card is displayed as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Employee Status Card Verification", "Employee status card is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on recommended but never nominated button")
    public void userClicksOnRecommendedButNeverNominatedButton() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        waitUntilElementAppear(RewardAndRecogniztionLocators.RecommendedButNeverNominatedSec, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.RecommendedButNeverNominatedSec, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.RecommendedButNeverNominatedSec)) {
            click(RewardAndRecogniztionLocators.RecommendedButNeverNominatedSec);
            GemTestReporter.addTestStep("Recommended But Never Nominated Button Click", "Recommended but never nominated button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Recommended But Never Nominated Button Click", "Recommended but never nominated button is not displayed.", STATUS.FAIL);
        }
    }



    @Then("user clicks on the forward button next to a candidate's name in the list")
    public void userClickOnTheForwardButtonNextToACandidateSNameInTheList() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        waitUntilElementAppear(RewardAndRecogniztionLocators.ForwardBtnRecommendedButNeverNominatedList, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ForwardBtnRecommendedButNeverNominatedList, 10);

        if (isDisplayed(RewardAndRecogniztionLocators.ForwardBtnRecommendedButNeverNominatedList)) {
            click(RewardAndRecogniztionLocators.ForwardBtnRecommendedButNeverNominatedList);
            GemTestReporter.addTestStep("Forward Button Click", "Forward button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Forward Button Click", "Forward button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user enters the name of the employee from the list and checks if list gets updated dynamically in Never recommended Talent")
    public void userEntersTheNameOfTheEmployeeFromTheListAndChecksIfListGetsUpdatedDynamicallyInNeverRecommendedTalent() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        // Wait for the employee names to appear
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesNeverRecommended, 10);

        // Get the name of the first employee in the list
        String name = getElementText(RewardAndRecogniztionLocators.NamesNeverRecommended).trim();

        // Enter the name in the search field
        typeText(RewardAndRecogniztionLocators.SearchBarUnrecognizedTal, name);

        waitSec(1);
        // Wait for the list to update dynamically
        waitUntilElementAppear(RewardAndRecogniztionLocators.NamesNeverRecommended, 10);

        // Get the name of the first employee in the updated list
        String updatedName = getElementText(RewardAndRecogniztionLocators.NamesNeverRecommended);

        // Verify if the list gets updated dynamically
        if (updatedName.equals(name)) {
            GemTestReporter.addTestStep("List Update Verification", "The list updated dynamically with the searched name: " + name, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("List Update Verification", "The list did not update dynamically. Expected name: " + name + ", Found name: " + updatedName, STATUS.FAIL);
        }

    }

    @Then("user clicks on Never Recommended button")
    public void userClicksOnNeverRecommendedButton() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NeverRecommendedSec, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.NeverRecommendedSec, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NeverRecommendedSec)) {
            click(RewardAndRecogniztionLocators.NeverRecommendedSec);
            GemTestReporter.addTestStep("Never Recommended Button Click", "Never Recommended button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Never Recommended Button Click", "Never Recommended button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on arrow button present in employee card")
    public void userClicksOnArrowButtonPresentInEmployeeCard() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.RecommendedBtnNeverRecommended, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.RecommendedBtnNeverRecommended, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.RecommendedBtnNeverRecommended)) {
            click(RewardAndRecogniztionLocators.RecommendedBtnNeverRecommended);
            GemTestReporter.addTestStep("Arrow Button Click", "Arrow button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Arrow Button Click", "Arrow button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if the add new recommendation form appears")
    public void userChecksIfTheAddNewRecommendationFormAppears() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitSec(1);
        waitUntilElementAppear(RewardAndRecogniztionLocators.AddNewRecommendationForm, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AddNewRecommendationForm, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AddNewRecommendationForm)) {
            GemTestReporter.addTestStep("Add New Recommendation Form Verification", "Add new recommendation form is displayed as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Add New Recommendation Form Verification", "Add new recommendation form is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on nominate button")
    public void userClicksOnNominateButton() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NominateBtn, 10);
        scrollIntoView(RewardAndRecogniztionLocators.NominateBtn);
        waitUntilElementClickable(RewardAndRecogniztionLocators.NominateBtn, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NominateBtn)) {
            click(RewardAndRecogniztionLocators.NominateBtn);
            GemTestReporter.addTestStep("Nominate Button Click", "Nominate button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Nominate Button Click", "Nominate button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if add new nomination page appears")
    public void userChecksIfAddNewNominationPageAppears() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitSec(1);
        waitUntilElementAppear(RewardAndRecogniztionLocators.AddNewNominationForm, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AddNewNominationForm, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AddNewNominationForm)) {
            GemTestReporter.addTestStep("Add New Nomination Page Verification", "Add new nomination page is displayed as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Add New Nomination Page Verification", "Add new nomination page is not displayed.", STATUS.FAIL);
        }
    }


//
//
//   NOminated by ec dc
//
//
    @Then("user click on nominated by ec dc section")
    public void userClickOnNominatedByEcDcSection() {

        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.NominatedByECDCSec, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.NominatedByECDCSec, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.NominatedByECDCSec)) {
            click(RewardAndRecogniztionLocators.NominatedByECDCSec);
            GemTestReporter.addTestStep("Add New Nomination Page Verification", "Add new nomination page is displayed as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Add New Nomination Page Verification", "Add new nomination page is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on filter button")
    public void userClicksOnFilterButton() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 30);
            GemTestReporter.addTestStep("Filter Button Click", "Filter button clicked successfully.", STATUS.PASS);

        }

        waitUntilElementAppear(RewardAndRecogniztionLocators.FilterBtn, 30);
        waitUntilElementClickable(RewardAndRecogniztionLocators.FilterBtn, 30);
        waitSec(20);
        if (isDisplayed(RewardAndRecogniztionLocators.FilterBtn)) {
            click(RewardAndRecogniztionLocators.FilterBtn);
            GemTestReporter.addTestStep("Filter Button Click", "Filter button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Filter Button Click", "Filter button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("^user chooses filter option \"(.*)\" from list$")
    public void userChoosesFilterOptionFromList(String opt) {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.FilterOptions(opt), 10);
        scrollIntoView(RewardAndRecogniztionLocators.FilterOptions(opt));
        waitUntilElementClickable(RewardAndRecogniztionLocators.FilterOptions(opt), 10);
        if (isDisplayed(RewardAndRecogniztionLocators.FilterOptions(opt))) {
            click(RewardAndRecogniztionLocators.FilterOptions(opt));
            GemTestReporter.addTestStep("Filter Option Selection", "Filter option '" + opt + "' selected successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Filter Option Selection", "Filter option '" + opt + "' is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user clicks on apply button")
    public void userClicksOnApplyButton() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.ApplyBtnInFilter, 10);
        scrollIntoView(RewardAndRecogniztionLocators.ApplyBtnInFilter);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ApplyBtnInFilter, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ApplyBtnInFilter)) {
            click(RewardAndRecogniztionLocators.ApplyBtnInFilter);
            GemTestReporter.addTestStep("Apply Button Click", "Apply button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Apply Button Click", "Apply button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("^user verifies that filter \"(.*)\" is applied$")
    public void userVerifiesThatFilterIsApplied(String opt) {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.ValidationAppliedFilter(opt), 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ValidationAppliedFilter(opt), 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ValidationAppliedFilter(opt))) {
            click(RewardAndRecogniztionLocators.ValidationAppliedFilter(opt));
            GemTestReporter.addTestStep("Applied Filter Verification", "Filter '" + opt + "' applied successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Applied Filter Verification", "Filter '" + opt + "' is not applied.", STATUS.FAIL);
        }
    }
    @Then("user clicks on clear button")
    public void userClicksOnClearButton() {

        waitUntilElementAppear(RewardAndRecogniztionLocators.ClearFilters, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.ClearFilters, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.ClearFilters)) {
            click(RewardAndRecogniztionLocators.ClearFilters);
            GemTestReporter.addTestStep("Clear Filters Button Click", "Clear filters button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Clear Filters Button Click", "Clear filters button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if no filter is selected")
    public void userChecksIfNoFilterIsSelected() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }

        waitSec(3);

        if (!isDisplayed(RewardAndRecogniztionLocators.ValidationClearFilters)) {
            GemTestReporter.addTestStep("No Filter Selected Verification", "No filter is selected as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("No Filter Selected Verification", "Filters are still selected.", STATUS.FAIL);
        }
    }

    @Then("user clicks on Cancel button")
    public void userClicksOnCancelButton() {
        waitUntilElementAppear(RewardAndRecogniztionLocators.CancelBtnInFilter, 10);
        scrollIntoView(RewardAndRecogniztionLocators.CancelBtnInFilter);
        waitUntilElementClickable(RewardAndRecogniztionLocators.CancelBtnInFilter, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.CancelBtnInFilter)) {
            click(RewardAndRecogniztionLocators.CancelBtnInFilter);
            GemTestReporter.addTestStep("Cancel Button Click", "Cancel button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Cancel Button Click", "Cancel button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if filter menu is closed")
    public void userChecksIfFilterMenuIsClosed() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitSec(3);
        if (!isDisplayed(RewardAndRecogniztionLocators.FilterMenu)) {
            GemTestReporter.addTestStep("Filter Menu Verification", "Filter menu is closed as expected.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Filter Menu Verification", "Filter menu is still open.", STATUS.FAIL);
        }
    }

    @Then("user clicks on select award category button")
    public void userClicksOnSelectAwardCategoryButton() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitUntilElementAppear(RewardAndRecogniztionLocators.SelectAwardCategorySec, 10);
//        scrollIntoView(RewardAndRecogniztionLocators.NominateEmployeePage);
        waitSec(2);

        scrollToTop();
        waitUntilElementClickable(RewardAndRecogniztionLocators.SelectAwardCategorySec, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.SelectAwardCategorySec)) {
            click(RewardAndRecogniztionLocators.SelectAwardCategorySec);
            GemTestReporter.addTestStep("Select Award Category Button Click", "Select award category button clicked successfully.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Select Award Category Button Click", "Select award category button is not displayed.", STATUS.FAIL);
        }
    }

    @Then("user checks if the list is loading and selectable")
    public void userChecksIfTheListIsLoadingAndSelectable() {
        if (isDisplayed(RewardAndRecogniztionLocators.LoadingAnimation)) {
            waitUntilElementDisappear(RewardAndRecogniztionLocators.LoadingAnimation, 10);
        }
        waitSec(1);
        waitUntilElementAppear(RewardAndRecogniztionLocators.AwardListInNomination, 10);
        waitUntilElementClickable(RewardAndRecogniztionLocators.AwardListInNomination, 10);
        if (isDisplayed(RewardAndRecogniztionLocators.AwardListInNomination)) {
            GemTestReporter.addTestStep("Award List Verification", "Award list is loading and selectable.", STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Award List Verification", "Award list is not displayed.", STATUS.FAIL);
        }
    }



}
