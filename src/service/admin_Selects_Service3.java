package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.sbdw_query;
import entity.user_insert;

/**
 * Servlet implementation class user_Selects1_Service
 */
//@WebServlet("/user_Selects1_Service")
public class admin_Selects_Service3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin_Selects_Service3() {
		super();
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
		// String idd = request.getParameter("idd");
		int pagecurrent = 1;

		///////////////////////////////////
		String sbdwdm1 = request.getParameter("sbdwdm1");
		// System.out.println(sbdwdm1 );
		List<user_insert> list;
		sbdw_query sbdw_query = new sbdw_query();
		list = sbdw_query.select(sbdwdm1);

		////////////////////////////////////
		// System.out.println(list);
		int total = list.size();
		int yeshu = (int) (Math.floor(total / 10) + 1);
		request.getSession().setAttribute("flag", 4);
		request.setAttribute("list", list);
		request.setAttribute("total", total);
		request.setAttribute("yeshu", yeshu);
		request.setAttribute("idd", pagecurrent);
		if (sbdwdm1 != null) {
			request.getSession().setAttribute("sbdwdm1", sbdwdm1);
			request.getRequestDispatcher("admin_table_select.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
