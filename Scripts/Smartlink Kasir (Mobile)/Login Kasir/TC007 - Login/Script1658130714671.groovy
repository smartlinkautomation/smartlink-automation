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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

Mobile.startExistingApplication('com.sinadme.kasirsinadme')

Mobile.tap(findTestObject('Object Repository/Kasir/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Kasir/Login/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Kasir/Login/username'), 0)

Mobile.clearText(findTestObject('Kasir/Login/username'), 0)

Mobile.sendKeys(findTestObject('Kasir/Login/username'), 'zikrikasir')

Mobile.tap(findTestObject('Kasir/Login/Password'), 0)

Mobile.clearText(findTestObject('Kasir/Login/Password'), 0)

Mobile.sendKeys(findTestObject('Kasir/Login/Password'), 'smartlink1')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Kasir/Login/android.widget.Button (3)'), 0)

KeywordLogger log = new KeywordLogger()

//boolean isNotExist = Mobile.verifyElementNotExist(findTestObject('Object Repository/Kasir/Login/Lanjut Digunakan'), 5)
boolean isPresent = Mobile.waitForElementPresent(findTestObject('Object Repository/Kasir/Login/Lanjut Digunakan'), 5)

//Statement
if (isPresent) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Login/Lanjut Digunakan'), 30)

    WebUI.delay(3)
} else {
    WebUI.delay(3)
}

String text = Mobile.getAttribute(findTestObject('Kasir/Login/User'), 'contentDescription', 30)

//KeywordLogger log = new KeywordLogger()
//
//log.logInfo(text)

assert text == "Zikri Kasir"

Mobile.takeScreenshot('C:\\Users\\citri\\AppData\\Local\\Temp\\screenshot483014698161607134.png')

Mobile.closeApplication()

