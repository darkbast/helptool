package jang.clt.func.view.memo;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemoCate extends JDialog {
    private JTextField txtOrg;
    private JTextField txtChg;
    private JButton btnDel;
    public MemoCate(){
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(12, 10, 410, 39);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblMode = new JLabel("모드");
        lblMode.setBounds(12, 10, 57, 15);
        panel.add(lblMode);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(12, 59, 410, 44);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        txtOrg = new JTextField();
        txtOrg.setBounds(12, 10, 143, 21);
        panel_1.add(txtOrg);
        txtOrg.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("TO");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(179, 13, 39, 15);
        panel_1.add(lblNewLabel_1);
        
        txtChg = new JTextField();
        txtChg.setBounds(255, 10, 143, 21);
        panel_1.add(txtChg);
        txtChg.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(12, 113, 410, 44);
        getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JButton btnInsert = new JButton("등록");
        btnInsert.setBounds(12, 10, 97, 23);
        panel_2.add(btnInsert);
        
        JButton btnUpdate = new JButton("갱신");
        btnUpdate.setBounds(123, 10, 97, 23);
        panel_2.add(btnUpdate);
        
        btnDel = new JButton("삭제");
        btnDel.setBounds(237, 10, 97, 23);
        panel_2.add(btnDel);
        
    }
    
    public void init(){
        txtOrg.setText("");
        txtChg.setText("");
        
        
    }
}
