package com.jcy.weixin.pojo;

/**
 * 微信通用借口凭证
 * @author jiachengyu
 *
 * @date 2014年7月31日
 */
public class AccessToken {

	//获取到的凭证
	private String token;
	
	//凭证的有效时间，单位：秒
	private int expiresIn;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
	
	
}
