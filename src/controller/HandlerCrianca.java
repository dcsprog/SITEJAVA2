package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Crianca;

/**
 * Servlet implementation class HandslerCrianca
 */
@WebServlet("/HandlerCrianca")
public class HandlerCrianca extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Crianca> arCriancas;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandlerCrianca() {
        super();
        arCriancas = new ArrayList<Crianca>();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaCriancas", arCriancas);
		request.getRequestDispatcher("/Crianca.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Crianca c = new Crianca(arCriancas.size(),
				request.getParameter("nome"),
				request.getParameter("data_nascimento"),
				request.getParameter("ccidadao"),
				request.getParameter("observacoes")
				);
		
				arCriancas.add(c);
				
				this.doGet(request, response);
				
				
		
	}

}
