package com.byteslounge.jsf.war;

import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class TestBean {

	private String message = "JSF is running from TestBean started at " + new Date() + ".";

	public String getMessage() {
		return message;
	}

	public String getServerTime() { return "" + new Date(); }

	public void setMessage(String message) {
		this.message = message;
	}

}
