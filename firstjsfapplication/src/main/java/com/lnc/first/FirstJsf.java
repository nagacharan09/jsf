package com.lnc.first;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "firstJsf", eager = true)
public class FirstJsf {
	
	private String message;
	
	   public FirstJsf() {
	      System.out.println("FirstJsf application!");
	      
	      this.message="FirstJsf application";
	   }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	   
	}
