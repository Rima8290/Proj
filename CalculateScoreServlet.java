package com.lti.exam.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/CalculateScoreServlet")
	
public class  CalculateScoreServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//picking up the current ques from the session
		HttpSession session = request.getSession();
	
		Question q = (Question) request.getSession().getAttribute("currentQs");
		
		//reading the value of radio button
		int optionSelected = Integer.parseInt(request.getParameter("op"));
		
		//int score = 0;
		Integer score = (Integer) session.getAttribute("score");
		if(score == null)
			score=0;
		
		//checking if the selected option is right or not
		Option op = q.getOptions().get(optionSelected);
		if(op.isRightAnswer())
			score+=1;
		
		
		//storing the score in the session of the user
		session.setAttribute("score",score);
		response.sendRedirect("QuestionLoaderServlet");
	
	}

}
