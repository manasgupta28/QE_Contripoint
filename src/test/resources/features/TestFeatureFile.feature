#@sanity
#Feature: Test Amazon website launch
#
#  Background: User Login into the Contripoint Application
#    Given User launches the URL
#    When User clicks on signIn Button
#    Then User enters the "username"
#    Then User enters the "password"
#    And User logins into the application
#
#  Scenario: Contripoint Logo is present
#    Given Verify if contripoint url is launched
#    Then Verify Contripoint logo and text is present
#    Then Verify notification icon is present
#    Then Verify menu icon is present
#
#    Scenario: Contripoint header components are visible
#      Given Verify if contripoint url is launched
#      Then verify if FAQ button is visible
#      Then Verify if Demo Videos button is visible
#      Then Verify if Help Channel button is visible
#      Then Verify if Report Bug button is visible
#
#      Scenario: Contrpoint Dashboard validation
#        Given Validate Dashboard icon is visible
#        Then Click on Dashboard icon
#        Then Verify winner dashboard is visible
#        Then check my insights
#        Then Check Contribution Categories section
#        Then Validate the visibility of Activities Feeds section on dashboard UI
#
#      Scenario: Contripoint winner dashboard
#        Given Validate the presence of winner dashboard on dashboard UI
#        Then Check the presence of awards dropdown
##        Then Click on dropdown and choose another award
##        And Check if winner dashboard is updated
#
#      Scenario: Contripoint my insights screen
#        Given check my insights
#        Then Check the presence of points card
#        Then Check the presence of rank card
#        Then Check the presence of level card
#        Then Check the presence of wallet amount card
#
#      Scenario: Contripoint contribution categories screen
#        Given Check Contribution Categories section
#        Then Check the presence of Certifications card
#        Then Check the presence of Interview Taken card
#        Then Check the presence of Training and Sessions card
#        Then Check the presence of Mentorship card
#        Then Check the presence of Projects card
#        Then Check the presence of Team Building Activity card
#        Then Check the presence of Client Feedback card
#        Then Check the presence of Self Development Activity card
#
#      Scenario: Contripoint activities feeds screen
#        Then Validate the visibility of Activities Feeds section on dashboard UI
#        Then Check the presence of search bar under activities feeds
#        Then Check the presence of activities feeds table
#        And Check the presence of next page section
#
#      Scenario: Contripoint activities feeds screen
#        Then Validate the visibility of Activities Feeds section on dashboard UI
#        Then Check the presence of search bar under activities feeds
#        Then Check the presence of activities feeds table
#        And Check the presence of next page section
#
#      Scenario: Contripoint leaderboard window
#        Given Check the visibility of leaderboard expand icon
#        Then Expand the leaderboard
#        Then Validate the presence of person on leaderboard
#
#      Scenario: Contripoint search bar is working
#        Then Validate the visibility of Activities Feeds section on dashboard UI
#        Then Check the presence of search bar under activities feeds
#        Then Click on goto to last button
#        Then Get the name of person from activities table
#        Then Validate if the name exists on table
#
#      Scenario: Contripoint cancel Self Development Activity
#        Then Check the presence of Self Development Activity card
#        Then add new self development activity
#        Then enter self development activity name
#        Then select duration
#        Then select the start date
#        Then select goal type as EC and fill the description
#        Then click on cancel button
#
#        Scenario: Contripoint add Self Development Activity by EC
#          Then Check the presence of Self Development Activity card
#          Then add new self development activity
#          Then enter self development activity name
#          Then select duration
#          Then select the start date
#          Then select goal type as EC and fill the description
#          Then click on submit button
#          Then check success popup is visible
#
#        Scenario: Contripoint add Self Development Activity by DC
#          Then Check the presence of Self Development Activity card
#          Then add new self development activity
#          Then enter self development activity name
#          Then select duration
#          Then select the start date
#          Then select goal type as EC and fill the description
#          Then click on submit button
#          Then check success popup is visible
#
#
#        Scenario: Contripoint Demo video page is opening and validate redirection on dashboard
#          Then Verify if Demo Videos button is visible
#          Then Click on Demo Videos button
#          And verify contripoint Demo videos page is visible
#          Then click on Back button
#          Then check my insights
#
#        Scenario: Contripoint Report a bug page is opening and validate redirection on dashboard
#          Then Verify if Report Bug button is visible
#          Then click on report a bug button
#          And verify contripoint bug reporting page is visible
#          Then click on back button
#          Then check my insights
#
#          Scenario: Contripoint notification icon is clickable
#            Then Verify notification icon is present on UI
#            Then Click on notification button
#            And Validate notification window is visible
#
#          Scenario: Contripoint notification list is working
#            Then Verify notification icon is present on UI
#            Then Click on notification button
#            And Validate notification window is visible
#            Then Get the total number of notifications
#            Then Click on view more
#            Then Validate the updated notification list
#
#          Scenario: Contripoint FAQs page is opening and validate redirection on dashboard
#            Then verify if FAQ button is visible
#            Then click on FAQ button
#            And verify contripoint FAQ page is visible
#            Then click on the back button
#            Then check my insights
#
#          Scenario: Contripoint all FAQs are visible on UI
#            Then verify if FAQ button is visible
#            Then click on FAQ button
#            And verify contripoint FAQ page is visible
#            Then get the total number of question present
#            Then validate all FAQs are populated on UI
#
#          Scenario: Contripoint wallet ammount
#            Then Check the presence of wallet amount card
#            Then click on wallet amount card
#            And validate checkout screen in opened
#
#
#
#
#
#
#
#
