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

WebUI.click(findTestObject('Search Mailder Data/span_Mailer Data'))

WebUI.setText(findTestObject('Search Mailder Data/input_Phone_form-'), homephone)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Reset'))

WebUI.setText(findTestObject('Search Mailder Data/input_First Name_form'), firstname)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Reset'))

WebUI.setText(findTestObject('Search Mailder Data/input_Last Name_form'), lastname)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Reset'))

WebUI.setText(findTestObject('Search Mailder Data/input_Zip_form'), zip)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Reset'))

WebUI.setText(findTestObject('Search Mailder Data/input_Custom Code_form'), maildercode)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Reset'))

WebUI.setText(findTestObject('Search Mailder Data/input_Phone_form-'), homephone)

WebUI.setText(findTestObject('Search Mailder Data/input_First Name_form'), firstname)

WebUI.setText(findTestObject('Search Mailder Data/input_Last Name_form'), lastname)

WebUI.setText(findTestObject('Search Mailder Data/input_Zip_form'), zip)

WebUI.setText(findTestObject('Search Mailder Data/input_Custom Code_form'), maildercode)

WebUI.click(findTestObject('Search Mailder Data/button_Search'))

WebUI.click(findTestObject('Search Mailder Data/button_Assign'))

WebUI.click(findTestObject('Search Mailder Data/button_Accept'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

