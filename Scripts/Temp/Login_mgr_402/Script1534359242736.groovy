import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/proof/android/release/app-release.apk', true)

Mobile.tap(findTestObject('Login/android.widget.TextView1 - Retry'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView1 - Retry'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView1 - Retry'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0 - Username'), 'kfusco', 0)

Mobile.setText(findTestObject('Login/android.widget.EditText1 - Password'), 'elliemae', 0)

Mobile.tap(findTestObject('Login/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Login/android.view.ViewGroup7'), 0)

Mobile.tap(findTestObject('Login/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView7 - Additional Info (1)'), 0)

Mobile.getText(findTestObject('Login/android.widget.TextView7 - Additional Info (1)'), 0)

