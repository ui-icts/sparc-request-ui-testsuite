import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Login  Sign Up'))

CustomKeywords.'newpackage.newkeyword.loadTextFile'(GlobalVariable.password_filepath)

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username_admin)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password_admin)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

//
WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

WebUI.switchToWindowTitle('SPARCRequest Dashboard')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificsearch_querys'), GlobalVariable.pid)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Katalon Test Study - Copy'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Admin Edit'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Notifications'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_History'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Non-clinical Services'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_List'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add Fulfillment'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_fulfillmentdate'), '01/26/2018')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_fulfillmenttime'), '1')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Min'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Details'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-list-'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Add a Note'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/textarea_notebody'), 'Test line item note')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary notes ad'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add Admin Rate'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_glyphicon glyphicon-trian'))

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

