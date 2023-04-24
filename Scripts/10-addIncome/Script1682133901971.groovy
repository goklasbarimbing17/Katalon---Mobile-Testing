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

Mobile.tap(findTestObject('buttonBack'), 0)

Mobile.tap(findTestObject('Object Repository/Module Income/android.widget.TextView - Income'), 0)

Mobile.tap(findTestObject('Object Repository/Module Income/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Module Income/android.widget.TextView - Penjualan'), 0)

Mobile.setText(findTestObject('Object Repository/Module Income/android.widget.EditText'), '1000000', 0)

Mobile.setText(findTestObject('Object Repository/Module Income/android.widget.EditText (1)'), 'Hasil Jual Takjil', 0)

Mobile.tap(findTestObject('Object Repository/Module Income/android.widget.Button - SAVE'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Module Income/android.widget.TextView - Hasil Jual Takjil'), 
    'Hasil Jual Takjil')

Mobile.verifyElementText(findTestObject('Object Repository/Module Income/android.widget.TextView - Penjualan (1)'), 'Penjualan')

Mobile.verifyElementText(findTestObject('Object Repository/Module Income/android.widget.TextView - 1,000,000'), '1,000,000')

