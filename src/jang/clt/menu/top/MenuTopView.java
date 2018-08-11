package jang.clt.menu.top;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuTopView extends JFrame{

	public JButton btnLogin = null;
	public JButton btnHelpEdit = null;
	public JButton btnSql = null;
	public JButton btnEncode = null;

	public MenuTopView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(250,195);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 213, 132);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblTitle1 = new JLabel("Helper");
		lblTitle1.setBounds(10, 11, 46, 14);
		panel.add(lblTitle1);

		JLabel lblNewLabel = new JLabel("Charact");
		lblNewLabel.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 29, 89, 23);
		panel.add(btnLogin);

		btnHelpEdit = new JButton("Help Edit");
		btnHelpEdit.setBounds(109, 29, 89, 23);
		panel.add(btnHelpEdit);

		btnEncode = new JButton("Encode");
		btnEncode.setBounds(10, 97, 89, 23);
		panel.add(btnEncode);

		btnSql = new JButton("SQL");
		btnSql.setBounds(109, 97, 89, 23);
		panel.add(btnSql);
		setVisible(true);
	}
}
