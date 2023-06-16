package Main;
import java.util.*;

import Dto.Student;
import ServiceLayer.StudentService;
import configs.StudentServicefactory;

public class SMSmain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Menu Driven Application
		Scanner sc=new Scanner(System.in);
		
		
		Student sdt;
		int roll;
		StudentService service=StudentServicefactory.getStudentService();
		
		
		while(true) {
			System.out.println("1.New Student");
			System.out.println("2.Searching Studnet");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.All Students");
			System.out.println("Exit");
			
			
			System.out.println("\nselect an option");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:
				sdt=getStudent();
			}
			
		}
		

	}

	private static Student getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
