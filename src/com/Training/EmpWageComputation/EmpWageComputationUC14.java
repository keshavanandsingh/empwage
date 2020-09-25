package com.Training.EmpWageComputation;

import java.util.ArrayList;
import java.util.List;

public class EmpWageComputationUC14 {

	static final int isPT = 1;//PT- PART TIME
	static final int isFT = 2;// FT-FULL TIME

	private ArrayList<companyEmpWage> companyEmpWageArrayList;
	
	public EmpWageComputationUC14(List<companyEmpWage> empWageArrayList) {
		super();
		this.companyEmpWageArrayList = (ArrayList<companyEmpWage>) empWageArrayList;
	}
	

	public void computeWage() {
		
		
		for (companyEmpWage compObj : companyEmpWageArrayList) {
			
			int workHour = 0, empWage = 0, totalWage = 0, totalHours = 0, noOfDays = 0;
			
			for (int days = 0; days < (compObj.getNoOfWorkingDays()) && totalHours <= (compObj.getTotalFixedWorkingHours()); days++) {
				
				int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
				switch (empCheck) {
					case isPT:
						workHour = 4;
						totalHours += workHour;
					
						//To Check whether total hours has exceed 100 hours limit 
					
						if(totalHours > 100) {
							totalHours = 100;
						}
					
						break;
						
					case isFT:
						workHour = 8;
						totalHours += workHour;
					
						//To Check whether total hours has exceed 100 hours limit 
					
						if(totalHours > 100) {
							totalHours = 100;
						}
					
						break;
			
					default:	
						workHour = 0;
				}
				empWage = workHour * compObj.getWagePerHour();
				noOfDays++;
				System.out.println("Day "+ noOfDays + " Emp Wage for company "+ compObj.getCompanyName() + ": " + empWage);
				totalWage += empWage;
				
			
			}
		
			System.out.println("Total Wage of " + compObj.getCompanyName() + " is: " + totalWage);
			
		}
	
	}
	
	
	public void computeWage(String companyName) {
		
		companyEmpWage compObject = null;
		
		for (companyEmpWage compObjtemp : companyEmpWageArrayList){
			
			if (compObjtemp.getCompanyName().equalsIgnoreCase(companyName)) {
				compObject = compObjtemp;
				break;
			}
		}
		
		int workHour = 0, empWage = 0, totalWage = 0, totalHours = 0, noOfDays = 0;
		
		if(compObject != null) {
		
			for (int days = 0; days < (compObject.getNoOfWorkingDays()) && totalHours <= (compObject.getTotalFixedWorkingHours()); days++) {
				
				int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
				switch (empCheck) {
					case isPT:
						workHour = 4;
						totalHours += workHour;
					
						//To Check whether total hours has exceed 100 hours limit 
					
						if(totalHours > 100) {
							totalHours = 100;
						}
					
						break;
						
					case isFT:
						workHour = 8;
						totalHours += workHour;
					
						//To Check whether total hours has exceed 100 hours limit 
					
						if(totalHours > 100) {
							totalHours = 100;
						}
					
						break;
			
					default:	
						workHour = 0;
				}
				empWage = workHour * compObject.getWagePerHour();
				noOfDays++;
				System.out.println("Day "+ noOfDays + " Emp Wage for company "+ compObject.getCompanyName() + ": " + empWage);
				totalWage += empWage;
				
			
			}
		
			System.out.println("Total Wage of " + compObject.getCompanyName() + " is: " + totalWage);
		
		}
		
 
	}

	public static void main(String[] args) {
		
		
		List<companyEmpWage> empWageArrayList = new ArrayList<companyEmpWage>();
		
		empWageArrayList.add(new companyEmpWage("Codesity", 100, 22, 100));
		empWageArrayList.add(new companyEmpWage("ePW", 90, 20, 120));
		empWageArrayList.add(new companyEmpWage("dMart", 110, 20, 150));
		
		EmpWageComputationUC14 empWageBuilderObject = new EmpWageComputationUC14(empWageArrayList);
		
		empWageBuilderObject.computeWage("dMart");
		
		
		
		
	}
}
