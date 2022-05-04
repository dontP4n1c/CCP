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

/**
 *
 * @author Dont Panic
 */
public class ValidarCampos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nome, senha, sexo;
        int hobbiCount = 0;
        
        try {
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>");
            out.println("Exercício de Validação - Resultado");
            out.println("</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY");
            out.println("<BR>");

             nome = request.getParameter("nome");
             senha = request.getParameter("senha");
             sexo = request.getParameter("sx1");
             String hobbies[] = request.getParameterValues("hobbies");
             
             
             if(nome.isEmpty() || senha.isEmpty() || sexo.isEmpty()){
                 out.println("<h1>Campos Nao validos E NESSERRARIO PREENCHER TODOS OS CAMPOS </h1>");
             }else{
                 out.print("Campos validados sao eles <br>Nome: "+nome+ "<br>Senha: "+senha+ "<br>Sexo: "+sexo);
                 for(int i = 0; i < hobbies.length; i++){
                     out.print("<br>Hobbie "+(i+1)+": "+ hobbies[i]);
                     hobbiCount++;
                 }
             }
            
             
            out.print("<br>");
            out.println("<input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'>");
            out.println("</BODY>");
            out.println("</HTML>");
        } catch (ArithmeticException e) {
            out.println("<html><head><title>Resultado da Calculadora");
            out.println("</title></head>");
            out.println("<body>");
            out.println("<p>Divisão não pode ser por zero");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
