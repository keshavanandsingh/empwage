package com.Training.EmpWageComputation;

public class EmpWageComputationUC8
{
	        public static final int isPT = 1;//PT- part time
	        public static final int isFT = 2;//FT= FULL TIME
	
	        public static int computeEmpWage(String company, int empRatePerHour, 
									 int numOfWorkingDays, int maxHoursPerMonth) {
		
		    int empHours = 0, totalWorkingHours = 0, totalWorkingDays = 0;

	    	while (totalWorkingDays++ < numOfWorkingDays &&
			totalWorkingHours < maxHoursPerMonth) {
			short empCheck = (short) (Math.random() * 10 % 3);

			switch (empCheck) {
			case isPT:
				empHours = 4;
				break;
			case isFT:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}

			totalWorkingHours += empHours;
			System.out.println("Total Working Day: " + totalWorkingDays + 
								" & Total Working Hours: " + totalWorkingHours);
		}
		
		    int totalEmpWage = totalWorkingHours * empRatePerHour;
		    System.out.println("Total Emp Wage for company " + company + ": " + totalEmpWage);
		
		    return totalEmpWage;
	}

	        public static void main(String[] args) {
	     	computeEmpWage("Dexon", 50, 22, 100);
	    	System.out.println("**************");
	    	computeEmpWage("BlackCap", 150, 18, 110);
	}
}
