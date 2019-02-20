package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.sbdwdm_en;

public class myRowMapper8 implements RowMapper<sbdwdm_en> {
	@Override
	public sbdwdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		sbdwdm_en sbdwdm_en = new sbdwdm_en();
		String sbdw = arg0.getString("sbdw");
		sbdwdm_en.setSbdw(sbdw);
		return sbdwdm_en;
	}

}