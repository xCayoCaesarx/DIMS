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

WebUI.setText(findTestObject('Object Repository/debt ims R/Page_Debt IMS/input_Username_form-control w-75 ng-untouch_2a886e'), 
    username)

WebUI.setText(findTestObject('Object Repository/debt ims R/Page_Debt IMS/input_Password_form-control w-75 ng-untouch_173c6b'), 
    pass)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/button_Login'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/strong_Office Tools'))

WebUI.click(findTestObject('Object Repository/debt ims R/Page_Debt IMS/span_Office'))

WebUI.setText(findTestObject('edit actions/write office'), 'Oficina CGTS')

WebUI.delay(2)

WebUI.click(findTestObject('edit actions/editButton'))

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Office Name_form-control shadow-none ng-pristine ng-invalid ng-touched'), 
    officename)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Office Alias_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    officealias)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Address_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    addres)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneUNITED STATES OF AMERICA'), 
    '1: Object', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneUS Armed Forces EuropeAlas_fd93bc'), 
    '8: Object', true)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Zip_form-control shadow-none ng-untouched ng-pristine ng-valid'), 
    zip)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_City_form-control shadow-none ng-pristine ng-valid ng-touched'), 
    city)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneDebt - Ims'), '1: Object', 
    true)

WebUI.setText(findTestObject('Object Repository/debt ims R/Page_Debt IMS/input_Phone Number_form-control shadow-none_f75f0d'), 
    phone)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Fax Number_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    fax)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Web Site_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    web)

WebUI.setText(findTestObject('debt ims R/Page_Debt IMS/input_Landing URL prefix_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    landing)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select Time ZoneEastern Standard Cen_41b770'), 
    'Eastern Standard', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneCommunityRejectedUnassigned'), 
    'Unassigned', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneYesNo'), 'true', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneTest'), ' ', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/debt ims R/Page_Debt IMS/select_Select OneMeridian'), 'Meridian', 
    true)

WebUI.scrollToElement(findTestObject('Object Repository/Create Lead/button_Welcome, Julio Uzctegui_saveButton'), 0)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/button_Welcome, Julio Uzctegui_saveButton'))

WebUI.delay(2)

WebUI.click(findTestObject('edit actions/Page_Debt/button_Accept'))

WebUI.closeBrowser()

