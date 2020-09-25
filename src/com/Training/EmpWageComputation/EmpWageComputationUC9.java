package com.Training.EmpWageComputation;

public class EmpWageComputationUC9
{
	static final int isPT = 1;//PT-part time
	static final int isFT = 2;//FT-full time
	
	private final String companyName;
	private final int wagePHr;
	private final int noOfWorkingDays;
	private final int totalFixedWorkingHours;
	
	
	public EmpWageComputationUC9 (String companyName, int wagePHr, int noOfWorkingDays, int totalFixedWorkingHours) {
		
		this.companyName = companyName;
		this.wagePHr = wagePHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.totalFixedWorkingHours = totalFixedWorkingHours;
	}
	
	
	public void computeWage() {
		
		int workHour = 0;
		int empWage = 0; 
		int totalWage = 0;
		int totalHours = 0;
		
		for (int days = 0; days < noOfWorkingDays && totalHours <= totalFixedWorkingHours; days++) {
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
			empWage = workHour * wagePHr;
			totalWage += empWage;
			
		}
		
		System.out.println("Total Wage of " + companyName + " is: " + totalWage);
		
	}

	public static void main(String[] args) {
		
		EmpWageComputationUC9 empWageBuilderCodesity = new EmpWageComputationUC9("Codesity", 100, 20, 100);
		EmpWageComputationUC9 empWageBuilderePW = new EmpWageComputationUC9("ePW", 50, 20, 100);
		
		empWageBuilderCodesity.computeWage();
		empWageBuilderePW.computeWage();
		
		
	}
}
