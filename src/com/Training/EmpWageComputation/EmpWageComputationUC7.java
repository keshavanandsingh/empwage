package com.Training.EmpWageComputation;

public class EmpWageComputationUC7 
{
	public static final int ISPT = 1;//PT- PART TIME
	public static final int ISFT = 2;//FT-FULL TIME
	public static final int EMPRATEPHR = 20;
	public static final int numOfWrkDay = 20;
	public static final int maxNoInMonth = 100;

	public static int computeEmpWage() {
		int empHours = 0, totalWorkingHours = 0, totalWorkingDays = 0;

		while (totalWorkingDays++ < numOfWrkDay &&
				totalWorkingHours < maxNoInMonth) {
			short empCheck = (short) (Math.random() * 10 % 3);

			switch (empCheck) {
			case ISPT:
				empHours = 4;
				break;
			case ISFT:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}

			totalWorkingHours += empHours;
			System.out.println("Total Working Day: " + totalWorkingDays + 
								 " & Total Working Hours: " + totalWorkingHours);
		}
		
		int totalEmpWage = totalWorkingHours * EMPRATEPHR;
		System.out.println("Total Employ Wage: " + totalEmpWage);
		
		return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage();
	}
}
