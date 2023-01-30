Focus Page script automated….!!!

Description about project: This porject was built OOP and contain some validation about the website of Focus Service https://www.focusservices.com/
Technologies: the project it have built in maven with Testng with the language programming java and javascript



Steps to setup and test the project 

1) install maven 
2) Ensure the last version of java is already installed if not installed install the last version
3) Import the project in ecplise or another IDE from github

4) the structure of the project: contain two package constants and Testcases, pom.xml and suite
*In the package Constants contain two classes Webdriverbase and Search. The class Webdriverbase contains the method Webdriverbase where is inizializated the webdriver with parameteres in order to the user define what browser want to run the scenario of testing besides have the method assertEqualsByText this method is to have a specific point of view when the assert fails.

in the class Search have the elements defined, this situation it's due the OOP in order to in the test class just to call the element and see more organized the project.

*In the package Testcases contain the class TC001 with the logic of the program: 
The method setUp is inizilizated the browser and need the parameter "browser" that is located in the testng.xml file, the values for this parameter could be Chrome, Firefox or Edge. covering the point #1 Open Chrome Browser.
The method search contain the URL that will access the program to do the all test this method need a parameter "urlvalue" to verify the url "https://www.focusservices.com" exist 

--requisite Open Chrome Browser. is being covered in the method setup from line 15 to 16.
--requisite Go to www.google.com, Type in Google’s search “Focus Services” and Click on “Search button”. is being covered in the method search from line 23 to 34.
--requisite Verify the https://www.focusservices.com URL exists in the search, Click on that page, Scroll down to the bottom of the page and Verify the “Now Hiring” button exists into this page. is being covered in the method search from line 35 to 48.
--requisite Click on “Locations” Tab, Locate North America Link. Do an assert on this link. is being covered in the method northamerica in the from line 56 to 68.
--requisite Click on Central America location and Validate “El Salvador & Nicaragua” title is displayed on the page. is being covered in the method centralamerica from line 74 to 89.
--requisite Click on Asia Location. Verify if exist the “Bacolod City, Philippines” text block. is being covered in the method asia from line 95 to 109.
--In the method close works to close the window after the all program. 

