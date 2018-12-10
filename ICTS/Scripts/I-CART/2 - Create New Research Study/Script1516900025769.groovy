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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Login  Sign Up'))

CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\katalon.txt')

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Dashboard'))

WebUI.switchToWindowUrl(GlobalVariable.url + '/dashboard')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_New Protocol'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_New Study'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-lg btn-success'))

not_run: WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/div_alert alert-danger'), 'Primary PI can\'t be blank\r\nProject roles identity can\'t be blank\r\nSponsor name can\'t be blank\r\nShort title can\'t be blank\r\nTitle can\'t be blank\r\nFunding status can\'t be blank')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_protocolproject_roles_at'), 'Ictsicarta Test')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/strong_Ictsicarta Test'))

not_run: WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/label_Ictsicarta Test (ictsica'), 'Ictsicarta Test (ictsicarta-test@uiowa.edu)')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_protocolshort_title'), 'Test Study')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_protocoltitle'), 'Test Study')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_protocolsponsor_name'), 'Test Testington')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-lg btn-success'))

not_run: WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/div_alert alert-danger'), 'Project roles identity can\'t be blank\nFunding status can\'t be blank')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/button_'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Funded'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-lg btn-success'))

not_run: WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/div_alert alert-danger'), 'Project roles identity can\'t be blank\nFunding source You must select a funding source')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_Select a Funding Source'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/span_College Department'))

not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/input_btn btn-lg btn-success'))

not_run: WebUI.verifyElementText(findTestObject('I-CART/Page_SPARCRequest Dashboard/div_alert alert-danger'), 'Project roles identity can\'t be blank')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest Dashboard/a_Cancel'))

WebUI.closeBrowser()

