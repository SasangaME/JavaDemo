package tutorial.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JdbcDemo {
    public static void demo()
    {
        try
        {
//           getSingleData();
            JdbcDemo obj = new JdbcDemo();
            obj.createRecord();
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

    public void createRecord() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();


        String url = "jdbc:mysql://localhost:3306/jdbcdemodb";
        String username = "root";
        String password = "sasanga";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        String qry1 = "SELECT MAX(id) as id FROM student";
        ResultSet rs1 = st.executeQuery(qry1);

        rs1.next();
        int id = rs1.getInt("id") + 1;
        st.close();


        String qry2 = "INSERT INTO student(Id, Name) VALUES(?, ?)";
        PreparedStatement st2 = con.prepareStatement(qry2);
        st2.setInt(1, id);
        st2.setString(2, name);
        st2.executeUpdate();

        st2.close();
        con.close();
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
