package jang.clt.func.view.help;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

import jang.cmn.util.db.MT_HELP;

import static cmn.util.CHECK_UTIL.*;
import static jang.cmn.util.db.SqliteDataBase.*;

public class HelpEdit extends HelpEditView {

    Connection helpEditConn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private Object ret = null;

    public HelpEdit() {
        init();
        initListener();
        db();
        display();
        logic();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void initListener() {
        btnInsert.addActionListener(insertListener);
        btnUpdate.addActionListener(updateListener);
        btnDelete.addActionListener(deleteListener);
    }

    public void db() {
        try {
            helpEditConn = conn;
        } catch (Exception e) {

        }
    }

    public void display() {

    }

    public void logic() {

    }

    private ActionListener insertListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int insMstCnt = 0;
            int insDetailCnt = 0;
            String ret = "";

            try {
                MT_HELP mtHelp = new MT_HELP();

                String tag = txtTag.getText();
                String div1 = txtDiv1.getText();
                String div2 = txtDiv2.getText();
                String div3 = txtDiv3.getText();

                String title = txtTitle.getText();
                String contents = txtContents.getText();

                if (isEmpty(tag)) {
                    return;
                }

                String[] paramMst = new String[] { tag, div1, div2, div3, "0" };

                ps = helpEditConn.prepareStatement(mtHelp.insMstHelp(paramMst));
                ps.setString(1, tag);
                ps.setString(2, div1);
                ps.setString(3, div2);
                ps.setString(4, div3);

                insMstCnt = ps.executeUpdate();

                if (1 == insMstCnt) {
                    ret = "You are success For M_HELP";
                }

                if (!isEmpty(title)) {
                    String[] paramTbl = new String[] { tag, div1, div2, div3, title, contents, "0" };

                    ps = helpEditConn.prepareStatement(mtHelp.insTblHelp(paramTbl));
                    ps.setString(1, tag);
                    ps.setString(2, div1);
                    ps.setString(3, div2);
                    ps.setString(4, div3);
                    ps.setString(5, title);
                    ps.setString(6, contents);

                    insDetailCnt = ps.executeUpdate();

                    if (1 == insDetailCnt) {
                        if (isEmpty(ret)) {
                            ret = "You are success For M_HELP";
                        } else {
                            ret += "\r\n" + "You are success For T_HELP";
                        }
                    }

                }

                txtStatus.setText(ret);
            } catch (SQLException se) {
            	String msg = "";
                //se.printStackTrace();
                msg = "Failed Insert Query"+"/r/n";
                msg = "It may Duplication Key";
                txtStatus.setText(msg);
            }
        }
    };

    private ActionListener updateListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    private ActionListener deleteListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };

    public Object getResult() {
        return ret;
    }
}
