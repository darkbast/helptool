package tool.sql;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

import tool.ai.AI_IntenalFrame;

public class SqlPutValView extends AI_IntenalFrame {
    private static final long serialVersionUID = 1L;
    public JTextArea txtaQuery = null;
    public JTextArea txtaParam = null;
    public JTextArea txtaRegExp = null;
    public JTextArea txtaResult = null;
    public JButton btnResult = null;


    public SqlPutValView(){
    	setSize(new Dimension(720, 750));
    	getContentPane().setLayout(null);
    	
    	JPanel panInput = new JPanel();
    	panInput.setBackground(Color.LIGHT_GRAY);
    	panInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
    	panInput.setBounds(12, 10, 680, 165);
    	getContentPane().add(panInput);
    	panInput.setLayout(null);
    	
    	JLabel lblChange = new JLabel("Comma / In Create");
    	lblChange.setBounds(12, 10, 115, 20);
    	panInput.add(lblChange);
    	
    	JComboBox cbInput = new JComboBox();
    	cbInput.setBounds(139, 10, 191, 20);
    	panInput.add(cbInput);
    	
    	JScrollPane scrCbInput = new JScrollPane();
    	scrCbInput.setBounds(10, 42, 320, 113);
    	panInput.add(scrCbInput);
    	
    	JTextArea txtCbInput = new JTextArea();
    	txtCbInput.setBounds(0, 0, 200, 50);
    	scrCbInput.setViewportView(txtCbInput);
    	
    	JScrollPane scrInputResult = new JScrollPane();
    	scrInputResult.setBounds(342, 42, 326, 113);
    	panInput.add(scrInputResult);
    	
    	JTextArea txtInputResult = new JTextArea();
    	txtInputResult.setBounds(0, 0, 200, 50);
    	scrInputResult.setViewportView(txtInputResult);
    	
    	JButton btnNewButton_2 = new JButton("Change");
    	btnNewButton_2.setBounds(571, 9, 97, 23);
    	panInput.add(btnNewButton_2);
    	
    	JButton btnInputClear = new JButton("Clear");
    	btnInputClear.setBounds(462, 9, 97, 23);
    	panInput.add(btnInputClear);
    	
    	JPanel panQuery = new JPanel();
    	panQuery.setBackground(Color.LIGHT_GRAY);
    	panQuery.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
    	panQuery.setBounds(12, 248, 680, 453);
    	getContentPane().add(panQuery);
    	panQuery.setLayout(null);
    	
    	JLabel lblQuery = new JLabel("Query");
    	lblQuery.setBounds(12, 10, 100, 20);
    	panQuery.add(lblQuery);
    	
    	JScrollPane scrQuery = new JScrollPane();
    	scrQuery.setBounds(12, 29, 656, 110);
    	panQuery.add(scrQuery);
    	
    	JTextArea txtQuery = new JTextArea();
    	txtQuery.setBounds(0, 0, 200, 50);
    	scrQuery.setViewportView(txtQuery);
    	
    	JLabel lblParam = new JLabel("Param");
    	lblParam.setBounds(12, 149, 100, 20);
    	panQuery.add(lblParam);
    	
    	JScrollPane scrParam = new JScrollPane();
    	scrParam.setBounds(12, 179, 656, 81);
    	panQuery.add(scrParam);
    	
    	JTextArea txtParam = new JTextArea();
    	txtParam.setBounds(0, 0, 200, 50);
    	scrParam.setViewportView(txtParam);
    	
    	JLabel lblQueryResult = new JLabel("Result Query");
    	lblQueryResult.setBounds(12, 270, 100, 20);
    	panQuery.add(lblQueryResult);
    	
    	JScrollPane scrQueryResult = new JScrollPane();
    	scrQueryResult.setBounds(12, 300, 656, 110);
    	panQuery.add(scrQueryResult);
    	
    	JTextArea txtQueryResult = new JTextArea();
    	txtQueryResult.setBounds(0, 0, 200, 50);
    	scrQueryResult.setViewportView(txtQueryResult);
    	
    	JButton btnQueryClear = new JButton("Clear");
    	btnQueryClear.setBounds(462, 420, 97, 23);
    	panQuery.add(btnQueryClear);
    	
    	JButton btnQueryResult = new JButton("Change");
    	btnQueryResult.setBounds(571, 420, 97, 23);
    	panQuery.add(btnQueryResult);
    	
    	JButton btnNewButton_3 = new JButton("Help");
    	btnNewButton_3.setBounds(619, 187, 73, 51);
    	getContentPane().add(btnNewButton_3);
    	
    	JScrollPane scrStatus = new JScrollPane();
    	scrStatus.setBounds(12, 181, 595, 62);
    	getContentPane().add(scrStatus);
    	
    	JTextArea txtStatus = new JTextArea();
    	txtStatus.setBounds(0, 0, 200, 50);
    	txtStatus.setForeground(new Color(255, 0, 0));
    	scrStatus.setViewportView(txtStatus);
    }
}
