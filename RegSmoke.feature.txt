Feature: Reg_Smoke

Background: I am logged into Orange Application
Given Open OrangeHRP
Then Login Orange Portal

@SmokeTest
Scenario: Verification of Admin Title
When Dashboard is available 
And click Admin menu

@SmokeTest
Scenario: Verification of Job Title 
Then Click Job 
And validate text JobTitle 

@RegressionTest
Scenario: Verification of PIM Title
When Click PIM
And Click Search

@RegressionTest
Scenario: Verification of My Info Title 
Given Click Leave
Then Click on Search 