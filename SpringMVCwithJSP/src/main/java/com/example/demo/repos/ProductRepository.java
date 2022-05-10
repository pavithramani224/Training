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

public class ProductRepository implements CrudRepository {
	private JdbcTemplate template;
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		// TODO Auto-generated constructor stub
		this.template=template;
	}

	@Override
	public int add(Product t) {
		// TODO Auto-generated method stub
		String sql = "insert into pavi1_product values(?,?,?)";
	
		return template.update(sql,t.getProductId(),t.getProductName(),t.getPrice());
	}

	

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		String sql = "select *from pavi1_product";
		return template.query(sql,BeanPropertyRowMapper.newInstance(Product.class));
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		try {
		String sql = "select * from pavi1_product where product_Id=?";
		return template.queryForObject(sql,BeanPropertyRowMapper.newInstance(Product.class),id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@Override
	public int update(Product t) {
		String sql = "Update pavi1_product set price=?,product_Name=? where product_Id=? ";
		return template.update(sql, t.getPrice(),t.getProductName(),t.getProductId());
		
		
	}

	@Override
	public int remove(int id) {
		String sql= "delete  from pavi1_product where product_Id=?";
		return template.update(sql,id);
	
	}
	


	
}
