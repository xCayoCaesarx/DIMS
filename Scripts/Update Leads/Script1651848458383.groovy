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

WebUI.setText(findTestObject('Object Repository/Create Lead/input_Username_form-control w-75 ng-untouch_2a886e'), username)

WebUI.setText(findTestObject('Object Repository/Create Lead/input_Password_form-control w-75 ng-untouch_173c6b'), pass)

WebUI.click(findTestObject('Object Repository/Create Lead/button_Login'))

WebUI.click(findTestObject('Distribute Leads/strong_Lead Maintenance'))

WebUI.click(findTestObject('Bulk Reassign/span_Bulk Reassign'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_From'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_1'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_To_form'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_31'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_30'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_29'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_28'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Bulk Reassign/div_Select a Status(es)'))

WebUI.click(findTestObject('Bulk Reassign/span_Attempting contact'))

WebUI.click(findTestObject('Bulk Reassign/div_Select a Source(s)'))

WebUI.click(findTestObject('Bulk Reassign/span_Mailer'))

WebUI.click(findTestObject('Bulk Reassign/div_Select a Program(s)'))

WebUI.click(findTestObject('Bulk Reassign/span_HFG NONE'))

WebUI.selectOptionByValue(findTestObject('Bulk Reassign/select_Select from user'), '1008', false)

WebUI.selectOptionByValue(findTestObject('Bulk Reassign/select_Select  to user'), '1001', false)

WebUI.click(findTestObject('Bulk Reassign/Page_Debt IMS/div_primero'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Bulk Reassign/Page_Debt IMS/button_Reassign'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_From'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_1'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_To_form'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_31'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_30'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_29'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_28'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Bulk Reassign/div_Select a Status(es)'))

WebUI.click(findTestObject('Bulk Reassign/span_Attempting contact'))

WebUI.click(findTestObject('Bulk Reassign/div_Select a Source(s)'))

WebUI.click(findTestObject('Bulk Reassign/span_Mailer'))

WebUI.click(findTestObject('Bulk Reassign/div_Select a Program(s)'))

WebUI.click(findTestObject('Bulk Reassign/span_HFG NONE'))

WebUI.selectOptionByValue(findTestObject('Bulk Reassign/select_Select from user'), '1001', false)

WebUI.selectOptionByValue(findTestObject('Bulk Reassign/select_Select  to user'), '1008', false)

WebUI.click(findTestObject('Bulk Reassign/Clean label_Yes'))

WebUI.click(findTestObject('Bulk Reassign/Page_Debt IMS/div_primero'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Bulk Reassign/Page_Debt IMS/button_Reassign'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

