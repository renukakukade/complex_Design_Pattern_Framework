package commonFunctionWeb;

import org.openqa.selenium.WebElement;

public class WebElementCommon {


		/*
		 * Desc: - This Method is use to validate, if element is present in DOM
		 * Param: - WebElement
		 * Return: - Boolean
		 */
		public static boolean isPresent(WebElement element){
			boolean isPre = false;
			if(element.isDisplayed()){
				isPre = true;
			}
			return isPre;
		}
		
		public static boolean isClickable(WebElement element){
			boolean isClick = false;
			if(isPresent(element)){
				if(element.isEnabled()){
					isClick = true;
				}
			}
			return isClick;
		}
	}


