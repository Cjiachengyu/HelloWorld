package com.jcy.weixin.utils;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;


/**
 *  ֤�����ι�����������https���� 
 *  ���֤������������þ���������������ָ����֤�飬����Ĵ�����ζ����������֤�飬�����Ƿ�Ȩ�������䷢��
 *  ֤�����ˣ�ͨ�õ�https���󷽷��Ͳ���ʵ����
 *  
 * @author jiachengyu
 *
 * @date 2014��7��31��
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
