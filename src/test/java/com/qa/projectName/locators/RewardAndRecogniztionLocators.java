package com.qa.projectName.locators;

import org.openqa.selenium.By;

public class RewardAndRecogniztionLocators {

    //
    //
    //      Login page :>>>>
//
//

    public static By LoginPageLogo = By.xpath("//img[@class='logo']");
    public static By ToggleLoginPage = By.xpath("//input[@type='checkbox']//parent::span//child::span");
    public static By EmailLoginPage =By.xpath("//input[@formcontrolname='username']");
    public static By PasswordLoginPage =By.xpath("//input[@formcontrolname='password']");
    public static By SubmitLoginPage =By.xpath("//button[@type='submit']");

//    public static By LoadingAnimation = By.xpath("//*[local-name()='svg' and @preserveAspectRatio='xMidYMid meet'])");
    public static By LoadingAnimation = By.xpath("//mat-progress-spinner");
    public static By HRPortalIcon = By.xpath("//a[@routerlink='/HR-portal']");
    public static By AwardNominationsIcon = By.xpath("//a[@href='#/award-nomination']");


    //mat-card[contains(@class,'mat-card')]/child::img[@alt='award category']
    public static By HRPortalAwardCategoryCard = By.xpath("//img[@alt='award category']");

    public static By GridIcon = By.xpath("//img[contains(@alt,'card')]");

    public static By ListIcon = By.xpath("//img[contains(@alt,'table')]");


    public static By CreateNewAwardButton = By.xpath("//div[contains(text(),'CREATE NEW AWARD')]");


    public static By AwardNameInCreateNewAward = By .xpath("//input[@formcontrolname='awardName']");

    public static By RewardAmountInCreateNewAward = By .xpath("//input[@formcontrolname='amount']");

    public static By InactiveButtonInCreateNewAward = By .xpath("//span[text()='Inactive']//ancestor::label");


    public static By ActiveButtonInCreateNewAward = By .xpath("//span[text()='Active']//ancestor::label");

    public static By DescrptionInCreateNewAward = By .xpath("//textarea[@formcontrolname='awardDescription']");

    //span[contains(text(),'SUBMIT')]
    public static By SubmitButtonInCreateNewAward = By .xpath("//span[contains(text(),'SUBMIT')]");
    public static By SuccessAnimationInAwardList = By.xpath("//app-confirmation-modal");



    //span[text()='Employee Of The Quarter']//following::mat-slide-toggle/label
    public static By SearchBarInAwardList = By .xpath("//input[@name='searchText']");
    public static By FirstNameInAwardList = By.xpath("(//img[@alt='award'])[1]//following::span[text()='Influence'][1]");

    public static String awardNameforInactivetoActive = "testaward1";


    public static By AwardInRecommendationFormTurnedToActive = By .xpath("//span[text()='"+ awardNameforInactivetoActive + "']//following::mat-slide-toggle/label");
    public static By AwardInRecommendationFormTurnedToActive(String awardNameforInactivetoActive){
        return  By .xpath("//span[text()='"+ awardNameforInactivetoActive + "']//following::mat-slide-toggle/label");
    }



    public static String awardNameforInactivetoActiveDuringSearch = "Employees are great";


    public static By AwardInRecommendationFormTurnedToActiveDuringSearch = By .xpath("//span[text()='"+ awardNameforInactivetoActiveDuringSearch + "']//following::mat-slide-toggle/label");

    public static String awardNameforInactivetoInActive = "TestAward0";
    public static By AwardInRecommendationFormTurnedToInActive = By .xpath("//span[text()='"+ awardNameforInactivetoInActive + "']//following::mat-slide-toggle/label");

    public static By AwardInRecommendationFormTurnedToInActive(String awardNameforInactivetoInActive){
        return  By .xpath("//span[text()='"+ awardNameforInactivetoInActive + "']//following::mat-slide-toggle/label");
    }



    public static By ToggleButtonInActivetoActiveInAwardInAwardList = By .xpath("//span[text()='"+ awardNameforInactivetoActive + "']//following::mat-slide-toggle/label");


    public static By ToggleButtonInActivetoActiveInAwardInAwardList(String awardNameforInactivetoActive){
        return By .xpath("//span[text()='"+ awardNameforInactivetoActive + "']/parent::div/parent::div//input[@aria-checked='false']/parent::span");
    }


    public static String awardNameForActiveToInactive = "TestAward0";
    public static By ToggleButtonInAwardInAwardList = By .xpath("//span[text()='"+ awardNameForActiveToInactive + "']//following::mat-slide-toggle/label");

