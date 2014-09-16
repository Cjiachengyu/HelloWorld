package com.jcy.weixin.msgresp;

/**
 * 音频消息
 * 
 * @author jiachengyu
 *
 * @date 2014年7月31日
 */
public class MusicMessage extends BaseMessage{

	// 音乐  
    private Music Music;  
  
    public Music getMusic() {  
        return Music;  
    }  
  
    public void setMusic(Music music) {  
        Music = music;  
    }  
    
}
