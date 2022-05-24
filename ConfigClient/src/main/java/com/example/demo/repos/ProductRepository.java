package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;
import com.fasterxml.jackson.databind.BeanProperty;
@Repository

public class ProductRepository implements CrudRepository<Product> {
	
	private JdbcTemplate template;
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		// TODO Auto-generated constructor stub
		this.template=template;
	}

	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		String sql = "select *from pavi1_product";
		return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
		
	}

	


	
}
