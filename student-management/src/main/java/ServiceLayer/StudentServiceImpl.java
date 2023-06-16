package ServiceLayer;

import java.util.List;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import Dto.Student;

public class StudentServiceImpl implements StudentService {
	
	private static StudentDao dao=null;
	

	public StudentServiceImpl() throws Exception {
		dao=new StudentDaoImpl();
	}

	public void saveStudent(Student sdt) throws Exception {
		// TODO Auto-generated method stub
		int n=dao.saveStudent(sdt);
		if(n>0)
			System.out.println("Student Saved!...........");

	}

	public void updateStudnet(String id, Student sdt) throws Exception {
		// TODO Auto-generated method stub
		int n=dao.updateStudnet(id, sdt);
		if(n>0)
			System.out.println("Student Updated!........");
		else
			System.out.println("No matching data found to that id......");

	}

	public void deleteStudentById(String id) throws Exception {
		// TODO Auto-generated method stub
		int n=dao.deleteStudentById(id);
		if(n>0)
			System.out.println("Student Deleted!........");
		else
			System.out.println("No matching data found to delete  that id......");

	}

	public Student findStudentById(String id) throws Exception {
		
		return dao.findStudentById(id);
	}

	public void findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Student> sf=dao.findAll();
		for(Student d:sf) {
			System.out.println(d);
			Thread.sleep(1000);
		}

	}

}
