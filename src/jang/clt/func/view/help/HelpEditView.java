package jang.clt.func.view.help;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;

public class HelpEditView extends JFrame {
    public JTextField txtTag = null;
    public JTextField txtDiv1 = null;
    public JTextField txtDiv2 = null;
    public JTextField txtDiv3 = null;
    public JButton btnUpdate = null;
    private JButton btnUpda1;
    public JButton btnInsert = null;
    private JButton btnInsert1;
    public JButton btnDelete = null;
    public JTextField txtTitle = null;
    public JTextArea txtContents = null;
    public JTextArea txtStatus = null;

    public HelpEditView() {
        getContentPane().setLayout(null);
        setSize(new Dimension(612, 630));

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(12, 140, 572, 338);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(12, 34, 548, 118);
        panel.add(panel_2);
        panel_2.setLayout(null);

        txtTag = new JTextField();
        txtTag.setBounds(112, 10, 436, 21);
        panel_2.add(txtTag);
        txtTag.setColumns(10);

        JLabel lblTag = new JLabel("Tag");
        lblTag.setBounds(0, 13, 100, 15);
        panel_2.add(lblTag);

        txtDiv1 = new JTextField();
        txtDiv1.setBounds(112, 35, 436, 21);
        panel_2.add(txtDiv1);
        txtDiv1.setColumns(10);

        JLabel lblDiv1 = new JLabel("Division(L)");
        lblDiv1.setBounds(0, 38, 100, 15);
        panel_2.add(lblDiv1);

        JLabel lblDiv2 = new JLabel("Division(M)");
        lblDiv2.setBounds(0, 66, 100, 15);
        panel_2.add(lblDiv2);

        txtDiv2 = new JTextField();
        txtDiv2.setBounds(112, 63, 436, 21);
        panel_2.add(txtDiv2);
        txtDiv2.setColumns(10);

        txtDiv3 = new JTextField();
        txtDiv3.setBounds(112, 88, 436, 21);
        panel_2.add(txtDiv3);
        txtDiv3.setColumns(10);

        JLabel lblDiv3 = new JLabel("Division(S)");
        lblDiv3.setBounds(0, 91, 100, 15);
        panel_2.add(lblDiv3);

        JLabel lblMhelp = new JLabel("M_HELP");
        lblMhelp.setBounds(12, 9, 57, 15);
        panel.add(lblMhelp);

        JLabel lblNewLabel = new JLabel("T_HELP");
        lblNewLabel.setBounds(12, 162, 57, 15);
        panel.add(lblNewLabel);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(12, 184, 548, 139);
        panel.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Title");
        lblNewLabel_1.setBounds(0, 10, 57, 15);
        panel_3.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Contents");
        lblNewLabel_2.setBounds(0, 35, 57, 15);
        panel_3.add(lblNewLabel_2);

        txtTitle = new JTextField();
        txtTitle.setBounds(112, 7, 436, 21);
        panel_3.add(txtTitle);
        txtTitle.setColumns(10);

        txtContents = new JTextArea();
        txtContents.setLineWrap(true);
        txtContents.setBounds(112, 35, 436, 94);
        panel_3.add(txtContents);

        JPanel panelBtn = new JPanel();
        panelBtn.setBounds(12, 494, 572, 92);
        getContentPane().add(panelBtn);
        panelBtn.setLayout(null);

        btnInsert = new JButton("Insert");
        btnInsert.setBounds(0, 10, 100, 72);
        panelBtn.add(btnInsert);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(112, 10, 97, 72);
        panelBtn.add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(472, 10, 100, 72);
        panelBtn.add(btnDelete);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(12, 10, 572, 110);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_5 = new JLabel("Status");
        lblNewLabel_5.setBounds(12, 10, 57, 15);
        panel_1.add(lblNewLabel_5);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 35, 548, 65);
        panel_1.add(scrollPane);

        txtStatus = new JTextArea();
        txtStatus.setForeground(Color.RED);
        txtStatus.setEditable(false);
        txtStatus.setText("Mode Insert");
        txtStatus.setBounds(0, 0, 4, 24);
        scrollPane.setViewportView(txtStatus);
    }

}
