package com.Nagarro.Nagp.Utility;

import java.util.Scanner;

import com.Nagarro.Nagp.QuestionBank.QuestionBank;
import com.Nagarro.Nagp.QuestionBank.Quiz;

/*
 * Purpose of this class is to start the programme and conduct test
 * Author : Rahul Gandhi
 */

public class driver {

	public static void main(String[] args) {	
		Scanner reader = new Scanner(System.in);
		System.out.println("Are you ready for a quiz?");
		System.out.println("following are quiz options");
		
		System.out.println(QuestionBank.values());
		System.out.println("select your quiz");
		///User selects quiz and based upon that Quiz will be loaded from properties file
		/// 
		Utility.getValuesFromPropertyFile("GeneralKnowledge.properties");
		// quiz object will be created
		//Quiz.add_Question(Number, Question, Answers, CorrectAnswer);
		
		char c = reader.next().charAt(0);
		while (c == 'Y' || c == 'y') {
			int scrore = 0;
			//To do
			//
			/*
			 * display each question from Quiz object
			 * calculate score
			 * Print final score
			 */
			System.out.println("Your final score is "+scrore );
		}
		
		
		System.out.println("Do you want to play again?");
		c = reader.next().charAt(0);
	}
	
}
