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

Mobile.startExistingApplication('com.sinadme.kasirsinadme')

for (int i = 1; i <= 1; i++) {
    Mobile.tap(findTestObject('Object Repository/Kasir/Buat Transaksi/Buat Transaksi'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Transaksi Deposit'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/cari konsumen'), 0)
	
	WebUI.delay(3)

    Mobile.sendKeys(findTestObject('Kasir/Buat Transaksi/cari konsumen'), 'aan')

    WebUI.delay(3)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/pilih konsumen'), 0)

    Mobile.tap(findTestObject('Object Repository/Kasir/Buat Transaksi/Lanjutkan'), 0)

    //    if (Mobile.waitForElementPresent(findTestObject('Kasir/Buat Transaksi/Ya, Lanjutkan'), 0)) {
    //        Mobile.tap(findTestObject('Kasir/Buat Transaksi/Ya, Lanjutkan'), 0)
    //    }
    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Pilih deposit'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Tambah kuantitas Deposit'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Keranjang Deposit'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Lanjutkan Deposit'), 0)

    WebUI.delay(3)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Lanjutkan pengaturan deposit'), 0)

    Mobile.tap(findTestObject('Kasir/Buat Transaksi/Transaksi Deposit/Selesaikan Deposit'), 0)

    WebUI.delay(5)

    Mobile.tap(findTestObject('Object Repository/Kasir/Buat Transaksi/Ke beranda'), 0)
}

Mobile.closeApplication()

