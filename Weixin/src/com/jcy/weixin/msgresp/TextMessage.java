package com.jcy.weixin.msgresp;

/**
 * 文本消息
 * 
 * @author jiachengyu
 *
 * @date 2014年7月31日
 */
public class TextMessage extends BaseMessage{

	// 回复的消息内容  
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
    
}
