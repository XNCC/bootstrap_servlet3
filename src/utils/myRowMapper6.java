package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.ktlbdm_en;

public class myRowMapper6 implements RowMapper<ktlbdm_en> {
	@Override
	public ktlbdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		ktlbdm_en ktlbdm_en = new ktlbdm_en();
		String ktlb = arg0.getString("ktlb");
		ktlbdm_en.setKtlb(ktlb);
		return ktlbdm_en;
	}

}