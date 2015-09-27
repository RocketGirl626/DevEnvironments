//package com.dineshonjava.struts2.login;
//import java.sql.*;
////import java.util.ArrayList;
//
//public class Environment{
//	
//	private String devOS;  
//    private String devOSVersion; 
//    private String devNotes;
//    
//    public String getDevOS() {  
//    	  return devOS ;  
//	 }  
//	  
//	 public void setDevOS(String devOS) {  
//	  this.devOS = devOS;  
//	 }  
//	  
//	 public String getDevOSVersion() {  
//	  return devOSVersion;  
//	 }  
//	  
//	 public void setDevOSVersion(String devOSVersion) {  
//	  this.devOSVersion = devOSVersion;  
//	 }  
//	 
//	 public String getDevNotes() {  
//		 return devNotes ;  
//	 } 
//	 
//	 public void setDevNotes(String devNotes) {  
//		 this.devNotes = devNotes;  
//	 }  
//
//
//	
//	public static int save(LoginAction r) {
//		int status = 0;
//
//		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dev_environments?user=root&passwrod=");
//			
//			PreparedStatement ps=con.prepareStatement("insert into environments (os, version, notes) values (?,?,?)");  
//			ps.setString(1,r.getDevOS());  
//			ps.setString(2,r.getDevOSVersion());  
//			ps.setString(3,r.getDevNotes());  
//			          
//			status=ps.executeUpdate();  
//			
//
//		
//			con.close();
//		}
//		catch(Exception e){e.printStackTrace();}
//			return status;
//	}
//	
//	
//}
