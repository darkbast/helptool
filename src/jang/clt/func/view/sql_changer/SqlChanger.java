package jang.clt.func.view.sql_changer;

import static cmn.util.CHECK_UTIL.*;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class SqlChanger extends SqlChangerView{
    
    public SqlChanger(){
        btnResult.addActionListener(analyListener);
        btnCbInputResult.addActionListener(changeStrListener);
        init();
    }

    public void init(){
        cbInput.addItem("IN");
        cbInput.addItem(",");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setClosable(true);
        setVisible(true);
    }
    
    private ActionListener changeStrListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cbIn = txtCbInput.getText();
            if (isEmpty(cbIn)) {
                return ;
            }
            
           String cb = (String)cbInput.getSelectedItem();
           if (isEmpty(cb)) {
               cb = "IN";
           }
           
           String fix = "'";
           if (cbIn.indexOf(",") != -1) {
               cbIn = cbIn.replaceAll(",", "\r\n");
           }
           
           switch (cbIn) {
               case "IN":
                   cbIn = "('" + cbIn + "')";
                   cbIn = cbIn.replaceAll("\r\n", "','");
                   break;
                   
               case ",":
                   cbIn = cbIn.replaceAll("\r\n", ",");
                   break;

               default:
                   return;
           }
        }
    };

    private ActionListener analyListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JDialog errDiaLog = new JDialog();
            errDiaLog.setSize(100,100);

            if (txtQuery == null){
                errDiaLog.setTitle("Query");
                errDiaLog.getContentPane().add(new Label("No Quert"));
                errDiaLog.setVisible(true);
                return;
            }
               
            if (txtParam == null){               
                errDiaLog.setTitle("Parameter");
                errDiaLog.getContentPane().add(new Label("No Parameter"));
                errDiaLog.setVisible(true);
                return;
            }
           
            StringBuffer query = new StringBuffer(txtQuery.getText());       
            String param = new String(txtParam.getText());

            int qryIdx = txtQuery.getText().length();
           
            Pattern p1 = Pattern.compile("[(\\?)]");
            if (txtaRegExp != null && isEmpty(txtaRegExp.getText())){
                p1 = Pattern.compile(txtaRegExp.getText());
            }
           
            Matcher m1 = p1.matcher(query);
            String str = param.replaceAll("\\([a-zA-Z]*\\)", "");
            String[] strArr = str.split(",");

            int i=0;
            while(m1.find()){
                System.out.println(m1.start());
                System.out.println(m1.end());

                m1.appendReplacement(query,strArr[i++]);
            }
        
            txtQueryResult.setText(query.substring(qryIdx));
        }
    };
}
