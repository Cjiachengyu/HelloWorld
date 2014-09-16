package com.jcy.weixin.msgreq;

/**
 * 图片消息
 * 
 * @author jiachengyu
 *
 * @date 2014年7月31日
 */
public class ImageMessage extends BaseMessage{

	 // 图片链接  
    private String PicUrl;  
  
    public String getPicUrl() {  
        return PicUrl;  
    }  
  
    public void setPicUrl(String picUrl) {  
        PicUrl = picUrl;  
    }  
    
}
