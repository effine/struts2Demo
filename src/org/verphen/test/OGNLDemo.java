/**
 * @author VerpHen
 * @date 2013-10-12  上午01:26:41
 */

package org.verphen.test;

import ognl.Ognl;
import ognl.OgnlException;

public class OGNLDemo {
	public static void main(String[] args) {

		Person person = new Person();
		person.setName("verphen");
		try {
			Object value = Ognl.getValue("name", person);
			System.out.println(value);
		} catch (OgnlException e) {
			e.printStackTrace();
		}

	}
}

class Person {

	private String name;
	private String passwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}