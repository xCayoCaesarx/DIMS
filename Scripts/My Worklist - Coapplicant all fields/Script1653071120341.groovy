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

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/a_CoApplicant'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_First Name'), name)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Middle Initial'), middlename)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Last Name'), lastname)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Address'), address)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Address 2'), address2)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_City'), city)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/select_State'), '3: 3', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_zip'), zip)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Address'), paddress)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Address 2'), paddress2)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous City'), pcity)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/select_previous state'), 
    '2: 2', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Zip'), pzip)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Phone'), phone)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Cell'), cell)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Work'), work)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Ext'), ext)

WebUI.setText(findTestObject('Create Lead/input_Fax'), fax)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Email'), email)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input__email2'), email2)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Driver License'), license)

WebUI.selectOptionByValue(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/select_driver state'), 
    '1: 1', false)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Social Security'), socialsecurity)

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/Page_Debt IMS/input_DOB (ex. 06211970)_form-control shadow-none ng-pristine ng-valid flatpickr-input ng-touched active'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/Page_Debt IMS/span_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Mothers Maiden Name'), mothername)

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Self Employed_check'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Occupation'), occupation)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Employer'), employer)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Length of employment'), lengthofemploy)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Gross Annual Income'), annualincome)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/All fields coapplicant/input_Previous Employer'), pemploy)

WebUI.setText(findTestObject('Myworklist(lead status)/Coapplicant/input_Payment_'), payment)

WebUI.click(findTestObject('Myworklist(lead status)/Coapplicant/button_History_saveButton'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

