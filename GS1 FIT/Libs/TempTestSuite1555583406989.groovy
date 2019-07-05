import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/FIt-test suite')

suiteProperties.put('name', 'FIt-test suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/satwik_df_gs1/Katalon Studio/GS1 FIT/Reports/FIt-test suite/20190418_155956/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'urlforFIDcheck' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'responsecode' : '404' , 'methodforcall' : 'POST' , 'glnforFID' : '8410014000002' , 'FIDcheckbody' : '  \"eoid\": \"5VB!8410014000002\",\\n  \"facilityAddress\": \"hdsjhs\",\\n  \"facilityCountryOfRegistration\": \"AT\",\\n  \"facilityType\": \"1\",\\n  \"facilityLeased\": \"1\",\\n  \"facilityTypeOther\": \"Other facility\",\\n  \"glnProvider\" :\"1\",\\n  \"businessPhoneNumber\": \"264234\",\\n  \"requestDateTime\": \"756568765768\"' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'urlforFIDcheck' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'responsecode' : '400' , 'methodforcall' : 'POST' , 'glnforFID' : '8410014000002' , 'FIDcheckbody' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n  \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n  \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'urlforFIDcheck' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'responsecode' : '400' , 'methodforcall' : 'GET' , 'glnforFID' : '8410014000002' , 'FIDcheckbody' : '' ,  ])])
