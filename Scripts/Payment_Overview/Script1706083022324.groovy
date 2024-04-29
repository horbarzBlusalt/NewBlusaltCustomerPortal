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

WebUI.navigateToUrl('https://app.blusalt.net/')

WebUI.setText(findTestObject('Page_BluSalt/input_Email_email'), 'kehindeo@blusalt.net')

WebUI.setEncryptedText(findTestObject('Page_BluSalt/input_Password_password'), 'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Page_BluSalt/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_Payments'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_Overview'))

WebUI.click(findTestObject('Page_BluSalt/path'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/p_9013191351'), '9013191351')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Request Fund'))

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_Amount_amount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/p_Payment Link Created Successfully'), 'Payment Link Created Successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/p_Payment Link Created Successfully'), 0)

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Fund Wallet'))

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_Amount_amount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/h1_9011340763'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_BluSalt/button_I have completed payment'), 'I have completed payment')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/svg (1)'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Withdraw Funds'))

WebUI.setText(findTestObject('Object Repository/Page_BluSalt/input_Amount_amount'), '1000')

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_Proceed'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/span_Otp Sent Successfully'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/p_Enter OTP'), 0)

WebUI.click(findTestObject('Page_BluSalt/path_1'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_View'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_BluSalt/div_Wallets'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/button_View'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/div_Reserved Accounts'), 0)

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_See All Customers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/div_Customers'), 0)

WebUI.click(findTestObject('Object Repository/Page_BluSalt/div_Overview'))

WebUI.click(findTestObject('Object Repository/Page_BluSalt/a_See All Transactions'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BluSalt/div_Transactions'), 0)

WebUI.closeBrowser()

