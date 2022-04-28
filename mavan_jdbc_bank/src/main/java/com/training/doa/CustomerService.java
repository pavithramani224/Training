package com.training.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.training.entity.Customer;
import com.training.entity.LoanApplication;
import com.training.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<LoanApplication>{
	private Connection con;

	public CustomerService(Connection con) {
		super();
		this.con=con;
	}

	public int add(LoanApplication obj) {
		int rowadded=0;
		String sql = "insert into pavi_customer values(?,?,?,?)";
		String sql2= "insert into pavi_loanapplication values(?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			try(PreparedStatement pstmt2 = con.prepareStatement(sql2)){
				pstmt.setInt(1, obj.getCustomer().getCustomerId());
				pstmt.setString(2, obj.getCustomer().getCustomerName());
				pstmt.setLong(3, obj.getCustomer().getPhonenumber());
				pstmt.setDouble(4, obj.getCustomer().getCreditScore());
				
			pstmt2.setInt(1, obj.getApplicationNumber());
			pstmt2.setInt(2, obj.getCustomer().getCustomerId());
			pstmt2.setDouble(3, obj.getLoanAmount());
			
			
			
			rowadded=pstmt.executeUpdate()+pstmt2.executeUpdate();
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowadded;
	}

	public List<LoanApplication> findAll() {
		List<LoanApplication> loanList = new ArrayList<LoanApplication>();
		String sql = "select * from pavi_customer pc  JOIN pavi_loanapplication pl on  pc.customer_id= pl.customerref ";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int applicationnumber = rs.getInt("application_number");
				String customerdetail = rs.getString("customerref");
				double loanamount = rs.getDouble("loan_amount");
				int customerId = rs.getInt("customer_id");
				String customerName = rs.getString("customer_name");
				long phonenumber = rs.getLong("phone_number");
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

	public Optional<LoanApplication> findById(int id) {
		Optional<LoanApplication> obj = Optional.empty();
		String sql = "select  ps.cutomer_id,ps.cutomer_name,ps.phonec_number,"
				+ "ps.credit_score,pl.application_number,pl.customerref,pl.loan_amount"
				+ "* from pavi_customer where customer_number=?";
//		String sql="SELECT CUST.CUSTOMER_ID,cust.customer_name,cust.phone_number,"
//				+ "cust.credit_score,loanapp.application_number,loanapp.loan_amount"
//				+ " FROM LOKI_CUSTOMER CUST left outer join LOKI_LOAN_APPLICATION LOANAPP ON "
//				+ "cust.customer_id=LOANAPP.CUSTOMER_REF WHERE CUST.CUSTOMER_ID=?";
		//String sql="select * from LOKI_CUSTOMER CUST left outer join LOKI_LOAN_APPLICATION LOANAPP ON cust.customer_id=LOANAPP.CUSTOMER_REF where cust.customer_id=?;";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int applicationnumber = rs.getInt("application_number");
				String customerdetail = rs.getString("customerref");
				double loanamount = rs.getDouble("loan_amount");
				int customerId = rs.getInt("customer_id");
				String customerName = rs.getString("customer_name");
				long phonenumber = rs.getLong("phone_number");
				double creditScore = rs.getDouble("credit_score");
				Customer cus = new Customer(customerId, customerName, phonenumber, creditScore);
				LoanApplication loan = new LoanApplication(applicationnumber,cus,loanamount);
			    obj=Optional.of(loan);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public int update(int id, LoanApplication customer) {
		// TODO Auto-generated method stub
		return 0;
	}

}

