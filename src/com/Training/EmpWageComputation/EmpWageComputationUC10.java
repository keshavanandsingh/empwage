package com.Training.EmpWageComputation;

public class EmpWageComputationUC10
{
	    static final int isPT = 1;//PT- PART IME
	    static final int isFT = 2;//FT- FULL TIME
	
      	private final String companyName;
    	private final int wagePerHour;
    	private final int noOfWorkingDays;
        private final int totalFixedWorkingHours;
	
	
	    public EmpWageComputationUC10 (String companyName, int wagePerHour, int noOfWorkingDays, int totalFixedWorkingHours) {
		
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.totalFixedWorkingHours = totalFixedWorkingHours;
	}
	
	
	    public void computeWage()
	    {
		
		int workHour = 0;
		int empWage = 0; 
		int totalWage = 0;
		int totalHours = 0;
		
		for (int days = 0; days < noOfWorkingDays && totalHours <= totalFixedWorkingHours; days++) {
		int empCheck = (int) Math.floor(Math.random()*10) % 3;
		
		switch (empCheck)
		{
		 case isPT:
		 workHour = 4;
		 totalHours += workHour;
					
	    //To Check : TOTAL HOUR  > 100
					
		if(totalHours > 100)
		{
		totalHours = 100;
					}
					
		break;
			
		case isFT:
		workHour = 8;
		totalHours += workHour;
					
					
		if(totalHours > 100)
		{
		totalHours = 100;
					}
					
		break;
			
		default:
		workHour = 0;
			}
		empWage = workHour * wagePerHour;
		totalWage += empWage;
			
		}
		
		System.out.println("Total Wage of " + companyName + " is: " + totalWage);
		
	}

	public static void main(String[] args) {
		
		EmpWageComputationUC10	 empWageBuilderCodesity = new EmpWageComputationUC10("Codesity", 100, 20, 100);
		EmpWageComputationUC10 empWageBuilderePW = new EmpWageComputationUC10("ePW", 50, 20, 100);
		
		empWageBuilderCodesity.computeWage();
		empWageBuilderePW.computeWage();
		
		
	}
}
