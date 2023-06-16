package Dto;

public class Student {
	private String studentRollNo;
	private String studentName;
	private Float studentCgpa;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentRollNo, String studentName, float studentCgpa) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentCgpa = studentCgpa;
	}
	
	
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getStudentCgpa() {
		return studentCgpa;
	}
	public void setStudentCgpa(float studentCgpa) {
		this.studentCgpa = studentCgpa;
	}
	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentCgpa="
				+ studentCgpa + "]";
	}
	

}
