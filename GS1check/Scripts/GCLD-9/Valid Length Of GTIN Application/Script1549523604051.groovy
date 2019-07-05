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

WebUI.openBrowser('https://cloud.test.gs1.org/gs1-portal')

WebUI.navigateToUrl('https://gs1-sso-customsts.azurewebsites.net/Account/LoginSelector')

WebUI.setText(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_E-mail_Email'), 'GS1CloudTest@gs1.org')

Thread.sleep(1000)

WebUI.setText(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_Password_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Page_Sign in - GS1 STS Server/input_Password_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Home/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Services/a_Check'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number'), '1')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_1'), '0000000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_2'), '000000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_3'), '00000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_4'), '0000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_5'), '000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_6'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_7'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_8'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_9'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_10'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_11'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_12'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_13'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_14'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_15'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_16'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_17'), '12')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_18'), '0000000000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_19'), '000000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_20'), '00000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_21'), '0000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_22'), '000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_23'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_24'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_25'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_26'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_27'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_28'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_29'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_30'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_31'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_32'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_33'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_34'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_35'), '123')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_36'), '0000000000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_37'), '000000000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_38'), '00000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_39'), '0000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_40'), '000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_41'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_42'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_43'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_44'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_45'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_46'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_47'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_48'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_49'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_50'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_51'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_52'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_53'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_54'), '1234')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_55'), '0000000000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_56'), '000000000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_57'), '00000000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_58'), '0000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_59'), '000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_60'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_61'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_62'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_63'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_64'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_65'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_66'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_67'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_68'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_69'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_70'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_71'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_72'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_73'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_74'), '12345')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_75'), '0000000001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_76'), '000000000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_77'), '00000000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_78'), '0000000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_79'), '000000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_80'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_81'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_82'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_83'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_84'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_85'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_86'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_87'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_88'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_89'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_90'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_91'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_92'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_93'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_94'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_95'), '123456')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_96'), '0000000012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_97'), '000000001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_98'), '00000000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_99'), '0000000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_100'), '000000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_101'), '00000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_102'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_103'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_104'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_105'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_106'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_107'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_108'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_109'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_110'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_111'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_112'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_113'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_114'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_115'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_116'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_117'), '1234567')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_118'), '0000000123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_119'), '000000012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_120'), '00000001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_121'), '0000000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_122'), '000000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_123'), '00000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_124'), '0000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_125'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_126'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_127'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_128'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_129'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_130'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_131'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_132'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_133'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_134'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_135'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_136'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_137'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_138'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_139'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_140'), '12345678')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_141'), '0000001234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_142'), '000000123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_143'), '00000012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_144'), '0000001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_145'), '000000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_146'), '00000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_147'), '0000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_148'), '000000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_149'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_150'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_151'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_152'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_153'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_154'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_155'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_156'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_157'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_158'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_159'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_160'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_161'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_162'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_163'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_164'), '123456789')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_165'), '0000012345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_166'), '000001234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_167'), '00000123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_168'), '0000012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_169'), '000001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_170'), '00000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_171'), '0000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_172'), '000001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_173'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_174'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_175'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_176'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_177'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_178'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_179'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_180'), '11')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_181'), '112')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_182'), '1123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_183'), '11234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_184'), '112345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_185'), '1123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_186'), '11234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_187'), '112345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_188'), '1123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_189'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_190'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_191'), '1234567891')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_192'), '0000123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_193'), '000012345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_194'), '00001234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_195'), '0000123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_196'), '000012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_197'), '00001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_198'), '0000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_199'), '000012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_200'), '00001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_201'), '0000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_202'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_203'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_204'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_205'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_206'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_207'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_208'), '124')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_209'), '1245')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_210'), '124')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_211'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_212'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_213'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_214'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_215'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_216'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_217'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_218'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_219'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_220'), '12345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_221'), '12345678912')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_222'), '0001234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_223'), '000123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_224'), '00012345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_225'), '0001234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_226'), '000123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_227'), '00012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_228'), '0001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_229'), '000123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_230'), '00012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_231'), '0001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_232'), '000')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_233'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_234'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_235'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_236'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_237'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_238'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_239'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_240'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_241'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_242'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_243'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_244'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_245'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_246'), '12345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_247'), '123456789123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_248'), '123456789123')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_249'), '0012345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_250'), '001234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_251'), '00123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_252'), '0012345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_253'), '001234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_254'), '00123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_255'), '0012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_256'), '001234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_257'), '00123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_258'), '0012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_259'), '001')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_260'), '00')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_261'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_262'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_263'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_264'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_265'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_266'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_267'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_268'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_269'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_270'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_271'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_272'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_273'), '12345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_274'), '123456789123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_275'), '1234567891234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_276'), '1234567891234')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_277'), '0123456789123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_278'), '012345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_279'), '01234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_280'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_281'), '012345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_282'), '01234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_283'), '0123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_284'), '012345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_285'), '01234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_286'), '0123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_287'), '012')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_288'), '01')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_289'), '0')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_290'), '')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_291'), '1')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_292'), '12')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_293'), '123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_294'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_295'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_296'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_297'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_298'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_299'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_300'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_301'), '12345678912')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_302'), '123456789123')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_303'), '1234567891234')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_304'), '12345678912345')

WebUI.setText(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/input_Global Trade Item Number_305'), '12345678912345')

WebUI.click(findTestObject('Object Repository/Page_GS1 Cloud BETA - Check/button_Search'))

WebUI.closeBrowser()

