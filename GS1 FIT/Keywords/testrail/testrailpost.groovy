package testrail

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class testrailpost {
	@Keyword
	def update_run(String id, String array) {
		def slurper = new JsonSlurper()
		def ro = new RequestObject('Update TestRail test run')
		ro.setRestRequestMethod('POST')
		ro.setRestUrl('https://cva.testrail.io/index.php?/api/v2/update_run/11')

		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
				'Content-Type', ConditionType.EQUALS, 'application/json'))
		httpheader.add(new TestObjectProperty(
				'Authorization', ConditionType.EQUALS, 'QmFzaWMgYzJocGRtRTNNbVZqWlRFeFFHZHRZV2xzTG1OdmJUcG5ObTB4Y1VSSWNWaEhjVEJ2U0VoMGRYbGlkdz09'))
		ro.setHttpHeaderProperties(httpheader)

		def body ="{'include_all': false,'case_ids': " + array + "}"
		WebUI.comment('body = ' + body)
		ro.setBodyContent(
				new HttpTextBodyContent(body, 'UTF-8', 'application/json'))
		def response = WSBuiltInKeywords.sendRequest(ro)
		return slurper.parseText(response.getResponseText())
	}
}
