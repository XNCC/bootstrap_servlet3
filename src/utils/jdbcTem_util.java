package utils;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcTem_util {
     public JdbcTemplate getJdbcTemplate() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql:///research");
			dataSource.setUsername("root");
			dataSource.setPassword("123456789");
     return new JdbcTemplate(dataSource);
     }
     
}
