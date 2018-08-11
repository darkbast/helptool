package test.tbl;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ExTable extends JFrame{
    JTable table = null;
    
    public ExTable() {

        setSize(new Dimension(683, 631));
//        String[][] tableData = { { "일본", "3승", "0승", "1분" }, { "일본", "3승",
//        "0승", "1분" }, { "일본", "3승", "0승", "1분" },
//        { "일본", "3승", "0승", "1분" }, { "일본", "3승", "0승", "1분" } };
//       
//        String[] columnName = { "Country", "Win", "Lost", "Even" };        
//        table = new JTable(tableData,columnName);
        table = new JTable();
        getContentPane().add(table);
        init();
        System.out.println("START");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void init(){
        String[][] tableData = { { "일본", "3승", "0승", "1분" }, { "일본", "3승",
        "0승", "1분" }, { "일본", "3승", "0승", "1분" },
        { "일본", "3승", "0승", "1분" }, { "일본", "3승", "0승", "1분" } };
       
        String[] columnName = { "Country", "Win", "Lost", "Even" };
        DefaultTableModel model = new DefaultTableModel(tableData,columnName);
        
//        table = new JTable(tableData,columnName);
//        table.updateUI();
  //      TableColumnModel col = Table
    //    table.setColumnModel(columnName);
        
//        table.doLayout();
        table.setModel(model);
    }
}
