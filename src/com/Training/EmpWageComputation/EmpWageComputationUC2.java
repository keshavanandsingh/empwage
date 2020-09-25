package com.Training.EmpWageComputation;

public class EmpWageComputationUC2 
{
        public static void main(String[] args) 
        {
		
		int isFullTime = 1;
		int wrkHr = 0;
		int wagePHr = 20;
		int empWage = 0;
		
		double isEmpPresent = Math.floor(Math.random()*10) % 2;
		
		if (isFullTime == isEmpPresent)
		{
			wrkHr = 8;
		}
		
		empWage = wrkHr * wagePHr;
		
		System.out.println("Daily Employee Wage: " + empWage);
	}

}
