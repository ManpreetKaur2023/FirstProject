package interviewQusetion;

public class RandomNumbers {
	
	
	int[] randomNumberArray= {2,4,6,8,5,2,7,2,1,10};
	int number;
	int compareNumber;
     void occurrenceOfNumber() {
    	 
    	 for(int i=0;i<randomNumberArray.length;i++) {
    		 if(randomNumberArray[i]==compareNumber) {
    			number=number+1;
    		 }
    		 
    	 }
    	 System.out.println(number);
     }

}
