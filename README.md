# SPARC Test Suite for Katalon Studio

This project must be opened with Katalon Studio v5.9.1 or later. Before it can be run, the following configuration is required:

1. Via the Tests Explorer pane, open Profiles > default
2. Enter the following information in their respective "Value" fields
	* username - Non-admin username
	* password - Leave blank
	* username_admin - Admin username
	* password_admin - Leave blank
	* url - URL to SPARCRequest
	* url_fulfillment - URL to SPARCFulfillment
	* pid - Protocol number of test project
	* project_title - Exact title of test project
	* password_filepath - Full path to text file containing both admin and non-admin passwords (Admin password first, separated by newline)
3. Click Save button

Test Suite can be run individually via the Test Cases folder in the Tests Explorer pane or as full suites via the Test Suites folder. Once a test/suite is open it can be run by clicking the Run button in the upper right of the window.