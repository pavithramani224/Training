package com.example.doa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
//					    Date memberAccountOpenDate = rs.getDate("acc_open_date");
//						LocalDate date = memberAccountOpenDate.toLocalDate();
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
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public int add(Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}


}
