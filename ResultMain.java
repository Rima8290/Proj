package com.lti.minorProject;
import java.util.List;
import java.util.Scanner;

public class ResultMain {
  
	
    public static void main(String[] args) {
			 StudentDao dao = new  StudentDao();
		     Scanner in = new Scanner(System.in);
		     Student s = new Student();
	         String s1 = in.nextLine();
		     String s2= in.nextLine();
		     String s3 = in.nextLine();
		     String s4 = in.nextLine();
		     String s5= in.nextLine();
		     System.out.println("The roll number of the student is: " +s1);
		     System.out.println("The first name of the student is: " +s2);
		     System.out.println("The last name of the student is: " +s3);
		     System.out.println("The course of the student is: " +s4);
		     System.out.println("The result of the student is: " +s5);
		     dao.add(s);
    }
}
		     
	/* List<Student> students = dao.fetchAll();
			 
			 for( Student stu : students) {
				  System.out.println("Rollno= "+ stu.getRollno()+"\n"+"First Name:"+
			      stu.getFname()+"\n"+"Last Name:"+stu.getLname()+"\n"+"Course:"+stu.getCourse()+"\n"+"Result"+stu.getResult());
				
			 }
		  }*/
	
		  
		    

	  

