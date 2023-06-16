package ServiceLayer;

import java.util.List;

import Dto.Student;
  
public interface StudentService {
	
	void saveStudent(Student sdt) throws Exception;
	
	void updateStudnet(String id,Student sdt) throws Exception;
	
	void  deleteStudentById(String id) throws Exception;
	
	Student findStudentById(String id) throws Exception;
	
	void  findAll() throws Exception;

}
