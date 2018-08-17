package jang.clt.func.view.sql_changer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import tool.ai.AI_IntenalFrame;

import javax.swing.JComboBox;

public class SqlChangerView extends AI_IntenalFrame {
    private static final long serialVersionUID = 1L;
    // IN 변환
    public JTextArea txtCbInput = null;
    public JTextArea txtInputResult = null;
    public JButton btnCbInputResult = null;
    public JComboBox<String> cbInput = null;
    
    // Query관련
    public JTextArea txtQuery = null;
    public JTextArea txtParam = null;
    public JTextArea txtaRegExp = null;
    public JTextArea txtQueryResult = null;
    public JButton btnResult = null;


    public SqlChangerView(){
    	setSize(new Dimension(720, 678));
    	getContentPane().setLayout(null);
    	
    	JPanel panInput = new JPanel();
    	panInput.setBackground(Color.LIGHT_GRAY);
    	panInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
    	panInput.setBounds(12, 10, 680, 165);
    	getContentPane().add(panInput);
    	panInput.setLayout(null);
    	
    	JLabel lblChange = new JLabel("文字変換");
    	lblChange.setBounds(12, 10, 115, 20);
    	panInput.add(lblChange);
    	
    	cbInput = new JComboBox<String>();
    	cbInput.setBounds(139, 10, 191, 20);
    	panInput.add(cbInput);
    	
    	JScrollPane scrCbInput = new JScrollPane();
    	scrCbInput.setBounds(10, 42, 320, 113);
    	panInput.add(scrCbInput);
    	
    	txtCbInput = new JTextArea();
    	txtCbInput.setBounds(0, 0, 200, 50);
    	scrCbInput.setViewportView(txtCbInput);
    	
    	JScrollPane scrInputResult = new JScrollPane();
    	scrInputResult.setBounds(342, 42, 326, 113);
    	panInput.add(scrInputResult);
    	
    	txtInputResult = new JTextArea();
    	txtInputResult.setBounds(0, 0, 200, 50);
    	scrInputResult.setViewportView(txtInputResult);
    	
    	btnCbInputResult = new JButton("変換");
    	btnCbInputResult.setBounds(571, 9, 97, 23);
    	panInput.add( btnCbInputResult);
    	
    	JButton btnInputClear = new JButton("クリア");
    	btnInputClear.setBounds(428, 9, 121, 23);
    	panInput.add(btnInputClear);
    	
    	JPanel panQuery = new JPanel();
    	panQuery.setBackground(Color.LIGHT_GRAY);
    	panQuery.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
    	panQuery.setBounds(12, 185, 680, 453);
    	getContentPane().add(panQuery);
    	panQuery.setLayout(null);
    	
    	JLabel lblQuery = new JLabel("クエリ入力");
    	lblQuery.setBounds(12, 10, 187, 20);
    	panQuery.add(lblQuery);
    	
    	JScrollPane scrQuery = new JScrollPane();
    	scrQuery.setBounds(12, 29, 656, 110);
    	panQuery.add(scrQuery);
    	
    	txtQuery = new JTextArea();
    	txtQuery.setBounds(0, 0, 200, 50);
    	scrQuery.setViewportView(txtQuery);
    	
    	JLabel lblParam = new JLabel("パラメータ入力");
    	lblParam.setBounds(12, 149, 202, 20);
    	panQuery.add(lblParam);
    	
    	JScrollPane scrParam = new JScrollPane();
    	scrParam.setBounds(12, 179, 656, 81);
    	panQuery.add(scrParam);
    	
    	txtParam = new JTextArea();
    	txtParam.setBounds(0, 0, 200, 50);
    	scrParam.setViewportView(txtParam);
    	
    	JLabel lblQueryResult = new JLabel("クエリ変換結果");
    	lblQueryResult.setBounds(12, 270, 202, 20);
    	panQuery.add(lblQueryResult);
    	
    	JScrollPane scrQueryResult = new JScrollPane();
    	scrQueryResult.setBounds(12, 300, 656, 110);
    	panQuery.add(scrQueryResult);
    	
    	txtQueryResult = new JTextArea();
    	txtQueryResult.setBounds(0, 0, 200, 50);
    	scrQueryResult.setViewportView(txtQueryResult);
    	
    	JButton btnQueryClear = new JButton("クリア");
    	btnQueryClear.setBounds(338, 420, 145, 23);
    	panQuery.add(btnQueryClear);
    	
    	btnResult = new JButton("貼り付け");
    	btnResult.setBounds(505, 420, 163, 23);
    	panQuery.add(btnResult);
    }
}
