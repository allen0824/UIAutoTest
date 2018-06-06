package com.demo.test.testcases.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

public class LoginPage_002_LoginFailFunction extends BaseParpare {
  @Test(dataProvider = "testData")
  public void loginPage_004_LoginWithWrongPwd(Map<String, String>data) {
	  //等待首页登录按钮加载
	  HomePageHelper.waitHomeLoginButtonLoad(seleniumUtil, timeOut);
	  //等待登录按钮加载
	  LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
	  //输入用户名密码
	  LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"),data.get("PASSWORD"));
	  //等待错误信息加载
	  LoginPageHelper.waitLoginErrorInfo(seleniumUtil, timeOut);
	  //验证登录失败信息
	  LoginPageHelper.checkLoginErrorInfo(seleniumUtil, data.get("ERROR"));
	  //跳转网站首页
	  seleniumUtil.get(webUrl);
  }
}
