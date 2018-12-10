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

WebUI.openBrowser(GlobalVariable.url_fulfillment)

CustomKeywords.'newpackage.newkeyword.loadTextFile'('H:\\katalon.txt')

WebUI.setText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_username'), GlobalVariable.username_admin)

WebUI.setMaskedText(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input_j_password'), GlobalVariable.password_admin)

WebUI.click(findTestObject('I-CART/Page_University of Iowa HawkID Logi/input__eventId_proceed'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_form-control'), '232')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_Katalon Test Study'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_add_arm_button'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), 'Test Arm')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '2')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armvisit_count'), '2')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Please Select Services'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Per-Patient Testing'))

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_edit_arm_button'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/label_Arm Name'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), '')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_Arm Name cant be blankSubj'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_edit_arm_button'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Screening Phase'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Test Arm'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armname'), 'Test Arm (Edited)')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_armsubject_count'), '5')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary'))

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

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Participant Tracker'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Create New Participant'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_Last name cant be blankFir'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantlast_name'), 'Participant')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantfirst_name'), 'Patricia')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantmiddle_initia'), 'P')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantmrn'), '0123456789')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantexternal_id'), '9876543210')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Consented'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/dob_picker'))

WebUI.sendKeys(findTestObject(null), 'ENTER')

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_2018'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Feb'))

not_run: WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Female'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Not Hispanic or Latino'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_UnknownOtherUnreported'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantaddress'), '612 Wharf Ave')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantcity'), 'Iowa City')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Iowa'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantzipcode'), '52246')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_participantphone'), '563-867-5309')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_TV Ad Campaign'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/i_glyphicon glyphicon-sunglass'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/i_glyphicon glyphicon-random'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Nothing selected (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Test Arm (Edited) (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Consented (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Completed'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_participant_172_notes'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Note'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/textarea_notecomment'), 'test note')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Non-clinical Services'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_List'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Fulfillment'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1 (1)'))

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_fulfillmentquantity'), '1')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Ashlee Wilson'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_ICTSICartA Test'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close_1 (1)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Non-clinical Servic'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Nothing selected'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_Non Per-Patient Testing'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/label_Quantity'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemquantity_reques'), '1')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/td_1 (1) - Copy'))

WebUI.sendKeys(findTestObject(null), 'ENTER')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemaccount_number'), '0123456789')

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/input_line_itemcontact_name'), 'Testy Testington')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Notes'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Add Note'))

WebUI.setText(findTestObject('I-CART/Page_Work Fulfillment/textarea_notecomment'), 'test note')

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Documents'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Upload Document'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/input_btn btn-primary (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/div_You must choose a file'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Close (2)'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/span_glyphicon glyphicon-trian - Copy'))

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/button_Delete Activity'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('I-CART/Page_Work Fulfillment/a_Reports'))

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

