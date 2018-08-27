package com.nf.phone.web;

import com.nf.phone.dao.Dao;
import com.nf.phone.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class list extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dao dao = new Dao();
        List<Phone> phones = dao.getList();
        req.setAttribute("phones",phones);
        req.getRequestDispatcher("/WEB-INF/jsp/list_form.jsp").forward(req,resp);
    }

}
