Feature: Selenium Cucumber with Git Actions 

Scenario Outline: Git Actions with Cucumber Framework 

	Given User launches the "<Browser>" 
	When User enters "<UserName>" and "<Password>" 
	Then User clicks on Login button 
	And User views the Dashboard 
	
	Examples: 
		|Browser|UserName|Password|
		|Chrome|User1|Password1|
		|IE|User2|Password2|
		|FireFox|User3|Password3|