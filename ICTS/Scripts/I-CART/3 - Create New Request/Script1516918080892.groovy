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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

//Open I-CART and login
WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Login  Sign Up'))

CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\katalon.txt')

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

//
WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

WebUI.switchToWindowTitle('SPARCRequest Dashboard')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Katalon Test Study (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add  Modify Request'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/span_Fitnesse Testing'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/span_Fitnesse Test Program'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/div_core-header green-provider'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Add_Per'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Add_Non'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Continue (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Edit Study Information'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Cancel'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Save and Continue'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/input_studystart_date'), '01/25/2018')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/input_studyend_date'), '01/25/2020')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Save and Continue'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_QuantityBilling Tab'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Consolidated Request Tab'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Save and Continue'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Add a Document'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Close_Document'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Add a Note'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/textarea_notebody'), 'Testing protocol note')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Close_Note'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Save and Continue'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Submit Request'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Go to Dashboard'))

WebUI.closeBrowser()

