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

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_HelpFAQs'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_May I submit a request for s'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_May I select and add service'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_How many Authorized Users ca'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_What is the difference  betw'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_How is SPARC Request calcula'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Im stuck Who can I contact f'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Close_Help'))

'doesn\'t work on rsmt-test'
not_run: WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Feedback'))

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/a_Contact Us'))

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/input_contact_formsubject'), 'subject')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/input_contact_formemail'), 'email')

WebUI.setText(findTestObject('I-CART/Page_SPARCRequest/textarea_contact_formmessage'), 'message content')

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/input_btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('I-CART/Page_SPARCRequest/p_Email is invalid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('I-CART/Page_SPARCRequest/button_Close_Contact'))

WebUI.closeBrowser()