    public static By ToggleButtonInAwardInAwardList(String awardNameForActiveToInactive){
        return By .xpath("//span[text()='"+ awardNameForActiveToInactive + "']/parent::div/parent::div//input[@aria-checked='true']/parent::span");
    }

    public static String awardNameforActivetoInactiveDuringSearch = "ActiveAwardToInactive";
    public static By ToggleButtonInAwardInAwardListDuringSearch = By .xpath("//span[text()='"+ awardNameforActivetoInactiveDuringSearch + "']//following::mat-slide-toggle/label");



    public static By HRPortalPage = By.xpath("//p[@class='title']");
    public static By HrAnalyticsSection = By.xpath("//div[@id='reviewRecommendation']");


    public static String AwardNameinGemWithInactive = "INActiveAwardInGEM2";
    //span[text()='ActiveAward']
    public static By IteminAwardListGemInactive = By.xpath("//span[text()='"+AwardNameinGemWithInactive+"']");


    public static By GemAwardCheckBox = By.xpath("//div/input[@formcontrolname=\"gemAward\"]");
    //p[@class='title' and text()='Rewards & Recognition Dashboard']


    public static String AwardNameinGemWithActive = "ActiveAwardInGEM";
    //span[text()='ActiveAward']
    public static By IteminAwardListGemActive = By.xpath("//span[text()='"+AwardNameinGemWithActive+"']");



    public static By ErrorMessageInAwardForm = By.xpath("//mat-error");

    public static By ErrorMessageForRewardInAwardForm = By.xpath("//mat-error[contains(text(),'digits')]");

    public static By ErrorMessageForDescriptionInAwardForm = By.xpath("//mat-error[contains(text(),'length')]");
    public static By ErrorMessageForAwardNameInAwardForm = By.xpath("//mat-error[contains(text(),'award name')]");

//    =========================================================
//    =========================================================
//    =========================================================
//                  HR ANALYTICS
//    =========================================================
//    =========================================================
//    =========================================================


    //mat-select[@placeholder='Select User*']
   public static By HrAnalyticsSelectEcDcDropdown = By.xpath("//mat-select[@placeholder='Select User*']//span/span");
   public static By EcDcOptionInDropDown = By.xpath("//span[text()=' All EC/DC ']");

   public static By SelectedEcDcOption = By.xpath("//mat-select//span[text()='All EC/DC']");


    public static By selectOnshoreOffshoreDropDown = By.xpath("//mat-select[@placeholder='Select Onshore/Offshore ']//span/span");
    public static By OnshoreInDropDown = By.xpath("//mat-option//span[text()='Onshore']");
    public static By OffshoreInDropDown = By.xpath("//mat-option//span[text()='Offshore']");
    public static By BothInDropDown = By.xpath("//mat-option//span[text()='Both']");
    public static By SelectedOnshoreOption = By.xpath("//span[text()='Onshore']");


    public static By DateRangeIcon = By.xpath("//mat-icon[text()='calendar_today']");
    public static By SelectStartDateDropDown = By.xpath("//mat-select[@formcontrolname='startingYear']");
    public static By SelectStartDate = By.xpath("//mat-option/span[contains(text(),'2023-2024')]");

    public static By SelectStartDate(String startDate){
        return  By.xpath("//mat-option/span[contains(text(),'"+startDate+"')]");
    }

    public static By SelectEndDate(String endDate){
        return  By.xpath("//mat-option/span[contains(text(),'"+endDate+"')]");
    }


        public static By SelectEndDateDropDown = By.xpath("//mat-select[@formcontrolname='endingYear']");
    public static By SelectEndDate = By.xpath("//mat-option/span[contains(text(),'2024-2025')]");
    public static By QuartersForDateRange = By.xpath("(//div[@role='button'])[3]");
    public static By QuartersForStartDateRange = By.xpath("(//div[@role='button'])[1]");
    public static By QuartersForEndDateRange = By.xpath("(//div[@role='button'])[8]");
    public static By TotalQuarters = By.xpath("//div[@role='button']");
    public static By DoneButtonInDateRange = By.xpath("//button//span[contains(text(),'DONE')]");


    public static By NoOfEmplyees = By.xpath("//span[text()='Total Number of Employees']/ancestor::div[@class='p-2']/div");
    public static By NoOfNominations = By.xpath("//span[text()='Total Number of Nominations']/ancestor::div[@class='p-2']/div");
    public static By NoOfAwardees = By.xpath("//span[text()='Total Number of Awardees']/ancestor::div[@class='p-2']/div");


    public static By listOfNominations = By.xpath("//div[@class='third-col']");


    public static By RecommendedByMeSection = By.xpath("//div[text()='Recommended By Me']");

