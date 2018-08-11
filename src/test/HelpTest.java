package test;

import jang.clt.func.view.help.Help;
import jang.cmn.util.db.SqliteDataBase;

public class HelpTest {

    public static void main(String[] args) {
        new SqliteDataBase("res/tool.db");
        new Help();
    }
}
