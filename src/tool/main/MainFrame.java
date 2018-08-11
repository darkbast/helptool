package tool.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import jang.clt.func.view.sql_changer.SqlChanger;
import tool.ai.AI_Frame;

public class MainFrame extends AI_Frame{
    
    private JDesktopPane frame = new JDesktopPane();
    public JMenuItem itemExit = null;
    public JMenuItem itemSqlFilter = null;
    
    public MainFrame(){
        init();
        addMenu();
        addListener();
        finalDisp();
    }
    
    public void init(){
        setSize(1024,768);
        frame = new JDesktopPane();
        frame.setBounds(0, 0, 1024, 768);
        add(frame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addMenu(){
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuFile = new JMenu("파일");
        itemExit = new JMenuItem("종료");
        
        menuFile.add(itemExit);
        
        
        JMenu menuFunc = new JMenu("기능");
        itemSqlFilter = new JMenuItem("SQL정리");
        
        menuFunc.add(itemSqlFilter);
        
        menuBar.add(menuFile);
        menuBar.add(menuFunc);
        
        setJMenuBar(menuBar);
    }
    
    public void addListener(){
        itemExit.addActionListener(itemExitListener);
        itemSqlFilter.addActionListener(itemSqlFilterListener);
    }
    
    
    public void finalDisp(){
        this.setVisible(true);
        frame.setVisible(true);
    }
    
    private ActionListener itemExitListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
    
    private ActionListener itemSqlFilterListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.add(new SqlChanger());
        }
    };

}
