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

WebUI.click(findTestObject('Object Repository/test registration/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Email address_email_crea'), 
    email)

WebUI.click(findTestObject('Object Repository/test registration/Page_Login - My Store/span_Create an account'))

Thread.sleep(1000)



WebUI.delay(4)

WebUI.getUrl()


if (WebUI.getUrl() == 'http://automationpractice.com/index.php?controller=authentication&back=my-account') {
	
	try {
		WebUI.verifyElementText(findTestObject('Object Repository/test/Page_Login - My Store/li_Invalid email address.'), validation1)
	}
	finally {
		Console.println('validation failed for email')
	}

}

else {

}


WebUI.click(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__customer_firstname'), firstname)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__customer_lastname'), lastname)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__passwd'), password)

WebUI.selectOptionByValue(findTestObject('Object Repository/test registration/Page_Login - My Store/select_-1234567891011121314151'), 
    date, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/test registration/Page_Login - My Store/select_-JanuaryFebruaryMarchAp'), 
    month, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/test registration/Page_Login - My Store/select_-2018201720162015201420'), 
    year, true)

WebUI.click(findTestObject('Object Repository/test registration/Page_Login - My Store/div_Sign up for our newsletter'))

WebUI.click(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Sign up for our newslett'))

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Company_company'), company)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__address1'), address1)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Address (Line 2)_address'), 
    address2)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__city'), city)

WebUI.selectOptionByLabel(findTestObject('Object Repository/test registration/Page_Login - My Store/select_-AlabamaAlaskaArizonaAr'), 
    state, true)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__postcode'), postalcode)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/textarea_Additional informatio'), 
    additionalinfo)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input_Home phone_phone'), homephoneno)

WebUI.setText(findTestObject('Object Repository/test registration/Page_Login - My Store/input__phone_mobile'), mobileno)

WebUI.click(findTestObject('Object Repository/test registration/Page_Login - My Store/span_Register'))

