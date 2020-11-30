package com.test.utils;

/**
 * @Package: dao
 * @ClassName: DBUtil
 * @Author: hp
 * @CreateTime: 2020/8/13 10:17
 * @Description:
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
    //连接数据库
    public static Connection getCon(){
        Connection con=null;
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/user_test?characterEncoding=gbk&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    //关闭数据库
    public static void close(ResultSet rs,PreparedStatement ps,Connection con){
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

