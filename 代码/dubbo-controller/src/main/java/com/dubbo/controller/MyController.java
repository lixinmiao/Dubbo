package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.service.TestService;
import com.gistandard.dubbo.CouponDubboService;
import com.gistandard.dubbo.bean.CheckHaveCouponBean;
import com.gistandard.dubbo.bean.DataResultBean;

/**
 * controller
 * @author hwy
 *
 */
@Controller
public class MyController {
	
	/*@Autowired
	private TestService testService;*/
	
	@Autowired
	private CouponDubboService couponDubboService;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String testSay(){
		CheckHaveCouponBean checkHaveCouponBean=new CheckHaveCouponBean();
		checkHaveCouponBean.setAccountCode("CN0002502520000");
		checkHaveCouponBean.setCityCode("3195");
		checkHaveCouponBean.setProductType("OTCYSEX");
		DataResultBean bean=couponDubboService.checkHaveCoupons(checkHaveCouponBean);
		return bean.getErrorCode();
	}
	
}
