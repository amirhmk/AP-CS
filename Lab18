// The Student Records Algorithm Program
// Amir Mousavi
// 06/03/2014
// AP Computer Science

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Lab18 {
	public static void main(String args[]) throws IOException { //displays the output
		List studentArray = new List(100);
		studentArray.getList();
		studentArray.display("UNSORTED LIST OF STUDENTS");
		studentArray.pause();

		studentArray.gpaSort();
		studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
		studentArray.pause();

		studentArray.ageSort();
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY AGE");
		studentArray.pause();

		studentArray.idSort();
		studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID#");
		studentArray.pause();

		 int studentID = getID(); 
		 int index = studentArray.search(studentID);
				
		 if (index == -1)
		 System.out.println("There is no student with an ID# of "+studentID+".\n");
		 else
		 {
		 studentArray.displayStudent(index, studentID); // displays the information for the found student
		 studentArray.pause();
		 studentArray.delete(index); // remove the same student from the array
		 studentArray.display("STUDENTS SORTED IN ASCENDING ORDER BY ID# WITHOUT STUDENT# "+studentID);
		 studentArray.pause();
		 }
	}

	public static int getID() { //user is asked to write ID
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 6-digit ID of the student.  { 100000 - 999999 }  -->  ");
		return input.nextInt();
	}
}

class Person { //variables declared
	public String name;
	public int id;
	public int age;
	public double gpa;

	Person(String n, int ID, int a, double g) {
		name = n;
		id = ID;
		age = a;
		gpa = g;
	}
}

class List {
	private Person student[]; // stores array elements
	private int capacity; // actual array capacity
	private int size; // number of elements in the array

	public List(int c) {
		capacity = c;
		size = 0;
		student = new Person[capacity];
	}

	public void getList() throws IOException { //the list is transfered
		FileReader inFile = new FileReader("students18.dat");
		BufferedReader inStream = new BufferedReader(inFile);
		String s1, s2, s3, s4;
		int age, id;
		double gpa;
		int index = 0;
		while (((s1 = inStream.readLine()) != null)
				&& ((s2 = inStream.readLine()) != null)
				&& ((s3 = inStream.readLine()) != null)
				&& ((s4 = inStream.readLine()) != null)) {
			String name = s1;
			id = Integer.parseInt(s2);
			age = Integer.parseInt(s3);
			gpa = Double.parseDouble(s4);

			student[index] = new Person(name, id, age, gpa);
			index++;
		}
		inStream.close();
		size = index;
	}

	private String spaces(String name) {
		int tab = 24 - name.length();
		String temp = "";
		for (int j = 1; j <= tab; j++)
			temp += " ";
		return temp;
	}

	public void display(String listInfo) { //the students are displayed
		DecimalFormat output = new DecimalFormat("0.000");
		System.out.println("\nDISPLAYING " + listInfo);
		System.out
				.println("\nStudent ID#     Student Name            Age         GPA");
		System.out
				.println("============================================================");

		for (int k = 0; k < size; k++)
			System.out.println(student[k].id + "          " + student[k].name
					+ spaces(student[k].name) + student[k].age + "          "
					+ output.format(student[k].gpa));
	}

	public void pause() {  //the pause where to user has to press <enter>
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		String dummy;
		System.out.println("\nPress <Enter> to continue.");
		dummy = input.nextLine();
	}

	public void displayStudent(int index, int studentID)  //the record of one student is shown
	{
		System.out.println();
		System.out.println("Student Record for ID# " +studentID);
		System.out.println();
		System.out.println("Name: " +student[index].name);
		System.out.println("Age:  "+student[index].age);
		System.out.println("GPA:  " +student[index].gpa);
	}

	private void swap(int x, int y) //the swapping, which is for sorting
	{
		Person temp = student[x]; 
		student[x] =  student[y]; 
		student[y] =  temp;
	}

	public void gpaSort()  //sorted by gpa
	{
		for (int p = 1; p < size; p++) 
			for (int q = 0; q < size-1; q++) 
			if (student[q].gpa < student[q+1].gpa) 
			swap(q,q+1);
	}

	public void ageSort() //sorted by age
	{
		for (int p = 1; p < size; p++) 
			 for (int q = 0; q < size-1; q++) 
			 if (student[q].age > student[q+1].age) 
			 swap(q,q+1);
	}

	public void idSort()  //sprted by id
	{
		for (int p = 1; p < size; p++) 
			 for (int q = 0; q < size-1; q++) 
			 if (student[q].id > student[q+1].id) 
			 swap(q,q+1);
	}

	 public int search(int studentID) // the search method
	 {
		 boolean found = false; 
		 int k = 0; 
		 while (k < size && !found) 
		 { 
			 if (student[k].id == studentID) //if found, found turns to true
				 found = true; 
			 else    //if not found, it goes to next index
		         k++; 
		 } 
		 if (found) 
			 return k; 
		 else 
			 return -1; 

	 }

	public void delete(int index) {  //delete the elemt that was searched for
			 student[index] = student[index+1]; 
			 size--;
	}
}
