/**
 * @author VerpHen
 * @date 2013-10-9  ионГ01:56:58
 */

package org.verphen.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		if (this.username.equals("admin") && this.password.equals("admin")) {
			return SUCCESS;
		}
		return LOGIN;
	}
}
