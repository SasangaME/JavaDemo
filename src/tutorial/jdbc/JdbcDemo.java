package tutorial.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JdbcDemo {
    public static void demo()
    {
        try
        {
//           getSingleData();
            JdbcDemo obj = new JdbcDemo();
            List<Student> lst = obj.getAllData();
            for(Student s : lst)
            {
                System.out.println(s.getId() + " : " + s.getName());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void getSingleData() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemodb";
        String username = "root";
        String password = "sasanga";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        String query = "select * from student where Id = 1";
        ResultSet rs =  st.executeQuery(query);

        rs.next();
        String name = rs.getString("Name");

        System.out.println(name);

        con.close();
    }

    public List<Student> getAllData() throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemodb";
        String username = "root";
        String password = "sasanga";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        String query = "select * from student";
        ResultSet rs =  st.executeQuery(query);

        List<Student> lst = new ArrayList<>();
        Student obj;

        while (rs.next())
        {
            obj = new Student();
            obj.setId(rs.getInt("Id"));
            obj.setName(rs.getString("Name"));
            lst.add(obj);
        }

        return lst;
    }
}

class  Student
{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
