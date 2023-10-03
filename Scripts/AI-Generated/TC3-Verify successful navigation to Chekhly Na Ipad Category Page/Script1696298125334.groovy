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

'step 1: Navigate to Page home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page home click on hyperlink category chekhly dlya samsung --> navigate to Page category chekhly-dlya-samsung'

testObj = findTestObject('Object Repository/Page_home/hyperlink_category_chekhly_dlya_samsung')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page category chekhly-dlya-samsung click on hyperlink category chekhly na ipad --> navigate to Page category chekhly-na-ipad'

testObj = findTestObject('Object Repository/Page_category_chekhly-dlya-samsung/hyperlink_category_chekhly_na_ipad')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-dlya-samsung(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page category chekhly-na-ipad click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-ipad/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-ipad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page category chekhly-na-ipad click on label object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-ipad/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-ipad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page category chekhly-na-ipad click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-ipad/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-ipad(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page category chekhly-na-ipad'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify successful navigation to Chekhly Na Ipad Category Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
