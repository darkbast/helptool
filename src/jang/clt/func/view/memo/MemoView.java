package jang.clt.func.view.memo;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemoView extends JFrame {
    public JTable table;
    public JMenuItem menuCateInsert = null;
    public JMenuItem menuCateDel = null;
    public JMenuItem menuCateUpd = null;
    public JButton btnCateSearch = null;
    public JComboBox cbCate = null;
    

    public MemoView() {
        getContentPane().setLayout(null);
        setSize(new Dimension(507, 571));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuCate = new JMenu("카테고리");
        menuBar.add(menuCate);

        menuCateInsert = new JMenuItem("카테고리 등록");
        menuCate.add(menuCateInsert);

        menuCateDel = new JMenuItem("카테고리 삭제");
        menuCate.add(menuCateDel);

        menuCateUpd = new JMenuItem("카테고리 변경");
        menuCate.add(menuCateUpd);

        JPanel pTitle01 = new JPanel();
        pTitle01.setBounds(12, 10, 472, 81);
        getContentPane().add(pTitle01);
        pTitle01.setLayout(null);

        JLabel lblTitle = new JLabel("검색기능");
        lblTitle.setBounds(12, 10, 57, 15);
        pTitle01.add(lblTitle);

        JPanel pContent01 = new JPanel();
        pContent01.setBounds(12, 35, 395, 36);
        pTitle01.add(pContent01);
        pContent01.setLayout(null);

        JLabel lblCate = new JLabel("카테고리");
        lblCate.setBounds(12, 10, 57, 15);
        pContent01.add(lblCate);

        cbCate = new JComboBox();
        cbCate.setBounds(68, 7, 185, 21);
        pContent01.add(cbCate);

        btnCateSearch = new JButton("카테고리검색");
        btnCateSearch.setBounds(265, 6, 119, 23);
        pContent01.add(btnCateSearch);

        JPanel pDevNote = new JPanel();
        pDevNote.setBounds(12, 360, 472, 141);
        getContentPane().add(pDevNote);
        pDevNote.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setText("1.무엇으로 검색내용을 표현할 것인가?테이블?\r\n2.");

        JLabel label_1 = new JLabel("개발메모");
        label_1.setBounds(12, 7, 57, 15);
        pDevNote.add(label_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(5, 25, 428, 110);
        scrollPane.setViewportView(textArea);
        pDevNote.add(scrollPane);

        JPanel panel = new JPanel();
        panel.setBounds(12, 101, 472, 223);
        getContentPane().add(panel);
        panel.setLayout(null);

;

        JScrollPane sp = new JScrollPane();
        sp.setBounds(12, 35, 437, 161);
        table = new JTable();
        panel.add(sp);
        sp.setViewportView(table);

        JLabel lblResult = new JLabel("결과");
        lblResult.setBounds(12, 10, 57, 15);
        panel.add(lblResult);
    }

    public void displayMenu() {

    }
}