    public static By RecommendedByMeList = By.xpath("//mat-expansion-panel");


    //span[@class='heading' and text()='Add New Recommendation']
    public static By ValidationAddNewRecommendationPage = By.xpath("//span[@class='heading' and text()='Add New Recommendation']");
    public static By AddNewButtonInRecommendedByMe = By.xpath("//div[text()='ADD NEW']");

    public static By NameOfEmployeeDropDown = By.xpath("//mat-select[@formcontrolname='empEmail']");
    public static By SearchBarInNameOfEmployee = By.xpath("//input[@placeholder='Search Employee']");
    public static By SelectEmployeeInNameDropDown    = By.xpath("//*[@id='mat-option-597']/span");
    public static By PraiseInAddNewRecommendation    = By.xpath("//textarea[@formcontrolname='summary']");
    public static By EcbuttoninAddNewRecommendation    = By.xpath("//mat-radio-button[@value='0']");

    public static By DcbuttoninAddNewRecommendation    = By.xpath("//mat-radio-button[@value='1']");
    public static By AwardCardInAddNewRecommendation   = By.xpath("(//mat-card-title)[3]");
    public static By SubmitButtonInAwardSelectionInAddNewRecommendation   = By.xpath("//button[@id='add_btn']/span[contains(text(),'SUBMIT')]");
    public static By PreviousButtonInAwardSelectionInAddNewRecommendation   = By.xpath("//button[@id='cancel_btn']/span[contains(text(),'PREVIOUS')]");
    public static By SaveAsDraftButtonInAwardSelectionInAddNewRecommendation   = By.xpath("//button[@id='draft_btn']");
    public static By SaveAsDraftAnimation   = By.xpath("//div[text()=' Draft Saved! ']");
    public static By NextButtonInAddNewRecommendation   = By.xpath("//button[@id='add_btn']/span[contains(text(),'NEXT')]");


    //change the name for this Scenario: Verify Update of Award List After Adding Recommendation

    public static By EmployeeInList(String EmployeeName){
        return  By .xpath("//p[contains(text(),'"+ EmployeeName + "')]");
    }


    //span[contains(@class,'mat-expansion-indicator')]
    public static By DropDownButtonInEmployeeList = By.xpath("//span[contains(@class,'mat-expansion-indicator')]");
    public static By ValidationDropDownButtonInEmployeeList = By.xpath("(//p[contains(@class,'heading') and text()='Praise '])[1]");






    public static By ThreeDotButtonInDraftItem = By.xpath("(//img[@alt='Draft']//following::mat-icon[text()='more_vert'])[1]");
    public static By ButtonsUnderThreeDotsButton = By.xpath("//button[@role='menuitem']");
    public static By  EditButtonUnderThreeDotsButton = By.xpath("//span[text()='Edit']");
    public static By  RecommendButtonUnderThreeDotsButton = By.xpath("//span[text()='Recommend']");
    public static By  DismissButtonUnderThreeDotsButton = By.xpath("//span[text()='Dismiss']");
    public static By  YesButtonForDismiss = By.xpath("//button[@type='submit']");


    public static By SuccessAnimation   = By.xpath("//div[text()=' Success! ']");



    public static By FilterButtonInRecommendedByMe = By.xpath("//div[text()='Filter']");

    public static By EcButtonInFilterInRecommendedByMe = By.xpath("//label[contains(text(),'Engineering Council')]/preceding-sibling::input");
    public static By ApplyButtonInFilterInRecommendedByMe = By.xpath("//span[contains(text(),'APPLY')]");
    public static By FilterOptionInEmployeeListInRecommendedByMe = By.xpath("//mat-expansion-panel-header//span[contains(text(),'Engineering Council')]");
    public static By HrRulesButton = By.xpath("//span[text()='VIEW HR RULES']");
    public static By HrRulesButtonValidation = By.xpath("//app-hr-rules");




//
//
//              Review Recommendation
//
//

    //button[text()=' Engineering council ']
    public static By EcButtonReviewRecommendation = By.xpath("//button[text()=' Engineering council ']");

    public static By VerifyByClassEcButtonIsSelectedReviewRecommendation = By.xpath("//button[contains(@class,'ec w-50 test1')]");
    public static By VerifyEcDropdownReviewRecommendation = By.xpath("//p[text()=' Select Engineering council ']");


    public static By OpenDropdownToSelectCouncilReviewRecommendation = By.xpath("//mat-select[@formcontrolname='council']");
    public static By ItemInCouncilDropDownReviewRecommendation = By.xpath("//mat-option/span");


