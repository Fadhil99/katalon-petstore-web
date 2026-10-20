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

if (CartEmpty == 'No') {
    WebUI.openBrowser(GlobalVariable.G_HomeLink)

    WebUI.click(findTestObject('Page_Header/img_Cart'))

    WebUI.verifyTextPresent('Your cart is empty', false)

    WebUI.closeBrowser()
} else if (CartEmpty == 'Yes') {
    WebUI.callTestCase(findTestCase('CommonTestCase/Login'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('CommonTestCase/AddProductCatsToCart'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Header/img_Cart'))

    WebUI.click(findTestObject('Page_ShoppingCart/btn_checkout'))

    WebUI.click(findTestObject('Page_ShoppingCart/btn_continueOrder'))

    WebUI.click(findTestObject('Page_ShoppingCart/btn_ConfirmOrder'))

    WebUI.verifyTextPresent('Thank you, your order has been submitted.', false)

    WebUI.closeBrowser()
}

