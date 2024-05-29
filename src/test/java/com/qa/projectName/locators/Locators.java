package com.qa.projectName.locators;

import org.openqa.selenium.By;

public class Locators {

    public static By signInBtn          =       By.xpath("//span[contains(text(),'Login with Gemini mail')]");
    public static By myInsight          =       By.xpath("//div[contains(text(),'My Insights')]");

    public static By credentials(String credentialType) {
        if (credentialType.contains("username")) {
            return By.xpath("//input[@type='email']");

        } else if (credentialType.contains("GitHubUserName")) {
            return By.id("login_field");
        } else if (credentialType.contains("GitHubPassword")) {
            return By.id("password");
        } else {
            return By.xpath("//input[@type='password']");
        }
    }


    //Header

    public static By logo = By.xpath("//img[@src='assets/images/n_logo.svg']");


    public static By notificationIcon = By.xpath("//img[@title='Notification']");
    public static By notificationWindow = By.xpath("//h1[contains(text(),'NOTIFICATIONS')]");



    public static By noticifationItems = By.xpath("//ul[@class='ul-notification ng-star-inserted']");
    public static By viewMore = By.xpath("//button[@class='view_more']");

    public static By backButton = By.xpath("//button[@class='back_button']");
    public static By backButton2 = By.xpath("//button[@class='back-btn']");
    public static By backButton3 = By.xpath("/html/body/app-root/div/div/mat-sidenav-container/mat-sidenav-content/div/app-bug-report-table/div/div/div/div[1]/div[1]/button/mat-icon");

    public static By FAQs = By.xpath("//a[contains(text(),'FAQs')]");
    public static By FAQsHeading = By.xpath("//h2[contains(text(),'Frequently Asked Questions')]");
    public static By FAQsQuestion = By.xpath("//div[@class='question']");

    public static By DemoVideos = By.xpath("//a[contains(text(),'Demo Videos')]");
    public static By demoVideosHeading = By.xpath("//span[contains(text(),'Demo Videos')]");
    public static By HelpChannel = By.xpath("//a[contains(text(),'Help Channel')]");
    public static By ReportBug = By.xpath("//a[contains(text(),'Report Bug')]");
    public static By reportBugHeading = By.xpath("//h2[contains(text(),'Report a Bug')]");
    public static By NotificationIcon = By.xpath("//img[@alt='notifications']");

    public static By MenuIcon = By.xpath("//img[@title='Menu']");
    public static By dashboardIcon = By.xpath("//a[@mattooltip='Dashboard']");
    public static By winnerDashboard = By.xpath("//div[@class='container banner padding-top ng-star-inserted']");
    public static By myInsights = By.xpath("//div[contains(text(),'My Insights')]");
    public static By contributionCategories = By.xpath("//div[contains(text(),'Contribution Categories')]");
    public static By activitiesFeeds = By.xpath("//div[contains(text(),'Activities Feeds')]");
    public static By winnerDashboardScreen = By.xpath("//div[@class='container banner padding-top ng-star-inserted']");
    public static By awardDropdownWInnerDashboard = By.xpath("//div[@class='mat-form-field-infix ng-tns-c85-3']");
    public static By pointsCard = By.xpath("//p[contains(text(),'Points')]");
    public static By rankCard = By.xpath("//p[contains(text(),'Rank')]");
    public static By levelCard = By.xpath("//p[contains(text(),'Level')]");
    public static By walletAmoutCard = By.xpath("//p[contains(text(),'Wallet Amount')]");
    public static By checkoutSection = By.xpath("//span[contains(text(),'Checkout')]");
    public static By certificationsCard = By.xpath("//h5[contains(text(),'Certifications')]");
    public static By interviewTakenCard = By.xpath("//h5[contains(text(),'Interview Taken')]");
    public static By trainingAndSessionsCard = By.xpath("//h5[contains(text(),'Training & Sessions')]");
    public static By mentorshipCard = By.xpath("//h5[contains(text(),'Mentorship')]");
    public static By projectsCard = By.xpath("//h5[contains(text(),'Projects')]");
    public static By teamBuildingActivity = By.xpath("//h5[contains(text(),'Team Building Activity')]");
    public static By clientFeedback = By.xpath("//h5[contains(text(),'Client Feedback')]");
    public static By selfDevelopmentActivity = By.xpath("//h5[contains(text(),'Self Development Activity')]");
    public static By searchBar = By.xpath("//input[@name='searchText']");
    public static By activitiesFeedsTable = By.xpath("//tbody[@role='rowgroup']");
    public static By nextPage = By.xpath("//div[@class='mat-paginator-range-actions']");
    public static By leaderboardExpand = By.xpath("//img[@class='mrg-lft2']");
    public static By leaderboardBanner = By.xpath("//img[@alt='leaderboardBanner']");
    public static By firstPerson = By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-6']");
    public static By lastPage = By.xpath("(//span[@class='mat-button-wrapper'])[4]");
    public static By ActivitiesFeedsEntry = By.xpath("(//div[@class='ml-4 d-flex align-items-center'])[1]");
    public static By searchButton = By.xpath("//div[@class='search-icon d-flex align-items-center justify-content-center h-100']");

    public static By selfDevelopmentActivityHeading = By.xpath("//div[contains(text(),'Self Development Activity')]");
    public static By selfDevelopmentActivityWindow = By.xpath("//span[contains(text(),'Add Self Development')]");
    public static By skillName = By.xpath("//input[@id='mat-input-0']");
    public static By duration = By.xpath("//input[@ng-reflect-name='duration']");
    public static By addNewButton = By.xpath("//button[contains(text(),'ADD NEW')]");
    public static By ECGoal = By.xpath("//span[@class='goal-type-font mrg-right']");
    public static By DCGoal = By.xpath("//span[@class='goal-type-font']");
    public static By activityDescription = By.xpath("//textarea[@data-placeholder='Max 400 Characters allowed']");
    public static By startDate = By.xpath("//button[@aria-label='Open calendar']");
    public static By inputScreen= By.xpath("//div[@id='feedback-form']");
    public static By submitButton = By.xpath("//span[contains(text(),'SUBMIT')]");
    public static By cancelButton = By.xpath("//span[contains(text(),'CANCEL')]");
    public static By successPopup =By.xpath("//div[@class='cdk-overlay-container']");
    public static By cardButton = By.xpath("//img[@alt='Self Development Activity Button']");



}

