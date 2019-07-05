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

public class testrail {
	@Keyword
	def get_tests(String id) {
		def slurper = new JsonSlurper()
		RequestObject ro = new RequestObject('Get TestRail tests')
		ro.setRestRequestMethod('GET')
		ro.setRestUrl('https://cva.testrail.io/index.php?/api/v2/get_case/' + id)
		
		def httpheader = new ArrayList<TestObjectProperty>()
		httpheader.add(new TestObjectProperty(
	'Content-Type', ConditionType.EQUALS, 'application/json'))
		
	httpheader.add(new TestObjectProperty(
	'Authorization', ConditionType.EQUALS,
	'QmFzaWMgYzJocGRtRTNNbVZqWlRFeFFHZHRZV2xzTG1OdmJUcG5ObTB4Y1VSSWNWaEhjVEJ2U0VoMGRYbGlkdz09'))
	
	ro.setHttpHeaderProperties(httpheader)
	ro.setBodyContent(
	new HttpTextBodyContent('', 'UTF-8', 'application/json'))
			
	def response = WSBuiltInKeywords.sendRequest(ro)
	return slurper.parseText(response.getResponseText())
	}
}
