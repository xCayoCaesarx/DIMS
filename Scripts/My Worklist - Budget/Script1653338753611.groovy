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

WebUI.setText(findTestObject('Object Repository/Create Lead/input_Username_form-control w-75 ng-untouch_2a886e'), 'SUPER_USER7')

WebUI.setText(findTestObject('Object Repository/Create Lead/input_Password_form-control w-75 ng-untouch_173c6b'), 'Abcd1234**')

WebUI.click(findTestObject('Object Repository/Create Lead/button_Login'))

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/strong_My Tools'))

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/span_My Worklist'))

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter'), 'test dg')

WebUI.click(findTestObject('Myworklist(lead status)/search ojito add note/button_FILE_editButton'))

WebUI.click(findTestObject('Myworklist(lead status)/Budget/a_Budget'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Housing Payment_2-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Secondary Housing Payment_4-1'), '500')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Auto Payments_5-1'), '150')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Auto Insurance (monthly)_6-1'), '1500')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Auto Other_7-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Gasoline (monthly)_8-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_HealthLife Insurance_9-1'), '1500')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Average GasElectricOil_10-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Average Phone Bill (including cell)_11-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Average WaterSewerGarbage_12-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_CableSatellite Bill_13-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Personal Care_15-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Medical Care_16-1'), '500')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Groceries(monthly)_18-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Education_20-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Clothing_25-1'), '2000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Laundry_26-1'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Pet Care_29-1'), '1000')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_Detailed Hardship Reason'), '100')

WebUI.setText(findTestObject('Myworklist(lead status)/Budget/input_income applicant'), '1000000')

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Budget/select_loss of job'), 'false', false)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Budget/select_delinquent'), 'false', false)

WebUI.click(findTestObject('Myworklist(lead status)/Budget/button_History_saveButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

