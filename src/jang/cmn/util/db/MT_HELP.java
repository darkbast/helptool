package jang.cmn.util.db;

import static cmn.util.CHECK_UTIL.*;
import static jang.cmn.util.db.CommonTable.*;

public class MT_HELP extends CommonQuery {
    //
    // CREATE TABLE `M_HELP` (
    // `TAG` TEXT NOT NULL,
    // `DIV1` TEXT,
    // `DIV2` TEXT,
    // `DIV3` TEXT,
    // `DEL_FLG` TEXT DEFAULT 0,
    // PRIMARY KEY(`TAG`,`DIV1`,`DIV2`,`DIV3`)
    // );

    public String insMstHelp(String[] arr) {
        sb = new StringBuilder();
        append(INSERT_INTO);
        append(M_HELP);
        append(VALUES_START);

        for (int i = 0; i < arr.length; i++) {
            if (0 == i) {
                append(VALUE);
            } else {
                append("," + VALUE);
            }
        }
        append(",'0'");
        append(VALUES_END);
        return sb.toString();
    }

    // CREATE TABLE `T_HELP` (
    // `TAG` TEXT NOT NULL,
    // `DIV1` TEXT,
    // `DIV2` TEXT,
    // `DIV3` TEXT,
    // `TITLE` TEXT NOT NULL,
    // `CONTENTS` TEXT,
    // `DEL_FLG` TEXT DEFAULT 0
    // );
    public String insTblHelp(String[] arr) {
        sb = new StringBuilder();
        append(INSERT_INTO);
        append(T_HELP);
        append(VALUES_START);
        for (int i = 0; i < arr.length; i++) {
            if (0 == i) {
                append(VALUE);
            } else {
                append("," + VALUE);
            }
        }
        append(",'0'");
        append(VALUES_END);
        return sb.toString();
    }
    
    public String getMHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(TAG);
        append(","+DIV1);
        append(","+DIV2);
        append(","+DIV3);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        return sb.toString();
    }
    
    public String getMHelpDisTinct(){
        sb = new StringBuilder();
        append(SELECT);
        append(DISTINCT);
        append(TAG);
        append(","+DIV1);
        append(","+DIV2);
        append(","+DIV3);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        return sb.toString();
    }
    
    public String getTHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(TAG);
        append(DIV1);
        append(","+DIV2);
        append(","+DIV3);
        append(","+TITLE);
        append(","+CONTENTS);
        append(FROM);
        append(T_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        return sb.toString();
    }
    
    public String getTHelp(String tag, String div1, String div2, String div3){
        sb = new StringBuilder();
        append(SELECT);
        append(TITLE);
        append(","+CONTENTS);
        append(FROM);
        append(T_HELP);
        append(WHERE);
        append("1=1");
        if (!isEmpty(tag)){
        	append(AND + TAG + "=" + tag);
        }
        
        if (!isEmpty(div1)){
        	append(AND + DIV1 + "=" + div1);
        }
        
        if (!isEmpty(div2)){
        	append(AND + DIV2 + "=" + div2);
        }
        
        if (!isEmpty(div3)){
        	append(AND + DIV3 + "=" + div3);
        }
        append(AND +  DEL_FLG + "= '0'");
        return sb.toString();
    }
    
    public String getTagByMHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(DISTINCT);
        append(TAG);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    public String getDiv1ByMHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(DISTINCT);
        append(DIV1);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        System.out.println(sb.toString());
        return sb.toString();
    }
    public String getDiv2ByMHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(DISTINCT);
        append(DIV2);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        System.out.println(sb.toString());
        return sb.toString();
    }
    public String getDiv3ByMHelp(){
        sb = new StringBuilder();
        append(SELECT);
        append(DISTINCT);
        append(DIV3);
        append(FROM);
        append(M_HELP);
        append(WHERE);
        append(DEL_FLG + "= '0'");
        System.out.println(sb.toString());
        return sb.toString();
    }
}
