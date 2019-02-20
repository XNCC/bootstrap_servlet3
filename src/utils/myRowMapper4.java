package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.ktfxdm_en;

public class myRowMapper4 implements RowMapper<ktfxdm_en> {
	@Override
	public ktfxdm_en mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		ktfxdm_en ktfxdm_en = new ktfxdm_en();
		String ktfx = arg0.getString("ktfx");
		ktfxdm_en.setKtfx(ktfx);
		return ktfxdm_en;
	}

}