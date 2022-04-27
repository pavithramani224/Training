package com.training.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Customer;
import com.training.entity.LoanApplication;
import com.training.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<LoanApplication>{
	private Connection con;

	public CustomerService() {
		super();
		this.con=con;
	}

	public int add(LoanApplication obj) {
		
		return 0;
	}

	public List<LoanApplication> findAll() {
		List<LoanApplication> loanList = new ArrayList<LoanApplication>();
		String sql = "select * from pavi_customer pc  JOIN pavi_loanapplication pl on  pc.customer_id= pl.customerref ";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int applicationnumber = rs.getInt("application_number");
				String customerdetail = rs.getString("customerref");
				double loanamount = rs.getDouble("loan_number");
				int customerId = rs.getInt("customer_name");
				String customerName = rs.getString("customer_name");
				int phonenumber = rs.getInt("phone_number");
				double creditScore = rs.getDouble("credit_score");
				Customer cus = new Customer(customerId, customerName, phonenumber, creditScore);
				LoanApplication loan = new LoanApplication(applicationnumber,cus,loanamount);
				loanList.add(loan);
				
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
			
		return loanList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public LoanApplication findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int id, LoanApplication customer) {
		// TODO Auto-generated method stub
		return 0;
	}

}

