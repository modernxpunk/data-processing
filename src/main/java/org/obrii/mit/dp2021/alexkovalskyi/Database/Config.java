package org.obrii.mit.dp2021.alexkovalskyi.Database;

public class Config {
    private static final String URL = "jdbc:postgresql://obrii.org:5432/db2021mit21s6";
    private static final String USER = "s6";
    private static final String PASS = "3887";
    private static String fileName = "";
    
    public static String getFileName(){
        return fileName;
    }
    
    public static void setFileName(String x){
        fileName = x;
    }

    public static String getURL() {
        return URL; 
    }
    
    public static String getDbUser() { 
        return USER; 
    }
    
    public static String getDbPass() {
        return PASS;
    }
}
