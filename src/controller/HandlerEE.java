package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EEducacao;

/**
 * Servlet implementation class HandlerEE
 */
@WebServlet("/HandlerEE")
public class HandlerEE extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArrayList<EEducacao> arEE;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandlerEE() {
        super();
        
        arEE = new ArrayList<EEducacao>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("listaEEducacao", arEE);
		request.getRequestDispatcher("/EEducacao.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		EEducacao ee = new EEducacao(arEE.size(),
				request.getParameter("nome"),
				request.getParameter("data_nascimento"),
				request.getParameter("ccidadao"),
				request.getParameter("telefoneP"),
				request.getParameter("telefoneS")
				);
		
				arEE.add(ee);
				
				this.doGet(request, response);
		
	}

}
