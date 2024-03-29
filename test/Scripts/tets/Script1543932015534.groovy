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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/test/Page_My Store/a_Sign in'))

WebUI.click(findTestObject('Object Repository/test/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/test/Page_Login - My Store/li_Invalid email address.'))

WebUI.verifyElementText(findTestObject('Page_Login - My Store/li_Invalid email address.'), 'Invalid email address.')

WebUI.doubleClick(findTestObject('Object Repository/test/Page_Login - My Store/li_Invalid email address.'))

WebUI.verifyElementText(findTestObject('Page_Login - My Store/li_Invalid email address.'), 'Invalid email address.')

