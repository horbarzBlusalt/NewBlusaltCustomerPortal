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

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_Verifications'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_Services'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify BVN'))

WebUI.verifyElementPresent(findTestObject('Page_BluSalt/small_BVN is required'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BluSalt/small_Application is required'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BluSalt/small_API Version is required'), 0)

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_BVN_bvn_number'), '22372706112')

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input__phone_number'), '0817 588 5645')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/input_Select an Application to be billed fo_aa6ee2'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_coreapp'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_Select API Version'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/li_V2'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/input_Currency_currency'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_NGN'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify BVN'))

WebUI.verifyElementPresent(findTestObject('Page_BluSalt/span_An Unexpected Error Occured'), 0)

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_BVN_bvn_number'), '22372706052')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify BVN'))

