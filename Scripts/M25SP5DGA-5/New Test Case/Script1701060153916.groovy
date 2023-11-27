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

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/01_VerifyElementText - Quick Actions'), 'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2764630535604141228.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/02_UserTapsOn - View All Accounts'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/03_VerifyElementText - ACCOUNTS'), 'ACCOUNTS')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6293676926243446263.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/04_NavigateInsideG1A- Global Access Account-i'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/05_VerifyElementText - MANAGE'), 'MANAGE')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4795958477907753060.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/06_UserTapsOn - MANAGE'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/07_VerifyElementText - Auto Sweep'), 'Auto Sweep')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/08_VerifyElementText - Automatically convert home currency ifforeign currency balance is insufficient forcard transaction'), 
    'Automatically convert home currency if\nforeign currency balance is insufficient for\ncard transaction')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5839498068958624739.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/10_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/11_VerifyElementText - Are you sure you want todeactivate Auto Sweep'), 
    'Are you sure you want to\ndeactivate Auto Sweep?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7738406051414577426.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/12_UserTapsOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/13_VerifyElementText_UserNavigatesBackToAccountDetailScreen'), 
    'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot672359741204102328.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/14_UserTapsOnToggleButtonAgain'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/15_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot435698299856662271.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/16_UserTapsOnCancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/17_VerifyElementText_UserNavigatesBackTo - Your Currencies'), 
    'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1264254330194872412.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/18_UserTapsOnToggleAgain'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/19_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/20_UserTapsOnDeactivateButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/21_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/22_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/23_VerifyElementText - Date  time'), 'Date & time')

Mobile.delay(50)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/24_VerifyElementTextExpiry - Authorisation failed'), 
    'Authorisation failed')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/25_VerifyElementTextExpiry - Your Secure Verification authorisation has expired. Please perform the transaction again'), 
    'Your Secure Verification authorisation has expired. Please perform the transaction again.')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/26_VerifyElementTextExpiry - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/27_VerifyElementTextExpiry - Date  time'), 'Date & time')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/28_VerifyElementTextExpiry- Transaction type'), 'Transaction type')

Mobile.getText(findTestObject('Object Repository/M25SP5DGA-5/29_RefID - 192786381M'), 0)

Mobile.getText(findTestObject('Object Repository/M25SP5DGA-5/30_DateTime - 27 Nov 2023, 1234 PM'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/31_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8280981999474609341.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/32_UserTapsOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/33_VerifyElementText - Your Currencies'), 'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888117852548430227.png')


Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/18_UserTapsOnToggleAgain'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/19_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6565859221654470641.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/20_UserTapsOnDeactivateButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/21_VerifyElementText - Secure2u authorisation'),
	'Secure2u authorisation')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/22_VerifyElementText - Deactivate Auto Sweep'), 'Deactivate Auto Sweep')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/23_VerifyElementText - Date  time'), 'Date & time')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/34_UserTapsOnApprove'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/35_VerifyElementText - Auto sweep successfullydeactivated'),
	'Auto sweep successfully\ndeactivated!')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/36_VerifyElementText - Reference ID'), 'Reference ID')

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-5/37_VerifyElementExist - 192786548M'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-5/38_VerifyElementExits - 27 Nov 2023, 1247 PM'),
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4298578957733559650.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/39_UserTapsOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/40_VerifyElementText - Your Currencies'), 'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6997556479238322125.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/06_UserTapsOn - MANAGE'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/07_VerifyElementText - Auto Sweep'), 'Auto Sweep')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/08_VerifyElementText - Automatically convert home currency ifforeign currency balance is insufficient forcard transaction'),
	'Automatically convert home currency if\nforeign currency balance is insufficient for\ncard transaction')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5839498068958624739.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/09_UserTapsOnDeactivateToggle'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/41_VerifyElementText - Secure2u authorisation'),
	'Secure2u authorisation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2336019252932878175.png')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/42_VerifyElementText - Activate Auto Sweep'), 'Activate Auto Sweep')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/43_TapOnApprove'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/44_VerifyElementText - Auto sweep successfullyactivated'),
	'Auto sweep successfully\nactivated!')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/45_VerifyElementText - Reference ID'), 'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/46_VerifyElementText - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622894067104886910.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-5/47_UserTapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-5/40_VerifyElementText - Your Currencies'), 'Your Currencies')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6997556479238322125.png')
