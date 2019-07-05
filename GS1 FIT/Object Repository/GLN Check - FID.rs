<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN Check - FID</name>
   <tag></tag>
   <elementGuidId>89a174cd-8e3e-4f0b-8f3d-9245753dea47</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n ${bodyFIDcheck}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Ocp-Apim-Subscription-Key</name>
      <type>Main</type>
      <value>1dd9eeaef1784e70b2288ca884e1cc45</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic T2NwLUFwaW0tU3Vic2NyaXB0aW9uLUtleToxZGQ5ZWVhZWYxNzg0ZTcwYjIyODhjYTg4NGUxY2M0NQ==</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${urlforcheckFID}?gln=${glnforFID}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/facility/check'</defaultValue>
      <description></description>
      <id>d3cbcf8f-4824-48e7-8f84-52d24b420d08</id>
      <masked>false</masked>
      <name>urlforcheckFID</name>
   </variables>
   <variables>
      <defaultValue>'8410014000002'</defaultValue>
      <description></description>
      <id>a6815ab4-cff6-4fbc-9137-63a6797270fc</id>
      <masked>false</masked>
      <name>glnforFID</name>
   </variables>
   <variables>
      <defaultValue>'  &quot;eoid&quot;: &quot;5VB!8410014000002&quot;,\n  &quot;facilityAddress&quot;: &quot;hdsjhs&quot;,\n  &quot;facilityCountryOfRegistration&quot;: &quot;AT&quot;,\n  &quot;facilityType&quot;: &quot;1&quot;,\n  &quot;facilityLeased&quot;: &quot;1&quot;,\n  &quot;facilityTypeOther&quot;: &quot;Other facility&quot;,\n  &quot;glnProvider&quot; :&quot;1&quot;,\n  &quot;businessPhoneNumber&quot;: &quot;264234&quot;,\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>a37ff8b7-481c-4cf6-ae07-0ca895994f2f</id>
      <masked>false</masked>
      <name>bodyFIDcheck</name>
   </variables>
   <variables>
      <defaultValue>'${method}'</defaultValue>
      <description></description>
      <id>e8efbcef-b6ee-4a78-937e-0b168818f2aa</id>
      <masked>false</masked>
      <name>method</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
