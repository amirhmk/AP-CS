// Lab11: The "Watch Your Interest"Program
// Name:Amir Mousavi		  
// 04/03/2014
// Teacher: Christopher Slowley
                                                  
import java.util.Scanner;

public class Lab11
{
      
	public static void main (String args[]) 
	{   
		Scanner input = new Scanner(System.in);
  
		int choice;
		double principal;
		double yearlyInterest;
		int paybackYears;
		double monthlyPmt;

		System.out.println("Select one of the following options");
		System.out.println();
		System.out.println("[1]   Monthly Loan Payment Computation");
		System.out.println("[2]   Amortization Schedule");
		System.out.println("[3]   Credit Card Pay-Off Schedule");
		System.out.println();
		System.out.print("Enter your choice  ===>>  ");
		choice = input.nextInt();
		System.out.println();
		
		switch (choice) //Monthly Loan payment
		{
			case 1:
				System.out.print("Enter loan amount       ===>>  ");
				principal = input.nextDouble();
				System.out.print("Enter annual percent    ===>>  ");
				yearlyInterest = input.nextDouble();
				System.out.print("Enter years to pay back ===>>  ");
				paybackYears = input.nextInt();
				Interest loan1 = new Interest(principal, yearlyInterest, paybackYears,0);
				loan1.computePayment();
				break;
			case 2: //Amortization
				System.out.print("Enter principle balance  ===>>  ");
				principal = input.nextDouble();
				System.out.print("Enter annual percent     ===>>  ");
				yearlyInterest = input.nextDouble();
				System.out.print("Enter monthly payment    ===>>  ");
				monthlyPmt = input.nextDouble();
				Interest loan2 = new Interest(principal, yearlyInterest, 0, monthlyPmt);
				loan2.amortization();
				break;
			case 3:
				System.out.print("Enter credit card balance  ===>>  ");
				principal = input.nextDouble();
				System.out.print("Enter annual percent       ===>>  ");
				yearlyInterest = input.nextDouble();
				Interest loan3 = new Interest(principal, yearlyInterest, 0, 0);
				loan3.creditCard();
				break;
		}
		System.out.println();
	}
}
class Interest // all variables are declared
{
	private double principal;
	private double percent;
	private int years;
	private double monthlyPmt;
	private int months;
	private int pmtNr;
	private double monthlyRate;
	private double interestPmt;
	private double principalPmt;
	private double totalPmt;
	private double totalInt;
	private double power;

	public Interest(double la, double yi, int py, double mp) //definition of each variable
	// Do not alter anything in the constructor!
	{
		principal = la;
		percent = yi;
		years = py;
		monthlyPmt = mp;
		monthlyRate = percent/1200;
		months = years * 12;
		pmtNr = 0;
	}
	private double round(double x) //the method that rounds to nearest cent
	{
		return (double) Math.round(100 * x) / 100;
	} 
	public void computePayment()
	{
		System.out.println();
		System.out.println("Monthly Loan Payment Computation");
		System.out.println();
		power=Math.pow((1+monthlyRate),(months)); //the formula
		monthlyPmt=((monthlyRate*power)/ (power-1))*principal; //the formula
		totalPmt=round(monthlyPmt)*months; //total payment is calculuated
		totalInt=totalPmt-principal;
		System.out.println(power); //eveything is printed out
		System.out.println(monthlyRate);
		System.out.println(months);
		System.out.println("Yearly Interest: " + percent);
		System.out.println("Payback Years:   " + years);
		System.out.println("Monthly Payment: " + monthlyPmt);
		System.out.println("Total Payments:  " + totalPmt);
		System.out.println("Total Interest:  " + totalInt);
	}

	public void amortization()
	{
		System.out.println();
		System.out.println("Amortization Schedule");
		System.out.println();
		System.out.println("Loan Amount:     " + principal);
		System.out.println("Yearly Interest: " + percent);
		System.out.println("Montly Payment:  " + monthlyPmt);
		do
		{	
			interestPmt=principal*monthlyRate; // what interest payment is
			if(principalPmt>principal) //if the payment is more than principal, countinous
			{
			monthlyPmt = principal + interestPmt; // if payment is  more, there is a new definiton of monthly payment
			}
			principalPmt=monthlyPmt-interestPmt; //what principle payment is
			principal=principal-principalPmt; //what the new prinicpal is
			totalPmt = totalPmt + monthlyPmt; //the total payment is calculated
			pmtNr++; //the payment number is increased
			totalInt+=interestPmt; //totalInt is acccumalted
		}			
		while (principal > 0); //the condition is if the principal is more than zero
		//eveything is displayed
		System.out.println("Payback Months:  " + pmtNr);  
		System.out.println("Total Payments:  " + Math.floor(totalPmt*100.0)/100.0);
		System.out.println("Total Interest:  " + Math.floor(totalInt*100)/100.0); 
	}
	public void creditCard()
	{
		System.out.println();
		System.out.println("Credit Card Pay-Off Schedule");
		System.out.println();
		System.out.println("Loan Amount:    " + principal);
		System.out.println("Yearly Interst: " + percent);
		
		do
		{








		//	System.out.println(pmtNr+"     \t"+monthlyPmt+"     \t"+interestPmt+"     \t"+principalPmt+"     \t"+principal);
		}
		while (principal > 0);
     
		System.out.println("Payback Months: " + pmtNr);  
		System.out.println("Total Payments: " + totalPmt);
		System.out.println("Total Interest: " + totalInt); 
	}
}

