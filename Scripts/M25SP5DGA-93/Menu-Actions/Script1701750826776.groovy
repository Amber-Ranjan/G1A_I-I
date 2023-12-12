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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/01_UserOn - Accounts'), 'Accounts')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4853386068334005863.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-33/02_UserSelectsFYC'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4865537834320157598.png')

Mobile.scrollToText('Convert Currency')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4625744279607788550.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/03_VerifyElementTextForActions - ViewStatements'),
	'View\nStatements')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/04_VerifyElementText - DETAILS'), 'DETAILS')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/05VerifyElementText - Current balance'), 'Current balance')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/06_verifyElementText- One-day float'), 'One-day float')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/07_VerifyElementText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-33/08_UserTapsOnConvertCurrency'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/09_VerifyElementText - Terms  Conditions'), 'Terms & Conditions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1998160721283563223.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-33/10_UserTapsOnBackButton'), 0)

Mobile.swipe(0, 500, 0, 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot396412189288730672.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-33/11_UserTapsOnCloseButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-33/12_VerifyElementText - Accounts'), 'Accounts')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot899295107133364343.png')



if (Mobile.verifyElementVisible(findTestObject('Object Repository/Generic/test/android.widget.TextView - Add currency'), 10, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/Generic/test/android.widget.TextView - Add currency'),0)
	Mobile.verifyElementText(null, null)
}