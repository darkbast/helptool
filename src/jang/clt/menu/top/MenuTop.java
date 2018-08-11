package jang.clt.menu.top;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jang.clt.func.view.char_encode.CharEncode;
import jang.clt.func.view.help.Help;
import jang.clt.func.view.help.HelpEdit;
import jang.clt.func.view.sql_changer.SqlChanger;

public class MenuTop extends MenuTopView {
	private SqlChanger sqlChanger = null;
	private CharEncode charEncode = null;
	private Help help = null;
	
	public MenuTop(){
		init();
		initListener();
	}
	
	public void init(){
	}
	
	public void initListener(){
		btnSql.addActionListener(sqlAction);
		btnEncode.addActionListener(encodeAction);
		btnLogin.addActionListener(loginAction);
		btnHelpEdit.addActionListener(helpEditAction);
	}
	
	private ActionListener sqlAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (null == sqlChanger){
				sqlChanger = new SqlChanger();
			}else{
				
			}
		}
	};

	private ActionListener encodeAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (null == charEncode){
				charEncode = new CharEncode();
			}else{
				
			}
		}
	};
	
	private ActionListener helpEditAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (null == help){
				help = new Help();
			}else{
				
			}		
		}
	};	
	private ActionListener loginAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
}
