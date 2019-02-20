package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.xkfldm_en;

public class myRowMapper9 implements RowMapper<xkfldm_en> {
	@Override
	public xkfldm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		xkfldm_en xkfldm_en = new xkfldm_en();
		String xkfl = arg0.getString("xkfl");
		xkfldm_en.setXkfl(xkfl);
		return xkfldm_en;
	}

}