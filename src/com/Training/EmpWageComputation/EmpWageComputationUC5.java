package com.Training.EmpWageComputation;

public class EmpWageComputationUC5 
{
	static final int isPT = 1;//PT- PART TIME
	static final int isFT = 2;//FT-FULL TIME
	static final int wagePHr = 20;
	static final int noOfWorkingDays = 20;

	public static void main(String[] args) {
		
		
		int wrkHr = 0;
		int empWage = 0; 
		int totalWage = 0;
		
		for (int days = 0; days < noOfWorkingDays; days++) {
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
			switch (empCheck) 
			{
				case isPT:
					wrkHr = 4; 
					break;
			
				case isFT:
					wrkHr = 8;
					break;
			
				default:
					wrkHr = 0;
			}
			empWage = wrkHr * wagePHr;
			
			totalWage += empWage;
		}
		System.out.println("Total Employee Wage of Days: " + totalWage);
	}

}
