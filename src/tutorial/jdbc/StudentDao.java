package tutorial.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends BaseDao {

    public Student getStudent(int id) throws Exception
    {
        Student objStudent = new Student();
        Connection con = super.connectTodB();

        String qry1 = "SELECT * FROM student where Id = ?";
        PreparedStatement st = con.prepareStatement(qry1);
        st.setInt(1, id);
        ResultSet rs1 = st.executeQuery();

        rs1.next();
        objStudent.setId(rs1.getInt("Id"));
        objStudent.setName(rs1.getString("Name"));
        con.close();
        return objStudent;
    }

    public void insertStudent(Student student) throws Exception
    {
        Connection con = super.connectTodB();
        String qryMaxId = "select max(id) as id FROM student";
        PreparedStatement stMaxId = con.prepareStatement(qryMaxId);
        ResultSet rsMaxId = stMaxId.executeQuery();
        rsMaxId.next();
        int id = rsMaxId.getInt("id") + 1;
        stMaxId.close();

        String insertQry = "insert into student values(?, ?)";
        PreparedStatement insertSt = con.prepareStatement(insertQry);
        insertSt.setInt(1, id);
        insertSt.setString(2, student.getName());
        insertSt.executeUpdate();

        insertSt.close();
        con.close();
    }

    public void editStudent(Student student) throws Exception
    {

    }

    public List<Student> getStudents() throws  Exception
    {
        List<Student> lst = new ArrayList<>();
        Student obj;
        Connection con = super.connectTodB();

        String qry = "SELECT * FROM student";
        PreparedStatement st = con.prepareStatement(qry);
        ResultSet rs = st.executeQuery();

        while(rs.next())
        {
            obj = new Student();
            obj.setId(rs.getInt("Id"));
            obj.setName(rs.getString("Name"));
            lst.add(obj);
        }

        con.close();
        return  lst;
    }
}
