package com.Training.EmpWageComputation;

public class EmpWageComputationUC11 implements WageCalculatorUC11 {
	static final int isPT = 1;
	static final int isFT = 2;

	private companyEmpWage[] companyEmpWageArray;
	
	public EmpWageComputationUC11(companyEmpWage[] companyEmpWageArray) {
		super();
		this.companyEmpWageArray = companyEmpWageArray;
	}
	
	@Override
	public void computeWage() {
		
		int noOfCompany = companyEmpWageArray.length;
		
		for (int i = 0; i < noOfCompany; i++) {
			int workHour = 0;
			int empWage = 0; 
			int totalWage = 0;
			int totalHours = 0;
			
			for (int days = 0; days < (companyEmpWageArray[i].getNoOfWorkingDays()) && totalHours <= (companyEmpWageArray[i].getTotalFixedWorkingHours()); days++) {
				
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
				empWage = workHour * companyEmpWageArray[i].getWagePerHour();
				totalWage += empWage;
			
			}
		
			System.out.println("Total Wage of " + companyEmpWageArray[i].getCompanyName() + " is: " + totalWage);
			
		}
	
}

	public static void main(String[] args) {
		
		
		companyEmpWage[] empWageArray = new companyEmpWage[3];
		
		empWageArray[0] = new companyEmpWage("Codesity", 100, 22, 100);;
		empWageArray[1] = new companyEmpWage("ePW", 90, 20, 120);
		empWageArray[2] = new companyEmpWage("dMart", 110, 20, 150);
		
		EmpWageComputationUC11 empWageBuilderObject = new EmpWageComputationUC11(empWageArray);
		
		empWageBuilderObject.computeWage();
		
		
	}
}
