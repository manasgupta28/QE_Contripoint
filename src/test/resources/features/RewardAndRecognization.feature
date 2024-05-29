Feature: Reward and recognization

  Background: User Login into the Contripoint Application
    Given User launches the URL
    Then User presses ctrl+m
#    When User clicks on signIn Button
#    Then User enters[ the "username"
#    Then User enters the "password"
    And User logins into the application

#    1
  Scenario: Validate award category card
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI

#    2
  Scenario: Change the display type to grid
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    Then User Click on grid icon

#    3
  Scenario: Change the display type to list
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    Then User Click on grid icon
    Then User click on list icon

  Scenario Outline: Create new award in inactive state and change its state to inactive and recommend the employee
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When the user enters "<award name>", "<reward amount>", award Visibility as active, "<description>" and clicks on submit button
    Then User Change the state of award "<award name>" to inactive
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Award "<award name>" should not be visible in the list
    Examples:
      | praise |employee name| award name            | reward amount | description |
      | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss |Shruti | reg1 | 500           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


#  4
  Scenario Outline: Create new award in inactive state and change its state to active and recommend the employee
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When the user enters "<award name>", "<reward amount>", award Visibility as inactive, "<description>" and clicks on submit button
    Then User Change the state of award "<award name>" to active
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award "<award name>" from the list that is turned to active
    Then Press Submit in award category
    Examples:
      | praise |employee name| award name            | reward amount | description |
      | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss |Shruti| reg2 | 500           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |




#  5
  Scenario Outline: Create new award in active state and change its state to inactive
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When the user enters "<award name>", "<reward amount>", award Visibility as active, "<description>" and clicks on submit button
    Then User Change the state of award "<award name>" to inactive
    Examples:
      | award name            | reward amount | description |
      | reg3 | 5000           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


  Scenario Outline: Create new award in inactive state and change its state to active
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When the user enters "<award name>", "<reward amount>", award Visibility as inactive, "<description>" and clicks on submit button
    Then User Change the state of award "<award name>" to active
    Examples:
      | award name            | reward amount | description |
      | reg4 | 500           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |





#  8
#  Scenario Outline: Create Inactive Award in "Gem" Award Category
#    When User click on HR portal icon
#    Then Check the award category card is visible on UI
#    Then Click on award category card UI
#    When User Click on create new award category button
##    Then user set category to gem award
##    When the user enters "<award name>", "<reward amount>", award Visibility as inactive, "<description>" and clicks on submit button
##   Then Navigate to the list of awards in gem category with Inactive award.
#    Examples:
#      | award name            | reward amount | description |
#      | INActiveAwardInGEM2 | 5000           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


#  9
#  Scenario Outline: Create Active Award in "Gem" Award Category
#    When User click on HR portal icon
#    Then Check the award category card is visible on UI
#    Then Click on award category card UI
#    When User Click on create new award category button
#    Then user set category to gem award
##    When the user enters "<award name>", "<reward amount>", award Visibility as active, "<description>" and clicks on submit button
##    Then Navigate to the list of awards in gem category with active award.
#    Examples:
#      | award name            | reward amount | description |
#      | ActiveAwardInGEM | 5000           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


#  11
  Scenario: Award Creation Form Does Verify Mandatory Fields Requirement
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When User Click On Submit Button
    Then Verify if any error messages appear indicating missing mandatory fields.


#  12
  Scenario: Verify Mandatory Fields Requirement with Partial Data Entry
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    Then Enter valid data for some fields like Name and Description but leave visibility blank
    When User Click On Submit Button
    Then Verify if any error messages appear indicating missing mandatory fields.


#  13
  Scenario Outline: Verify Mandatory Fields Requirement with All mandatory Fields Filled
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    When the user enters "<award name>", award Visibility as active, "<description>" and clicks on the submit button
    Examples:
      | award name   | description |
      | reg5   | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


#  14
  Scenario: Validate "Reward Amount" Field Accepts Only Numeric Values
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    Then User enter char like "aaa" in reward amount
    When User Click On Submit Button
    Then Verify if any error messages appear indicating error in reward amount field.


#  15
  Scenario: Validate "Description" Field Length for short length less than 150 characters
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    Then User enter char like "aaa" in Description
    When User Click On Submit Button
    Then Verify if any error messages appear indicating error in Description field.

#  16
  Scenario: Validate "Description" Field Length for greater for 400 characters
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    Then User enter char like "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" in Description
    When User Click On Submit Button
    Then Verify if any error messages does not appear indicating error in Description field.


