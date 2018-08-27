package com.nf.phone.web;

import com.nf.phone.dao.Dao;
import com.nf.phone.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "add")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jsp/add_form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        String brand = req.getParameter("brand");
        double price = Double.parseDouble(req.getParameter("price"));
        double size = Double.parseDouble(req.getParameter("size"));
        String info = req.getParameter("info");
        String address = req.getParameter("address");
        String store = req.getParameter("store");
        Phone phone = new Phone(id, brand, price, size, info, address, store);
        Dao dao = new Dao();
        dao.add(phone);
        resp.sendRedirect("index.jsp");

    }
}
