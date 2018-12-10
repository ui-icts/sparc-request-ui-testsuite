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


RunConfiguration.setExecutionSettingFile('C:\\Users\\eneuhaus\\AppData\\Local\\Temp\\Katalon\\Test Cases\\I-CART\\7 - Fulfillment (Admin)\\20181116_110523\\execution.properties')

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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser(GlobalVariable.url_fulfillment)

not_run: CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\\\katalon.txt')

not_run: WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username_admin)

not_run: WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password_admin)

not_run: WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_form-control'), '232')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_Katalon Test Study'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_add_arm_button'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), 'Test Arm')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '2')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armvisit_count'), '2')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Please Select Services'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Per-Patient Testing'))

not_run: WebUI.sendKeys(findTestObject(null), 'ENTER')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_edit_arm_button'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/label_Arm Name'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), '')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_Arm Name cant be blankSubj'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_edit_arm_button'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Screening Phase'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Test Arm'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), 'Test Arm (Edited)')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '5')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_add_visit_group_button'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Screening Phase'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Test Arm (Edited)'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupname'), 'Added Visit')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupday'), '3')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Add as last'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupwindow_before'), '3')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupwindow_after'), '3')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_edit_visit_group_button'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupname'), '')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_visit_groupday'), 'abcd')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_Visit Name cant be blankVi'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close_1'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Participant Tracker'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Create New Participant'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_Last name cant be blankFir'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantlast_name'), 'Participant')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantfirst_name'), 'Patricia')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantmiddle_initia'), 'P')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantmrn'), '0123456789')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantexternal_id'), '9876543210')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Consented'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/dob_picker'))

not_run: WebUI.sendKeys(findTestObject(null), 'ENTER')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_2018'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Feb'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Female'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Not Hispanic or Latino'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_UnknownOtherUnreported'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantaddress'), '612 Wharf Ave')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantcity'), 'Iowa City')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Iowa'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantzipcode'), '52246')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantphone'), '563-867-5309')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_TV Ad Campaign'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/i_glyphicon glyphicon-sunglass'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/i_glyphicon glyphicon-random'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Test Arm (Edited) (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Consented (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Completed'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_participant_172_notes'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Note'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/textarea_notecomment'), 'test note')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Non-clinical Services'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_List'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Fulfillment'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1 (1)'))

not_run: WebUI.sendKeys(findTestObject(null), 'ENTER')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_fulfillmentquantity'), '1')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Ashlee Wilson'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_ICTSICartA Test'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close_1 (1)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Non-clinical Servic'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Nothing selected'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Non Per-Patient Testing'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/label_Quantity'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemquantity_reques'), '1')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1 (1) - Copy'))

not_run: WebUI.sendKeys(findTestObject(null), 'ENTER')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemaccount_number'), '0123456789')

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemcontact_name'), 'Testy Testington')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Notes'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Note'))

not_run: WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/textarea_notecomment'), 'test note')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Documents'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Upload Document'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_You must choose a file'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian - Copy'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Delete Activity'))

not_run: WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Reports'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-equal'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-file'))

WebUI.waitForElementPresent(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-file'), 0)

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Clinical Services'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_remove_arm_button'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Screening Phase (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Test Arm (Edited) (1) - Copy'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_remove_arm_form_button'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

''', 'Test Cases/I-CART/7 - Fulfillment (Admin)', new TestCaseBinding('Test Cases/I-CART/7 - Fulfillment (Admin)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
