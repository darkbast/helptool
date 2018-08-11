package jang.cmn.util.db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteDataBase {
    public static Connection conn = null;
    private String dbFileName = null;
    private boolean isOpen = false;

    static {
        try {
            // 클래스 로드
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 연결할 DB파일
     * 
     * @param dbFileName
     */
    public SqliteDataBase(String dbFileName) {
        this.dbFileName = dbFileName;
        if (null == conn) {
            open();
        }
    }

    /**
     * 연결할 DB파일
     * 
     * @param dbFileName
     */
    public SqliteDataBase() {
        if (null == conn) {
            open();
        }
    }

    public void open(String dbFileName) {
        this.dbFileName = dbFileName;

        try {
            File f = new File(dbFileName);
            if (!f.exists()) {

            }

            conn = DriverManager.getConnection("jdbc:sqlite:" + dbFileName);
            isOpen = true;
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public void open() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:./sqlitedb/test.db");
            isOpen = true;
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() {
        try {
            if (null != conn && isOpen) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
