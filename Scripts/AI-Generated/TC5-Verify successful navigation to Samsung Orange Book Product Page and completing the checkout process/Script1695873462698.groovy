import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

'step 3: At Page category chekhly-dlya-samsung click on hyperlink product samsung orange book --> navigate to Page product samsung-orange-book-1'

testObj = findTestObject('Object Repository/Page_category_chekhly-dlya-samsung/hyperlink_product_samsung_orange_book')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-dlya-samsung(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product samsung-orange-book-1 click on label object'

testObj = findTestObject('Object Repository/Page_product/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page product samsung-orange-book-1 input on input object'

testObj = findTestObject('Object Repository/Page_product/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object)

'step 6: At Page product samsung-orange-book-1 click on button object'

testObj = findTestObject('Object Repository/Page_product/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page product samsung-orange-book-1 click on hyperlink cart --> navigate to Page cart'

testObj = findTestObject('Object Repository/Page_product/hyperlink_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page cart click on button object --> navigate to Page checkout info'

testObj = findTestObject('Object Repository/Page_cart/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page checkout info input on input object'

testObj = findTestObject('Object Repository/Page_checkout_info/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_object)

'step 10: At Page checkout info click on input object'

testObj = findTestObject('Object Repository/Page_checkout_info/input_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page checkout info click on button object --> navigate to Page checkout shipping-address'

testObj = findTestObject('Object Repository/Page_checkout_info/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page checkout shipping-address click on small object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/small_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 15: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_object)

'step 16: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_object_1)

'step 17: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_object_2)

'step 18: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_6_input_object_3)

'step 19: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_7_input_object_4)

'step 20: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_8_input_object_5)

'step 21: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_9_input_object_6)

'step 22: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 23: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 24: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_7')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_10_input_object_7)

'step 25: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 26: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_8')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_11_input_object_8)

'step 27: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_9')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_12_input_object_9)

'step 28: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_10')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_13_input_object_10)

'step 29: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_11')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_14_input_object_11)

'step 30: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_12')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_15_input_object_12)

'step 31: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_13')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_16_input_object_13)

'step 32: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_14')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_17_input_object_14)

'step 33: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 34: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 35: At Page checkout shipping-address click on button object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 36: At Page checkout shipping-address click on div object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 37: At Page checkout shipping-address click on label object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 38: At Page checkout shipping-address click on small object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/small_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 39: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 40: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_18_input_object)

'step 41: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_19_input_object_1)

'step 42: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_20_input_object_2)

'step 43: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_21_input_object_3)

'step 44: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_22_input_object_4)

'step 45: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_23_input_object_5)

'step 46: At Page checkout shipping-address input on input object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_object_6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_24_input_object_6)

'step 47: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 48: At Page checkout shipping-address click on select object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 49: At Page checkout shipping-address click on span object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 50: At Page checkout shipping-address click on button object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 51: Add visual checkpoint at Page checkout shipping-address'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify successful navigation to Samsung Orange Book Product Page and completing the checkout process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
