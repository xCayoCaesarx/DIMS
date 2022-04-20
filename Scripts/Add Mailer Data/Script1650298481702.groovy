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

WebUI.click(findTestObject('Object Repository/Create Lead/strong_My Tools'))

WebUI.click(findTestObject('Object Repository/Create Lead/span_New Lead'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Lead/select_Select OneAdvertising-Stop My Payday_d308cb'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Lead/select_Select OneHFG 2020HFG NONEHFG PAYDAY_f27ab0'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Create Lead/status select'), '12', true)

WebUI.setText(findTestObject('Create Lead/input_First Name'), firstname)

WebUI.setText(findTestObject('Create Lead/input_Last Name'), lastname)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Lead/select_Select OneUS Armed Forces EuropeAlas_fd93bc'), 
    '2: 2', true)

WebUI.setText(findTestObject('Create Lead/input_Zip'), zip)

WebUI.selectOptionByValue(findTestObject('debt ims R/Page_Debt IMS/select_Select OneUNITED STATES OF AMERICA'), '62', true)

WebUI.setText(findTestObject('Object Repository/Create Lead/input_Home Phone_form-control shadow-none n_1c6889'), homephone)

WebUI.setText(findTestObject('Create Lead/input_Email_form-control shadow-none ng-untouched ng-pristine ng-invalid'), email)

WebUI.setText(findTestObject('Create Lead/input_Mailer Code'), maildercode)

WebUI.scrollToElement(findTestObject('Object Repository/Create Lead/button_Welcome, Julio Uzctegui_saveButton'), 0)

WebUI.click(findTestObject('Object Repository/Create Lead/button_Welcome, Julio Uzctegui_saveButton'))

