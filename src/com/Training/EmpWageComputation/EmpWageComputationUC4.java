package com.Training.EmpWageComputation;

public class EmpWageComputationUC4 
{
	     static final int isPT = 1;
	     static final int isFT = 2;
	     static final int wagePHr = 20;

	     public static void main(String[] args)
	     {
		 int workHour = 0;
		
		 int empWage = 0;
		
		 int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
		 switch (empCheck) {
			case isPT:
				workHour = 4; 
				break;
			
			case isFT:
				workHour = 8;
				break;
			
			default:
				workHour = 0;
		}
		empWage = workHour * wagePHr;
		
		System.out.println("Daily Employee Wage: " + empWage);
	}
}
