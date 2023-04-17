package javaWeek4Assignment;

import java.util.Scanner;

public class selectCellPhhoneMain {

	public static void main(String[] args) {
		selectCellPhnone cellphone=new selectCellPhnone();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the brand that you want to choose from : apple/samsung ");
		String selectBrand=sc.nextLine();
		cellphone.selectPhoneBrand(selectBrand);
		
		System.out.println("please enter the model that you want to buy from: ");
		String selectModel=sc.nextLine();
		cellphone.selectPhoneModel(selectBrand, selectModel);
		
		System.out.println("Please select the plan that you want to opt for : rogers/telus/bell ");
		String selectPlan=sc.nextLine();
		cellphone.selectDataPlan(selectPlan,selectBrand,selectModel);
		
		cellphone.phoneBill(selectBrand,selectModel);
		cellphone.dataBill(selectPlan);
		
		cellphone.finalBill();
		
		
	}

}
