package com.lnq.servlet;


import com.lnq.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteByIdServlet")
public class DeleteByIdServlet extends HttpServlet {
    private BrandServiceImpl service = new BrandServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //处理POST请求的乱码问题
        request.setCharacterEncoding("utf-8");

        //1.接受表单提交的数据，封装成一个Brand对象
        String id = request.getParameter("id");



        //2.调用service，完成删除
        service.deleteById(Integer.parseInt(id));

        //3.转发到查询所有Servlet
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);
    }
}
