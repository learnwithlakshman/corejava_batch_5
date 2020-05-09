package com.lwl.ems.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionUtil {
	private static Properties properties;
	
	private ConnectionUtil() {
		
	}
	static {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = properties.getProperty("url");
			conn = DriverManager.getConnection(url, properties);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
