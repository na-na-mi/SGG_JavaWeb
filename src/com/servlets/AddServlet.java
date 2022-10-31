package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        //int price = Integer.parseInt(priceStr);
        String count = request.getParameter("count");
        //int fcount = Integer.parseInt(fcountStr);
        String remark = request.getParameter("remark");
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("count = " + count);
        System.out.println("remark = " + remark);
    }
}
