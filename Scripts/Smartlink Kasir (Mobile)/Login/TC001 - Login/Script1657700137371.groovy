import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startExistingApplication('com.sinadme.kasirsinadme')

if (Mobile.waitForElementPresent(findTestObject('Object Repository/Kasir/Login/akses 1'), 5)) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Login/akses 1'), 30)

    Mobile.tap(findTestObject('Object Repository/Kasir/Login/akses 1'), 30)

    Mobile.tap(findTestObject('Object Repository/Kasir/Login/akses 1'), 30)
}

if (Mobile.waitForElementPresent(findTestObject('Object Repository/Kasir/Login/akses 2'), 5)) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Login/akses 2'), 30)

    Mobile.tap(findTestObject('Object Repository/Kasir/Login/akses 2'), 30)
}

if (Mobile.waitForElementPresent(findTestObject('Object Repository/Kasir/Login/Lewati'), 5)) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Login/Lewati'), 30)
}

if (Mobile.waitForElementPresent(findTestObject('Object Repository/Kasir/Login/Mulai'), 5)) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Login/Mulai'), 30)
}

Mobile.tap(findTestObject('Object Repository/Kasir/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Kasir/Login/Login Masuk'), 0)

Mobile.verifyElementExist(findTestObject('Kasir/Login/Alert empty'), 30)

Mobile.closeApplication()

