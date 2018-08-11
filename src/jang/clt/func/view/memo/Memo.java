package jang.clt.func.view.memo;

import static cmn.util.CHECK_UTIL.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import jang.cmn.util.db.SqliteDataBase;

public class Memo extends MemoView {
    private Connection memoConn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Object ret = null;
    private SqliteDataBase sdb = new SqliteDataBase();
    private StringBuilder sb = null;

    public Memo() {
        init();
        initService();
        initListener();
        display();
        logic();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    // 준비 단계
    public void initService(){
        try{
            sb = new StringBuilder();
            sdb.open();
            memoConn = sdb.getConnection();
            
            // CREATE TABLE
            sb.append("CREATE TABLE IF NOT EXISTS m_cate(cate TEXT)");
            ps = memoConn.prepareStatement(sb.toString());
            ps.executeUpdate();
            
            // CREATE TABLE
            sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS t_memo(cate TEXT,title TEXT,content TEXT)");
            ps = memoConn.prepareStatement(sb.toString());
            ps.executeUpdate();
            
            // SQL
            sb = new StringBuilder();
            sb.append("SELECT cate FROM m_cate");
            // SQL준비
            ps = memoConn.prepareStatement(sb.toString());
            // SQL실행
            rs = ps.executeQuery();
            // 결과로부터 값취득
            List<String> cateList = new ArrayList<String>();
            //cateList.add("");
            cbCate.addItem("");
            while(rs.next()){
                //cateList.add(rs.getString("cate"));
                cbCate.addItem(rs.getString("cate"));
            }
            
        }catch(SQLException se){
            se.printStackTrace();            
        }finally{
            try{ 
                if(rs       != null){         rs.close();  }
                if(ps       != null){         ps.close();  }
                if(memoConn != null){   memoConn.close();  }
            }catch(SQLException se2){
                se2.printStackTrace();
            }     
        }
    }

    public void initListener() {
        menuCateInsert.addActionListener(cateInsert);
        menuCateDel = null;
        menuCateUpd = null;
        btnCateSearch.addActionListener(cateSearch);
    }
    
    private ActionListener cateInsert = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    };
    
    private ActionListener cateSearch = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                sb = new StringBuilder();
                sdb.open();
                memoConn = sdb.getConnection();
                
                sb.append("SELECT cate,title,contents FROM T_MEMO");
                String selected = (String)cbCate.getSelectedItem();
                
                boolean isWhere = false;
                if (!isEmpty(selected)){
                    sb.append(" WHERE cate = ?");
                    isWhere = true;
                }
                
                ps = memoConn.prepareStatement(sb.toString());
                if (isWhere){
                    ps.setString(1, selected);
                }
                
                rs = ps.executeQuery();
                while(rs.next()){
                    
                }
                
            }catch(SQLException se){
                se.printStackTrace();        
            }finally{
                try{ 
                    if(rs       != null){         rs.close();  }
                    if(ps       != null){         ps.close();  }
                    if(memoConn != null){   memoConn.close();  }
                }catch(SQLException se2){
                    se2.printStackTrace();
                }     
            }
            
            
        }
    };

    public void display() {
         String[][] tableData = { { "일본", "3승", "0승", "1분" }, { "일본", "3승",
         "0승", "1분" }, { "일본", "3승", "0승", "1분" },
         { "일본", "3승", "0승", "1분" }, { "일본", "3승", "0승", "1분" } };
         String[] columnName = { "Country", "Win", "Lost", "Even" };

         DefaultTableModel model = new DefaultTableModel(tableData, columnName);
         table.setModel(model);
    }

    public void logic() {

    }
}
