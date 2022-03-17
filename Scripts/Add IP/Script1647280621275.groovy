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

WebUI.setText(findTestObject('Object Repository/Add IP objects/input_Username_form-control w-75 ng-untouch_2a886e'), username)

WebUI.setText(findTestObject('Object Repository/Add IP objects/input_Password_form-control w-75 ng-untouch_173c6b'), pass)

WebUI.click(findTestObject('Object Repository/Add IP objects/button_Login'))

WebUI.click(findTestObject('Object Repository/Add IP objects/strong_Office Tools'))

WebUI.click(findTestObject('Object Repository/Add IP objects/span_IP Restrictions'))

WebUI.click(findTestObject('Add IP objects/add ip - button'))

WebUI.selectOptionByValue(findTestObject('Edit Ip Office/input_IP Restrictions_p-inputtext p-compone_ad6e79'), '9', true)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add IP objects/input_IP Address_form-control shadow-none n_fc27df'), ip)

WebUI.setText(findTestObject('Add IP objects/input_Description_form-control shadow-none ng-untouched ng-pristine ng-invalid'), 
    ipname)

WebUI.click(findTestObject('Add IP objects/save IP - Button'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

