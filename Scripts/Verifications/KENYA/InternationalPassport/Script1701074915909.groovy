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

WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_BluSalt/div_Verifications'))

WebUI.click(findTestObject('Page_BluSalt/div_Services'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/span_'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/span_IDENTITY (KENYA)'))

WebUI.click(findTestObject('Page_BluSalt/li_International Passport'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify KIP'))

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_Passport Number_identity_number'), 'BX1002911')

WebUI.click(findTestObject('Page_BluSalt/input_Select an Application to be billed fo_aa6ee2'))

WebUI.click(findTestObject('Page_BluSalt/div_coreapp'))

WebUI.click(findTestObject('Page_BluSalt/input_Currency_currency'))

WebUI.click(findTestObject('Page_BluSalt/div_NGN'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify KIP'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/span_Invalid Passport Id'), 'Invalid Passport Id')

WebUI.doubleClick(findTestObject('Object Repository/Page_BluSalt/input_Passport Number_identity_number'))

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_Passport Number_identity_number'), 'A1608500')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Verify KIP'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/span_Verification Successful'), 'Verification Successful')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/p_JOSEPH MUTHUKUI NGUI'), 'JOSEPH MUTHUKUI NGUI')

WebUI.closeBrowser()

