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

WebUI.setText(findTestObject('Object Repository/Email Templates/Page_Debt IMS/input_Username_form-control w-75 ng-untouch_2a886e'), 
    username)

WebUI.setText(findTestObject('Object Repository/Email Templates/Page_Debt IMS/input_Password_form-control w-75 ng-untouch_173c6b'), 
    pass)

WebUI.click(findTestObject('Object Repository/Email Templates/Page_Debt IMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Email Templates/Page_Debt IMS/strong_Maintenance Tools'))

WebUI.click(findTestObject('Email Campaings/add/span_Email Campaigns'))

WebUI.click(findTestObject('Email Campaings/add/button_Welcome, Julio Uzctegui_addButton'))

WebUI.selectOptionByValue(findTestObject('Email Campaings/add/select_Select OneDebt - ImsConsumer'), '1', true)

WebUI.selectOptionByValue(findTestObject('Email Campaings/add/select_Select status'), '1', true)

WebUI.selectOptionByValue(findTestObject('Email Campaings/add/select_Select OneNew LeadEmail'), '1', true)

WebUI.selectOptionByValue(findTestObject('Email Campaings/add/select_Select OneEmailTestCzxcz'), '1', true)

WebUI.setText(findTestObject('Email Campaings/add/input_Campaign Name_'), name)

WebUI.setText(findTestObject('Email Campaings/add/input_Send From Email'), fromemail)

WebUI.setText(findTestObject('Email Campaings/add/input_Send To Email'), toemail)

WebUI.click(findTestObject('Email Campaings/add/input_Campaign Date_'))

WebUI.click(findTestObject('Email Campaings/add/span_'))

WebUI.click(findTestObject('Email Campaings/add/span_5'))

WebUI.scrollToElement(findTestObject('Email Campaings/Edit/button_Welcome, Julio Uzctegui_saveButton'), 0)

WebUI.click(findTestObject('Email Campaings/Edit/button_Welcome, Julio Uzctegui_saveButton'))

WebUI.delay(4)

WebUI.closeBrowser()

