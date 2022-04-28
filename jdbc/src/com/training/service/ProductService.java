package com.training.service;
import java.sql.*;
import java.util.*;
import com.training.entity.*;
public class ProductService {
private Connection con;

public ProductService(Connection con) {
	super();
	// TODO Auto-generated constructor stub
	this.con = con;
	}
public List<Product> findAll(){
	List<Product> productList = new ArrayList<Product>();
	String sql ="select * from pavi1_product";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int productId = rs.getInt("product_id");
			String productName = rs.getString("product_name");
			double price = rs.getDouble("price");
			Product prod = new Product(productId, productName,price);
			productList.add(prod);
			}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return productList;
	}

public int addProduct(Product product) {
	int rowAdded=0;
	String sql = "insert into pavi1_product values(?,?,?)";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		    pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			rowAdded = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
	}
	return rowAdded;
}

public int deleteById(int id) {
	int rowsDeleted=0;
	String sql = "delete from pavi1_product where product_id=?";
	try (PreparedStatement pstmt = con.prepareStatement(sql)){
		pstmt.setInt(1, id);
		rowsDeleted = pstmt.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return rowsDeleted;
}
public Optional<Product> findById(int id){
    Optional<Product> obj = Optional.empty();
	String sql ="select * from pavi1_product where product_id=?";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			int productId = rs.getInt("product_id");
			String productName = rs.getString("product_name");
			double price = rs.getDouble("price");
			Product prod = new Product(productId, productName,price);
			obj=Optional.of(prod);
			}
		}catch(SQLException e) {
		e.printStackTrace();
	}
	return obj;
}
public int update(String productName, double newprice) {
	int rowsUpdated=0;
	String sql = "Update pavi1_product set price=? where product_name=? ";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		pstmt.setDouble(1, newprice);
		pstmt.setString(2, productName);
		rowsUpdated=pstmt.executeUpdate(); 
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return  rowsUpdated;
	
}
public void usingtxn(Product prod1, Product prod2) {
	String sql="insert into pavi1_product values(?,?,?)";
	try(PreparedStatement pstmt = con.prepareStatement(sql)){
		con.setAutoCommit(false);
		pstmt.setInt(1, prod1.getProductId());
		pstmt.setString(2, prod1.getProductName());
		pstmt.setDouble(3,prod1.getPrice());
		
		
		int rowAdded = pstmt.executeUpdate();
		pstmt.setInt(1, prod2.getProductId());
		pstmt.setString(2, prod2.getProductName());
		pstmt.setDouble(3,prod2.getPrice());
		
		int rowAdded2 = pstmt.executeUpdate();
		if(prod2.getPrice()>prod1.getPrice()) {
			con.commit();
		}else {
			con.rollback();
		}
		
		System.out.println("rowadded:"+rowAdded +","+rowAdded2);
		}catch(Exception e) {
			e.printStackTrace();
}
}
public void usingtxnwithCatchBlock(Product prod1,Invoice invoice) {
	String addprodsql="insert into pavi1_product values(?,?,?)";
	String addinvoicesql="insert into pavi2_invoice values(?,?,?,?)";
	try(
		PreparedStatement prodpstmt = con.prepareStatement(addprodsql);
		PreparedStatement invpstmt = con.prepareStatement(addinvoicesql)
		)
		{
		con.setAutoCommit(false);
		
		prodpstmt.setInt(1, prod1.getProductId());
		prodpstmt.setString(2, prod1.getProductName());
		prodpstmt.setDouble(3,prod1.getPrice());
		
		
		int rowAdded = prodpstmt.executeUpdate();
		
		invpstmt.setInt(1, invoice.getInvoiceNumber());
		invpstmt.setString(2, invoice.getCustomerName());
		invpstmt.setInt(3,invoice.getQuantity());
		invpstmt.setInt(4, invoice.getProductRef());
		
		int rowadded1 = invpstmt.executeUpdate();
		con.commit();
		
		}
	catch(Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
}
}
}