#  17
  Scenario: Validate "Award name" Field with special characters
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When User Click on create new award category button
    Then User enter char like "abc123!@#$%^&*" in award name
    When User Click On Submit Button
    Then Verify if any error messages does not appear indicating error in award field.


#  18
#    Scenario Outline: Validate the selection of certificate and trophy in award creation
#        When User click on HR portal icon
#        Then Check the award category card is visible on UI
#        Then Click on award category card UI
#        When User Click on create new award category button
#        Then Select the option for both certificate and trophy
#    #    When the user enters "<award name>", "<reward amount>", award Visibility as active, "<description>" and clicks on submit button
#    #    Verify that the award contains the certificate and trophy
##        Examples:
##          | award name            | reward amount | description |
##          | ActiveAwardInGEM | 5000           | Recognition for outstanding performance and hardwork by the employee throughout the year consistently and with discipline and dedication.very god work |


#  19
  Scenario: verify search functionality for award list
    When User click on HR portal icon
    Then Check the award category card is visible on UI
    Then Click on award category card UI
    When user types the name of the award in the search bar and check if the list gets updated

#    =====================================================================
#    =====================================================================
#    =====================================================================


#                        HR ANALYTICS


#    =====================================================================
#    =====================================================================
#    =====================================================================


#  25-18
  Scenario: Verify Selection of EC/DC in hr analytics
    When User click on HR portal icon
    Then Select EC-DC option
    Then Verify if all EC-DC options is displayed and selectable

#  26
#  Scenario: Verify List Update when we change EC/DC options
#    When User click on HR portal icon
#    Then Select EC-DC option
#    Then Verify if all EC-DC options is displayed and selectable

#  27-19
  Scenario: Verify Selection of Onshore, Offshore or both
    When User click on HR portal icon
    Then Select EC-DC option
    Then Select Onshore option
    Then Verify if onshore-offshore options is displayed and selectable

#  20
  Scenario: Verify Selection of DateRange
    When User click on HR portal icon
    Then Select EC-DC option
    Then Select Onshore option
    Then Click on select date range icon
    Then select date range with desired quarters

#  30-21
  Scenario: Verify Display of Total Number of Employees
    When User click on HR portal icon
    Then Select EC-DC option
    Then Select Onshore option
    Then Click on select date range icon
    Then select date range with desired quarters
    Then Verify if the total number of employees in the selected EC-DC is displayed.


  Scenario: Verify Display of Total Number of Nominations
    When User click on HR portal icon
    Then Select EC-DC option
    Then Select Onshore option
    Then Click on select date range icon
    Then select date range with desired quarters
    Then Verify if the total number of nominations in the selected EC-DC is displayed.



  Scenario: Verify Display of Total Number of Awardees
    When User click on HR portal icon
    Then Select EC-DC option
    Then Select Onshore option
    Then Click on select date range icon
    Then select date range with desired quarters
    Then Verify if the total number of Awardees in the selected EC-DC is displayed.


    Scenario: Verify Equality of Employees in Onshore and Offshore with Both Option for Different Date Ranges and Quarters
      When User click on HR portal icon
      Then Select EC-DC option
      Then Click on select date range icon
      Then select date range with desired quarters
      Then Select Onshore option Offshore option and then both option and verify the sum


      Scenario: Verify Equality of Total Number of Nominations with List
        When User click on HR portal icon
        Then Select EC-DC option
        Then Select Offshore option
        Then Click on select date range icon
        Then Select the desired quarters and checks if the number of nominations are equal to nominations present in list


        Scenario: Verify Display of Recommendations Made by User
          When User Clicks on Award Nomination Icon
          Then User Access the Recommended by Me section.
          And Verifies if there is a list displaying recommendations made by the user.



        Scenario Outline: Verify Add New Recommendation Form
          When User Clicks on Award Nomination Icon
          Then User Access the Recommended by Me section.
          When User Clicks On Add New Button
          Then User Enters the Name Of The Employee "<employee name>"
          Then User Enters the Praise "<praise>" For the Employee
          Then User Selects Share praise with EC
          Then User Clicks on next button
          Then Select an award from the list
          Then Press Submit in award category
        Examples:
          |employee name|praise|
          | Richa         | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss|


          #change the name is locators file
  Scenario Outline: verify functionality of submit button in add new recommendation form
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then Press Submit in award category
    Then check if success animation appears
    Examples:
      |employee name|praise|
      | Kriti    | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss|


  Scenario Outline: Verify Update of recommended by me List After Adding Recommendation
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then Press Submit in award category
    Then Verify the Name of employees "<employee name>" listed after adding the recommendation
    Examples:
      | employee name | praise |
      | Sandeep    | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss|

  Scenario Outline: Verify functionality of previous button in add new recommendation
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then User clicks on previous button in Select an Award Category
    Then check if user is directed to Recommendation form
    Examples:
      | employee name | praise |
      | Akhil   | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss|

  Scenario Outline: Verify functionality of save as draft in add new recommendation
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then User Clicks on Save as Draft in Select an Award Category and verify
    Examples:
      |employee name        | praise |
      | Vipra    | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |

  Scenario: verify functionality of dropdown button present in each employee card
      When User Clicks on Award Nomination Icon
      Then User Access the Recommended by Me section.
      Then User Click on dropdown button present in employee card
      Then user checks if the dropdown is opened

      Scenario Outline: verify the 3 dot functionality for the drafted employee in the list
        When User Clicks on Award Nomination Icon
        Then User Access the Recommended by Me section.
        When User Clicks On Add New Button
        Then User Enters the Name Of The Employee "<employee name>"
        Then User Enters the Praise "<praise>" For the Employee
        Then User Selects Share praise with EC
        Then User Clicks on next button
        Then Select an award from the list
        Then User Clicks on Save as Draft in Select an Award Category and verify
        Then user clicks on three dots button
        Then user checks if the three dots button is clicked and options are visible
        Examples:
          |employee name        | praise |
          | Sachin Garg    | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |



  Scenario Outline: check functionality of "edit" option inside "3 dot" button
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then User Clicks on Save as Draft in Select an Award Category and verify
    Then user clicks on three dots button
    Then user clicks on edit button present under three dots button
    Then check if user is directed to Recommendation form
    Examples:
      |employee name        | praise |
      | Vaibhav    | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |




  Scenario Outline: check functionality of "recommend" option inside "3 dot" button
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then User Clicks on Save as Draft in Select an Award Category and verify
    Then user clicks on three dots button
    Then user clicks on recommend button present under three dots button
    Examples:
      |employee name        | praise |
      | Anshul   | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |


  Scenario Outline: check functionality of "Dismiss" option inside "3 dot" button
       When User Clicks on Award Nomination Icon
       Then User Access the Recommended by Me section.
