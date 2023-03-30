package LoopsInJava;

public class PrintTableOf2 {

	int number=1;
	int answer;
	
	void tableOf2() {
		
		int finalNumber = 10;
		
		while(number<=finalNumber)
		{
			answer=number*2;
			System.out.println(answer);
			number++;
		}
	}
	
}
