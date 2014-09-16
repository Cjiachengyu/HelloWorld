package com.jcy.weixin.pojo;

/**
 * view类型的菜单，点击可以直接打开网页
 * 
 * @author jiachengyu
 *
 * @date 2014年8月1日
 */
public class ViewButton extends Button {  
    private String type;  
    private String url;  
  
    public String getType() {  
        return type;  
    }  
  
    public void setType(String type) {  
        this.type = type;  
    }  
  
    public String getUrl() {  
        return url;  
    }  
  
    public void setUrl(String url) {  
        this.url = url;  
    }  
}  