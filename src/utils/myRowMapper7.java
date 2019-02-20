package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.ktsxdm_en;

public class myRowMapper7 implements RowMapper<ktsxdm_en> {
	@Override
	public ktsxdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		ktsxdm_en ktsxdm_en = new ktsxdm_en();
		String ktsx = arg0.getString("ktsx");
		ktsxdm_en.setKtsx(ktsx);
		return ktsxdm_en;
	}

}