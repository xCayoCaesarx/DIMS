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

WebUI.setText(findTestObject('Object Repository/Quick notes/Page_Debt IMS/input_Username_form-control w-75 ng-untouch_2a886e'), 
    username)

WebUI.setText(findTestObject('Object Repository/Quick notes/Page_Debt IMS/input_Password_form-control w-75 ng-untouch_173c6b'), 
    pass)

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/strong_Maintenance Tools'))

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/span_Quick Notes'))

WebUI.setText(findTestObject('Quick notes/Page_Debt IMS/input_Quick Notes search'), 'nota')

WebUI.click(findTestObject('Quick notes/Page_Debt IMS/button_Office_editButton editar'))

WebUI.setText(findTestObject('Quick notes/Page_Debt IMS/input_Quick Note name'), note)

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/div_Debt - Ims'))

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/span_Consumer Capital Advocates LLC'))

WebUI.click(findTestObject('Object Repository/Quick notes/Page_Debt IMS/button_Welcome, Julio Uzctegui_saveButton'))

WebUI.click(findTestObject('edit actions/button_Accept'))

