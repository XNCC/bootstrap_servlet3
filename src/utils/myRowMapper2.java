package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.jflydm_en;

public class myRowMapper2 implements RowMapper<jflydm_en> {
	@Override
	public jflydm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		jflydm_en jflydm_en = new jflydm_en();
		String jfly = arg0.getString("jfly");
		jflydm_en.setJfly(jfly);
		return jflydm_en;
	}

}