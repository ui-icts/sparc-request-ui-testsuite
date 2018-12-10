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

CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\katalon.txt')

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

//
WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

WebUI.switchToWindowTitle('SPARCRequest Dashboard')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Katalon Test Study (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Study Notes (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Add a Note (2)'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/textarea_notebody (3)'), 'test protocol note')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary notes ad (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close_Notes'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_View Study Details (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close_Details'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Edit Study Information (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Cancel (3)'))

try {
    WebUI.verifyElementNotPresent(findTestObject('I-CART/Page_SPARCRequest Dashboard/td_Ictsicarta Test'), 0)

    WebUI.delay(1)
}
catch (Exception e) {
    WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_btn btn-danger actions- (1)'))

    WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)
} 

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add an Authorized User (2)'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_authorized_user_search (3)'), 'Ictsicarta')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/div_Test ( -testuiowa.edu)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_ (3)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a (3)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button__1 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_1 (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/label_Phone (1)'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_project_roleidentity_att (2)'), '555-555-5555')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button__2 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_2 (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button__3 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_3 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button__4 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a (3)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_project_roleproject_righ (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Save (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Add a Document (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-primary notes ad (2)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button__5'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_4 (1)'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_Close_Document'))

WebUI.closeBrowser()

