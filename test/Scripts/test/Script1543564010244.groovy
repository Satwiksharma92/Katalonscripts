import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://accounts.google.com/signin')

WebUI.navigateToUrl('https://accounts.google.com/signin')

WebUI.setText(findTestObject('Page_Sign in  Google accounts/input_Use your Google Account_'), username)

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/test/Page_Sign in  Google accounts/span_Next'))

WebUI.setEncryptedText(findTestObject('Page_Sign in  Google accounts/input_Too many failed attempts'), password)

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/test/Page_Sign in  Google accounts/span_Next1'))

WebUI.click(findTestObject('Page_Google Account/svg_Account_gb_pe'))

WebUI.click(findTestObject('Page_Google Account/span_News_gb_W'))

WebUI.click(findTestObject('Page_Inbox - saminenihavinashgmail./span_Search_gb_ab gbii'))

WebUI.click(findTestObject('Page_Inbox - saminenihavinashgmail./a_Sign out'))

WebUI.closeBrowser()
