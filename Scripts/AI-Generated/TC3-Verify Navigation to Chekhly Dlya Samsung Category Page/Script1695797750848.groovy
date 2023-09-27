import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category chekhly-dlya-samsung'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/chekhly-dlya-samsung')

'step 2: At Page category chekhly-dlya-samsung click on hyperlink product samsung clear cover --> navigate to Page product samsung-clear-cover'

testObj = findTestObject('Object Repository/Page_category_chekhly-dlya-samsung/hyperlink_product_samsung_clear_cover')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-dlya-samsung(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page product samsung-clear-cover click on label object'

testObj = findTestObject('Object Repository/Page_product_samsung-clear-cover/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/samsung-clear-cover(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product samsung-clear-cover click on button object'

testObj = findTestObject('Object Repository/Page_product_samsung-clear-cover/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/samsung-clear-cover(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page product samsung-clear-cover'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Navigation to Chekhly Dlya Samsung Category Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
