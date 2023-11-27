import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/01_VerifyElementText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5219717840700357742.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/02_UserTapsOn - View All Accounts'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/03_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4512516575138160458.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/04_UserTapsOn_No1_fromKeypad'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/05_VerifyElementText - Kill Switch'), 'Kill Switch')

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/06_VerifyElementText - You can now temporarily deactivate your credit cards and M2U access in just a few quick taps in case of fraud'),'You can now temporarily deactivate your credit cards and M2U access in just a few quick taps in case of fraud.')

//Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7248156319460999763.png')

//Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/07_UserTapsOn - Got It'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/08_VerifuElementText - ACCOUNTS'), 'ACCOUNTS')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/09_VerifyElementText - Global Access Account-i'),
	'Global Access Account-i')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8571766889717295126.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/10_UserTapsOnHome'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/11_VerifyElementText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7263452785027825094.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/12_UserTapsOn - View All Accounts'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/13_VerifyElementText - ACCOUNTS'), 'ACCOUNTS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4409548081609906756.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-3/10_UserTapsOnHome'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-3/11_VerifyElementText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7263452785027825094.png')