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
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.System_builder_url)

WebUI.click(findTestObject('Web/Pop_Ups/button_Allow_Cookies'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_CPU'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_Video_Card'))

WebUI.click(findTestObject('Object Repository/Web/Filters/Min_TDP'))

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_left_input_I_TDP'), '500')

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_left_input_I_TDP'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_Power_Supply'))

WebUI.click(findTestObject('Web/Filters/checkbox_Compatibility_filter'))

WebUI.click(findTestObject('Object Repository/Web/Filters/Max_Wattage'))

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_A_Wattage'), '300')

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_A_Wattage'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

powerSupply = WebUI.getText(findTestObject('Web/Pages/List/Name_of_selected_Power_Supply'))

WebUI.verifyElementVisible(findTestObject('Web/Pages/List/Compatibility_warning'))

WebUI.verifyElementVisible(findTestObject('Web/Pages/List/Warning_Messages/Insufficient_wattage', [('powerSupply') : powerSupply]))

WebUI.closeBrowser()
