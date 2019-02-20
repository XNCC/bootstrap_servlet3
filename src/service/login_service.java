package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.login_dao;
import entity.user;

/**
 * Servlet implementation class login
 */
//@WebServlet("/login")
public class login_service extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login_service() {
		super();
		// System.out.println("123");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String radio = request.getParameter("radio");
		int power = Integer.parseInt(radio);
		System.out.println(username + password + power);

		login_dao login_dao = new login_dao();
		// user user = new user();
		List<user> list = login_dao.select(username);
		System.out.println(list);
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				if (password.equals(list.get(i).getPassword()) && power == list.get(i).getPower()) {
					if (power == 1) {
						request.getRequestDispatcher("/admin_table_select.jsp").forward(request, response);
					} else {
						request.getRequestDispatcher("/selects.jsp").forward(request, response);
					}

				} else {
					// request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			}

		} else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
