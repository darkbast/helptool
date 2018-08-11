package jang.cmn.util.db;

import static jang.cmn.util.db.CommonTable.*;

public class CommonQuery {

    protected StringBuilder sb = null;

    // Base Query
    protected final String SELECT = "select";
    protected final String INSERT_INTO = "insert into";
    protected final String UPDATE = "update";
    protected final String VALUES_START = "values(";
    protected final String VALUES_END = ")";
    protected final String VALUE = "?";

    protected final String COUNT_ALL = "count(*) as cnt";
    protected final String FROM = "from";
    protected final String WHERE = "where";
    protected final String AND = "and ";
    protected final String OR = "or ";
    protected final String DISTINCT = "distinct";

    public String mHelpCount() {
        sb = new StringBuilder();
        append(SELECT);
        append(COUNT_ALL);
        append(FROM);
        append(M_HELP);
        return sb.toString();
    }

    protected void append(String val) {
        sb.append(val + " ");
    }
}
