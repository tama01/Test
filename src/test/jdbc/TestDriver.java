package test.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

public class TestDriver implements Driver {

    static {
        try {
            java.sql.DriverManager.registerDriver(new TestDriver());
        } catch (SQLException E) {
            throw new RuntimeException("Can't register driver!");
        }
    }
	
	@Override
	public boolean acceptsURL(String s) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection connect(String s, Properties properties)
			throws SQLException {
		// TODO Auto-generated method stub
		return new TestConnection();
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		System.out.println("-->getMajorVersion");
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		System.out.println("-->getMinorVersion");
		return 0;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String s, Properties properties)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

}
