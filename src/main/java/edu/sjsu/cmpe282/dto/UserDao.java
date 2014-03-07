package edu.sjsu.cmpe282.dto;

import java.sql.*;
import java.util.ArrayList;

import edu.sjsu.cmpe282.domain.*;

public class UserDao {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement stmt2 = null;
	
	// Constructure with JDBC connection
	  public UserDao()
	  {
		   try{
		      try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      conn = DriverManager.getConnection("jdbc:mysql://localhost/CloudServices","root","");
		   }
		   catch (SQLException e) {
					e.printStackTrace();
					
			}
	  }
	  
	  public boolean addUser(User user)
	  {
		  try {
		 stmt = conn.createStatement();
		 String query = "INSERT INTO `cloudservices`.`users` (`firstname`, `lastname`, `email`, `passwd`) VALUES ('" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getEmail() + "', '" + user.getPasswd() + "');";
		 stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return true;
	  }
	  
	  public boolean checkUser(User user){
		  ResultSet rs;
		  String origPasswd = null;
		  	try {
		  		stmt = conn.createStatement();
		  		String query = "Select passwd from cloudservices.users where email = '"+user.getEmail()+"';";
		  		rs = stmt.executeQuery(query);
		  		rs.next();
		  		origPasswd = rs.getString("passwd");
		  		System.out.println("Password from db : "+ origPasswd );
		  		System.out.println("Password entered : "+user.getPasswd());
		  		} catch (SQLException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}

		  		return user.getPasswd().equals(origPasswd);
		  }
	  
	public Product[] getOrderHistory(User user) {
		ArrayList<Order> prodIdbt = new ArrayList<Order>();
		Product[] prodArray = null;
		ArrayList<Product> tempList = new ArrayList<Product>();
		String query1 = "select * from cloudservices.orderhistory where boughtBy = '" + user.getUserId() + "';";
		//String query2 = "select * from cloudservices.product where id = ?";
		String query2 = null;
		System.out.println(" successfully connected!!");
		try{
			stmt2 = conn.prepareStatement(query1);
			//stmt2.setInt(1, user.getUserId());
			ResultSet rs = stmt2.executeQuery();
			System.out.println("successfully retrieved the history");
			if(rs!=null){
				System.out.println("retrieving product ids...");
				while(rs.next()){
					Order order = new Order();
					order.setPrdBt(rs.getInt("productBought"));
					order.setQtyBt(rs.getInt("qty"));
					prodIdbt.add(order);
				}
			}
			
			for(int i=0; i< prodIdbt.size(); i++) {
				query2 = "select * from cloudservices.product where id = '" + prodIdbt.get(i).getPrdBt() + "';";
				stmt2 = conn.prepareStatement(query2);
				//stmt2.setInt(1, prodIdbt.get(i).getPrdBt());
				rs = stmt2.executeQuery();
				if(rs.next()){
					System.out.println("retrieving product desc...");
					Product prod= new Product();
					System.out.println(rs.getInt("id"));
					prod.setProdId(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					prod.setName(rs.getString("name"));
					System.out.println(rs.getString("description"));
					prod.setDesc(rs.getString("description"));
					prod.setPrice(rs.getDouble("price"));
					prod.setQty(rs.getInt("qty"));
						
					tempList.add(prod);	
					
				}
			}
			prodArray = new Product[tempList.size()];
			for(int i=0; i< tempList.size(); i++)
			{
				prodArray[i] = tempList.get(i);
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
         }
		
		return prodArray;
	}
	
	/*
	  public int checkUser(User user){
		  ResultSet rs;
		  String origPasswd = null;
		  	try {
		  		stmt = conn.createStatement();
		  		String query = "Select password, userAcctId from cloudservices.user where email = '"+user.getEmail()+"';";
		  		rs = stmt.executeQuery(query);
		  		rs.next();
		  		origPasswd = rs.getString("password");
		  		System.out.println("Password from db : "+ origPasswd );
		  		System.out.println("Password entered : "+user.getPasswd());
		  		} catch (SQLException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}

		  		if (!user.getPasswd().equals(origPasswd)) return -1;
		  		return rs.getInt("userAcctId");
		  }
		  
*/	  
}
