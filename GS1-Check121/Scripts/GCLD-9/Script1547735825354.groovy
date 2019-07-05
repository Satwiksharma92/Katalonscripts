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

WebUI.navigateToUrl('https://gs1-sso-customsts.azurewebsites.net/Account/LoginSelector')

WebUI.setText(findTestObject('Object Repository/GCLD-9/Page_Sign in - GS1 STS Server/input_E-mail_Email'), 'GS1CloudTest@gs1.org')

WebUI.setEncryptedText(findTestObject('Object Repository/GCLD-9/Page_Sign in - GS1 STS Server/input_Password_Password'), 
    '9q2BB59Iqtb8EiGv0aZ+BQ==')

WebUI.click(findTestObject('Object Repository/GCLD-9/Page_Sign in - GS1 STS Server/input_Password_btn btn-default'))

WebUI.click(findTestObject('Object Repository/GCLD-9/Page_GS1 Cloud BETA - Home/a_Services'))

WebUI.click(findTestObject('Object Repository/GCLD-9/Page_GS1 Cloud BETA - Services/a_Check'))

WebUI.setText(findTestObject('Object Repository/GCLD-9/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number'), '1')

WebUI.click(findTestObject('Object Repository/GCLD-9/Page_GS1 Cloud BETA - Check/button_Search'))

