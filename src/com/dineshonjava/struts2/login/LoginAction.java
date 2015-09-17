package com.dineshonjava.struts2.login;

import com.opensymphony.xwork2.ActionSupport;  

/** 
 * @author Dinesh Rajput 
 * 
 */  
@SuppressWarnings("serial")  
public class LoginAction  extends ActionSupport{  
	private String devOS;  
    private String devOSVersion; 
    private String devNotes;
      
 public String execute() {  
     
        if (this.devOS.equals("Mac OS X")   
                && this.devOSVersion.equals("10.8")) {  
            return "success";  
        } else {  
         addActionError(getText("error.login"));  
            return "error";  
        }  
    }  
  
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
 
   
} 
