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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'awaludin.89@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'UdkSbv1BFthtHYFoZhyQPg==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

//WebUI.verifyTextPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/icon_github'), false, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/icon_profil'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_Your_Gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_Create_gits'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_title_gits'), 'testLogin')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_komen_gits'), 'Hellow World')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_make_gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_see_all_gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/icon_profil'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_Your_Gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_goto_mygits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_delete_gits'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_Create_gits'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_title_gits'), 'testLogin')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_komen_gits'), 'Hellow World')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_make_gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_Edit_gits'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_title_gits'), 'testLogin di edit')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_komen_gits'), 'Hellow')

//WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_button_update_gits'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/icon_profil'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_logout_gits'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/Input_final_signout'))

WebUI.closeBrowser()


