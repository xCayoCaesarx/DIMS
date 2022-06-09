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

WebUI.setText(findTestObject('Object Repository/Myworklist(lead status)/search ojito add note/input_Filter'), '56793')

WebUI.click(findTestObject('Myworklist(lead status)/search ojito add note/button_FILE_editButton'))

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/a_CoApplicant'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_First Name'), 'nombreeee')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Middle Initial'), 'mediooo')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Last Name'), 'apellidoooo')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Address'), 'direccionnnnnnnnn')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Address 2'), 'direccion 2222')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_City'), 'ciudaddddd')

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/select_State'), '3: 3', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Address'), 'direccion previaaaa')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Address 2'), 'direccion previaaaa 222222')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous City'), 'ciudad previaaa')

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/select_previous state'), 
    '2: 2', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Zip'), '3090')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Phone'), '151515')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Cell'), '161616')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Work'), '171717')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Ext'), '161616')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Fax'), '171717')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Email'), 'jtegui@ggmail.com')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input__email2'), 'jtegui@ggmail2222.com')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Driver License'), 'lencia test 12')

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/select_driver state'), 
    '1: 1', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Social Security'), '111111111')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Mothers Maiden Name'), 'maria test')

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Self Employed_check'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Occupation'), 'analista')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Employer'), 'ca sal')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Length of employment'), 'length of emplyment')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Gross Annual Income'), '1000000')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Employer'), 'another company')

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Payment_'), '10000')

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/button_History_saveButton'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

