package util;

import java.sql.*;

public class main {

	public static void main(String[] args) throws SQLException {
		testDBConnection();
	}

	private static void testDBConnection() throws SQLException {
		DBverbindung.dbconnect();

		Statement st = null;

		st = DBverbindung.getConn().createStatement();
		ResultSet res = st.executeQuery("SELECT * FROM test");

		while (res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			System.out.println(id + name);
		}
		st.close();

		DBverbindung.dbdisconect();
	}

}