    public static By CountForReviewRecommendations = By.xpath("//p[contains(@class,'name')]");
    public static By TotalRecommendation = By.xpath("//div[contains(@class,'number')]");
    public static By NominatedCandidates = By.xpath("//div[text()='Nominated Candidates']//following::div[contains(@class,'number')]");
    public static By ButtonReviewRecommendation = By.xpath("//button[text()=' Review Recommendations ']");
    public static By NominateEmployeePage = By.xpath("//p[contains(text(),'Nominate') and contains(@class,'heading')]");
    public static By NamesEmployeeReviewRecommendation = By.xpath("//p[contains(@class,'name')]");

    public static By SearchReviewRecommendation = By.xpath("//input[@name='searchText']");
    public static By UnrecognizedBtn = By.xpath("//div[contains(@class,'unrecognized-btn')]/span");
    public static By UnrecognizedTalentPage = By.xpath("//span[@class='heading' and contains(text(),'Unrecognized Talents')]");
    public static By ViewDraftListBtn = By.xpath("//button[@routerlink='/award-nomination/draft']/span");
    public static By ViewDraftListPage = By.xpath("//p[contains(@class,'main-heading') and text()='Nominations Draft List']");
    public static By OptionsUnrecognizedTalentPage = By.xpath("//p[contains(@class,'main-heading') and text()='Nominations Draft List']");
    public static By DropDownBtnNominationDraftList = By.xpath("//span[contains(@class,'mat-expansion-indicator')]");
    public static By DropDownContentNominationDraftList = By.xpath("//mat-expansion-panel/div[@style='visibility: visible;']");

    public static By ThreeDotsBtnNominationDraftList = By.xpath("//mat-icon[text()='more_vert']");
    public static By ThreeDotsOptionsNominationDraftList = By.xpath("//button[@role='menuitem']");
    public static By SubmitNominationThreeDotsNominationDraftList = By.xpath("//span[text()='Submit Nomination']");
    public static By SearchBarUnrecognizedTal = By.xpath("//input[@name='searchText']");
    public static By NamesUnrecognizedTal = By.xpath("//div[@class='req-brd']//img");
    public static By EyeBtnNBNA = By.xpath("//img[@alt='view icon']");
    public static By EmployeeStatus = By.xpath("//app-never-awarded-modal");
    public static By RecommendedButNeverNominatedSec = By.xpath("//div[text()='Recommended But Never Nominated']");
    public static By NeverRecommendedSec = By.xpath("//div[text()='Never Recommended']");
    public static By ForwardBtnRecommendedButNeverNominatedList = By.xpath("//img[@mattooltip='Forward Recommendation']");
    public static By NamesNeverRecommended = By.xpath("//span[@class='emp-name']");
    public static By RecommendedBtnNeverRecommended = By.xpath("//img[@alt='arrow']");
    public static By AddNewRecommendationForm = By.xpath("//div[@id='recommend-form']");
    public static By AddNewNominationForm = By.xpath("//div[@id='recommend-form']");

    public static By NominateBtn = By.xpath("//span[text()=' NOMINATE ']/parent::button");

//
//
//    Nominated by ec-dc
//
//

    //div[text()='Nominated by EC/DC']
    public static By NominatedByECDCSec = By.xpath("//div[text()='Nominated by EC/DC']");




    //div[contains(@class,'filter')]
    public static By FilterBtn = By.xpath("//div[contains(@class,'filter')]");
    public static By QAFilter = By.xpath("//label[text()=' QA']/parent::div/child::input");

    public static By FilterOptions(String options){
        return  By.xpath("//label[text()=' "+options+"']/parent::div/child::input");
    }


    public static By ApplyBtnInFilter = By.xpath("//span[text()=' APPLY ']");
    public static By CancelBtnInFilter = By.xpath("//span[text()=' CANCEL ']");
    public static By FilterMenu = By.xpath("//mat-card[contains(@class,'filter-card')]");
    public static By ClearFilters = By.xpath("//button[@id='clear_btn']");
    public static By ValidationClearFilters = By.xpath("//input[@ng-reflect-model='true']");
    public static By ValidationQAFilter = By.xpath("//mat-expansion-panel-header//div[contains(text(),'QA')]");
    public static By ValidationAppliedFilter(String options){
        return By.xpath("//mat-expansion-panel-header//div[contains(text(),'"+options+"')]");
    }


    //mat-select[@formcontrolname='empEmail']
//    public static By DropdownEmployeeAddNewNomination = By.xpath("//mat-select[@formcontrolname='empEmail']");

    //div[@class="award-catg-container"]
    public static By AwardListInNomination = By.xpath("//div[@class='award-catg-container']");
    public static By SelectAwardCategorySec = By.xpath("//div[text()='Select Award Category']");




}
