package jang.cmn.view;

import java.util.List;

import javax.swing.JComboBox;

public class ExtCombo<E> extends JComboBox<E> {
	private static final long serialVersionUID = 1L;

	public void addItems(List<E> list){
		if (null == list || 0 == list.size()){
			
		}else{
			for (E val : list){
				addItem((E)val);
			}
		}
	}
	
	public void addItems(List<E> list, boolean space){
		if (null == list || 0 == list.size()){
			
		}else{
			if(space){
				addItem(null);
			}
			
			for (E val : list){
				addItem((E)val);
			}
		}
	}
}
