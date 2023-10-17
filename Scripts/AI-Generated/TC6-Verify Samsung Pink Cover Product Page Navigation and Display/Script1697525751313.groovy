import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page product samsung-pink-cover'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/samsung-pink-cover')

'step 2: Add visual checkpoint at Page product samsung-pink-cover'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Samsung Pink Cover Product Page Navigation and Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
