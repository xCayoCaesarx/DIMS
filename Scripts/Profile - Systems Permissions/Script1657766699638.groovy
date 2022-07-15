import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://35.237.24.127:8081/dims-app/#/home')

WebUI.setText(findTestObject('Object Repository/Create Lead/Page_Debt IMS/input_Username_form-control w-75 ng-untouch_2a886e'), 
    username)

WebUI.setText(findTestObject('Object Repository/Create Lead/Page_Debt IMS/input_Password_form-control w-75 ng-untouch_173c6b'), 
    pass)

WebUI.click(findTestObject('Object Repository/Profiles/Page_Debt IMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Profiles/Page_Debt IMS/strong_Security'))

WebUI.click(findTestObject('Object Repository/Profiles/Page_Debt IMS/span_Profiles'))

WebUI.setText(findTestObject('Profiles/edit - delete profiles/edit - delete profiles/input_Profiles to search'), namemodify)

WebUI.click(findTestObject('Profiles/Permissions assign/button_Assign'))

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_leads'), 'Yes', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Reasign Leads'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Reject Leads'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Calculate Payments'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Send Docs'), 'Yes', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Pull Credit'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Change Leads Source'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_assign mailer'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Delete Documents'), 'No', 
    false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/Permissions assign/select_Delete Notes'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_File Exceptions'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Mask Social Security'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Community Access'), 'Read', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Email To Me'), 'Enabled', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Email Office'), 'Enabled', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_CoApplicant Check'), 'Read', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_change notes'), 'Yes', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Edit Client Status'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Change Sales Rep'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Change Account Manager Rep'), 'No', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Change Negotiator'), 'Yes', false)

WebUI.selectOptionByValue(findTestObject('Profiles/Permissions assign/select_Export'), 'Yes', false)

WebUI.click(findTestObject('Profiles/Permissions assign/Permissions assign/button_Save'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

