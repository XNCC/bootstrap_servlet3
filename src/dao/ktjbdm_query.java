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

public class ktjbdm_query {
	// 查询日期区间
	@Test
	public List<user_insert> select(String ktjbdm) {
		///
		jdbcTem_util jdbcTem_util = new jdbcTem_util();
		JdbcTemplate jdbcTemplate = jdbcTem_util.getJdbcTemplate();
		String sql = "select * from basicinfo  where ktjbdm=?";
		List<user_insert> users = jdbcTemplate.query(sql, new myRowMapper0(), ktjbdm);	
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

//class myRowMapper0 implements RowMapper<user_insert> {
//	@Override
//	public user_insert mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		String projectno = arg0.getString("projectno");
//		String projectname = arg0.getString("projectname");
//		String hostid = arg0.getString("hostid");
//		String hostname = arg0.getString("hostname");
//		String ktjbdm = arg0.getString("ktjbdm");
//		String ktsxdm = arg0.getString("ktsxdm");
//		String ktlbdm = arg0.getString("ktlbdm");
//		String ktfxdm = arg0.getString("ktfxdm");
//		String xkfldm = arg0.getString("xkfldm");
//		String jtfsdm = arg0.getString("jtfsdm");
//		String sbdwdm = arg0.getString("sbdwdm");
//		String jflydm = arg0.getString("jflydm");
//		String bftjdm = arg0.getString("bftjdm");
//		Date pzsj = arg0.getDate("pzsj");
//		Date wcsj = arg0.getDate("wcsj");
//		int zjf = arg0.getInt("zjf");
//		String member1 = arg0.getString("member1");
//		String member2 = arg0.getString("member2");
//		String member3 = arg0.getString("member3");
//		String member4 = arg0.getString("member4");
//		String member5 = arg0.getString("member5");
//		int sftj = arg0.getInt("sftj");
//		int sflx = arg0.getInt("sflx");
//
//		user_insert user = new user_insert();
//
//		user.setProjectno(projectno);
//		user.setProjectname(projectname);
//		user.setHostid(hostid);
//		// user.setHostid(hostid);
//		user.setHostname(hostname);
//		user.setKtjbdm(ktjbdm);
//		user.setKtsxdm(ktsxdm);
//		user.setKtlbdm(ktlbdm);
//		user.setKtfxdm(ktfxdm);
//		user.setXkfldm(xkfldm);
//		user.setJtfsdm(jtfsdm);
//		// user.setJflydm(jflydm);
//		user.setSbdwdm(sbdwdm);
//		user.setJflydm(jflydm);
//		user.setBftjdm(bftjdm);
//		user.setPzsj(pzsj);
//		user.setWcsj(wcsj);
//		user.setZjf(zjf);
//		user.setMenber1(member1);
//		user.setMenber2(member2);
//		user.setMenber3(member3);
//		user.setMenber4(member4);
//		user.setMenber5(member5);
//		user.setSftj(sftj);
//		user.setSflx(sflx);
//		return user;
//	}
//
//}
//
//////1
//class myRowMapper11 implements RowMapper<bftjdm_en> {
//	@Override
//	public bftjdm_en mapRow(ResultSet a, int arg1) throws SQLException {
//// TODO Auto-generated method stub
//		String bftj = a.getString("bftj");
//
//		bftjdm_en bftjdm_en = new bftjdm_en();
//		bftjdm_en.setBftj(bftj);
//		return bftjdm_en;
//	}
//
//}
//
//////2
//class myRowMapper2 implements RowMapper<jflydm_en> {
//	@Override
//	public jflydm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		jflydm_en jflydm_en = new jflydm_en();
//		String jfly = arg0.getString("jfly");
//		jflydm_en.setJfly(jfly);
//		return jflydm_en;
//	}
//
//}
////////3
//
//class myRowMapper3 implements RowMapper<jtfsdm_en> {
//	@Override
//	public jtfsdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		jtfsdm_en jtfsdm_en = new jtfsdm_en();
//		String jfly = arg0.getString("jtfs");
//		jtfsdm_en.setJtfs(jfly);
//		return jtfsdm_en;
//	}
//
//}
//
////4
//class myRowMapper4 implements RowMapper<ktfxdm_en> {
//	@Override
//	public ktfxdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		ktfxdm_en ktfxdm_en = new ktfxdm_en();
//		String ktfx = arg0.getString("ktfx");
//		ktfxdm_en.setKtfx(ktfx);
//		return ktfxdm_en;
//	}
//
//}
//
////////5
//class myRowMapper5 implements RowMapper<ktjbdm_en> {
//	@Override
//	public ktjbdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		ktjbdm_en ktjbdm_en = new ktjbdm_en();
//		String ktjb = arg0.getString("ktjb");
//		ktjbdm_en.setKtjb(ktjb);
//		return ktjbdm_en;
//	}
//
//}
//
////////6 ktlbdm_en
//class myRowMapper6 implements RowMapper<ktlbdm_en> {
//	@Override
//	public ktlbdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		ktlbdm_en ktlbdm_en = new ktlbdm_en();
//		String ktlb = arg0.getString("ktlb");
//		ktlbdm_en.setKtlb(ktlb);
//		return ktlbdm_en;
//	}
//
//}
//
///////7
//class myRowMapper7 implements RowMapper<ktsxdm_en> {
//	@Override
//	public ktsxdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		ktsxdm_en ktsxdm_en = new ktsxdm_en();
//		String ktsx = arg0.getString("ktsx");
//		ktsxdm_en.setKtsx(ktsx);
//		return ktsxdm_en;
//	}
//
//}
//
////////8
//class myRowMapper8 implements RowMapper<sbdwdm_en> {
//	@Override
//	public sbdwdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		sbdwdm_en sbdwdm_en = new sbdwdm_en();
//		String sbdw = arg0.getString("sbdw");
//		sbdwdm_en.setSbdw(sbdw);
//		return sbdwdm_en;
//	}
//
//}
//
/////9
//class myRowMapper9 implements RowMapper<xkfldm_en> {
//	@Override
//	public xkfldm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
//		// TODO Auto-generated method stub
//		xkfldm_en xkfldm_en = new xkfldm_en();
//		String xkfl = arg0.getString("xkfl");
//		xkfldm_en.setXkfl(xkfl);
//		return xkfldm_en;
//	}
//
//}
