package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.jtfsdm_en;

public class myRowMapper3 implements RowMapper<jtfsdm_en> {
	@Override
	public jtfsdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		jtfsdm_en jtfsdm_en = new jtfsdm_en();
		String jfly = arg0.getString("jtfs");
		jtfsdm_en.setJtfs(jfly);
		return jtfsdm_en;
	}

}