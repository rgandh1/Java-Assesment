package com.Nagarro.Nagp.QuestionBank;

/*
 * Purpose of this class is to make Quiz object
 */

import java.util.HashMap;
import java.util.Hashtable;



public class Quiz {
	public static HashMap<Integer, HashMap<String,HashMap<String[],String>>>	QuizMap =  new HashMap<Integer, HashMap<String,HashMap<String[],String>>>();
		
	public static void add_Question(Integer Number, String Question, String[]Answers, String CorrectAnswer)
	{
		HashMap<String[],String> Answer = new HashMap<String[],String>();
		Answer.put(Answers, CorrectAnswer);
		HashMap<String,HashMap<String[], String>> question = new HashMap<String,HashMap<String[], String>>();
		question.put(Question, Answer);
		QuizMap.put(Number, question);
	}
	
}
