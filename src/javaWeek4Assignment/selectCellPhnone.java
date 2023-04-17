package javaWeek4Assignment;



public class selectCellPhnone {

	String [] samsungModelsPrice= {"25", "35","55","20"};
	String[] samsungModels= {"S22", "S22+", "S22 Ultra", "S22FE"};
	String[] appleModels= {"Iphone14", "Iphone14pro", "Iphone14promax", "Iphone14mini"};
	String [] appleModelsPrice= {"30", "40","65","25"};
	String[] dataPrice= {"70","80","75"};
	String[] dataPlanes= {"rogers","bell","telus"};
	
	String costOfDataPlan;
	String costOfPhone;
	
	void selectPhoneBrand(String selectBrand) {
		
		if(selectBrand.equals("samsung")) {
			System.out.println("List of available products...... " );
			for(int i=0;i<samsungModels.length;i++) {
				System.out.println(samsungModels[i]);	
			}
			
		}
		else if(selectBrand.equals("apple")) {
			System.out.println("List of available products " );
			for(int i=0;i<appleModels.length;i++) {
			System.out.println(appleModels[i]);

		}
		}
		else {
			System.out.println("Incorrect option");
		}
	}
	
	
	void selectPhoneModel(String selectBrand, String selectModel) {
		if(selectBrand.equals("samsung")) {
		for(int i=0;i<samsungModels.length;i++) {
			if(selectModel.equals(samsungModels[i])) {
				System.out.println("Product selected is " +samsungModels[i]);
				break;
			}
			
			}
		}
		
		else if(selectBrand.equals("apple")) {
			for(int i=0;i<appleModels.length;i++) {
				if(selectModel.equals(appleModels[i])) {
					System.out.println("Product selected is " +appleModels[i]);
					break;
				}
				}
		}
	}
	
	
	void selectDataPlan(String selectPlan,String selectBrand,String selectModel) {
		System.out.println("You have selected "+selectModel+ " with " +selectPlan);
	}
	
	
	void phoneBill(String selectBrand,String selectModel) {
		if(selectBrand.equals("samsung")){
		for(int i=0;i<samsungModelsPrice.length;i++) {
		if( selectModel.equals(samsungModels[i])) {
		System.out.println("Your phone tab will be: $"+samsungModelsPrice[i]);
		costOfPhone=samsungModelsPrice[i];
			
		
		}}
		}
		
		if(selectBrand.equals("apple")){
			for(int i=0;i<appleModelsPrice.length;i++) {
			if( selectModel.equals(appleModels[i])) {
			System.out.println("Your phone tab will be: $"+appleModelsPrice[i]);
				costOfPhone=appleModelsPrice[i];
			}}
			}
		
	}
	
	void dataBill(String selectPlan) {
		if(selectPlan.equals("rogers")) {
			for(int i=0;i<dataPrice.length;i++) {
				if(selectPlan.equals(dataPlanes[i])) {
					System.out.println("Your monthly plane will be: $"+dataPrice[i]);
					costOfDataPlan=dataPrice[i];
				}
			}
		}
		
		if(selectPlan.equals("bell")) {
			for(int i=0;i<dataPrice.length;i++) {
				if(selectPlan.equals(dataPlanes[i])) {
					System.out.println("Your monthly plane will be: $"+dataPrice[i]);
					costOfDataPlan=dataPrice[i];
				}
			}
		}
		
		if(selectPlan.equals("telus")) {
			for(int i=0;i<dataPrice.length;i++) {
				if(selectPlan.equals(dataPlanes[i])) {
					System.out.println("Your monthly plane will be: $"+dataPrice[i]);					
					 costOfDataPlan=dataPrice[i];
									
				}
			}
		}
		
	}
	
	void finalBill() {
		int costOfData=Integer.parseInt(costOfDataPlan);
		int costOfMobile=Integer.parseInt(costOfPhone);
		int finalBill=costOfData+costOfMobile;
		System.out.println("Total Monthly Amount: $"+finalBill);
	}
	
	
	
}
