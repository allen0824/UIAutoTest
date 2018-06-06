package com.demo.test.pages;

import org.openqa.selenium.By;

public class HomePage {
	//登录后-用户名显示区域
	public static final By HP_TEXT_USERNAME= By.xpath("html/body/div[2]/div[1]/div/span[7]/a[1]");
	
	//登录后-退出按钮
	public static final By HP__BUTTON_LOGINOUT = By.xpath("//*[@id='loginOut']");
	
	//登录后-banner账户中心
	public static final By HP_BUTTON_ACCOUNTCENTER = By.xpath("//*[@id='static_banner_login']/a[1]");
	
	//首页顶部请登录按钮
	public static final By HP_BUTTON_TOPLOGIN = By.xpath("//*[@id='login_bt']/a[1]");
	
	//首页banner马上登陆按钮
	public static final By HP_BUTTON_BANNERLOGIN = By.xpath("//*[@id='static_banner_login']/a[2]");
	
	//首页顶部免费注册按钮
	public static final By HP_BUTTON_TOPREGISTER = By.xpath("//*[@id='login_bt']/a[2]");
	
	//首页banner免费注册按钮
	public static final By HP_BUTTON_BANNERREGISTER = By.xpath("//*[@id='static_banner_login']/a[1]");
	
	//首页首页按钮
	public static final By HP_BUTTON_HOMEPAGE = By.xpath("//*[@title='首页']");
	
	//我要投资按钮
	public static final By HP_BUTTON_INVEST = By.xpath("//*[@class='two']/div[1]/div[1]/a[1]");
	
	//我要借款按钮
	public static final By HP_BUTTON_LOAN = By.xpath("//*[@class='rela']/div[1]/div[1]/a[1]");
	
	//新手导航按钮
	public static final By HP_BUTTON_NOVICEGUIDE = By.xpath("//*[@class='rela']/a[1]");
	
	//社区按钮
	public static final By HP_BUTTON_CLUB = By.xpath("//*[@class='nav clearfix']/li[5]/a[1]");	
	
	//信息披露按钮
	public static final By HP_BUTTON_MESSAGESHOW =By.xpath("//*[@class='two']/a[1]");
	
	//头像按钮
	public static final By HP_BUTTON_HEADSCULPTRUE = By.id("//*[@id='small-tx']");
	
	//我的账户按钮
	public static final By HP_BUTTON_MYCCOUNT = By.xpath("//*[@class='Ledger_name pad_t5']/a[1]");
	
	//公告栏更多按钮
	public static final By HP_BUTTON_NOTICEMORE = By.xpath("//*[@class='fr moregonggao mar_r20']/a[1]");
	
	//安全风控
	public static final By HP_BUTTON_SECURITYRISK = By.xpath("//*[@class='index_tese clearfix']/li[1]");
	
	//历史收益
	public static final By HP_BUTTON_HISTORYINCOME = By.xpath("//*[@class='index_tese clearfix']/li[2]");
	
	//高流动性
	public static final By HP_BUTTON_HIGHFLUIDITY = By.xpath("//*[@class='index_tese clearfix']/li[3]");
	
	//资深平台
	public static final By HP_BUTTON_SENIORPLATFORM= By.xpath("//*[@class='index_tese clearfix']/li[4]");
}
