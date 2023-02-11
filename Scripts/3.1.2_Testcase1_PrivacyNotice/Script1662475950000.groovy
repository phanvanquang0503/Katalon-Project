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

'Open Browser'
WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.delay(12)


'Sign In'
WebUI.setText(findTestObject('Object Repository/3.3.2.1.1_Testcase1_FirstnameLastName/input_Sign in_loginfmt'), GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/3.3.2.1.1_Testcase1_FirstnameLastName/input_Sign in_idSIButton9'))

WebUI.delay(9)

WebUI.scrollToElement(findTestObject('3.1.2_Testcase2_PrivacyNotice/a_PrivacyNotice'), 0)

'Verify Privacy Message'
WebUI.verifyTextPresent('iAchieve is used by ICON to facilitate one-to-one discussions and to provide oversight of workload, quality, compliance and performance metrics, aligned to employee goals and objectives in order to provide tailored managerial support.', 
    false)

WebUI.verifyTextPresent('The employee page is visible to the named employee and all direct superiors of that employee in order to process the data for the purposes mentioned. The iAchieve displays aggregated data from a variety of ICON systems, dependent on your specific role, but includes: CTMS (ICOTrial), Timesheets (Planview, Databasics), Learning Compliance (Cornerstone, iLearn), Start-Up (Activate, Horizon) and basic employee data (Workday).', 
    false)

String Mesage2 = WebUI.getText(findTestObject('Object Repository/3.1.2_Testcase2_PrivacyNotice/p_Message2'))

println(Mesage2)

WebUI.verifyEqual(Mesage2, 'To learn more about how your personal data is processed by ICON please refer to the Employee Privacy Notice.')

//WebUI.delay(3)
WebUI.verifyElementClickable(findTestObject('Object Repository/3.1.2_Testcase2_PrivacyNotice/a_PrivacyNotice'))

WebUI.scrollToElement(findTestObject('3.1.2_Testcase2_PrivacyNotice/a_PrivacyNotice'), 0)

'Take Screenshot'
WebUI.takeFullPageScreenshot('C:/Users/SakarabaniY/Documents/SP0119/Project/EmployeePortal/Include/Screenshots_Formal/SP0119_3.1.2_PrivacyPolicy/3.1.2_Testcase1_PrivacyNotice/PrivacyNotice_3.1.2_SS1.png')


WebUI.delay(3)

//'Take Screenshot'
//WebUI.takeFullPageScreenshot('C:/Users/SakarabaniY/Katalon Studio/EmployeePortal/Include/Screenshots/SP0119_3.1.2_PrivacyPolicy/3.1.2_Testcase1_PrivacyNotice/PrivacyNotice_3.1.2_SS1.png')

WebUI.click(findTestObject('Object Repository/3.1.2_Testcase2_PrivacyNotice/a_PrivacyNotice'))


