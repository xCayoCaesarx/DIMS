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

WebUI.click(findTestObject('Bulk Update/span_Bulk Update'))

WebUI.click(findTestObject('Bulk Update/Page_Debt IMS/div_Select an Office(s)'))

WebUI.click(findTestObject('Bulk Update/span_Debt - Ims'))

WebUI.click(findTestObject('Bulk Update/Page_Debt IMS/div_Select a User(s)'))

WebUI.click(findTestObject('Bulk Update/span_Julio Uzctegui'))

WebUI.selectOptionByValue(findTestObject('Bulk Update/select_type'), '1', false)

WebUI.selectOptionByValue(findTestObject('Bulk Update/select_from source'), '12', false)

WebUI.selectOptionByValue(findTestObject('Bulk Update/select_to source'), '19', false)

WebUI.click(findTestObject('Bulk Update/div_Leadsource_p-checkbox-box p-component'))

WebUI.click(findTestObject('Bulk Update/button_Update Leads'))

