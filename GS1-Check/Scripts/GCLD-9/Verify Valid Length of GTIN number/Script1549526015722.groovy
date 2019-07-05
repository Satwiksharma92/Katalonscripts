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

WebUI.openBrowser('https://cloud.test.gs1.org/gs1-portal')

WebUI.navigateToUrl('https://gs1-sso-customsts.azurewebsites.net/Account/LoginSelector')

WebUI.setText(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_E-mail_Email'), GlobalVariable.email)

Thread.sleep(1000)

WebUI.setText(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_Password_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_Password_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Home/a_Services'))

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Services/a_Check'))


	
if (Checkgtinlength == '12345A'){ 
	
	WebUI.verifyTextPresent(validation, false)
	
}


else{
try{
	

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number'), Checkgtinlength)

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))
}


finally{
	
	WebUI.verifyTextPresent(validation, false)

}

}

