package com.Nagarro.Nagp.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import com.Nagarro.Nagp.QuestionBank.Quiz;

/*
 * purpose of this class is to read quiz from properties file
 */

public class Utility {
	
	public static Properties testData = new Properties();
	
	public static void getValuesFromPropertyFile(String FileName)
	{
		
		File file = new File(FileName);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
			
		//load properties file
		try {
			testData.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		ArrayList<String> answers = new ArrayList<String>();				
		String correctAnswer;
		Enumeration<String> enums = (Enumeration<String>) testData.propertyNames();
	    while (enums.hasMoreElements())       
		
		{
		     		  
		     String lKey = enums.nextElement();
		     String lValue = testData.getProperty(lKey);
		     System.out.println(lKey);
		     String questionIdentifier = lKey.substring(0, 1);
		     String sParameterValue = lKey.substring(2);
		     
		     if (sParameterValue.contains("Option"))
		     {
		    	 answers.add(lValue);
		      }
		     if (sParameterValue.contains("Answer"))
		     {
		    	 correctAnswer=lValue;
		      }
		  //Quiz.add_Question(Number, Question, Answers, CorrectAnswer);   
		 }
	}
	
}
