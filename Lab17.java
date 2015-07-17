
//Lab 17: The Student Records File Program
// Amir Mousavi  
// 04/03/2014  
// AP Computer Science  
  
import java.io.*;  
import java.text.DecimalFormat;  
  
public class Lab17 {  
    public static void main(String args[]) throws IOException {  
        System.out.println("\nLab17 -- The Student Records File Program\n");  
        DecimalFormat df = new DecimalFormat("00.000");   //the Decimal format
        File f1 = new File("students.dat");  
        File f2 = new File("passing.dat");  
        File f3 = new File("honors.dat");  
        f2.delete();  
        f3.delete();  
        int age = 0;  //all variables declared
        double gpa = 0;  
        String name = null; 
        int TotalStudent=0;
        double averAge=0;
        double averGPA=0;
        if (f1.exists())  //if the file exists...
        {  
            FileReader inFile = new FileReader(f1);  
            BufferedReader inStream = new BufferedReader(inFile);  
            String inString;  
            
            while((inString = inStream.readLine()) != null) //if there is no more line, the loop stops
            { 		  
            	
            	{
            		name=inString;  				//displays name
            		TotalStudent++;                 //number of names added
            	}
            	inString = inStream.readLine();   
            	age=Integer.parseInt(inString);   //converts age   
            		      
            	inString = inStream.readLine();   
            	gpa=Double.parseDouble(inString);   //converts gpa   
            	
                averAge+=age;                      //the ages are added
                averGPA+=gpa;                      //the GPAs are added
            
            	System.out.println("Name: " + name);  //eveything is displayed
            	System.out.println("Age: " + age);   
            	System.out.println("GPA: " +gpa); 
            	System.out.println("..."); 
            	System.out.println(); 
            }
 
            inStream.close();   
        	System.out.println("Total students records:  " + TotalStudent);  //displays number of people
        	System.out.println("Average student age:     "+df.format(averAge/TotalStudent)); //displays average age
        	System.out.println("Average student GPA:     "+df.format(averGPA/TotalStudent)); //displays average gpa
        } 
        else  //if file does not exist...
        {  
            System.out.println(f1.getName() + " does not exist");  
        }  
        System.out.println();  
    }  
}  
