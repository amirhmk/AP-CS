// Lab 12: The “Sieve of Eratosthenes” Program
// Name:Amir Mousavi		  
// Nov/24/2013
// Teacher: Christopher Slowley 

import java.util.Scanner;
public class Lab12 
{  
	public static void main(String args[])
	{  
        // This main method needs additions for the 100 point version.  
        System.out.println("\nThe \"Sieve of Eratosthenes\"\n");  
        int MAX;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the primes upper bound  ===>>    ");
        MAX=sc.nextInt();
        
        boolean primes[] = new boolean [MAX]; // initilise our array, all numbers true
        primes[0]=false;
        for (int c=1;c<MAX;c++)
       	{
        	primes[c]=true;
        }
     
		System.out.print("Primes between 1 and " + MAX);
		System.out.println();

    	for (int Pr = 2; Pr <= MAX; Pr++) 		// check for being primary
    	{    
    		if (primes[Pr-1])   // i is prime if it has not been crossed off yet
    		{               
    			System.out.print(Pr +" ");   //display the prime numbers
    			
    			for (int NotPr=Pr*Pr;NotPr<=MAX;NotPr+=Pr) // cross the multiples of i
    			{ 
    				primes[NotPr-1]=false;
    			}
    		}  
    	}  
	}
}
