package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import entity.bftjdm_en;
import entity.jflydm_en;
import entity.jtfsdm_en;
import entity.ktfxdm_en;
import entity.ktjbdm_en;
import entity.ktlbdm_en;
import entity.ktsxdm_en;
import entity.sbdwdm_en;
import entity.user;
import entity.user_insert;
import entity.xkfldm_en;
import utils.jdbcTem_util;
import utils.myRowMapper0;
import utils.myRowMapper11;
import utils.myRowMapper2;
import utils.myRowMapper3;
import utils.myRowMapper4;
import utils.myRowMapper5;
import utils.myRowMapper6;
import utils.myRowMapper7;
import utils.myRowMapper8;
import utils.myRowMapper9;

public class admin_table_select_dao {
	// 查询日期区间
	@Test
	public List<user_insert> select(String start_time, String end_time) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where wcsj BETWEEN ? and ? ";
		//System.out.println(start_time);
		//System.out.println(end_time);
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), start_time, end_time);
		//System.out.println(users);
		//System.out.println(users.size());
		//System.out.println(users.get(0).getWcsj());
		//System.out.println("System.out.println(users);12312312");
		// 内部查询
		for (int i = 0; i < users.size(); i++) {
			String sql1 = "select bftj from bftj  where bftjdm=?";
			List<bftjdm_en> users1 = jdbcTemplate.query(sql1, new myRowMapper11(), users.get(i).getBftjdm());
			users.get(i).setBftjdm(users1.get(0).getBftj());
			// System.out.println(users.get(i).getBftjdm());

			String sql2 = "select jfly from jfly  where jflydm=?";
			List<jflydm_en> users2 = jdbcTemplate.query(sql2, new myRowMapper2(), users.get(i).getJflydm());
			users.get(i).setJflydm(users2.get(0).getJfly());

			String sql3 = "select jtfs from jtfs  where jtfsdm=?";
			List<jtfsdm_en> users3 = jdbcTemplate.query(sql3, new myRowMapper3(), users.get(i).getJtfsdm());
			users.get(i).setJtfsdm(users3.get(0).getJtfs());

			String sql4 = "select ktfx from ktfx  where ktfxdm=?";
			List<ktfxdm_en> users4 = jdbcTemplate.query(sql4, new myRowMapper4(), users.get(i).getKtfxdm());
			users.get(i).setKtfxdm(users4.get(0).getKtfx());

			String sql5 = "select ktjb from ktjb  where ktjbdm=?";
			List<ktjbdm_en> users5 = jdbcTemplate.query(sql5, new myRowMapper5(), users.get(i).getKtjbdm());
			users.get(i).setKtjbdm(users5.get(0).getKtjb());

			String sql6 = "select ktlb from ktlb  where ktlbdm=?";
			List<ktlbdm_en> users6 = jdbcTemplate.query(sql6, new myRowMapper6(), users.get(i).getKtlbdm());
			users.get(i).setKtlbdm(users6.get(0).getKtlb());

			String sql7 = "select ktsx from ktsx  where ktsxdm=?";
			List<ktsxdm_en> users7 = jdbcTemplate.query(sql7, new myRowMapper7(), users.get(i).getKtsxdm());
			users.get(i).setKtsxdm(users7.get(0).getKtsx());

			String sql8 = "select sbdw from sbdw  where sbdwdm=?";
			List<sbdwdm_en> users8 = jdbcTemplate.query(sql8, new myRowMapper8(), users.get(i).getSbdwdm());
			users.get(i).setSbdwdm(users8.get(0).getSbdw());

			String sql9 = "select xkfl from xkfl  where xkfldm=?";
			List<xkfldm_en> users9 = jdbcTemplate.query(sql9, new myRowMapper9(), users.get(i).getXkfldm());
			users.get(i).setXkfldm(users9.get(0).getXkfl());

		}
		return users;

	}

}



////1


////2

//////3



//4


//////5


//////6 ktlbdm_en


/////7


//////8


///9

