package jang.clt.func.view.char_encode;

import java.awt.Dimension;

import javax.swing.JFrame;

import jang.cmn.CommonDisplay;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class CharEncodeView extends JFrame{
	
	protected JButton btnEncode = null;
	protected JTextArea txtSearch  = null;
	protected JTextArea txtResult = null;
	protected JTextArea txtHexResult = null;
	protected JButton btnHelp = null;
	protected JButton btnClear = null;
	protected JTextArea txtOctResult = null;
	
	public CharEncodeView() {
		getContentPane().setLayout(null);
		setSize(new Dimension(CommonDisplay.WIDTH_SIZE, CommonDisplay.HEIGHT_SIZE));
		setResizable(false);
		
		JPanel pnLeft = new JPanel();
		pnLeft.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnLeft.setBounds(12, 31, 290, 400);
		getContentPane().add(pnLeft);
		pnLeft.setLayout(null);
		
		JLabel lbl = new JLabel("Input Char");
		lbl.setBounds(12, 10, 77, 15);
		pnLeft.add(lbl);
		
		JScrollPane scrSearch = new JScrollPane();
		scrSearch.setBounds(10, 30, 270, 300);
		pnLeft.add(scrSearch);
		
		txtSearch = new JTextArea();
		txtSearch.setBounds(0, 0, 4, 24);
		txtSearch.setLineWrap(true);
		scrSearch.setViewportView(txtSearch);
		
		btnEncode = new JButton("Encoding");
		btnEncode.setBounds(193, 367, 85, 23);
		pnLeft.add(btnEncode);
		
		btnHelp = new JButton("Help");
		btnHelp.setBounds(12, 367, 73, 23);
		pnLeft.add(btnHelp);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(97, 367, 82, 23);
		pnLeft.add(btnClear);
		
		JPanel pnRigt = new JPanel();
		pnRigt.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnRigt.setBounds(322, 31, 290, 400);
		getContentPane().add(pnRigt);
		pnRigt.setLayout(null);
		
		JLabel lblHtmlResult = new JLabel("HTML");
		lblHtmlResult.setBounds(10, 10, 57, 15);
		pnRigt.add(lblHtmlResult);
		
		JScrollPane scrHtmlResult = new JScrollPane();
		scrHtmlResult.setBounds(10, 30, 270, 90);
		pnRigt.add(scrHtmlResult);
		
		txtResult = new JTextArea();
		txtResult.setBackground(java.awt.Color.PINK);
		txtResult.setBounds(0, 0, 4, 24);
		txtResult.setLineWrap(true);
		txtResult.setEditable(false);

		scrHtmlResult.setViewportView(txtResult);
		
		JLabel lblHexResult = new JLabel("Hex");
		lblHexResult.setBounds(10, 140, 57, 15);
		pnRigt.add(lblHexResult);
		
		JScrollPane scrHexResult = new JScrollPane();
		scrHexResult.setBounds(10, 165, 270, 90);
		pnRigt.add(scrHexResult);
		
		txtHexResult = new JTextArea();
		txtHexResult.setBackground(java.awt.Color.PINK);
		txtHexResult.setBounds(0, 0, 4, 24);
		txtHexResult.setLineWrap(true);
		txtHexResult.setEditable(false);

		scrHexResult.setViewportView(txtHexResult);
		
		JLabel lblNewLabel = new JLabel("Oct");
		lblNewLabel.setBounds(12, 275, 91, 15);
		pnRigt.add(lblNewLabel);
		
		JScrollPane scrOctResult = new JScrollPane();
		scrOctResult.setBounds(10, 300, 268, 90);
		pnRigt.add(scrOctResult);
		
		txtOctResult = new JTextArea();
		txtOctResult.setBackground(java.awt.Color.PINK);
		txtOctResult.setBounds(0, 0, 200, 50);
		txtOctResult.setLineWrap(true);
		scrOctResult.setViewportView(txtOctResult);
		
		JLabel lblTitleSearch = new JLabel("Encode(Search)");
		lblTitleSearch.setBounds(12, 10, 112, 15);
		getContentPane().add(lblTitleSearch);
		
		JLabel lblEncodeResult = new JLabel("Encode(Result)");
		lblEncodeResult.setBounds(316, 10, 95, 15);
		getContentPane().add(lblEncodeResult);

	}
	
	public void init(){}
	
	public void display(){}
	
	public void destroy() {}
	
}
