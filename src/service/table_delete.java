package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.jdbc.core.JdbcTemplate;

import utils.jdbcTem_util;

/**
 * Servlet implementation class table_insert
 */
//@WebServlet("/table_delete")
public class table_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a = req.getParameter("projectno");

		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();

		String sql = "delete from basicinfo where projectno=?";
		System.out.println("sql-------------" + a);
		jdbcTemplate.update(sql, a);
		System.out.println("sql-------------" + a);
		req.getRequestDispatcher("/delete_success.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// super.doPost(request, response);

	}

}
