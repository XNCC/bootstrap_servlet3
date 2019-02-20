package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.zjf_query;
import entity.user_insert;

/**
 * Servlet implementation class user_Selects1_Service
 */
//@WebServlet("/user_Selects1_Service")
public class admin_Selects_Service7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin_Selects_Service7() {
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
		String zjf1 = request.getParameter("zjf1");
		// System.out.println(sbdwdm1 );
		int zjf = Integer.parseInt(zjf1);
		List<user_insert> list;
		zjf_query zjf_query = new zjf_query();
		list = zjf_query.select(zjf);

		////////////////////////////////////
		// System.out.println(list);
		int total = list.size();
		int yeshu = (int) (Math.floor(total / 10) + 1);
		request.getSession().setAttribute("flag", 8);
		request.setAttribute("list", list);
		request.setAttribute("total", total);
		request.setAttribute("yeshu", yeshu);
		request.setAttribute("idd", pagecurrent);
		/////////////
		if (zjf1 != null) {
			request.getSession().setAttribute("zjf1", zjf);
			request.getRequestDispatcher("admin_table_select.jsp").forward(request, response);
		}
		///////////////
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
