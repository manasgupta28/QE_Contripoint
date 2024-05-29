package com.qa.projectName.locators;
import org.openqa.selenium.By;

public class ActivityLocators {




    public static By successPopup =By.xpath("//div[@class='cdk-overlay-container']");

    public static By signInBtn          =       By.xpath("//span[contains(text(),'Login with Gemini mail')]");
    public static By certification         =    By.xpath("//div//h5[text()='Certifications']");
    public static By certificationCardBody = By.xpath("(//div//p[contains(@class,'card-text')])[1]");
    public static By notificationFrame = By.xpath("//div//div[@class='notification-container ng-star-inserted']");
    public static By menuFrame = By.xpath("//div[@class='mat-menu-content ng-tns-c264-2']");
    public static By notificationIcon = By.xpath("//div//img[@title='Notification']");
    public static By addNew = By.xpath("//button[text()=' ADD NEW ']");
    public static By interviewTaken = By.xpath("(//div[@class='card'])[2]");

    public static By trainingCard = By.xpath("(//div[@class='card'])[3]");
    public static By projectCard = By.xpath("(//div[@class='card'])[5]");

    public static By teamBuildingCard = By.xpath("(//div[@class='card'])[6]");

    public static By cancelBtn = By.xpath("//button[@id='cancel_btn']");
    public static By menuIcon = By.xpath("//div//img[@title=\"Menu\"]");
    public static By arrowIcon = By.xpath("//mat-form-field//div[@class='mat-select-arrow-wrapper ng-tns-c253-5']");
    public static By arrowIconTrain = By.xpath("//mat-form-field//div[@class='mat-select-arrow-wrapper ng-tns-c253-7']");
    public static By arrowIconMonth = By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c253-10\"]");
    public static By saveAsDraft = By.xpath("//button[@id='draft_btn']");

    public static By submitBtn = By.xpath("//button[@type='submit'']");
    public static By arrowIconExp = By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c253-7']");
    public static By month = By.xpath("//span[text()=' May ']");

    public static By goalType = By.xpath("//span[text()='Engineering Council (EC)']");

    public static By goalTypeDc = By.xpath("//span[text()='Delivery Council (DC)']");
    public static By date=By.xpath("//div[text()=' 9 ']");
    public static By interviewText = By.xpath("//input[@type='number']");
    //    public static By numberField = By.xpath("//span[text()='{0}']//..//input");
    public static By description = By.xpath("//textarea");
    public static By expLevel = By.xpath("//span[text()=' Junior (Less than 5 years)']");
    public static By interviewPosition = By.xpath("//span[text()=' Business Analyst with CRM ']");



}
