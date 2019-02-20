package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.table_select_dao;
import entity.user_insert;

/**
 * Servlet implementation class user_Selects1_Service
 */
//@WebServlet("/user_Selects1_Service")
public class user_Selects1_Service extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public user_Selects1_Service() {
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

		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		System.out.println("qwewq123" + starttime + endtime);
		List<user_insert> list;
		table_select_dao table_select_dao = new table_select_dao();
		list = table_select_dao.select(starttime, endtime, "321");
		System.out.println(list);
		int total = list.size();
		int yeshu = (int) (Math.floor(total / 10) + 1);
		request.setAttribute("list", list);
		request.setAttribute("total", total);
		request.setAttribute("yeshu", yeshu);
		request.setAttribute("idd", pagecurrent);
		if (starttime != null && endtime != null) {
			request.getSession().setAttribute("starttime", starttime);
			request.getSession().setAttribute("endtime", endtime);
			request.getRequestDispatcher("selects.jsp").forward(request, response);
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
