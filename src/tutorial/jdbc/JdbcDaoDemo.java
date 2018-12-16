package tutorial.jdbc;

import java.util.List;

public class JdbcDaoDemo {
    public static void demo()
    {
        try
        {
            StudentDao st = new StudentDao();
            Student obj = st.getStudent(3);
            System.out.println(obj.getId() + " : " + obj.getName());
            Student objStudent = new Student();
            objStudent.setName("Dao Test 123");
            st.insertStudent(objStudent);

            List<Student> lst = st.getStudents();
            for(Student item : lst)
            {
                System.out.println(item.getId() + " : " + item.getName());
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
