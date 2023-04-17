package javaWeek4Assignment;

import java.util.Scanner;

public class CRSCalculatorMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CRSCalculator crscalculator=new CRSCalculator();
		
		System.out.println("Enter level of your education");
	     String educationLevel=sc.nextLine();
	     crscalculator.educationScores(educationLevel);
	     
	     System.out.println("Enter your Experience in Years");
	     int experienceScore=sc.nextInt();
	     crscalculator.experienceScores(experienceScore);

	     System.out.println("Enyer your Age in Years");
	     int age=sc.nextInt();
	     crscalculator.ageScores(age);
	     
	     System.out.println("Enter your IELTS Score for Listening");
	     double ieltsListening=sc.nextDouble();
	     crscalculator.ieltListeningScore(ieltsListening);
	     
	     System.out.println("Enter your IELTS Score for Speaking");
	     double ieltsSpeaking=sc.nextDouble();
	     crscalculator.ieltSpeakingScore(ieltsSpeaking);
	     
	     System.out.println("Enter your IELTS Score for Reading");
	     double ieltsReading=sc.nextDouble();
	     crscalculator.ieltReadingScore(ieltsReading);
	     
	     System.out.println("Enter your IELTS Score for Writing");
	     double ieltsWriting=sc.nextDouble();
	     crscalculator.ieltWritingScore(ieltsWriting);
	     
	     System.out.println("Have relative in Canada(y/n)");
	     String relativeInCanada=sc.nextLine();
	     crscalculator.haveRelativeInCanada(relativeInCanada);
	     
	     System.out.println("Have you studied in Canada for atleast 2 Years(y/n)");
	     String studyInCanada=sc.nextLine();
	     crscalculator.studyInCanada(studyInCanada);
	     
	     System.out.println("Have you worked in Canada for 1 Years(y/n)");
	     String workInCanada=sc.nextLine();
	     crscalculator.workInCanada(workInCanada);
	    
	     crscalculator.totalPoints();
	
	}
	

}
