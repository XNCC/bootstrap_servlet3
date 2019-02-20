package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.sbdw_show;

/**
 * Servlet implementation class user_Selects1_Service
 */
//@WebServlet("/user_Selects1_Service")
public class admin_show_service extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin_show_service() {
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

		// 查询申报单位 1
		sbdw_show sbdw_show = new sbdw_show();
		int show4[] = new int[8];
		for (int i = 1; i <= 7; i++) {
			show4[i] = sbdw_show.select4("" + i + "");
			System.out.print(show4[i]);
			request.setAttribute("show4" + i + "", show4[i]);
		}
		System.out.println("");
		////////////////////////////////////////////////
		// 课题级别 1
		System.out.print("课题级别");
		int show1[] = new int[6];
		for (int i = 1; i <= 5; i++) {
			show1[i] = sbdw_show.select1("" + i + "");
			System.out.print(show1[i]);
			request.setAttribute("show1" + i + "", show1[i]);
		}
		System.out.println("");
		// money 0
		int show2[] = new int[5];
		for (int i = 0; i < 5; i++) {
			show2[i] = sbdw_show.select2(i);
			System.out.print(show2[i]);
			request.setAttribute("show2" + i + "", show2[i]);
		}
		System.out.println("");
		// 月份
		int show3[] = new int[12];
		show3[0] = sbdw_show.select3("2019-01-1", "2019-01-31");
		show3[1] = sbdw_show.select3("2019-02-1", "2019-02-28");
		show3[2] = sbdw_show.select3("2019-03-1", "2019-03-31");
		show3[3] = sbdw_show.select3("2019-04-1", "2019-04-30");
		show3[4] = sbdw_show.select3("2019-05-1", "2019-05-30");
		show3[5] = sbdw_show.select3("2019-06-1", "2019-06-30");
		show3[6] = sbdw_show.select3("2019-07-1", "2019-07-31");
		show3[7] = sbdw_show.select3("2019-08-1", "2019-08-31");
		show3[8] = sbdw_show.select3("2019-09-1", "2019-09-30");
		show3[9] = sbdw_show.select3("2019-10-1", "2019-10-31");
		show3[10] = sbdw_show.select3("2019-11-1", "2019-11-30");
		show3[11] = sbdw_show.select3("2019-12-1", "2019-12-31");
		for (int i = 0; i < show3.length; i++) {
			request.setAttribute("show3" + i + "", show3[i]);
		}

		// request.setAttribute("show1", show1);
		// request.setAttribute("show2", show2);
		// request.setAttribute("show3", show3);
		// request.setAttribute("show4", show4[1]);

		request.getRequestDispatcher("/main_show.jsp").forward(request, response);
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
