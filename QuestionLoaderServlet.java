package com.lti.exam.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	private int questionNo;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       QuestionBankLoader qb1 = new QuestionBankLoader();
	       List<Question> questions = qb1.fetchQuestionsOnJava();
	       if(questionNo<questions.size()) {
	    	   Question q = questions.get(questionNo++);
		       request.getSession().setAttribute("currentQs",q);
		       response.sendRedirect("showQuestion.jsp");
		       
	       } else{   
	    	   response.sendRedirect("Score.jsp");
	       }
}
}