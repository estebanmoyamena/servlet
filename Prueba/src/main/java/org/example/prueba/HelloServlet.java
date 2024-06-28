package org.example.prueba;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String user =request.getParameter("user");
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        
        if("jonConnors".equals(user) && "juan".equals(name) && "Connors".equals(lastName) && "terminator@skynet.com".equals(email)){
        response(response, "Estás dentro");
        }else{
        response(response, "No pasa naipe");
        }

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");

        String user = req.getParameter("user");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        
        if("JonSnow".equals(user) && "Jon".equals(name) && "Snow".equals(lastName) && "winteriscoming@gmail.com".equals(email)){
            response(res, "Wena shoro, entraste");
        }else{
            response(res,"No puedes pasar, fuiste weno");
        }

    }

    private void response(HttpServletResponse res, String message) throws IOException{
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }


    public void destroy() {
    }
}