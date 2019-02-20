package service;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class admin_Selects_Service4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin_Selects_Service4() {
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
		String idd = request.getParameter("idd");
		// System.out.println("user_Selects1_Service2" + idd);
		int iddd = Integer.parseInt(idd);

		//////////////////////////
		// 查询
		String sbdwdm1 = (String) request.getSession().getAttribute("sbdwdm1");
		System.out.println(sbdwdm1);
		List<user_insert> list;
		sbdw_query sbdw_query = new sbdw_query();
		list = sbdw_query.select(sbdwdm1);
		System.out.println(list);
		////////////////////////////////////////////////

		int total = list.size();
		int yeshu = (int) (Math.floor(total / 10) + 1);
		request.setAttribute("total", total);
		request.setAttribute("idd", idd);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");// 小写的mm表示的是分钟
		if (list != null) {

			if (iddd * 10 < list.size()) {
				list = list.subList(iddd * 10 - 10, iddd * 10);
			} else {
				list = list.subList(iddd * 10 - 10, list.size());
			}
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
//		String str="";
//		for(int i=0;i<list.size();i++) {
//		str+=list
//		}

		response.getWriter().println(list);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
