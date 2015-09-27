package com.dineshonjava.struts2.login;
import java.sql.*;
import java.util.ArrayList;

public class FetchRecords {
	ArrayList<LoginAction> list=new ArrayList<LoginAction>();

	public ArrayList<LoginAction> getList() {
		return list;
	}
	public void setList(ArrayList<LoginAction> list) {
		this.list = list;
	}

	public String execute(){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dev_environments?user=root&passwrod=");


			PreparedStatement ps=con.prepareStatement("select * from environments");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				LoginAction environment=new LoginAction();
				environment.setDevOS(rs.getString(2));
				environment.setDevOSVersion(rs.getString(3));
				environment.setDevNotes(rs.getString(4));
				list.add(environment);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return "success";
   }
}
