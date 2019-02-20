package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import entity.user;

public class login_dao {

	// ��ѯlogin�������
	@Test
	public List<user> select(String name) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///research");
		dataSource.setUsername("root");
		dataSource.setPassword("123456789");

		// ����jdbcTemplate����
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user where name=? ";
		List<user> list = jdbcTemplate.query(sql, new myRowMapper(), name);
		// System.out.print(user);
		return list;
	}

}

class myRowMapper implements RowMapper<user> {

	@Override
	public user mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		// String name=arg0.getString("name");
		int id = arg0.getInt("id");
		String name = arg0.getString("name");
		String password = arg0.getString("password");
		int power = arg0.getInt("power");
		user user = new user();
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		user.setPower(power);
		return user;
	}

}

class myRowMapper1 implements RowMapper<user> {

	@Override
	public user mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int name = arg0.getInt("power");
		String password = arg0.getString("password");
		Integer power = arg0.getInt("power");
		user user = new user();
		user.setPassword(password);
		user.setPower(power);
		return user;
	}

}