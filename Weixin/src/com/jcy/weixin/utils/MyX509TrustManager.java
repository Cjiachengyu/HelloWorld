package com.jcy.weixin.utils;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;


/**
 *  证书信任管理器（用于https请求） 
 *  这个证书管理器的作用就是让它信任我们指定的证书，上面的代码意味着信任所有证书，不管是否权威机构颁发。
 *  证书有了，通用的https请求方法就不难实现了
 *  
 * @author jiachengyu
 *
 * @date 2014年7月31日
 */
public class MyX509TrustManager implements X509TrustManager {  
	  
	    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {  
	    }  
	  
	    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {  
	    }  
	  
	    public X509Certificate[] getAcceptedIssuers() {  
	        return null;  
	    }  
}
