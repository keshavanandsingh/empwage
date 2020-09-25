package com.Training.EmpWageComputation;

public class EmpWageComputationUC1
{
	    public static void main(String[] args)
	    {
		int IS_FULL_TIME = 1;
		
		double IS_EMP_PRESENT = Math.floor(Math.random()*10) % 2;
		
		if (IS_FULL_TIME == IS_EMP_PRESENT)
		{
			System.out.println("Employee is Present");
		}
		
		else 
		{
			System.out.println("Employee is Absent");
		}
	}
}
