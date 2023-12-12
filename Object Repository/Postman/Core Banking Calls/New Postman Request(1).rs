<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>New Postman Request(1)</name>
   <tag></tag>
   <elementGuidId>dfcb08ee-7713-4161-b797-8579ee1cbf40</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;msgHeader\&quot;:{\n        \&quot;msgRefNo\&quot;:\&quot;123456\&quot;,\n        \&quot;requesterId\&quot;:\&quot;00146222\&quot;,\n        \&quot;staffPfId\&quot;:\&quot;00146222\&quot;,\n        \&quot;transDateTime\&quot;:\&quot;20230101-01010112\&quot;,\n        \&quot;branchCode\&quot;:\&quot;14011\&quot;,\n        \&quot;consumerEnv\&quot;:\&quot;SIT\&quot;,\n        \&quot;transCode\&quot;:\&quot;G1A00006\&quot;\n    },\n    \&quot;msgBody\&quot;: {\n        \&quot;accountNumber\&quot;: \&quot;900000017559\&quot;,\n        \&quot;primaryCurrency\&quot;: \&quot;MYR\&quot;,\n        \&quot;primaryLimit\&quot;: \&quot;10000.00\&quot;,\n        \&quot;autoSweepFlag\&quot;: \&quot;Y\&quot;\n    }\n}\n&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
      <webElementGuid>81e6be72-07d6-4367-9576-3068a8a6a3c9</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJNQUUiLCJhcHAiOiJNQUUiLCJjdHkiOiJNWVMiLCJpc3MiOiJvcGVuc3lzdGVtcyIsImlhdCI6MTY4OTU1MTU2MSwiZXhwIjozMzI0NjQzMjAwMH0.DvlcpRVheEVp9Tx-trY6ejkljsQ9niK0y0Jg7lRpx9IuFqQCkEKwYTJeWHxJcl_b</value>
      <webElementGuid>bb1482ce-ad70-4394-9aca-0df04cee903a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>d0d2fd81-9a8f-4777-a76d-7cc8dea27faf</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>1a3560fc-43dd-41d6-a813-569fce321e0d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://172.31.182.166:8090/account</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
