package com.dineshonjava.struts2.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;  
 
@SuppressWarnings("serial")  
public class LoginAction  extends ActionSupport{  


	private String devOS;  
  private String devOSVersion; 
    private String devNotes;
    
    public String getDevOS() {  
    	  return devOS ;  
	 }  
	  
	 public void setDevOS(String devOS) {  
	  this.devOS = devOS;  
	 }  
	  
	 public String getDevOSVersion() {  
	  return devOSVersion;  
	 }  
	  
	 public void setDevOSVersion(String devOSVersion) {  
	  this.devOSVersion = devOSVersion;  
	 }  
	 
	 public String getDevNotes() {  
		 return devNotes ;  
	 } 
	 
	 public void setDevNotes(String devNotes) {  
		 this.devNotes = devNotes;  
	 } 
	 
	 public static int save(LoginAction r) {
			int status = 0;

			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dev_environments?user=root&passwrod=");
				
				PreparedStatement ps=con.prepareStatement("insert into environments (os, version, notes) values (?,?,?)");  
				ps.setString(1,r.getDevOS());  
				ps.setString(2,r.getDevOSVersion());  
				ps.setString(3,r.getDevNotes());  
				          
				status=ps.executeUpdate();  
				

			
				con.close();
			}
			catch(Exception e){e.printStackTrace();}
				return status;
		}
	
	 public String execute() {  
	 
		 
		 if(this.devOS.length() > 0 && this.devOSVersion.length() > 0){
			int i = LoginAction.save(this);
			return "success"; 
		 }
		 return "error"; 
		
		 }  
  
 
 
   
} 
