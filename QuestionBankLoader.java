package com.lti.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	//-----------static page to crate questions( static Dao class)
	public List<Question> fetchQuestionsOnJava(){ //return type is list
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject("Java");
		//--Q1
		Question q = new Question();
		q.setQuestion("What is a class?");
		List<Option> opts = new ArrayList<Option>();
		Option o1 = new Option();
		o1.setOption("class is a template for an object");
		o1.setRightAnswer(true);
		Option o2 = new Option();
		o2.setOption("class is an instance of an object");
		o2.setRightAnswer(false);
		Option o3 = new Option();
		o3.setOption("class is another name for object");
		o3.setRightAnswer(false);
		Option o4 = new Option();
		o4.setOption("All of the above");
		o4.setRightAnswer(false);
		
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		q.setOptions(opts);
         qb.addNewQuestion("Java", q);
         
       //--Q2
 		 q = new Question();
 		q.setQuestion("What is a java?");
 		 opts = new ArrayList<Option>();
 		 o1 = new Option();
 		o1.setOption("java is an object");
 		o1.setRightAnswer(false);
 		 o2 = new Option();
 		o2.setOption("Programming language");
 		o2.setRightAnswer(true);
 		 o3 = new Option();
 		o3.setOption("It is a software");
 		o3.setRightAnswer(false);
 		 o4 = new Option();
 		o4.setOption("It is an OS");
 		o4.setRightAnswer(false);
 		
 		opts.add(o1);
 		opts.add(o2);
 		opts.add(o3);
 		opts.add(o4);
 		q.setOptions(opts);
          qb.addNewQuestion("Java", q);
          
 	//---Q3
        
  		 q = new Question();
  		q.setQuestion("What is an object");
  		 opts = new ArrayList<Option>();
  		 o1 = new Option();
  		o1.setOption("Its is an instance of class");
  		o1.setRightAnswer(true);
  		 o2 = new Option();
  		o2.setOption("object is an template of class");
  		o2.setRightAnswer(false);
  		 o3 = new Option();
  		o3.setOption("it is another name for class");
  		o3.setRightAnswer(false);
  		 o4 = new Option();
  		o4.setOption("All of the above");
  		o4.setRightAnswer(false);
  		
  		opts.add(o1);
  		opts.add(o2);
  		opts.add(o3);
  		opts.add(o4);
  		q.setOptions(opts);
           qb.addNewQuestion("Java", q);
          
         //--Q4
   		 q = new Question();
   		q.setQuestion("full form of jvm is");
   		 opts = new ArrayList<Option>();
   		 o1 = new Option();
   		o1.setOption("java virtual machine");
   		o1.setRightAnswer(true);
   		 o2 = new Option();
   		o2.setOption("java virtual mode ");
   		o2.setRightAnswer(false);
   		 o3 = new Option();
   		o3.setOption("joint visual machine");
   		o3.setRightAnswer(false);
   		 o4 = new Option();
   		o4.setOption("jdbc virtual machine");
   		o4.setRightAnswer(false);
   		
   		opts.add(o1);
   		opts.add(o2);
   		opts.add(o3);
   		opts.add(o4);
   		q.setOptions(opts);
            qb.addNewQuestion("Java", q);
            
   	return qb.getQuestionsFor("Java");
  	
	}
}
