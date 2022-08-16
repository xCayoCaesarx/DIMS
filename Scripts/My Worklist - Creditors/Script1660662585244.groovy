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

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/strong_My Tools'))

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/span_My Worklist'))

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter'), 'test mailer')

WebUI.click(findTestObject('Myworklist(lead status)/search ojito add note/button_FILE_editButton'))

WebUI.click(findTestObject('Myworklist(lead status)/Creditors/a_Creditors'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Myworklist(lead status)/Creditors/button_Creditors_addButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/input_Account Number_'), accountnumber)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/input_Creditor Name_'), creditorname)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_Address'), address)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_City_form'), city)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/select_Select oneUS'), '2: 2', 
    false)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_Zip_form'), zip)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/select_Select oneApplicantCoApplicant'), 
    'Coapplicant', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_Balance_'), balance)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_Monthly'), monthly)

WebUI.setText(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/input_Credit Limit'), creditlimit)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/select_Select oneYesNo'), 'true', 
    false)

WebUI.click(findTestObject('Myworklist(lead status)/Creditors/Page_Debt IMS/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

