Feature: Login Test
Scenario Outline: Login test with valid creds
Given User launch chrome browser
When User Enters "<username>" and "<password>"  
And User click login 
Then User should navigate to homepage "Swag Labs"
And browser closed

Examples: 
| username | password | 
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user |secret_sauce |
| performance_glitch_user | secret_sauc |