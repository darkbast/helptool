package jang.clt.func.view.help;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import jang.cmn.view.ExtCombo;
import jang.cmn.view.WndFrame;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class HelpView extends WndFrame {
    public JTextField txtTitle;
    public JButton btnInsertHelp = null;
    public JButton btnSearch = null;
    public JTable tblResult;
    public ExtCombo<String> cbTag = null;
    public ExtCombo<String> cbDiv1 = null;
    public ExtCombo<String> cbDiv2 = null;
    public ExtCombo<String> cbDiv3 = null;
    public JTextField txtHelpStatus = null;

    public HelpView() {
        getContentPane().setLayout(null);
        setSize(new Dimension(683, 631));
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 11, 666, 97);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblHelpStatus = new JLabel("Status");
        lblHelpStatus.setBounds(10, 11, 46, 14);
        panel.add(lblHelpStatus);
        
        txtHelpStatus = new JTextField();
        txtHelpStatus.setEditable(false);
        txtHelpStatus.setBounds(10, 33, 646, 53);
        panel.add(txtHelpStatus);
        txtHelpStatus.setColumns(10);
        JPanel panOtherFunc = new JPanel();
        panOtherFunc.setBounds(0, 119, 666, 102);
        getContentPane().add(panOtherFunc);
        panOtherFunc.setLayout(null);

        JLabel lblOtherFunction = new JLabel("Other Function");
        lblOtherFunction.setBounds(12, 10, 82, 15);
        panOtherFunc.add(lblOtherFunction);

        JPanel panelOtherFuncArea = new JPanel();
        panelOtherFuncArea.setBounds(12, 35, 642, 42);
        panOtherFunc.add(panelOtherFuncArea);
        panelOtherFuncArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panelOtherFuncArea.setLayout(null);

        btnInsertHelp = new JButton("Insert Help");
        btnInsertHelp.setBounds(12, 10, 97, 23);
        panelOtherFuncArea.add(btnInsertHelp);

        JPanel panelInput = new JPanel();
        panelInput.setBounds(0, 232, 666, 174);
        getContentPane().add(panelInput);
        panelInput.setLayout(null);

        JLabel lblNewLabel = new JLabel("Input Area");
        lblNewLabel.setBounds(12, 10, 57, 15);
        panelInput.add(lblNewLabel);

        JPanel panelInputArea = new JPanel();
        panelInputArea.setBounds(12, 35, 642, 124);
        panelInput.add(panelInputArea);
        panelInputArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panelInputArea.setLayout(null);

        JLabel lblTag = new JLabel("Tag (*)");
        lblTag.setBounds(12, 10, 68, 15);
        panelInputArea.add(lblTag);

        cbTag = new ExtCombo<String>();
        cbTag.setBounds(92, 7, 100, 21);
        panelInputArea.add(cbTag);

        JLabel lblDiv1 = new JLabel("Division(L)");
        lblDiv1.setBounds(12, 35, 68, 15);
        panelInputArea.add(lblDiv1);

        cbDiv1 = new ExtCombo<String>();
        cbDiv1.setBounds(92, 32, 100, 21);
        panelInputArea.add(cbDiv1);

        JLabel lblDiv2 = new JLabel("Division(M)");
        lblDiv2.setBounds(228, 35, 68, 15);
        panelInputArea.add(lblDiv2);

        cbDiv2 = new ExtCombo<String>();
        cbDiv2.setBounds(308, 32, 100, 21);
        panelInputArea.add(cbDiv2);

        JLabel lblDiv3 = new JLabel("Division(S)");
        lblDiv3.setBounds(450, 35, 68, 15);
        panelInputArea.add(lblDiv3);

        cbDiv3 = new ExtCombo<String>();
        cbDiv3.setBounds(530, 32, 100, 21);
        panelInputArea.add(cbDiv3);

        JLabel lblTitle = new JLabel("Title");
        lblTitle.setBounds(12, 60, 68, 15);
        panelInputArea.add(lblTitle);

        txtTitle = new JTextField();
        txtTitle.setBounds(92, 57, 538, 21);
        panelInputArea.add(txtTitle);
        txtTitle.setColumns(10);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(533, 88, 97, 23);
        panelInputArea.add(btnSearch);

        JPanel panelResult = new JPanel();
        panelResult.setBounds(0, 417, 666, 164);
        getContentPane().add(panelResult);
        panelResult.setLayout(null);

        JScrollPane scrResult = new JScrollPane();
        scrResult.setBounds(12, 35, 642, 119);
        panelResult.add(scrResult);

        tblResult = new JTable();
        tblResult.setBounds(0, 0, 1, 1);
        scrResult.setViewportView(tblResult);

        JLabel lblResult = new JLabel("Result Area");
        lblResult.setBounds(12, 10, 97, 15);
        panelResult.add(lblResult);
    }

    @Override
    public Object getWnd(Object t) {
        // TODO Auto-generated method stub
        return super.getWnd(t);
    }
}
