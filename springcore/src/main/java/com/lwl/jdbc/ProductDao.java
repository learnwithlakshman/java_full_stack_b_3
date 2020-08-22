package com.lwl.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void showProductCount() {
		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from product", Integer.class);
		System.out.println("Total product found in DB:" + rowCount);
	}

	

	public void showProducts() {
		List<Product> list = this.jdbcTemplate.query("select * from product",new BeanPropertyRowMapper(Product.class));


		list.stream().forEach(p -> {
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getPrice());
			System.out.println("-----------------------------");
		});
	}
}
