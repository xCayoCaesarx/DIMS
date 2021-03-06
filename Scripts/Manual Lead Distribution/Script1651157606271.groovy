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

WebUI.click(findTestObject('Distribute Leads/span_Distribute Leads'))

WebUI.click(findTestObject('Distribute Leads/input_Lead date from'))

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_1'))

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/input_To_form'))

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_31'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_30'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_29'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_28'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Distribute Leads/div_Select a Source(s)'))

WebUI.click(findTestObject('Distribute Leads/span_Mailer'))

WebUI.click(findTestObject('Distribute Leads/div_Select a User(s)'))

WebUI.click(findTestObject('Distribute Leads/span_Taiana Rondon'))

WebUI.click(findTestObject('Distribute Leads/span_Anifer Da Rocha'))

WebUI.selectOptionByValue(findTestObject('Distribute Leads/select_number'), '2', false)

WebUI.click(findTestObject('Distribute Leads/div_Total Leads_p-checkbox-box'))

WebUI.click(findTestObject('Distribute Leads/button_Distribute'))

WebUI.scrollToElement(findTestObject('Distribute Leads/Page_Debt IMS/h4_Distribution Details'), 0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Distribute Leads/input_Lead date from'))

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_1'))

WebUI.click(findTestObject('Myworklist(lead status)/Page_Debt IMS/input_To_form'))

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_31'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_30'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_29'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('debt ims R/Page_Debt IMS/span_28'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Distribute Leads/div_Select a Source(s)'))

WebUI.click(findTestObject('Distribute Leads/span_Mailer'))

WebUI.click(findTestObject('Distribute Leads/div_Select mailer'))

WebUI.click(findTestObject('Distribute Leads/div_Select a User(s)'))

WebUI.click(findTestObject('Distribute Leads/span_Taiana Rondon'))

WebUI.click(findTestObject('Distribute Leads/span_Anifer Da Rocha'))

WebUI.click(findTestObject('Distribute Leads/div_Total Leads_p-checkbox-box'))

WebUI.click(findTestObject('Distribute Leads/button_Distribute'))

WebUI.scrollToElement(findTestObject('Distribute Leads/Page_Debt IMS/h4_Distribution Details'), 0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

