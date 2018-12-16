package tutorial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
    Connection con;
    public Connection connectTodB() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemodb";
        String username = "root";
        String password = "sasanga";
        con = DriverManager.getConnection(url, username, password);
        return con;
    }

    public void disconnect() throws Exception
    {
        con.close();
    }
}