#       When User Clicks On Add New Button
#       Then User Enters the Name Of The Employee "<employee name>"
#       Then User Enters the Praise "<praise>" For the Employee
#       Then User Selects Share praise with EC
#       Then User Clicks on next button
#       Then Select an award from the list
       Then User Clicks on Save as Draft in Select an Award Category and verify
       Then user clicks on three dots button
       Then user clicks on Dismiss button present under three dots button
       Examples:
         | employee name        |  praise |
         | Siddhanshi |  very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |



#          please replace the name in "EmployeeName" name in locators
          Scenario Outline: Verify Update of Award List After Adding Recommendation
            When User Clicks on Award Nomination Icon
            Then User Access the Recommended by Me section.
            When User Clicks On Add New Button
            Then User Enters the Name Of The Employee "<employee name>"
            Then User Enters the Praise "<praise>" For the Employee
            Then User Selects Share praise with EC
            Then User Clicks on next button
            Then Select an award from the list
            Then Press Submit in award category
            Then Verify the Name of employees "<employee name>" listed after adding the recommendation
            Examples:
              | employee name | praise |
              | Pankaj | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |


#        check for date range and award
          Scenario: Verify Filtering of Recommended Employee List by EC-DC, Award, and Date Range
            When User Clicks on Award Nomination Icon
            Then User Access the Recommended by Me section.
            Then User Clicks on Filter button in Recommended By me section
            Then User Selects the desired Filter
            Then Users Checks if the desired filter are applied


            Scenario Outline: Verify Quarters visible for Same Year Range
              Then User click on HR portal icon
              Then Click on select date range icon
              Then select the start date "<start date>" under date range
              Then select the year with same end date "<start date>"
              Then verify that the number of quarters that can be selected are "<quarter>"
              Examples:
                | start date | quarter |
                | 2023-2024  |   4     |


  Scenario Outline: Verify Quarters visible for Different Year Range
    Then User click on HR portal icon
    Then Click on select date range icon
    Then select the start date "<start date>" under date range
    Then select the year with same end date "<end date>"
    Then verify that the number of quarters that can be selected are "<quarter>"
    Examples:
      | start date| end date  | quarter |
      | 2023-2024 | 2024-2025 |   8     |


  Scenario Outline: Verify Quarters visible for present Year Range
    Then User click on HR portal icon
    Then Click on select date range icon
    Then select the start date "<start date>" under date range
    Then select the year with same end date "<end date>"
    Then verify that the number of quarters that can be selected are "<quarter>"
    Examples:
      | start date| end date  | quarter |
      | 2024-2025 | 2024-2025 |   4     |

  Scenario Outline: Verify Award Selection and Submission Options After Adding Name, Praise, and EC-DC
              When User Clicks on Award Nomination Icon
              Then User Access the Recommended by Me section.
              When User Clicks On Add New Button
              Then User Enters the Name Of The Employee "<employee name>"
              Then User Enters the Praise "<praise>" For the Employee
              Then User Selects Share praise with EC
              Then User Clicks on next button
              Then Select an award from the list
              Then User clicks on previous button in Select an Award Category
              Then User Clicks on next button in Add new Recommendation
              Then User Clicks on Save as Draft in Select an Award Category and verify
        Examples:
              | employee name | praise |
              |  Sakshi Ag | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |



      Scenario Outline: verify if user is able to submit without selecting award
              When User Clicks on Award Nomination Icon
              Then User Access the Recommended by Me section.
              When User Clicks On Add New Button
              Then User Enters the Name Of The Employee "<employee name>"
              Then User Enters the Praise "<praise>" For the Employee
              Then User Selects Share praise with EC
              Then User Clicks on next button
              Then Press Submit in award category
              Then Verify the Name of employees "<employee name>" listed after adding the recommendation
        Examples:
              | employee name | praise |
              |  Saloni | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |






