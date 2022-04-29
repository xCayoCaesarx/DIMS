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

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_From'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_1'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/input_To_form'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_31'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_30'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_29'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_28'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Filter'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Reset'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select a Status(es)'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/lead status select span_Attempting contact'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select a Status(es)'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Filter'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Reset'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select Lead Source'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/lead source  select span_Mailer'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select Lead Source'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Filter'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Reset'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select Queue'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/lead queue span_MAIN'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/div_Select Queue'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Filter'))

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter'), statuses)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter_2nd'), state)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter_2nd'), source)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter_2nd'), zip)

WebUI.click(findTestObject('Myworklist(lead status)/search ojito add note/button_FILE_editButton'))

WebUI.scrollToElement(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/button_Save Note'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/Page_Debt IMS/select_Select OneCalle  textedHOT LEADLEFT _fb051f'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/button_Save Note'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/button_Back'))

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter'), zip)

WebUI.scrollToPosition(150, 100, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/button_ojito'))

WebUI.takeFullPageScreenshot()

