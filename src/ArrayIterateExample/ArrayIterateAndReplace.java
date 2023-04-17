package ArrayIterateExample;

public class ArrayIterateAndReplace {

	int[] rollNo = {1,2,3,4,5};
	String [] studentNames= {"Manpreet", "Jimna", "Kamal", "Khushi","Kamal" ,"Harpreet"};
	
	void printArray() {
		for(int i=0;i<rollNo.length;i++) {
			System.out.println(rollNo[i]);
		}
	}
		
	void findName() {
	for(int i=0;i<studentNames.length;i++) {
		if(studentNames[i].equals("Kamal")) {
			System.out.println("Kamal is present at " +i+ " position in class ");
		}
		
	}
		
	}
		 void replaceName() {
			 for(int i=0;i<studentNames.length;i++) {
				 if(studentNames[i].equals("Kamal")) {
					 studentNames[i]="Ashnoor";
					
				 }
				 System.out.println(studentNames[i]);
			 }
		 }
		

			 void replaceTwoName() {
				 for(int i=0;i<studentNames.length;i++) {
					 if(studentNames[i].equals("Kamal")) {
						 studentNames[i]="Ashnoor";
						
					 }
					 if(studentNames[i].equals("Harpreet")) {
						 studentNames[i]="Aman";
						
					 } 
					 
					 
					 System.out.println(studentNames[i]);
				 }
				 
			 }
				 
//sum of  100 even numbers	
				
				 void sumOfEvenNumbers() {
					 int sum =0;
					 for(int i=1;i<=100;i++) {
						 if(i%2==0) {
							  sum=sum+i;
							 
						 }
					 }
					 System.out.println("sum of even numbers is "+sum);
					 
				 }
			  
	
	
	
	
	
	
	
	
	
	
}
