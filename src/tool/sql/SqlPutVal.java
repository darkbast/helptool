package tool.sql;

import static cmn.util.CHECK_UTIL.*;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class SqlPutVal extends SqlPutValView{
	public SqlPutVal(){
		btnResult.addActionListener(analyListener);
		 init();
	}
	
	public void init(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
    
    private ActionListener analyListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JDialog errDiaLog = new JDialog();
            errDiaLog.setSize(100,100);

            if (txtaQuery == null){
                errDiaLog.setTitle("Query");
                errDiaLog.getContentPane().add(new Label("No Quert"));
                errDiaLog.setVisible(true);
                return;
            }
               
            if (txtaParam == null){               
                errDiaLog.setTitle("Parameter");
                errDiaLog.getContentPane().add(new Label("No Parameter"));
                errDiaLog.setVisible(true);
                return;
            }
           
            StringBuffer query = new StringBuffer(txtaQuery.getText());       
            String param = new String(txtaParam.getText());

            int qryIdx = txtaQuery.getText().length();
           
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
        
            txtaResult.setText(query.substring(qryIdx));
        }
    };
}
