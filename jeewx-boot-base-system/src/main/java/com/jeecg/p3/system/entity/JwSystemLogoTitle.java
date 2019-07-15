package com.jeecg.p3.system.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>系统logo、title、head和footer设置表<br>
 * @author liwenhui
 * @since：2017年08月30日 18时15分25秒 星期三 
 * @version:1.0
 */
public class JwSystemLogoTitle implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 活动底部logo
	 * */
	private String huodongBottomCopyright;
	//update-begin--Author:zhangweijian  Date: 20181105 for：新增收费说明字段
	/**
	 * 收费说明
	 * */
	private String chargingDesc;
	public String getChargingDesc() {
		return chargingDesc;
	}
	public void setChargingDesc(String chargingDesc) {
		this.chargingDesc = chargingDesc;
	}
	//update-end--Author:zhangweijian  Date: 20181105 for：新增收费说明字段
	public String getHuodongBottomCopyright() {
		return huodongBottomCopyright;
	}
	public void setHuodongBottomCopyright(String huodongBottomCopyright) {
		this.huodongBottomCopyright = huodongBottomCopyright;
	}
	public String getId() {
}
