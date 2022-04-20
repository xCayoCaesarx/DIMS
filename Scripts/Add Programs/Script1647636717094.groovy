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

WebUI.setText(findTestObject('Object Repository/Programs/input_Username_form-control w-75 ng-untouch_2a886e'), username)

WebUI.setText(findTestObject('Object Repository/Programs/input_Password_form-control w-75 ng-untouch_173c6b'), pass)

WebUI.click(findTestObject('Object Repository/Programs/button_Login'))

WebUI.click(findTestObject('Object Repository/Programs/strong_Maintenance Tools'))

WebUI.click(findTestObject('Object Repository/Programs/span_Programs'))

WebUI.click(findTestObject('Object Repository/Programs/button_Welcome, Julio Uzctegui_addButton'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Program_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    programname)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Programs/div_Select an Office(s)'))

WebUI.click(findTestObject('Object Repository/Programs/div_Debt - Ims_p-checkbox-box'))

WebUI.click(findTestObject('Object Repository/Programs/div_Select a Pay Frequencie(s)'))

WebUI.click(findTestObject('Object Repository/Programs/div_Semi  Monthly_p-checkbox-box'))

not_run: WebUI.doubleClick(findTestObject('Programs/Page_Debt IMS/input_Minimum Debt Accepted'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Minimum Debt Accepted'), minimumdebt)

not_run: WebUI.doubleClick(findTestObject('Programs/Page_Debt IMS/input_Minimum Creditor Balance'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Minimum Creditor Balance'), minimumCreditor)

not_run: WebUI.doubleClick(findTestObject('Programs/Page_Debt IMS/input_Program Minimum Payment_for'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Program Minimum Payment_for'), programminimum)

WebUI.setText(findTestObject('Object Repository/Programs/input_Email_form-control shadow-none ng-unt_36dc17'), email)

not_run: WebUI.doubleClick(findTestObject('Programs/Page_Debt IMS/input_Debt amount From_'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Debt amount From_'), debtamountfrom)

not_run: WebUI.doubleClick(findTestObject('Programs/Page_Debt IMS/input_Debt amount To_'))

WebUI.setText(findTestObject('Programs/Page_Debt IMS/input_Debt amount To_'), debtamountto)

WebUI.selectOptionByValue(findTestObject('Object Repository/Programs/select_Select One12345678910111213141516171_b2f31c'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/Programs/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Programs/div_Select a Unacceptable debt(s)'))

WebUI.click(findTestObject('Object Repository/Programs/div_Only medical_p-checkbox-box'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Programs/select_Select OneYesNo'), 'false', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Programs/select_Select OneYesNo_1'), 'false', true)

WebUI.selectOptionByValue(findTestObject('Programs/Page_Debt IMS/select_Legal Plan'), 'false', true)

WebUI.selectOptionByValue(findTestObject('Programs/Page_Debt IMS/select_Monthly Legal'), 'false', true)

WebUI.selectOptionByValue(findTestObject('Programs/Page_Debt IMS/select_Monthly Bank'), 'false', true)

WebUI.selectOptionByValue(findTestObject('Programs/Page_Debt IMS/select_Credit Analyzer'), 'false', true)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Create Lead/button_Welcome, Julio Uzctegui_saveButton'), 0)

WebUI.click(findTestObject('Object Repository/Programs/button_Welcome, Julio Uzctegui_saveButton'))

