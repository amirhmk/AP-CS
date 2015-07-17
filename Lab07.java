// Lab07: The GPA Program
// Name:Amir Mousavi		  
// Oct/22/2013
// Teacher: Christopher Slowley 

import java.util.*;

public class Lab07 {		
	
	public static void main (String args[])
	{     
	    System.out.println("\nLAB07 BASIC VERSION\n\n");  //The local classes
	    GPA.enterData();  
	    GPA.computeGPA(); 
	    GPA.displayData();  
	    
	}  
}	
class GPA							//All the Variabled declared
 {
	 	static String courseGrade1;
	 	static String courseGrade2;
	 	static String courseGrade3;	 	
	 	static String courseGrade4;
	 	static String letterGrade;
		static int courseHours1;		
		static int courseHours2;
		static int courseHours3;
		static int courseHours4;
		static double totalValue;
		static double totalHours;
		static double gpa;
		static int courseMark1;
		static int courseMark2;
		static int courseMark3;
		static int courseMark4;
		static int courseValue1;
		static int courseValue2;
		static int courseValue3;
		static int courseValue4;
		
		public static void enterData() 
		{
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);	    //user types the marks
			System.out.print("Enter course 1 Grade  ===>>  ");
			courseGrade1 = keyboard.nextLine();
			System.out.print("enter course 1 Hours  ===>>  ");
			courseHours1 = keyboard.nextInt(); letterGrade = keyboard.nextLine();
			System.out.print("Enter course 2 Grade  ===>>  ");
			courseGrade2 = keyboard.nextLine(); 
			System.out.print("enter course 2 Hours  ===>>  ");
			courseHours2 = keyboard.nextInt(); letterGrade = keyboard.nextLine();
			System.out.print("Enter course 3 Grade  ===>>  ");
			courseGrade3 = keyboard.nextLine(); 
			System.out.print("enter course 3 Hours  ===>>  ");
			courseHours3 = keyboard.nextInt(); letterGrade = keyboard.nextLine();
			System.out.print("Enter course 4 Grade  ===>>  ");
			courseGrade4 = keyboard.nextLine(); 
			System.out.print("enter course 4 Hours  ===>>  ");
			courseHours4 = keyboard.nextInt(); letterGrade = keyboard.nextLine();
	}
		
		
		public static void computeGPA() 
		{
			courseMark1=Grades.gradeValue(courseGrade1); //the coursemark is determind using gradeValue method
			courseMark2=Grades.gradeValue(courseGrade2);
			courseMark3=Grades.gradeValue(courseGrade3);
			courseMark4=Grades.gradeValue(courseGrade4);
			courseValue1 = Grades.courseValue(courseMark1, courseHours1); //the coursecalue is calculated using courseValue
			courseValue2 = Grades.courseValue(courseMark2, courseHours2);
			courseValue3 = Grades.courseValue(courseMark3, courseHours3);
			courseValue4 = Grades.courseValue(courseMark4, courseHours4);
			totalValue = courseValue1 + courseValue2 + courseValue3 + courseValue4; //total course value is calculated
			totalHours = courseHours1 + courseHours2 + courseHours3 + courseHours4; //total course hours is calculated
			gpa=Grades.getGPA(totalValue, totalHours);
		}
	
		public static void displayData() //displaying the GPA including the input from the user
		{
		System.out.println();
		System.out.println("Course1 Grade: " + courseGrade1 +  "  Course1 Credit Hours: " + courseHours1);
		System.out.println("Course2 Grade: " + courseGrade2 +  "  Course2 Credit Hours: " + courseHours2);
		System.out.println("Course3 Grade: " + courseGrade3 +  "  Course3 Credit Hours: " + courseHours3);
		System.out.println("Course4 Grade: " + courseGrade4 +  "  Course4 Credit Hours: " + courseHours4);
		System.out.println("Current GPA: " +gpa);
		}
}
