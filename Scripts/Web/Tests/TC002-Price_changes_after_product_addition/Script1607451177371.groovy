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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.System_builder_url)

WebUI.click(findTestObject('Web/Pop_Ups/button_Allow_Cookies'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_CPU'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

totalPrice = WebUI.getText(findTestObject('Web/Pages/List/Total_price'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_CPU_Cooler'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

currentTotalPrice = WebUI.getText(findTestObject('Web/Pages/List/Total_price'))

WebUI.verifyNotEqual(currentTotalPrice, totalPrice)

WebUI.closeBrowser()