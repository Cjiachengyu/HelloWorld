package com.jcy.weixin.pojo;

/**
 * ���Ӱ�ť ������ť��
 * 
 * @author jiachengyu
 *
 * @date 2014��7��31��
 */
public class ComplexButton extends Button{
	
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
	
}
