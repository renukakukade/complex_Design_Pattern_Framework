package commonFunctionWeb;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
		public static void sendInput(WebElement textBox,String text) {
			textBox.sendKeys(text);
		}

		public static void clearText(WebElement textBox) {
			textBox.clear();

		}
	}


