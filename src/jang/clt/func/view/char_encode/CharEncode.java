package jang.clt.func.view.char_encode;

import static cmn.util.CHECK_UTIL.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URLEncoder;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import jang.cmn.CommonDisplay;

public class CharEncode extends CharEncodeView {

    private String kbn1 = ",";
    private String kbn2 = null;

    public CharEncode() {
        init();
        initListener();
        display();
        logic();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initListener() {
        btnHelp.addActionListener(helpListener);
        btnClear.addActionListener(clearListener);
        btnEncode.addActionListener(encodeListener);
    }

    public void display() {
    }

    public void logic() {

    }

    ActionListener helpListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 다이얼로그 닫아야만 보여짐.
        }
    };

    ActionListener clearListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSearch.setText("");
            txtResult.setText("");
            txtHexResult.setText("");
        }
    };

    ActionListener encodeListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = txtSearch.getText();
            String htmlResult = null;
            String hexResult = null;
            String octResult = null;
            if (isEmpty(input)) {
                return;
            }

            htmlResult = htmlEncode(input);
            hexResult = hexEncode(input);
            octResult = octEncode(input);

            txtResult.setText(htmlResult);
            txtHexResult.setText(hexResult);
            txtOctResult.setText(octResult);
        }
    };

    private String htmlEncode(String input) {
        String ret = "";
        try {
            // ret = URLEncoder.encode(input,"UTF-8");
            for (int i = 0; i < input.length(); i++) {
                if (0 == i) {
                    ret += URLEncoder.encode(input.substring(i, i + 1), "UTF-8");
                } else {
                    ret += kbn1 + URLEncoder.encode(input.substring(i, i + 1), "UTF-8");
                }
            }
        } catch (Exception ie) {
            ret = "";
        }
        return ret;
    }

    private String hexEncode(String input) {
        String ret = "";
        for (int i = 0; i < input.length(); i++) {
            if (0 == i) {
                ret += Integer.toHexString(input.charAt(i));
            } else {
                ret += kbn1 + Integer.toHexString(input.charAt(i));
            }
        }
        return ret;
    }

    private String octEncode(String input) {
        String ret = "";
        for (int i = 0; i < input.length(); i++) {
            if (0 == i) {
                ret += (int) input.charAt(i);
            } else {
                ret += kbn1 + (int) input.charAt(i);
            }
        }
        return ret;
    }
}
