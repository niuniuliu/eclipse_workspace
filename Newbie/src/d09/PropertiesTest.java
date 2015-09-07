package org.nitpro.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();

		//读取属性文件
		props.load(new FileInputStream("db.properties"));
		
		//获取属性值（注意中文的属性文件）
		String user = props.getProperty("user");
		String pwd = props.getProperty("password");

		System.out.println(user);
		System.out.println(pwd);
		
		//设置属性值
		props.setProperty("driver","oracle.driver.OracleDriver");
		
		//保存属性文件
		props.store(new FileOutputStream("e:/db.properties"),"*****");
	}
}