#
  Scenario Outline: Verify Functionality of "Save as Draft" Option After Adding Name, Praise, and EC-DC
    When User Clicks on Award Nomination Icon
    Then User Access the Recommended by Me section.
    When User Clicks On Add New Button
    Then User Enters the Name Of The Employee "<employee name>"
    Then User Enters the Praise "<praise>" For the Employee
    Then User Selects Share praise with EC
    Then User Clicks on next button
    Then Select an award from the list
    Then User Clicks on Save as Draft in Select an Award Category and verify
    Examples:
      | employee name | praise |
      |  Ayush Gupta  | very good job hard workingssssssssssssssssssssssssssssssssssssssssssss   |


  Scenario: Verify Functionality of hr rules button on top
    When User Clicks on Award Nomination Icon
    Then click on hr rules button on top

#
#      Review Recommendation
#

  Scenario:Verify Selection of EC-DC in review recommendation
    When User Clicks on Award Nomination Icon
    When click on the ec-dc option
    Then verify that the ec option is selected

  Scenario:Verify EC-DC Selection and Council Dropdown Visibility
    When User Clicks on Award Nomination Icon
    When click on the ec-dc option
    Then verify that the dropdown is updated to ec

  Scenario:Verify List Update After Selecting Date Range with EC-DC and Council
    When User Clicks on Award Nomination Icon
    When click on the ec-dc option
    Then select the specific council
    Then Click on select date range icon
    Then select date range with desired quarters

    Scenario: Validate Equality of Total Recommendation Count and List Item Count
      When User Clicks on Award Nomination Icon
      When click on the ec-dc option
      Then select the specific council
      Then Click on select date range icon
      Then select date range with desired quarters
      Then check if the number of recommendations present in the list are equal to the count

    Scenario: perform operation on list item in review-recommendation
      When User Clicks on Award Nomination Icon
      Then user clicks on the Review Recommendations button for any employee in the list.
      Then user verifies that they are directed to the nomination page.

    Scenario: Verify Search Functionality for Recommended Candidates
      When User Clicks on Award Nomination Icon
      Then user enters the name of the employee from the list and checks if list gets updated dynamically

    Scenario: Verify Opening of Unrecognized Talent Page
      When User Clicks on Award Nomination Icon
      Then user clicks on unrecognized talent button
      Then user checks if the unrecognized talent page appears



  Scenario: Verify Opening of View Draft List Page
    When User Clicks on Award Nomination Icon
    Then user clicks on View Draft List button
    Then user checks if the View Draft List page appears

  Scenario: Verify Options on "Unrecognized Talent" Page
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user checks if the unrecognized talent page appears
    Then verify that option present on unrecognized talent page appears



  Scenario: perform operation on list item in Nomination Draft List
    When User Clicks on Award Nomination Icon
    Then user clicks on View Draft List button
    Then user checks if the View Draft List page appears
    Then user clicks on the dropdown button under employee card in the list
    Then user clicks on three dots button present under nomination draft list



