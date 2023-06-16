package configs;

import ServiceLayer.StudentService;
import ServiceLayer.StudentServiceImpl;

public class StudentServicefactory {
	private static StudentService service=null;
	
	public static StudentService getStudentService() throws Exception{
		if(service==null) {
			service =new StudentServiceImpl();
		}
		return service;
	}

}
