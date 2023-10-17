import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category dlya-devushek'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/dlya-devushek')

'step 2: Add visual checkpoint at Page category dlya-devushek'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Category Dlya Devushek Page Navigation and Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
