package com.example.doa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import com.example.entity.Member;
import com.example.ifaces.CrudRepositroy;

public class MemberRespository implements CrudRepositroy<Member> {
	private Connection con;
	

	public MemberRespository(Connection con) {
		super();
		this.con = con;
	}

	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<Member>();
			String sql = "select * from memberpavi";
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				
					ResultSet rs = pstmt.executeQuery();
					
					while(rs.next()) {
						
						int memberId=rs.getInt("member_id");
						String memberName = rs.getString("memberr_name");
						String memberAddress = rs.getString("member_address");
						
						Date accountopendate = rs.getDate("acc_open_date");
						LocalDate accDate = accountopendate.toLocalDate();
						String membershipType = rs.getNString("membership_type");
						double fessPaid = rs.getDouble("feespaid");
						int maximumBookAllowed = rs.getInt("max_books_allowed");
						double penaltyAmount = rs.getDouble("penality_amount");		
						Member mem = new Member(memberId,memberName,memberAddress,
								accDate,membershipType,fessPaid,maximumBookAllowed,
								penaltyAmount);
						memberList.add(mem);
					}
					}catch(SQLException e) {
				e.printStackTrace();
			}
		return memberList;
	}

	public int remove(int id) {
		int rowsDeleted=0;
		String sql = "delete from memberpavi where member_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			rowsDeleted = pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rowsDeleted;
		
	}

	public Optional<Member> findById(int id) {
		Optional<Member> obj = Optional.empty();
		String sql = "select * from memberpavi where member_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				int memberId=rs.getInt("member_id");
				String memberName = rs.getString("memberr_name");
				String memberAddress = rs.getString("member_address");
				
				Date accountopendate = rs.getDate("acc_open_date");
				LocalDate accDate = accountopendate.toLocalDate();
				String membershipType = rs.getNString("membership_type");
				double fessPaid = rs.getDouble("feespaid");
				int maximumBookAllowed = rs.getInt("max_books_allowed");
				double penaltyAmount = rs.getDouble("penality_amount");		
				Member mem = new Member(memberId,memberName,memberAddress,
						accDate,membershipType,fessPaid,maximumBookAllowed,
						penaltyAmount);
				obj = Optional.of(mem);
			}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return obj;
	}

	public int update(int Id, String  address) {
		int rowsupdated=0;
		String sql = " update memberpavi set member_address=? where member_id=?";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, address);
			pstmt.setInt(2, Id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowsupdated;
	}




	@Override
	public int add(Member obj) {
		int rowadded =0;
		String sql = "insert into memberpavi values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,obj.getMemeberId());
			pstmt.setString(2, obj.getMemberName());
			pstmt.setString(3, obj.getMemberAddress());
			pstmt.setDate(4,Date.valueOf( obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6,obj.getFesspaid());
			pstmt.setInt(7, obj.getMaxBookAllowed());
			pstmt.setDouble(8, obj.getPenaltyAmount());
		    rowadded = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowadded ;
	}

	@Override
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}


}
