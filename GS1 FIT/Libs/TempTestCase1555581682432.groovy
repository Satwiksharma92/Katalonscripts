import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/zc/fn_mhxbn5jd4m7wn390z4ctr0000gp/T/Katalon/20190418_153107/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), '    \nimport com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory\nimport com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository\nimport com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport internal.GlobalVariable as GlobalVariable\n\nMap<String, String> evaluatedVariables = [:]\n\n\nevaluatedVariables.put(\"body\", \' \"economicOperatorCompanyName\": \"Jaitra\",\\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\\n  \"economicOperatorAddress\": \"4th Aveneue\",\\n  \"economicOperatorCountryOfRegistration\": \"AT\",\\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\\n  \"economicOperatorVatOrTaxStatus\": \"0\",\\n  \"economicOperatorCompanyType\": 2,\\n  \"glnProvider\" :\"1\",\\n  \"businessPhoneNumber\": \"+491706328615\",\\n  \"requestDateTime\": \"756568765768\"\'.toString())\n\nevaluatedVariables.put(\"url\", \'gs-dv-fit.gs1.org/api/v1/economicOperator/5VB%218410014000002/approve\'.toString())\n\n\nFileOutputStream fos = null\nObjectOutputStream oos = null\ntry {\n   fos = new FileOutputStream(new File(\"/var/folders/zc/fn_mhxbn5jd4m7wn390z4ctr0000gp/T/Katalon/variables/variable-eval-8453027818811774101.tmp\"))\n   oos = new ObjectOutputStream(fos);\n   oos.writeObject(evaluatedVariables)\n} catch (Exception e) {\n   e.printStackTrace()\n} finally {\n   if (fos != null) {\n       fos.close()\n   }\n\n   if (oos != null) {\n       oos.close()\n   }\n}\n \n', FailureHandling.STOP_ON_FAILURE, true)

