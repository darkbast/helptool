package jang.clt.func.view.help;

import static jang.cmn.util.db.CommonTable.*;
import static jang.cmn.util.db.SqliteDataBase.conn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;

import jang.clt.dto.MHelpDto;
import jang.cmn.util.db.CommonQuery;
import jang.cmn.util.db.MT_HELP;

public class Help extends HelpView {

    private Connection helpConn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private HelpEdit helpEdit = null;
    private Object ret = null;
    private MT_HELP mtQuery = null;

    private List<String> tagList = null;
    private List<String> div1List = null;
    private List<String> div2List = null;
    private List<String> div3List = null;

    public Help() {
        init();
        initListener();
        db();
        display();
        logic();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mtQuery = new MT_HELP();
        setVisible(true);
    }

    public void initListener() {
        btnInsertHelp.addActionListener(insertHelpListener);
        btnSearch.addActionListener(searchListener);
    }

    public void db() {
        try {
            // conn.SqliteDataBase sdb = new SqliteDataBase("test.db");
            // helpConn = sdb.getConnection();
            CommonQuery query = new CommonQuery();
            ps = conn.prepareStatement(query.mHelpCount());
            rs = ps.executeQuery();
            int cnt = rs.getInt("cnt");
            if (0 == cnt) {
                txtHelpStatus.setText("No Data");
                return;
            }

            // Get Tag
            ps = conn.prepareStatement(mtQuery.getTagByMHelp());
            rs = ps.executeQuery();
            tagList = new LinkedList<String>();

            while (rs.next()) {
                tagList.add(rs.getString(TAG));
            }

            // Get Div1
            ps = conn.prepareStatement(mtQuery.getDiv1ByMHelp());
            rs = ps.executeQuery();
            div1List = new LinkedList<String>();

            // Get Div1
            while (rs.next()) {
                div1List.add(rs.getString(DIV1));
            }

            // Get Div2
            ps = conn.prepareStatement(mtQuery.getDiv2ByMHelp());
            rs = ps.executeQuery();
            div2List = new LinkedList<String>();
            while (rs.next()) {
                div2List.add(rs.getString(DIV2));
            }

            // Get Div3
            ps = conn.prepareStatement(mtQuery.getDiv3ByMHelp());
            rs = ps.executeQuery();
            div3List = new LinkedList<String>();
            while (rs.next()) {
                div3List.add(rs.getString(DIV3));
            }
        } catch (Exception e) {

        }
    }

    public void display() {
        cbTag.addItems(tagList, true);
        cbDiv1.addItems(div1List, true);
        cbDiv2.addItems(div2List, true);
        cbDiv3.addItems(div3List, true);
    }

    public void logic() {

    }

    private ActionListener insertHelpListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // 에디터가 이미 존재한다면 기존에 내용 해제?
                if (null != helpEdit) {
                    // helpEdit.dispose();
                    // helpEdit = null;
                } else {
                    helpEdit = new HelpEdit();
                    helpEdit.addWindowListener(insertHelpWnd);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    };

    private ActionListener searchListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String tag = (String) cbTag.getSelectedItem();
                String div1 = (String) cbDiv1.getSelectedItem();
                String div2 = (String) cbDiv2.getSelectedItem();
                String div3 = (String) cbDiv3.getSelectedItem();

                CommonQuery query = new CommonQuery();
                ps = conn.prepareStatement(mtQuery.getTHelp(tag, div1, div2, div3));
                rs = ps.executeQuery();

            } catch (SQLException se) {

            }
            // tblResult.
        }
    };

    private WindowListener insertHelpWnd = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {

            if (e.getSource() instanceof HelpEdit == false) {
                return;
            }

            helpEdit = (HelpEdit) e.getSource();
            helpEdit.removeWindowListener(insertHelpWnd);
            ret = helpEdit.getResult();
            helpEdit = null;
        }
    };
}
