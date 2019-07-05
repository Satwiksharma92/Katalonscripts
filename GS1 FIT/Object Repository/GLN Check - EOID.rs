<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN Check - EOID</name>
   <tag></tag>
   <elementGuidId>13d9c771-175b-4858-9d97-1a45b83b59b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n ${body}\n}&quot;,
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic T2NwLUFwaW0tU3Vic2NyaXB0aW9uLUtleToxZGQ5ZWVhZWYxNzg0ZTcwYjIyODhjYTg4NGUxY2M0NQ==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${url}?gln=${glnparameter}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'8410023000000'</defaultValue>
      <description></description>
      <id>05f8d4ea-1d83-43de-bba8-c7fdeeb9d9c8</id>
      <masked>false</masked>
      <name>glnparamter</name>
   </variables>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/economicOperator/check'</defaultValue>
      <description></description>
      <id>2c2c3cdd-0cc9-4210-94a2-7b131c35cec2</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>200</defaultValue>
      <description></description>
      <id>35f855c5-5e96-40ef-b179-dc15e5f52477</id>
      <masked>false</masked>
      <name>responsecode</name>
   </variables>
   <variables>
      <defaultValue>'status'</defaultValue>
      <description></description>
      <id>3d3fb68c-a5bb-473a-b136-1789849b7354</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'200'</defaultValue>
      <description></description>
      <id>d837d3df-4ba2-4869-b329-5dcf58febf70</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>'messageId'</defaultValue>
      <description></description>
      <id>8291a8ae-c3dd-45b9-aa37-358ec1085081</id>
      <masked>false</masked>
      <name>messageid</name>
   </variables>
   <variables>
      <defaultValue>'E012'</defaultValue>
      <description></description>
      <id>bed4f358-eff1-4fbd-aa9f-c2c8cb037b9c</id>
      <masked>false</masked>
      <name>messagidvalue</name>
   </variables>
   <variables>
      <defaultValue>'companyName'</defaultValue>
      <description></description>
      <id>13b67b97-29eb-42ba-a844-3a04f164f2da</id>
      <masked>false</masked>
      <name>companyname</name>
   </variables>
   <variables>
      <defaultValue>'GONZALEZ BYASS S.A.'</defaultValue>
      <description></description>
      <id>dab1c764-b740-404c-9627-0af3cb01fa46</id>
      <masked>false</masked>
      <name>companynamevalue</name>
   </variables>
   <variables>
      <defaultValue>'POST'</defaultValue>
      <description></description>
      <id>9fab4653-8651-4612-b085-ecdd446c09db</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>' &quot;economicOperatorCompanyName&quot;: &quot;Jaitra Updated&quot;,\n  &quot;economicOperatorAlternativeCompanyName&quot;: &quot;Ramesh Updated&quot;,\n  &quot;economicOperatorAddress&quot;: &quot;4th Aveneue, New Jersey&quot;,\n  &quot;economicOperatorCountryOfRegistration&quot;: &quot;AT&quot;,\n  &quot;economicOperatorVatOrTaxNumber&quot;: &quot;VAT6969961&quot;,\n  &quot;economicOperatorVatOrTaxIdentifier&quot;: &quot;VAT&quot;,\n  &quot;economicOperatorVatOrTaxStatus&quot;: &quot;0&quot;,\n  &quot;economicOperatorCompanyType&quot;: 2,\n  &quot;glnProvider&quot; :&quot;1&quot;,\n  &quot;businessPhoneNumber&quot;: &quot;+491706328615&quot;,\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>303f4745-1a30-4ca5-ab7b-1b629d98061c</id>
      <masked>false</masked>
      <name>body</name>
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
