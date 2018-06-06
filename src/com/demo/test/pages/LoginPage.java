package com.demo.test.pages;

import org.openqa.selenium.By;
/**
 * @author liuyan
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
	/**用户名输入框*/
	public static final By LP_INPUT_USERNAME = By.id("username");
	
	/**手机号输入框*/
	public static final By LP_INPUT_PHONE = By.id("username");
	
	/**邮箱输入框*/
	public static final By LP_INPUT_EMAIL = By.id("username");
	
	/**密码输入框*/
	public static final By LP_INPUT_PASSWORD = By.id("pwd");
	
	/**登录按钮*/
	public static final By LP_BUTTON_LOGIN = By.id("userLoginBtn");
	
	/**登录错误信息*/
	public static final By LP_TEXT_ERROR= By.xpath("//*[@id='errorMsg']/div/span");

	
	
}
