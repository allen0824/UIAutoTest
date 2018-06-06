package com.demo.test.pageshelper;

import org.apache.log4j.Logger;
import com.demo.test.pages.HomePage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author liuyan
 * @desciption 首页帮助类：专门提供在这个页面进行操作的方法封装*/
public class HomePageHelper {
	//提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(HomePageHelper.class);
	
	/**
	 * @author liuyan
	 * @description 登录前-等待首页登录按钮加载
	 * @param seleniumUtil selenium api封装引用对象
	 * @param timeOut 等待元素超时的时间
	 * */
	public static void waitHomeLoginButtonLoad(SeleniumUtil seleniumUtil,int timeOut){
		logger.info("开始等待首页元素加载");
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_TOPLOGIN);
		logger.info("首页登录按钮加载完毕");
		seleniumUtil.click(HomePage.HP_BUTTON_TOPLOGIN);
		
	}
	
	/**
	 * @author liuyan
	 * @description 登录后-等待首页元素加载
	 * @param seleniumUtil selenium api封装引用对象
	 * @param timeOut 等待元素超时的时间
	 * */
	public static void waitHomePageLoad(SeleniumUtil seleniumUtil,int timeOut){
		logger.info("开始等待首页元素加载");
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERNAME);
		logger.info("首页元素加载完毕");
		
	}
	
	/**
	 * @author liuyan
	 * @Description 登录成功之后验证用户名是否显示正确
	 * */
	public static void checkUserName(SeleniumUtil seleniumUtil,int timeOut,String username){
		logger.info("开始检查用户名是不是："+username);
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_USERNAME),username);
		logger.info("用户名检查完毕,用户名是："+username);
		
	}
	
	/**
	 * @author liuyan
	 * @Description 用户登出
	 * */
	public static void loginOut(SeleniumUtil seleniumUtil,int timeOut){
		logger.info("等待首页退出按钮加载");
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERNAME);
		logger.info("退出按钮加载完毕");
		seleniumUtil.click(HomePage.HP_TEXT_USERNAME);
		
	}


}
