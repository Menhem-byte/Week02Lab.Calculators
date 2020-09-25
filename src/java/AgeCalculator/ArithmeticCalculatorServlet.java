/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeCalculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 789438
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").
                forward(request,response);
         String stringresult="---";
              request.setAttribute("Result",stringresult);
              
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
          String firstnum = request.getParameter("firstnumber");
           String secondnum = request.getParameter("secondnumber");
         String stringresult="---";
            
     
        
        if((firstnum==null || firstnum.equals("")) && (secondnum==null || secondnum.equals("")) ){
         //request.setAttribute("Result","---");
         request.setAttribute("Result",stringresult);
         request.setAttribute("Value1",firstnum);
          request.setAttribute("Value2",secondnum);
           getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").
                forward(request,response);
           
        }
        
        else if((firstnum==null || firstnum.equals("")) || (secondnum==null || secondnum.equals("")) ){
         //request.setAttribute("Result","---");
         request.setAttribute("Result","Invalid");
         request.setAttribute("Value1",firstnum);
          request.setAttribute("Value2",secondnum);
           
        }
        
        else if(checkString(firstnum)==true && checkString(secondnum)==true ){
         request.setAttribute("Value1",firstnum);
          request.setAttribute("Value2",secondnum);
             int first=Integer.parseInt(firstnum);
              int second=Integer.parseInt(secondnum);
              String operation = request.getParameter("s1");
              int result=0;
             
       switch(operation){
           case "+":
               result=first+second;
               stringresult=Integer.toString(result);
               break;
               case "*":
                   
               result=first*second;
               stringresult=Integer.toString(result);
               break;
               case "-":
                   if(first >= second){
               result=first-second;
               stringresult=Integer.toString(result);
                   }
                   else {
                    result=second - first;
                    stringresult=Integer.toString(result);
                   }
               break;
               
                case "%":
                   if(first >= second){
               result=first%second;
               stringresult=Integer.toString(result);
                   }
                   else {
                    result=second % first;
                    stringresult=Integer.toString(result);
                   }
               break;
               
           default:
       
        stringresult="---";
        }
        request.setAttribute("Result",stringresult);
         }
       
        else{
            request.setAttribute("Value1",firstnum);
            request.setAttribute("Value2",secondnum);
           request.setAttribute("Result","Invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").
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
