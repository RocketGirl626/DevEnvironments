package com.dineshonjava.struts2.login;

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
	
	 public String execute() {  
	 
	 int i = Environment.save(this);
		 if(this.devOS.length() > 0 && this.devOSVersion.length() > 0){
			return "success"; 
		 }
		 return "error";     
	 }  
  
 
 
   
} 
