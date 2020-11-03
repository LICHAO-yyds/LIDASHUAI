package com.test.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        if(name.equals("lichao")&& pass.equals("123")){

            req.getRequestDispatcher("WEB-INF/success.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("message","账户名或密码错误");
            req.getRequestDispatcher("WEB-INF/Login.jsp").forward(req,resp);
        }

    }
}