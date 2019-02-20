package dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.user_insert;
import utils.jdbcTem_util;
import utils.myRowMapper0;

public class sbdw_show {
	// 申报单位
	@Test
	public int select4(String sbdw) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where sbdwdm=?";
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), sbdw);
		int count = users.size();
		return count;

	}

	// 课题级别
	public int select1(String ktjbdm) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where ktjbdm=?";
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), ktjbdm);
		int count = users.size();
		return count;

	}

	// money
	public int select2(int zjf) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where zjf = ? ";
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), zjf);
		int count = users.size();
		return count;

	}

	// 月份
	public int select3(String start_time, String end_time) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where wcsj BETWEEN ? and ? ";
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), start_time, end_time);
		int count = users.size();
		return count;

	}

}
