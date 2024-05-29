package com.qa.projectName.utils;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import com.qa.projectName.locators.Locators;
import com.thoughtworks.selenium.Wait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.gemini.generic.ui.utils.DriverAction.*;

public class Dashboard {


   // String name = DriverAction.getElementsText(Locators.ActivitiesFeedsEntry).toString();

    @Then("Verify winner dashboard is visible")
    public void verifyWinnerDashboardIsVisible() {

        if (isExist(Locators.winnerDashboard)){
            GemTestReporter.addTestStep("Verify if Winner Dashboard is visible", "Contripoint Winner Dashboard  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Winner Dashboard is visible", "Contripoint Winner Dashboard is not visible", STATUS.FAIL);
        }

    }

    @Then("check my insights")
    public void checkMyInsights() {
        if (isExist(Locators.myInsights)){
            GemTestReporter.addTestStep("Verify if my insights is visible", "Contripoint my insights  is visible, User is on contripoint dashboard", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if my insights is visible", "Contripoint my insights is not visible", STATUS.FAIL);
        }
    }


    @Then("Check Contribution Categories section")
    public void checkContributionCategoriesSection() {
        if (isExist(Locators.contributionCategories)){
            GemTestReporter.addTestStep("Verify if contribution category is visible", "Contripoint contribution category  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if contribution category is visible", "Contripoint contribution category is not visible", STATUS.FAIL);
        }
    }

    @Then("Validate the visibility of Activities Feeds section on dashboard UI")
    public void validateTheVisibilityOfActivitiesFeedsSectionOnDashboardUI() {

        if (isExist(Locators.activitiesFeeds)){
            GemTestReporter.addTestStep("Verify if Activities Feeds is visible", "Contripoint Activities Feeds  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Activities Feeds is visible", "Contripoint Activities Feeds is not visible", STATUS.FAIL);
        }
    }


    @Given("Validate the presence of winner dashboard on dashboard UI")
    public void validateThePresenceOfWinnerDashboardOnDashboardUI() {

        if (isExist(Locators.winnerDashboardScreen)){
            GemTestReporter.addTestStep("Verify if winner dashboard screen is visible", "Contripoint winner dashboard screen  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if winner dashboard screen is visible", "Contripoint winner dashboard screen is not visible", STATUS.FAIL);
        }

    }

    @Then("Check the presence of awards dropdown")
    public void checkThePresenceOfAwardsDropdown() {

        if (isExist(Locators.awardDropdownWInnerDashboard)){
            GemTestReporter.addTestStep("Verify is awards dropdown is present on winner dashboard.", "Awards dropdown is present on winner dashboard.", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify is awards dropdown is present on winner dashboard.", "Awards dropdown is not present on winner dashboard.", STATUS.FAIL);
        }

    }


    @Then("Check the presence of points card")
    public void checkThePresenceOfPointsCard() {
        if (isExist(Locators.pointsCard)){
            GemTestReporter.addTestStep("Verify if points card is visible", "Contripoint points card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if points card is visible", "Contripoint points card is not visible", STATUS.FAIL);
        }

    }

    @Then("Check the presence of rank card")
    public void checkThePresenceOfRankCard() {
        if (isExist(Locators.rankCard)){
            GemTestReporter.addTestStep("Verify if rank cards is visible", "Contripoint rank card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if rark card is visible", "Contripoint rank card is not visible", STATUS.FAIL);
        }

    }

    @Then("Check the presence of level card")
    public void checkThePresenceOfLevelCard() {
        if (isExist(Locators.levelCard)){
            GemTestReporter.addTestStep("Verify if level card is visible", "Contripoint level card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if level card is visible", "Contripoint level card is not visible", STATUS.FAIL);
        }
    }


    @Then("Check the presence of wallet amount card")
    public void checkThePresenceOfWalletAmountCard() {
        if (isExist(Locators.walletAmoutCard)){
            GemTestReporter.addTestStep("Verify if wallet amount card is visible", "Contripoint wallet amount card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if wallet amount card is visible", "Contripoint wallet amount card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Certifications card")
    public void checkThePresenceOfCertificationsCard() {
        if (isExist(Locators.certificationsCard)){
            GemTestReporter.addTestStep("Verify if certifications card is visible", "Contripoint certifications card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if certifications card is visible", "Contripoint certifications card is not visible", STATUS.FAIL);
        }
        
    }

    @Then("Check the presence of Interview Taken card")
    public void checkThePresenceOfInterviewTakenCard() {
        if (isExist(Locators.interviewTakenCard)){
            GemTestReporter.addTestStep("Verify if interview taken card is visible", "Contripoint interview taken card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if interview taken card is visible", "Contripoint interview taken card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Training and Sessions card")
    public void checkThePresenceOfTrainingAndSessionsCard() {
        if (isExist(Locators.trainingAndSessionsCard)){
            GemTestReporter.addTestStep("Verify if Training and Sessions card is visible", "Contripoint Training and Sessions card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Training and Sessions card is visible", "Contripoint Training and Sessions card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Mentorship card")
    public void checkThePresenceOfMentorshipCard() {
        if (isExist(Locators.mentorshipCard)){
            GemTestReporter.addTestStep("Verify if Mentorship card is visible", "Contripoint Mentorship card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Mentorship card is visible", "Contripoint Mentorship card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Projects card")
    public void checkThePresenceOfProjectsCard() {
        if (isExist(Locators.projectsCard)){
            GemTestReporter.addTestStep("Verify if Project card is visible", "Contripoint Project card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Project card is visible", "Contripoint Project card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Team Building Activity card")
    public void checkThePresenceOfTeamBuildingActivityCard() {
        if (isExist(Locators.teamBuildingActivity)){
            GemTestReporter.addTestStep("Verify if Team Building Activity card is visible", "Contripoint Team Building Activity card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Team Building Activity card is visible", "Contripoint Team Building Activity card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of Client Feedback card")
    public void checkThePresenceOfClientFeedbackCard() {
        if (isExist(Locators.clientFeedback)){
            GemTestReporter.addTestStep("Verify if Client Feedback card is visible", "Contripoint Client Feedback card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Client Feedback card is visible", "Contripoint Client Feedback card is not visible", STATUS.FAIL);
        }
    }


    @Then("Check the presence of Self Development Activity card")
    public void checkThePresenceOfSelfDevelopmentActivityCard() {
        if (isExist(Locators.selfDevelopmentActivity)){
            GemTestReporter.addTestStep("Verify if Self Development Activity card is visible", "Contripoint Self Development Activity card  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if Self Development Activity card is visible", "Contripoint Self Development Activity card is not visible", STATUS.FAIL);
        }
    }

    @Then("Check the presence of search bar under activities feeds")
    public void checkThePresenceOfSearchBarUnderActivitiesFeeds() {
        if (isExist(Locators.searchBar)){
            GemTestReporter.addTestStep("Verify if search bar under activities feeds is visible", "Contripoint search bar under activities feeds  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if search bar under activities feeds is visible", "Contripoint search bar under activities feeds is not visible", STATUS.FAIL);
        }
    }


    @Then("Check the presence of activities feeds table")
    public void checkThePresenceOfActivitiesFeedsTable() {
        if (isExist(Locators.activitiesFeedsTable)){
            GemTestReporter.addTestStep("Verify if activities table is visible", "Contripoint activities table  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if activities table is visible", "Contripoint activities table is not visible", STATUS.FAIL);
        }
    }

    @And("Check the presence of next page section")
    public void checkThePresenceOfNextPageSection() {
        if (isExist(Locators.nextPage)){
            GemTestReporter.addTestStep("Verify if next page section is visible", "Contripoint next page section  is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if next page section is visible", "Contripoint next page section is not visible", STATUS.FAIL);
        }

    }

    @Given("Check the visibility of leaderboard expand icon")
    public void checkTheVisibilityOfLeaderboardExpandIcon() {
        if (isExist(Locators.leaderboardExpand)){
            GemTestReporter.addTestStep("Verify if leaderboard expand icon is visible", "Contripoint leaderboard expand icon is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if leaderboard expand icon is visible", "Contripoint leaderboard expand icon is not visible", STATUS.FAIL);
        }
    }

    @Then("Expand the leaderboard")
    public void expandTheLeaderboard() {
        DriverAction.click(Locators.leaderboardExpand);
        if (isExist(Locators.leaderboardBanner)){
            GemTestReporter.addTestStep("Verify if leaderboard banner is visible", "Contripoint leaderboard banner is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if leaderboard banner is visible", "Contripoint leaderboard banner is not visible", STATUS.FAIL);
        }

    }

    @Then("Validate the presence of person on leaderboard")
    public void validateThePresenceOfPersonOnLeaderboard() {

        if (isExist(Locators.firstPerson)){
            GemTestReporter.addTestStep("Verify if leaderboard is visible", "Entries on leaderboard is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if leaderboard is visible", "Entries on leaderboard is not visible", STATUS.FAIL);
        }

    }


    @Then("Click on dropdown and choose another award")
    public void clickOnDropdownAndChooseAnotherAward() {


    }

    @And("Check if winner dashboard is updated")
    public void checkIfWinnerDashboardIsUpdated() {
    }

    @Then("Click on goto to last button")
    public void clickOnGotoToLastButton() {
        DriverAction.scrollIntoView(Locators.lastPage);
        waitUntilElementClickable(Locators.lastPage, 5);
        if (isDisplayed(Locators.lastPage)){
            GemTestReporter.addTestStep("Verify if navigate to last page button is visible", "Contripoint last page button is visible", STATUS.PASS);
            waitSec(3);
            DriverAction.click(Locators.lastPage, "Click on last page button", "Click performed successfully");
        }
        else {
            GemTestReporter.addTestStep("Verify if navigate to last page button is visible", "Contripoint last page button is not visible", STATUS.FAIL);
        }
    }

    @Then("Get the name of person from activities table")
    public void getTheNameOfPersonFromActivitiesTable() {

        System.out.println("*********************************************");
        System.out.println(Locators.ActivitiesFeedsEntry.toString());
        System.out.println("*********************************************");

        if (isExist(Locators.ActivitiesFeedsEntry)){
            String name = DriverAction.getElementsText(Locators.ActivitiesFeedsEntry).toString();
            String textToEnter = name.replace("[", " ");
            String text = textToEnter.replace("]", " ");

            String text1 = text.trim();

            GemTestReporter.addTestStep("Verify if entry under activities feeds are visible", "Entries are visible and one name is : " +text1+ " from list", STATUS.PASS);
            DriverAction.typeText(Locators.searchBar, text1);

        }
        else {
            GemTestReporter.addTestStep("Verify if entry under activities feeds are visible", "Entries are not visible", STATUS.FAIL);
        }
    }


    @Then("Validate if the name exists on table")
    public void validateIfTheNameExistsOnTable() {

        if (isExist(Locators.ActivitiesFeedsEntry)){
            GemTestReporter.addTestStep("Verify if entry is visible", "Search bar is working", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if entry is visible", "Search bar is not working", STATUS.FAIL);
        }


    }


    @Then("add new self development activity")
    public void addNewSelfDevelopmentActivity() {
waitSec(2);
        scrollIntoView(Locators.selfDevelopmentActivity);
        waitSec(3);
        //DriverAction.click(Locators.selfDevelopmentActivity);
        DriverAction.click(Locators.cardButton);

        if (isDisplayed(Locators.selfDevelopmentActivityHeading)){
            GemTestReporter.addTestStep("Verify if self development activity page is opened", "Page opened successfully", STATUS.PASS);
            DriverAction.click(Locators.addNewButton);

        }
        else {
            GemTestReporter.addTestStep("Verify if self development activity page is opened", "Page not opened", STATUS.FAIL);

        }


    }

    @Then("enter self development activity name")
    public void enterSelfDevelopmentActivityName() {
        if (isDisplayed(Locators.selfDevelopmentActivityWindow)){
            GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window opened successfully", STATUS.PASS);
            typeText(Locators.skillName, "testSkill", "Enter the name of skill acuried", "Skill name entered");

        }
        else {
            GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window didn't opened", STATUS.PASS);

        }

    }

    @Then("select duration")
    public void selectDuration() {

        if (isDisplayed(Locators.selfDevelopmentActivityWindow)){
            //GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window opened successfully", STATUS.PASS);
            typeText(Locators.duration, "10", "Enter the hours taken in acquiring the skill", "duration entered successfully");


        }
        else {
            GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window didn't opened", STATUS.PASS);

        }


    }

    @Then("select goal type as EC and fill the description")
    public void selectGoalTypeAsECAndFillTheDescription() {
        if (isDisplayed(Locators.selfDevelopmentActivityWindow)){
            //GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window opened successfully", STATUS.PASS);
            click(Locators.DCGoal, "Click on DC as goal type", "Click on DC is performed successfully");
            waitSec(10);
            typeText(Locators.activityDescription, "This is just a demo description used by automation script", "Enter activity description", "Description entered successfully");

        }
        else {
            GemTestReporter.addTestStep("Verify if add self development activity window is opened", "Window didn't opened", STATUS.FAIL);

        }

    }

    @Then("click on submit button")
    public void clickOnSubmitButton() {
        if (isDisplayed(Locators.submitButton)){
            waitSec(3);
            click(Locators.submitButton, "Click on submit button", "Click on submit button is performed successfully");
            waitSec(3);
        }
        else {
            GemTestReporter.addTestStep("Verify if submit button is visible", "Submit button is not visible", STATUS.FAIL);

        }
    }

    @Then("check success popup is visible")
    public void checkSuccessPopupIsVisible() {
        if (isDisplayed(Locators.successPopup)){
            waitSec(3);
            GemTestReporter.addTestStep("Verify if success popup is visible", "Success popup visible", STATUS.PASS);
            waitSec(3);
        }
        else {
            GemTestReporter.addTestStep("Verify if success popup is visible", "Success popup didn't come on UI", STATUS.FAIL);
        }


    }

    @Then("select the start date")
    public void selectTheStartDate() {

        if (isDisplayed(Locators.selfDevelopmentActivityWindow)){
            GemTestReporter.addTestStep("Verify calender icon is visible", "Calender icon is visible on UI", STATUS.PASS);
            click(Locators.startDate, "Click on start date", "Click on start date is performed successfully");
            waitSec(10);
            click(By.xpath("//div[contains(text(),'28')]"));
            //typeText(Locators.activityDescription, "This is just a demo description used by automation script", "Enter activity description", "Description entered successfully");

        }
        else {
            GemTestReporter.addTestStep("Verify calender icon is visible", "Calender icon is not visible on UI", STATUS.FAIL);

        }

    }

    @Then("click on cancel button")
    public void clickOnCancelButton() {
        click(Locators.cancelButton, "Click on cancel button", "Click on cancel button is performed successfully");
        waitSec(3);
        if (isDisplayed(Locators.inputScreen)){
            GemTestReporter.addTestStep("Verify if input form is closed", "Input form is not closed", STATUS.FAIL);
        }
        else {
            GemTestReporter.addTestStep("Verify if input form is closed", "Input form is closed", STATUS.PASS);

        }

    }

    @Then("click on FAQ button")
    public void clickOnFAQButton() {
        click(Locators.FAQs, "CLick on FAQ button", "Click performed successfully");
    }

    @And("verify contripoint FAQ page is visible")
    public void verifyContripointPageIsVisible() {
        if (isExist(Locators.FAQsHeading)){
            GemTestReporter.addTestStep("Verify if FAQs page is visible", "Contripoint FAQs page is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if FAQs page is visible", "Contripoint FAQs page is not visible", STATUS.FAIL);
        }
    }

    @Then("Click on Demo Videos button")
    public void clickOnDemoVideosButton() {
        click(Locators.DemoVideos, "CLick on Demo Videos button", "Click performed successfully");
    }

    @And("verify contripoint Demo videos page is visible")
    public void verifyContripointDemoVideosPageIsVisible() {
        if (isExist(Locators.demoVideosHeading)){
            GemTestReporter.addTestStep("Verify if demo videos page is visible", "Contripoint demo videos page is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if demo videos page is visible", "Contripoint demo videos page is not visible", STATUS.FAIL);
        }
    }



    @Then("click on report a bug button")
    public void clickOnReportABugButton() {
        click(Locators.ReportBug, "CLick on report a bug button", "Click performed successfully");

    }

    @And("verify contripoint bug reporting page is visible")
    public void verifyContripointBugReportingPageIsVisible() {
        if (isExist(Locators.reportBugHeading)){
            GemTestReporter.addTestStep("Verify if contripoint bug reporting page is visible", "Contripoint bug reporting page is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if contripoint bug reporting page is visible", "Contripoint bug reporting page is not visible", STATUS.FAIL);
        }

    }

    @Then("click on Back button")
    public void clickOnBackButton() {
        DriverAction.waitSec(5);
        if (isExist(Locators.backButton2)){
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is visible", STATUS.PASS);
            DriverAction.click(Locators.backButton2);
            DriverAction.waitSec(5);
        }
        else {
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is not visible", STATUS.FAIL);
        }

    }

    @Then("click on the back button")
    public void clickOnTheBackButton() {
        DriverAction.waitSec(5);
        if (isExist(Locators.backButton)){
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is visible", STATUS.PASS);
            DriverAction.click(Locators.backButton);
            DriverAction.waitSec(5);
        }
        else {
            GemTestReporter.addTestStep("Verify if back button is visible", "Icon for back button is not visible", STATUS.FAIL);
        }
    }

    @Then("Verify notification icon is present on UI")
    public void verifyNotificationIconIsPresentOnUI() {
        if (isExist(Locators.notificationIcon)){
            GemTestReporter.addTestStep("Verify if notification icon is visible", "Notification icon is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if notification icon is visible", "Notification icon is not visible", STATUS.FAIL);
        }
    }

    @Then("Click on notification button")
    public void clickOnNotificationButton() {
        click(Locators.notificationIcon, "Click on notification button", "Click performed successfully");
    }

    @And("Validate notification window is visible")
    public void validateNotificationWindowIsVisible() {
        if (isExist(Locators.notificationWindow)){
            GemTestReporter.addTestStep("Verify if notification window is visible", "Notification window is visible", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Verify if notification window is visible", "Notification window is not visible", STATUS.FAIL);
        }
    }


    @Then("Get the total number of notifications")
    public void getTheTotalNumberOfNotifications() {

        List<WebElement> notificationItemDefault = DriverAction.getElements(Locators.noticifationItems);

        System.out.println("--------------------------notificationItemDefault--------------------------");
        System.out.println(notificationItemDefault.size());
        System.out.println("--------------------------notificationItemDefault--------------------------");

        if (isExist(Locators.noticifationItems)){
            GemTestReporter.addTestStep("Fetch the value of total number of nofications", "Total number of nofications is : " +notificationItemDefault.size(), STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Fetch the value of total number of nofications", "Total number of nofications is : " +notificationItemDefault.size(), STATUS.FAIL);
        }
    }

    @Then("Click on view more")
    public void clickOnViewMore() {
        waitSec(3);
        if (isExist(Locators.notificationWindow)){
            GemTestReporter.addTestStep("Verify if view more button is visible", "View more button is visible on UI", STATUS.PASS);
            //click(Locators.viewMore, "Click on view more button", "Click performed successfully");
            scrollIntoView(Locators.viewMore);
            click(Locators.viewMore);
            scrollIntoView(Locators.viewMore);
            waitSec(5);
        }
        else {
            GemTestReporter.addTestStep("Verify if view more button is visible", "View more button is visible on UI", STATUS.FAIL);
        }
    }

    @Then("Validate the updated notification list")
    public void validateTheUpdatedNotificationList() {
        List<WebElement> notificationItemUpdated = DriverAction.getElements(Locators.noticifationItems);
//        System.out.println("--------------------------notificationItemDefault--------------------------");
//        System.out.println(notificationItemUpdated.size());
//        System.out.println("--------------------------notificationItemDefault--------------------------");
        if (isExist(Locators.noticifationItems) && notificationItemUpdated.size() >= 5 ){
            GemTestReporter.addTestStep("Fetch the updated value of total number of nofications", "Total number of nofications is : " +notificationItemUpdated.size(), STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Fetch the updated value of total number of nofications", "Values not updated. Total number of nofications is : " +notificationItemUpdated.size(), STATUS.FAIL);
        }


    }

    @Then("get the total number of question present")
    public void getTheTotalNumberOfQuestionPresent() {

        List<WebElement> FAQsQuestion = DriverAction.getElements(Locators.FAQsQuestion);

        System.out.println("--------------------------FAQ--------------------------");
        System.out.println(FAQsQuestion.size());
        System.out.println("--------------------------FAQ--------------------------");

        if (isExist(Locators.FAQsHeading)){
            GemTestReporter.addTestStep("Fetch the value of total number of FAQs", "Total number of FAQs is : " +FAQsQuestion.size(), STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Fetch the value of total number of nofFAQsications", "Total number of FAQ is : " +FAQsQuestion.size(), STATUS.FAIL);
        }
    }

    @Then("validate all FAQs are populated on UI")
    public void validateAllFAQsArePopulatedOnUI() {
        List<WebElement> FAQsQuestion = DriverAction.getElements(Locators.FAQsQuestion);
        if (FAQsQuestion.size() == 10){
            GemTestReporter.addTestStep("Fetch the value of total number of FAQs", "Total number of FAQs is : " +FAQsQuestion.size(), STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Fetch the value of total number of nofFAQs", "All FAQs are not loaded. Number of FAQ on UI is : " +FAQsQuestion.size(), STATUS.FAIL);
        }

    }

    @Then("click on wallet amount card")
    public void clickOnWalletAmountCard() {

        click(Locators.walletAmoutCard, "Click on wallet amount card", "Click performed successfully");

        waitSec(3);
    }


    @And("validate checkout screen in opened")
    public void validateCheckoutScreenInOpened() {

        waitSec(5);
        if (isDisplayed(Locators.checkoutSection)){
            GemTestReporter.addTestStep("Validate checkout screen", "Checkout screen is visible on UI", STATUS.PASS);
        }
        else {
            GemTestReporter.addTestStep("Validate checkout screen", "Checkout screen is visible on UI", STATUS.FAIL);
        }

    }


}

