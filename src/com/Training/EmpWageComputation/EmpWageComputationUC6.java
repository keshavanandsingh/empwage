package com.Training.EmpWageComputation;

public class EmpWageComputationUC6 
{
	     static final int isPT = 1;
	     static final int isFT = 2;
	     static final int wagePHr = 20;
	     static final int noOfWorkingDays = 20;
	     static final int TFWH = 100; // TFWH- TOTAL FIXED WORKING HOUR

	     public static void main(String[] args) {
		
		
		 int workHour = 0;
		 int empWage = 0; 
		 int totalWage = 0;
		 int totalHours = 0;
		
		  for (int days = 0; days < noOfWorkingDays && totalHours < TFWH; days++)
		  {
		 int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
		 switch (empCheck)
		 {
				case isPT:
					workHour = 4;
					totalHours += workHour;
					break;
			
				case isFT:
					workHour = 8;
					totalHours += workHour;
					
					//To Check whether total hours has exceeded the 100 hours limit 
					
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
		
		System.out.println("Total Wage for 20 days or 100 hours (whichever occured first): " + totalWage);
	}
}
