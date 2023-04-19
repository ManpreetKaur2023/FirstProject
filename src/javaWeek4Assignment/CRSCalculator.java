package javaWeek4Assignment;

public class CRSCalculator {
	int educationScore;
	int experienceScore;
	int ageScore;
	int ieltslistening;
	int ieltsSpeaking;
	int ieltsReading;
	int ieltsWriting;
	int relativeScore;
	int studyInCanadaScore;
	int canadaWorkScore;
	
	void educationScores(String educationLevel) {
		if(educationLevel.equals("PhD")) {
			 educationScore=25;
			 System.out.println(educationScore);
		}else if(educationLevel.equals("Master Degree")) {
			educationScore=23;
			 System.out.println(educationScore);
		}
		else if(educationLevel.equals("Two or more degree")) {
			educationScore=22;
			 System.out.println(educationScore);
		}
		else if(educationLevel.equals("12 and three year degree")) {
			educationScore=21;
			 System.out.println(educationScore);
		}
		else {
			System.out.println("Incorrect Input");
		}
	}
	
	void experienceScores(int noOfYears) {
		if(noOfYears==4 || noOfYears==5) {
			experienceScore=13;
			System.out.println(experienceScore);
		}
		else if(noOfYears>=6) {
			experienceScore=15;
			System.out.println(experienceScore);
		}
		
		else {
			System.out.println("Incorrect Input");
		}
	}
	
	void ageScores(int age) {
		if(age>=18 && age<=35) {
			ageScore=12;
			System.out.println(ageScore);
			
		}
		else if(age==36) {
			ageScore=11;
			System.out.println(ageScore);
			
		}
		else if(age==37) {
			ageScore=10;
			System.out.println(ageScore);
			
		}
		else if(age==38) {
			ageScore=9;
			System.out.println(ageScore);
			
		}
		else if(age==39) {
			ageScore=8;
			System.out.println(ageScore);
			
		}
		else if(age==40) {
			ageScore=7;
			System.out.println(ageScore);
			
		}
		else if(age==41) {
			ageScore=6;
			System.out.println(ageScore);
			
		}
		else if(age==42) {
			ageScore=5;
			System.out.println(ageScore);
			
		}
		else if(age==43) {
			ageScore=4;
			System.out.println(ageScore);
			
		}
		else if(age==44) {
			ageScore=3;
			System.out.println(ageScore);
			
		}
		else if(age==45) {
			ageScore=2;
			System.out.println(ageScore);
			
		}
		else if(age==46) {
			ageScore=1;
			System.out.println(ageScore);
			
		}
		else if(age==47) {
			ageScore=0;
			System.out.println(ageScore);
		
		}
		else {
			System.out.println("Incorrect Input");
		}
	
	}

	void ieltListeningScore(double listeningScore ) {
		if(listeningScore>=8) {
			ieltslistening=6;
			System.out.println(ieltslistening);
		}
		else if(listeningScore==7.5) {
			ieltslistening=5;
			System.out.println(ieltslistening);
		}
		else {
			System.out.println("Incorrect Input");
		}
	}
	
	void ieltSpeakingScore(double SpeakingScore ) {
		if(SpeakingScore>=7) {
			ieltsSpeaking=6;
			System.out.println(ieltsSpeaking);
		}
		else if(SpeakingScore==6.5) {
			ieltsSpeaking=5;
			System.out.println(ieltsSpeaking);
		}
		else {
			System.out.println("Incorrect Input");
		}
	}
	
	void ieltReadingScore(double readingScore ) {
		if(readingScore>=7) {
			ieltsReading=6;
			System.out.println(ieltsReading);
		}
		else if(readingScore==6.5) {
			ieltsReading=5;
			System.out.println(ieltsReading);
		}
		else {
			System.out.println("Incorrect Input");
		}
	}
	void ieltWritingScore(double writingScore ) {
		if(writingScore>=7) {
			ieltsWriting=6;
			System.out.println(ieltsWriting);
		}
		else if(writingScore==6.5) {
			ieltsWriting=5;
			System.out.println(ieltsWriting);
		}
		else {
			System.out.println("Incorrect Input");
		}
	}
	
	void haveRelativeInCanada(String relativeInCanada) {
		if (relativeInCanada.equals("y")) {
			relativeScore=5;
			System.out.println(relativeScore);
		}
		
	}
	
	void studyInCanada(String studyInCanada) {
		if(studyInCanada.equals("y")) {
		studyInCanadaScore=5;
		System.out.println(studyInCanadaScore);
		}
		
	}
	
	void workInCanada(String workInCanada) {
		if(workInCanada.equals("y")){
			canadaWorkScore=10;
			System.out.println(canadaWorkScore);
		}
		
	}
	
	void totalPoints() {
	int totalPoints=educationScore+experienceScore+ieltslistening+ieltsReading+ieltsSpeaking+ieltsWriting+ageScore+relativeScore+canadaWorkScore+studyInCanadaScore;
    System.out.println("Toatl points you have scored: "+totalPoints +"Points");
    if(totalPoints>67) {
    	System.out.println("You qualify to submit an Expression of Interest(EOI) to immigration Canada");
    }
}
}
