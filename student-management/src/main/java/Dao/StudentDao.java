package Dao;

import java.util.List;

import Dto.Student;

public interface StudentDao {
	
	Integer saveStudent(Student sdt) throws Exception;
	
	Integer updateStudnet(String id,Student sdt) throws Exception;
	
	Integer deleteStudentById(String id) throws Exception;
	
	Student findStudentById(String id) throws Exception;
	
	List<Student> findAll() throws Exception;

}
