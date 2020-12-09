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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.System_builder_url)

//Verify addition of a CPU
WebUI.click(findTestObject('Web/Pop_Ups/button_Allow_Cookies'))

WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_CPU'))

WebUI.click(findTestObject('Web/Filters/Max_Price'))

WebUI.waitForElementVisible(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), 5)

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), '444')

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Web/Filters/Select_Manufacturer', [('manufacturer') : 'AMD']))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Filters/Select_Rating_5_Stars'))

WebUI.delay(3)

cpuName = WebUI.getText(findTestObject('Object Repository/Web/Pages/Products/Part_name_of_the_1st_product'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

WebUI.verifyElementVisible(findTestObject('Web/Pages/List/Name_of_expected_CPU', [('expectedCpu') : cpuName]))

//Verify addition of a CPU Cooler
WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_CPU_Cooler'))

WebUI.click(findTestObject('Web/Filters/Max_Price'))

WebUI.waitForElementVisible(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), 5)

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), '333')

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Web/Filters/Select_Manufacturer', [('manufacturer') : 'Cooler Master']))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Filters/Select_Rating_5_Stars'))

WebUI.delay(3)

cpuCoolerName = WebUI.getText(findTestObject('Object Repository/Web/Pages/Products/Part_name_of_the_1st_product'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

WebUI.verifyElementVisible(findTestObject('Web/Pages/List/Name_of_expected_CPU_Cooler', [('expectedCpuCooler') : cpuCoolerName]))

//Verify addition of a Motherboard
WebUI.click(findTestObject('Object Repository/Web/Pages/List/button_Choose_A_Motherboard'))

WebUI.click(findTestObject('Web/Filters/Max_Price'))

WebUI.waitForElementVisible(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), 5)

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), '555')

WebUI.sendKeys(findTestObject('Web/Filters/input_filter_slide_right_input_X_Price'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Web/Filters/Select_Manufacturer', [('manufacturer') : 'Asus']))

WebUI.delay(3)

WebUI.click(findTestObject('Web/Filters/Select_Rating_5_Stars'))

WebUI.delay(3)

motherboardName = WebUI.getText(findTestObject('Object Repository/Web/Pages/Products/Part_name_of_the_1st_product'))

WebUI.click(findTestObject('Object Repository/Web/Pages/Products/button_Add_the_1st_product'))

WebUI.verifyElementVisible(findTestObject('Web/Pages/List/Name_of_expected_Motherboard', [('expectedMotherboard') : motherboardName]))

WebUI.closeBrowser()
