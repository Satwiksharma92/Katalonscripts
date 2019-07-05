<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN Approve</name>
   <tag></tag>
   <elementGuidId>9dd0a5d1-d12a-4965-aa40-89c581e125ed</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;economicOperatorCompanyName\&quot;: \&quot;Jaitra\&quot;,\n  \&quot;economicOperatorAlternativeCompanyName\&quot;: \&quot;Inc\&quot;,\n  \&quot;economicOperatorAddress\&quot;: \&quot;4th Aveneue\&quot;,\n  \&quot;economicOperatorCountryOfRegistration\&quot;: \&quot;AT\&quot;,\n  \&quot;economicOperatorVatOrTaxNumber\&quot;: \&quot;VAT696986\&quot;,\n  \&quot;economicOperatorVatOrTaxIdentifier\&quot;: \&quot;VAT\&quot;,\n  \&quot;economicOperatorVatOrTaxStatus\&quot;: \&quot;0\&quot;,\n  \&quot;economicOperatorCompanyType\&quot;: 2,\n  \&quot;glnProvider\&quot; :\&quot;1\&quot;,\n  \&quot;businessPhoneNumber\&quot;: \&quot;+491706328615\&quot;,\n  \&quot;requestDateTime\&quot;: \&quot;756568765768\&quot;\n}\n&quot;,
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
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://gs-dv-fit.gs1.org/api/v1/economicOperator/5VB%218410014000002/approve?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/economicOperator'</defaultValue>
      <description></description>
      <id>b7f2b3df-c12f-4184-a93f-0c0f70c0af88</id>
      <masked>false</masked>
      <name>urlwithouteoid</name>
   </variables>
   <variables>
      <defaultValue>'5VB%218410014000002/approve'</defaultValue>
      <description></description>
      <id>9e8511e3-6ffb-4c24-aa2b-dbf536d532b3</id>
      <masked>false</masked>
      <name>eoidintheurl</name>
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
