package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements userInterface{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	@Override
	public List<User> findByName(String name) {
		logger.info("entering findByName()");
		@SuppressWarnings("unchecked")
		List<User> userList = jdbcTemplate.query("select * from user_table where name like '%"+name+"%'", new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setName(rs.getString("name"));
				return user;
			}
		});
		logger.info("exiting findByName()");
		return userList;
	}

	@Override
	public List<Product> getProducts() {
		logger.info("entering getProducts()");
		List<Product> productList = jdbcTemplate.query("select * from Product", (resultSet, i)->
		new Product(resultSet.getInt("productId"), resultSet.getString("productTitle"), resultSet.getString("productDiscount"), resultSet.getString("productOriginalPrice"), resultSet.getString("productDiscountPrice"), resultSet.getString("imageSrc")));
		logger.info("exiting getProducts()");
		return productList;
	}

}