#    create 3 drafted user before testing
  Scenario: check functionality of edit option inside Three dots button in nomination draft list
    When User Clicks on Award Nomination Icon
    Then user clicks on View Draft List button
    Then user checks if the View Draft List page appears
    Then user clicks on three dots button present under nomination draft list
    Then user clicks on edit button present under three dots button
    Then user verifies that they are directed to the nomination page.

  Scenario: check functionality of submit option inside Three dots button in nomination draft list
    When User Clicks on Award Nomination Icon
    Then user clicks on View Draft List button
    Then user checks if the View Draft List page appears
    Then user clicks on three dots button present under nomination draft list
    Then user clicks on submit nomination button present under three dots button
    Then check if success animation appears


  Scenario: check functionality of dismiss option inside Three dots button in nomination draft list
    When User Clicks on Award Nomination Icon
    Then user clicks on View Draft List button
    Then user checks if the View Draft List page appears
    Then user clicks on three dots button present under nomination draft list
    Then user clicks on Dismiss button present under three dots button

  Scenario: Verify Search Functionality for Nominated But Never Awarded List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user enters the name of the employee from the list and checks if list gets updated dynamically in Unrecognized Talent

  Scenario: Verify functionality of eye button in Nominated But Never Awarded List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user clicks on eye button present under the employee card
    Then user verifies that employee status card appears

  Scenario: Verify Search Functionality for Recommended But Never Nominated List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user clicks on recommended but never nominated button
    Then user enters the name of the employee from the list and checks if list gets updated dynamically in Unrecognized Talent


  Scenario: Verify functionality of forward button from "Recommended But Never Nominated" List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user clicks on recommended but never nominated button
    Then user clicks on the forward button next to a candidate's name in the list
    Then user verifies that they are directed to the nomination page.


  Scenario: Verify Search Functionality for Never Recommended List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user clicks on Never Recommended button
    Then user enters the name of the employee from the list and checks if list gets updated dynamically in Never recommended Talent


  Scenario: Verify Recommending a Candidate from "Never Recommended" List
    When User Clicks on Award Nomination Icon
    Then user clicks on unrecognized talent button
    Then user clicks on Never Recommended button
    Then user clicks on arrow button present in employee card
    Then user checks if the add new recommendation form appears


  Scenario: Verify Opening of Nominate Page from "Review Recommendations" Section
    When User Clicks on Award Nomination Icon
    Then user clicks on nominate button
    Then user checks if add new nomination page appears


#
#         Nominated by ec-dc
#

  Scenario Outline: Verify Filtering Options in "Nominated by EC/DC" Section
    When User Clicks on Award Nomination Icon
    Then user click on nominated by ec dc section
    Then user clicks on filter button
    Then user chooses filter option "<opt>" from list
    Then user clicks on apply button
    Then user verifies that filter "<opt>" is applied
    Examples:
      | opt  |
      | QA   |


  Scenario Outline: Verify Clear Button in "Nominated by EC/DC" Section
    When User Clicks on Award Nomination Icon
    Then user click on nominated by ec dc section
    Then user clicks on filter button
    Then user chooses filter option "<opt>" from list
    Then user clicks on clear button
    Then user checks if no filter is selected
    Examples:
      | opt  |
      | QA   |


  Scenario Outline: Verify Cancel Button in "Nominated by EC/DC" Section
    When User Clicks on Award Nomination Icon
    Then user click on nominated by ec dc section
    Then user clicks on filter button
    Then user chooses filter option "<opt>" from list
    Then user clicks on Cancel button
    Then user checks if filter menu is closed
    Examples:
      | opt  |
      | QA   |



  Scenario Outline: Verify Navigation to Nominate Page After Employee Selection in "Add New Nomination" Popup
    When User Clicks on Award Nomination Icon
    Then user clicks on nominate button
    Then user checks if add new nomination page appears
    Then User Enters the Name Of The Employee "<emp name>"
    Then User Clicks on next button
    Then user verifies that they are directed to the nomination page.
    Examples:
      | emp name   |
      | Priyanshu Prajapati |

  Scenario Outline: Verify Loading of Awards List in Nominate Page
    When User Clicks on Award Nomination Icon
    Then user clicks on nominate button
    Then user checks if add new nomination page appears
    Then User Enters the Name Of The Employee "<emp name>"
    Then User Clicks on next button
    Then user verifies that they are directed to the nomination page.
    Then user clicks on select award category button
    Then user checks if the list is loading and selectable
    Examples:
      | emp name   |
      | Priyanshu Prajapati |









#
#
#



