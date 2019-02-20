package utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import entity.user_insert;

public class myRowMapper0 implements RowMapper<user_insert> {
	@Override
	public user_insert mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		String projectno = arg0.getString("projectno");
		String projectname = arg0.getString("projectname");
		String hostid = arg0.getString("hostid");
		String hostname = arg0.getString("hostname");
		String ktjbdm = arg0.getString("ktjbdm");
		String ktsxdm = arg0.getString("ktsxdm");
		String ktlbdm = arg0.getString("ktlbdm");
		String ktfxdm = arg0.getString("ktfxdm");
		String xkfldm = arg0.getString("xkfldm");
		String jtfsdm = arg0.getString("jtfsdm");
		String sbdwdm = arg0.getString("sbdwdm");
		String jflydm = arg0.getString("jflydm");
		String bftjdm = arg0.getString("bftjdm");
		Date pzsj = arg0.getDate("pzsj");
		Date wcsj = arg0.getDate("wcsj");
		int zjf = arg0.getInt("zjf");
		String member1 = arg0.getString("member1");
		String member2 = arg0.getString("member2");
		String member3 = arg0.getString("member3");
		String member4 = arg0.getString("member4");
		String member5 = arg0.getString("member5");
		int sftj = arg0.getInt("sftj");
		int sflx = arg0.getInt("sflx");

		user_insert user = new user_insert();

		user.setProjectno(projectno);
		user.setProjectname(projectname);
		user.setHostid(hostid);
		// user.setHostid(hostid);
		user.setHostname(hostname);
		user.setKtjbdm(ktjbdm);
		user.setKtsxdm(ktsxdm);
		user.setKtlbdm(ktlbdm);
		user.setKtfxdm(ktfxdm);
		user.setXkfldm(xkfldm);
		user.setJtfsdm(jtfsdm);
		// user.setJflydm(jflydm);
		user.setSbdwdm(sbdwdm);
		user.setJflydm(jflydm);
		user.setBftjdm(bftjdm);
		user.setPzsj(pzsj);
		user.setWcsj(wcsj);
		user.setZjf(zjf);
		user.setMenber1(member1);
		user.setMenber2(member2);
		user.setMenber3(member3);
		user.setMenber4(member4);
		user.setMenber5(member5);
		user.setSftj(sftj);
		user.setSflx(sflx);
		return user;
	}

}