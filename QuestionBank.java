package com.lti.exam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 //        ---------------------------------------To Store Data In memory
public class QuestionBank {

	private Map<String, List<Question>> questionBank = new HashMap<String, List<Question>>();
	public void addNewSubject(String subjectName) {
	       questionBank.put(subjectName, new ArrayList<Question>());//empty list
	       
	       
	}
	public void addNewQuestion(String subjectName, Question question) { //---------To add questions
		List<Question> questions = questionBank.get(subjectName);
	    questions.add(question);//to fill the list
	    }
	
	public List<Question>getQuestionsFor(String subjectName){ //----------------To Read Questions
		return questionBank.get(subjectName);
		
	}
}
