package Dao;

import java.sql.Connection;
import java .util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Dto.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Statement st=null;

	public StudentDaoImpl() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/second","root","root");
		Statement st=con.createStatement();
	}

	public Integer saveStudent(Student sdt) throws Exception {
		String sql="insert into sdttble values('"+sdt.getStudentRollNo()+"','"+sdt.getStudentName()+"',"+sdt.getStudentCgpa()+")";   
		
		int n=st.executeUpdate(sql);
		return n;
	}

	public Integer updateStudnet(String id, Student sdt) throws Exception {
		String sql="update sdttble set name='"+sdt.getStudentName()+"',marks="+sdt.getStudentCgpa()+" where roll="+id;
		int n=st.executeUpdate(sql);
		return n;
	}

	public Integer deleteStudentById(String id) throws Exception {
		String sql="delete from sdttble where roll="+id;
		int n=st.executeUpdate(sql);
		return n;
	}

	public Student findStudentById(String id) throws Exception {
		String sql="select name,marks from sdttble where roll="+id;
		ResultSet rs=st.executeQuery(sql);
		Student sdt=null;
		if(rs.next()) {
			sdt=new Student();
			String name=rs.getString(1);
			float marks=rs.getFloat(2);
			sdt.setStudentRollNo(id);
			sdt.setStudentName(name);
			sdt.setStudentCgpa(marks);
		}
		return sdt;
		
	}

	public List<Student> findAll() throws Exception {
		
		List<Student> sdts=new ArrayList<Student>();
		String sql="select * from sdttble";
		
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			String id=rs.getString(1);
			String name=rs.getString(2);
			float marks=rs.getFloat(3);
			
			
			Student sdt=new Student();
			sdts.add(sdt);

		}
		
		
		
		return sdts;
		
	}

}
