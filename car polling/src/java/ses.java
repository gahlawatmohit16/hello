/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class ses extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //response.setContentType();
        PrintWriter out = response.getWriter();
        out.println("you are at sesjava");
//        String uname = request.getParameter("username");
//        String pass = request.getParameter("password");
        HttpSession session=request.getSession(false);  
        String uname=(String)session.getAttribute("uname");  
        
        out.println("Its nice to see you here "+uname+". Your password: ");
        }
    }

   

