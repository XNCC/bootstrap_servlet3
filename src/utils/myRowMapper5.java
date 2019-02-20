package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.ktjbdm_en;

public class myRowMapper5 implements RowMapper<ktjbdm_en> {
	@Override
	public ktjbdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		ktjbdm_en ktjbdm_en = new ktjbdm_en();
		String ktjb = arg0.getString("ktjb");
		ktjbdm_en.setKtjb(ktjb);
		return ktjbdm_en;
	}

}