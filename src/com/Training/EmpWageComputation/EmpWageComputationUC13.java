package com.Training.EmpWageComputation;

import java.util.ArrayList;
import java.util.List;

public class EmpWageComputationUC13 {
	
		static final int isPT = 1;
		static final int isFT = 2;

		private ArrayList<companyEmpWage> companyEmpWageArrayList;
		
		public EmpWageComputationUC13(List<companyEmpWage> empWageArrayList) {
			super();
			this.companyEmpWageArrayList = (ArrayList<companyEmpWage>) empWageArrayList;
		}
		

		public void computeWage() {
			
			
			for (companyEmpWage compObj : companyEmpWageArrayList) {
				int workHour = 0;
				int empWage = 0; 
				int totalWage = 0;
				int totalHours = 0;
				int noOfDays = 0;
				
				for (int days = 0; days < (compObj.getNoOfWorkingDays()) && totalHours <= (compObj.getTotalFixedWorkingHours()); days++) {
					
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
					empWage = workHour * compObj.getWagePerHour();
					noOfDays++;
					System.out.println("Day "+ noOfDays + " Emp Wage for company "+ compObj.getCompanyName() + ": " + empWage);
					totalWage += empWage;
					
				
				}
			
				System.out.println("Total Wage of " + compObj.getCompanyName() + " is: " + totalWage);
				
			}
		
	}

		public static void main(String[] args) {
			
			
			List<companyEmpWage> empWageArrayList = new ArrayList<companyEmpWage>();
			
			empWageArrayList.add(new companyEmpWage("Codesity", 100, 22, 100));
			empWageArrayList.add(new companyEmpWage("ePW", 90, 20, 120));
			empWageArrayList.add(new companyEmpWage("dMart", 110, 20, 150));
			
			EmpWageComputationUC13 empWageBuilderObject = new EmpWageComputationUC13(empWageArrayList);
			
			empWageBuilderObject.computeWage();
			
			
		}
	}


