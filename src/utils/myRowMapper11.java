package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.bftjdm_en;

public class myRowMapper11 implements RowMapper<bftjdm_en> {
	@Override
	public bftjdm_en mapRow(ResultSet a, int arg1) throws SQLException {
// TODO Auto-generated method stub
		String bftj = a.getString("bftj");

		bftjdm_en bftjdm_en = new bftjdm_en();
		bftjdm_en.setBftj(bftj);
		return bftjdm_en;
	}

}