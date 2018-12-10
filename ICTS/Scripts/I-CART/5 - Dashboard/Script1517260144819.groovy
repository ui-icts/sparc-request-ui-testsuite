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

//Open I-CART and login
WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Login  Sign Up'))

CustomKeywords.'newpackage.newkeyword.loadTextFile'(GlobalVariable.password_filepath)

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

//
WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

WebUI.switchToWindowTitle('SPARCRequest Dashboard')

try {
    WebUI.verifyTextPresent('Fit Test 2017', false)
}
catch (Exception e) {
    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificshow_archived'))

    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'))

    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Fit Test 2017'))

    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Unarchive Project'))

    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Dashboard (1)'))
} 

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificsearch_querys (1)'), GlobalVariable.pid)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'))

WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/b_1'), '1')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificsearch_querys (1)'), '')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Fit Test 2017'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Archive Project'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Dashboard (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_filterrificshow_archived'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Filter'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Fit Test 2017'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Unarchive Project'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Dashboard (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Requests'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Send Notification'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Co-investigator'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_notificationsubject'), 'Test Subject')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/textarea_notificationmessagebo'), 'test message')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Send'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Requests'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_View'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close_View'))

WebUI.closeBrowser()

