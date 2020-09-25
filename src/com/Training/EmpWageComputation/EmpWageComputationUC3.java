package com.Training.EmpWageComputation;

public class EmpWageComputationUC3 
{
        public static void main(String[] args)
        {
		
		int isPT = 1;//PT-PART TIME
		int isFT = 2;//FT-FULL TIME
		int wrkHr = 0;
		int wagePHr = 20;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random()*10) % 3;
		
		if (isFT == empCheck) {
			wrkHr = 8;
		}
		
		else if (isPT == empCheck) {
			wrkHr = 4;
		}
		
		empWage = wrkHr * wagePHr;
		
		System.out.println("Daily Employee Wage: " + empWage);
	}

}
