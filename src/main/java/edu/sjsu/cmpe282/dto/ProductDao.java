package edu.sjsu.cmpe282.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.sjsu.cmpe282.domain.*;


public class ProductDao {
	
	Connection conn;
	PreparedStatement stmt;
	
	// Constructure with JDBC connection
	  public ProductDao()
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
	  
	public Product[] getProductList(){
		System.out.println("inside get product list");
		Product[] prodArray = null;
		ArrayList<Product> tempList = new ArrayList<Product>();
		String query = "select id,name,description,price,qty from cloudservices.product";
		System.out.println(" successfully connected!!");
		try{
			stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			System.out.println("successfully retrieved the prods");
			if(rs!=null){
				System.out.println("there is a catalog of products");
				while(rs.next()){
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
				prodArray = new Product[tempList.size()];
				for(int i=0; i< tempList.size(); i++)
				{
					prodArray[i] = tempList.get(i);
				}
				
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
	
	public ProductInfo getProductDetails(Product prod){
		System.out.println("inside get product details");
		ProductInfo prodinfo = new ProductInfo();
		String query = "select * from cloudservices.productinfo where prodInfoId = '" + prod.getProdId() + "';";
		System.out.println(" successfully connected!!");
		try{
			stmt = conn.prepareStatement(query);
			//stmt.setInt(1, prod.getProdId());
			ResultSet rs = stmt.executeQuery();
			System.out.println("successfully retrieved the prodinfo");
			if(rs.next()){
				System.out.println("there is a tech detail of the product");
				System.out.println(rs.getInt("prodinfoId"));
				prodinfo.setProdInfoId(rs.getInt("prodInfoId"));
				prodinfo.setMax_horizontal_resolution(rs.getString("max_horizontal_resolution"));
				prodinfo.setMemory_technology(rs.getString("memory_technology"));
				prodinfo.setInstalled_memory(rs.getString("installed_memory"));
				prodinfo.setProcessor_speed(rs.getString("processor_speed"));
				prodinfo.setProcessor(rs.getString("processor"));
				prodinfo.setManufacturer(rs.getString("manufacturer"));
				prodinfo.setInfrared(rs.getString("infrared"));
				prodinfo.setBluetooth(rs.getString("bluetooth"));
				prodinfo.setDocking_station(rs.getString("docking_station"));
				prodinfo.setPort_replicator(rs.getString("port_replicator"));
				prodinfo.setFingerprint(rs.getString("fingerprint"));
				prodinfo.setSubwoofer(rs.getString("subwoofer"));
				prodinfo.setExternal_battery(rs.getString("external_battery"));
				prodinfo.setCdma(rs.getString("cdma"));
				prodinfo.setOperating_system(rs.getString("operating_system"));
				prodinfo.setWarranty_days(rs.getInt("warranty_days"));
				prodinfo.setPrice(rs.getDouble("price"));
					
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
		
		return prodinfo;
		
	
	}

/*
	public boolean addProduct(ProductInfo prod){
		System.out.println("inside get product details");
		ProductInfo prodinfo = new ProductInfo();
		String query = "select * from ProductInfo where productinfoId = Product.id and productinfoId = ?";
		System.out.println(" successfully connected!!");
		try{
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, prod.getProdId());
			ResultSet rs = stmt.executeQuery();
			System.out.println("successfully retrieved the prodinfo");
			if(rs!=null){
				System.out.println("there is a tech detail of the product");
				System.out.println(rs.getInt("prodinfoId"));
				prodinfo.setProdinfoId(rs.getInt("prodinfoId"));
				System.out.println(rs.getString("resolution"));
				prodinfo.setResolution(rs.getString("resolution"));
				System.out.println(rs.getString("weight"));
				prodinfo.setWeight(rs.getString("weight"));
				System.out.println(rs.getString("dimension"));
				prodinfo.setDimension(rs.getString("dimension"));
				System.out.println(rs.getString("processor"));
				prodinfo.setProcessor(rs.getString("processor"));
				System.out.println(rs.getString("ram"));
				prodinfo.setRam(rs.getString("ram"));
				System.out.println(rs.getString("memspeed"));
				prodinfo.setMemspeed(rs.getString("memspeed"));
				System.out.println(rs.getString("harddrive"));
				prodinfo.setHarddrive(rs.getString("harddrive"));
				System.out.println(rs.getString("graphicsprocessor"));
				prodinfo.setGraphicsprocessor(rs.getString("graphicsprocessor"));
				System.out.println(rs.getString("wirelesstype"));
				prodinfo.setWirelesstype(rs.getString("wirelesstype"));
				System.out.println(rs.getString("batterylife"));
				prodinfo.setBatterylife(rs.getString("batterylife"));
				System.out.println(rs.getString("manufacturer"));
				prodinfo.setManufacturer(rs.getString("manufacturer"));
				System.out.println(rs.getString("model"));
				prodinfo.setModel(rs.getString("model"));
				System.out.println(rs.getString("hddinterface"));
				prodinfo.setHddinterface(rs.getString("hddinterface"));
				System.out.println(rs.getString("batterytype"));
				prodinfo.setBatterytype(rs.getString("batterytype"));
					
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
		
		return prodinfo;
		
	
	}
 */
}
