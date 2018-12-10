import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\eneuhaus\\AppData\\Local\\Temp\\Katalon\\Test Cases\\I-CART\\6 - Edit Request (Admin)\\20181116_142222\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Open I-CART and login
not_run: WebUI.openBrowser(GlobalVariable.url)

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Login  Sign Up'))

not_run: CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\\\katalon.txt')

not_run: WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username_admin)

not_run: WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password_admin)

not_run: WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

//
not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

not_run: WebUI.switchToWindowTitle('SPARCRequest Dashboard')

not_run: WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificsearch_querys'), GlobalVariable.pid)

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Katalon Test Study - Copy'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Admin Edit'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Notifications'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_History'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Non-clinical Services'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_List'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add Fulfillment'))

not_run: WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_fulfillmentdate'), '01/26/2018')

not_run: WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_fulfillmenttime'), '1')

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Min'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Details'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-list-'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Add a Note'))

not_run: WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/textarea_notebody'), 'Test line item note')

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary notes ad'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add Admin Rate'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-edit'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/label_Quantity Requested'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_line_itemquantity'), '2')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_line_itemin_process_date'), '01/26/2018')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_line_itemcomplete_date'), '01/26/2018')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Clinical Services'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Consolidated Request Tab'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_QuantityBilling Tab'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Template Tab'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Request Details'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_caret'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Ictsicarta Test'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_caret_1'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Complete'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Send to Fulfillment'))

WebUI.closeBrowser()

''', 'Test Cases/I-CART/6 - Edit Request (Admin)', new TestCaseBinding('Test Cases/I-CART/6 - Edit Request (Admin)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
