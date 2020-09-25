/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeCalculator;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 789438
 */
public class AgeCalculatorServlet extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request,response);
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("agenum");
        
       
        
        if(age==null || age.equals("")){
         request.setAttribute("Age","You must give your current age");
         request.setAttribute("Value",age);
        }
        
        else if(checkString(age)==true){
         request.setAttribute("Value",age);
             int ageinteger=Integer.parseInt(age);
        ageinteger+=1;
        request.setAttribute("Age","your age  next birthday will be "+ ageinteger);
         }
       
        else{
            request.setAttribute("Value",age);
           request.setAttribute("Age","you must enter a number");
        }
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request,response);
       
       
    }
    
    private static boolean checkString(String s){
    boolean yes=true;
    int len=s.length();
    for(int i=0;i<len;i++){
    if(Character.isAlphabetic(s.charAt(i))){
   
        yes=false;
        
    }
    
   
    }
    return yes;
    }

}
