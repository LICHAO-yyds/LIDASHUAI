package com.test.controller;

import com.test.com.test.pojo.user;
import com.test.service.HomeService;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name1 = req.getParameter("username");
        String pass1 = req.getParameter("password");

        user u = new user();
        u = HomeService.getTodayGoodsList(name1);
        System.out.println("userid: "+u.getUser_id());
        System.out.println("userpass: "+u.getUser_pass());
        if(name1.equals(u.getUser_id()) && pass1.equals(u.getUser_pass())){
            req.getRequestDispatcher("WEB-INF/success.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("message","账户名或密码错误");
            req.getRequestDispatcher("WEB-INF/Login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pass = req.getParameter("password");

            user u = new user();
            u = HomeService.getTodayGoodsList(name);

        System.out.println("userid: "+u.getUser_id());
        System.out.println("userpass: "+u.getUser_pass());
            if(name.equals(u.getUser_id()) && pass.equals(u.getUser_pass())){
                req.getRequestDispatcher("WEB-INF/success.jsp").forward(req,resp);
            }
            else{
                req.setAttribute("message","账户名或密码错误");
                req.getRequestDispatcher("WEB-INF/Login.jsp").forward(req,resp);
            }

    }
}
