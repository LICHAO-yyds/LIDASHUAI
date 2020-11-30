package com.test.service;

import com.test.com.test.pojo.user;
import com.test.utils.DBUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @Package: service
 * @ClassName: HomeService
 * @Author: hp
 * @CreateTime: 2020/8/13 10:24
 * @Description:
 */
public class HomeService {
    public static user getTodayGoodsList(String user_id){
        PreparedStatement pstmt = null;
        ResultSet res = null;
        Connection con = null;
        try {
            con = DBUtil.getCon();
            String sql = "SELECT * FROM users";
            pstmt = con.prepareCall(sql);
            res = pstmt.executeQuery();
            user users = new user();
            System.out.println(users.toString());
            while (res.next()){
                users.setUser_id(res.getString(1));
                users.setUser_pass(res.getString(2));
            }
            return  users;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  null;
        }
        finally{
            DBUtil.close(res,pstmt,con);
        }

    }


}
