/**
 * @author VerpHen
 * @date 2013-10-12  上午01:32:19
 */

package org.verphen.test;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

public class OgnlContext {
	public static void main(String[] args) {

		Map<String, Object> context = new HashMap<String, Object>();

		Person person1 = new Person();
		person1.setName("zhangsan");

		Person person2 = new Person();
		person2.setName("lisi");

		Person person3 = new Person();
		person3.setName("wangwu");

		context.put("person1", person1);
		context.put("person2", person2);

		try {
			Object value = Ognl.getValue("name", context, person3);
			System.out.println(value);
		} catch (OgnlException e) {
			e.printStackTrace();
		}

	}
}