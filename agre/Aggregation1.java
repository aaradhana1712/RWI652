package com.agre;


class Student {
	 private int sid;
	 private String sname;
	 public Student(int sid, String sname) {
	  super();
	  this.sid = sid;
	  this.sname = sname;
	 }
	 public int getSid() {
	  return sid;
	 }
	 public void setSid(int sid) {
	  this.sid = sid;
	 }
	 public String getSname() {
	  return sname;
	 }
	 public void setSname(String sname) {
	  this.sname = sname;
	 } 
	}
	class Department{
	 private String dname;
	  private Student student;
	 public Department(String dname, Student student) {
	  super();
	  this.dname = dname;
	  this.student = student;
	 }
	  
	  void show()
	  {
	   System.out.println("Department Name  ="+ dname +" \n" + "Student ="+student.getSid()+" "+ student.getSname());
	  }
	  
	}
	public class Aggregation1 {

	 public static void main(String[] args) {

	  Student s1=new Student(121, "Sneha");
	  Student s2=new Student(122, "Sakshi");
	  
	  Department d=new Department("Computer Science", s1);
	  Department d1=new Department("polytechnic", s2);
	  d.show();
	  d1.show();
	  
	  
	  

	 }

	}