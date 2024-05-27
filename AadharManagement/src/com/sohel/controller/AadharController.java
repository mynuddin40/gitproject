package com.sohel.controller;

import java.util.List;
import java.util.Scanner;

import com.sohel.dto.Aadhar;
import com.sohel.dto.Address;

import com.sohel.sevice.AadharServiceImpl;
public class AadharController {
	public static void main(String[] args)
	{
		
	AadharServiceImpl aadharService = new AadharServiceImpl();
	while(true) {
	System.out.println("Enter the action you want to perform");
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Add Aadhar");
	System.out.println("2.Select Aadhar by id");
	System.out.println("3.Select Aadhar by name");
	System.out.println("4.Select All Aadhar ");
	System.out.println("5.Select all Aadhar income by price low to high");
	System.out.println("6.Select all Aadhar income by price high to low");
	System.out.println("7.delete Aadhar by name");
	System.out.println("8. update Aadhar");
	int choice = sc.nextInt();
	switch(choice) {
	case 1 : System.out.println("Enter Aadhar Details ");
	         Aadhar aadhar = new Aadhar();
	         Address address = new Address();
	         System.out.println("Enter Aadhar id");
	         aadhar.setAadharId(sc.nextInt());
	         System.out.println("Enter AadharHolder name");
	         aadhar.setAadharHolderName(sc.next());
	         System.out.println("Enter AadharHolder Age");
	         aadhar.setAadharHolderAge(sc.nextInt());
	         System.out.println("Enter AadharHolder Gender");
	          aadhar.setAadharHolderGender(sc.next().charAt(0));
	         System.out.println("Enter mobile number");
	         aadhar.setMobileNumder(sc.nextLong());
	         System.out.print("Enter AadharHolder Income");
	         aadhar.setAadharHolderIncome(sc.nextDouble());  
	         System.out.println("Enter the Village");
	          address.setVillage(sc.next());
	          System.out.println("Enter the Mandal");
	          address.setMandal(sc.next());
	          System.out.println("Enter the District");
	          address.setDistrict(sc.next());
	          System.out.println("Enter the State");
	          address.setState(sc.next());
	          System.out.println("Enter the Pincode");
	          address.setPincode(sc.nextLong());
	          aadhar.setAddress(address);
	         aadharService.saveAadharService(aadhar);
	     	break;
      	case 2 : System.out.println("Enter the aadhar id");
        int aadharId = sc.nextInt();
        Aadhar selectedAadhar = aadharService.selectAadharByIdService(aadharId);
        System.out.println(selectedAadhar);
          break;
	    case 3:
		System.out.println("Enter the Aadhar name to select");
		String aadharName = sc.next();
		Aadhar selectedAadharByName = aadharService.selectAadharByNameService(aadharName);
		System.out.println(selectedAadharByName);
		break;
	    case 4:
			System.out.println("Selected all Aadhar");
			List<Aadhar> aadharList = aadharService.selectAllAadharByService();
			for (Aadhar aad : aadharList) {
				System.out.println(aad);
			}
			break;
	    case 5:
			System.out.println("select all Aadhar by Income low to high");
			List<Aadhar> aadLHIList = aadharService.selectAllAadharIncomeByPriceLowToHighService();
			for (Aadhar aad : aadLHIList) {
				System.out.println(aad);
			}
			break;
	    case 6:
			System.out.println("select all Aadhar by Income high to low");
			List<Aadhar> aadHLIList = aadharService.selectAllAadharIncomeByPriceHightToLowService();
			for (Aadhar aad : aadHLIList) {
				System.out.println(aad);
			}
			break;
	    case 7:
			System.out.println("delete aadhar by id");
			System.out.println("Enter the aadhar id");
			int aadharId1 = sc.nextInt();
			aadharService.deleteAadharByIdService(aadharId1);;
			break;
	    case 8:
			System.out.println("Do you want to update from, find the Aadhar Details below");
			List<Aadhar> allAadList = aadharService.selectAllAadharByService();
			for (Aadhar aad : allAadList) {
				System.out.println(aad);
			}
			System.out.println("enter the Aadhar Id you want to update");
			int modifyAadharId  = sc.nextInt();
			Aadhar modifyingAadhar = aadharService.selectAadharByIdService(modifyAadharId);
			System.out.println(modifyingAadhar);
			System.out.println("Enter the Aadharname you wish to update");
			String newAadharName = sc.next();
		    modifyingAadhar.setAadharHolderName(newAadharName);
		    System.out.println(modifyingAadhar);
     		System.out.println("Enter the Aadharholder Age you wish to update");
			int newAge=sc.nextInt();
			
			break;
		}
}
}
}

