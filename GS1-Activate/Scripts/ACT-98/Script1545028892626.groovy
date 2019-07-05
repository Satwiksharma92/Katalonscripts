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

WebUI.navigateToUrl('https://activate.stg.gs1.org/admin/login/?next=/admin/')

WebUI.setText(findTestObject('Object Repository/ACT-98/Page_Log in  Django site admin/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/ACT-98/Page_Log in  Django site admin/input_Password_password'), 
    'c28RsN2wimnPdWbtW4f0eA==')

WebUI.click(findTestObject('Object Repository/ACT-98/Page_Log in  Django site admin/input'))

//WebUI.click(findTestObject('Object Repository/ACT-98/Page_Site administration  Django si/a_Company users'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/select_All            GS1 Aust'), 
//    '?organization__member_organisation__country__exact=7', true)
//
//WebUI.click(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/a_Home'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_Site administration  Django si/a_MO Admin'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_ Django site admin/a_Company users'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/clickondropdown'))

Thread.sleep(3000)

WebUI.selectOptionByLabel(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/selectcompanyuser'), 'GS1 GO')

//WebUI.selectOptionByValue(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/select_All            GS1 Aust'), 
   // '?organization__member_organisation__country__exact=7', true)

WebUI.click(findTestObject('Object Repository/ACT-98/Page_Select Company user to change/a_Impersonate'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate Dashboard/a_Add product'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Pallet_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Previous_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Label Description_label_'), 'testing description')

WebUI.setText(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Brand_brand_i18n'), 'testing brand')

WebUI.setText(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Functional Name_function'), 'tesing name')

WebUI.setText(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/input_Global Product Classific'), 'tes')

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/strong_10001680'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/div_Product Image  (Upload a p'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/span_Choose file'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/button_Save as draft'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate New Product/a_Finish'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate My products/i_cloud_queue'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate Edit product/button_Activate barcodeGTIN'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate Edit product/label_I agree'))

WebUI.click(findTestObject('Object Repository/ACT-98/Page_GS1 Activate Edit product/button_OK'))

