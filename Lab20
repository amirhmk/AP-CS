// Lab20.java: The Student Records Algorithm Program
// Amir Mousavi
// 19/03/14
// AP Computer Science 

import java.io.*;
import java.util.*;

public class Lab20 {
	public static void main(String args[]) throws IOException {
		List studentArray = new List(); //all the methods are called
		studentArray.getList();
		studentArray.checkIfEmpty();
		studentArray.pause();

		studentArray.display("UNSORTED LIST OF STUDENTS");
		studentArray.pause();

		studentArray.gpaSort();
		studentArray.display("STUDENTS SORTED IN DESCENDING ORDER BY GPA");
		studentArray.pause();

		Person thisPerson = getPerson();
		studentArray.insert(thisPerson);

		studentArray.display("STUDENTS SORTED BY GPA WITH NEW STUDENT ADDED");
		studentArray.pause();

		 studentArray.removeFailing();

		 studentArray.display("STUDENTS SORTED BY GPA WITH FAILING STUDENTS REMOVED");
		 studentArray.pause();

		int index = studentArray.search(thisPerson); //the results from search
		if (index == -1)
			System.out.println(thisPerson.name + " is not in the list.\n");
		else
			System.out.println(thisPerson.name + " is in the list at index "
					+ index + ".\n");

		studentArray.compareTop3();
		studentArray.removeAll();
		studentArray.checkIfEmpty();
	}

	public static Person getPerson() { //information of new student is given
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter name:  -->  ");
		String name = input.nextLine();
		System.out.print("Enter id:    -->  ");
		int id = input.nextInt();
		System.out.print("Enter age:   -->  ");
		int age = input.nextInt();
		System.out.print("Enter gpa:   -->  ");
		double gpa = input.nextDouble();
		return new Person(name, id, age, gpa);
	}
}

class Person {  //all variables declared
	public String name;
	public int id;
	public int age;
	public double gpa;

	Person(String n, int ID, int a, double g) { //the Person constructor
		name = n;
		id = ID;
		age = a;
		gpa = g;
	}
	public String toString(){//the method toString is altered
		 return "Name: "+name+ "\nID#:  " + id +"\nAge:  "+age+"\nGPA:  "+gpa+ "\n";
	}
	public boolean equals(Person temp)  //the equals method is altered
	{
		return this.age==temp.age && this.gpa==temp.gpa;
	}

}
class List {
	private ArrayList<Person> student;  //the arrayList is made
	 
	public List() {
		 student = new ArrayList<Person>(); 
		}

	public void getList() throws IOException { //the bat file is read
		// This methos is mostly finished. As it is, it will read in the
		// information from the file,
		// but it will not put the information into the ArrayList. You need to
		// add that part.

		FileReader inFile = new FileReader("students20.dat");
		BufferedReader inStream = new BufferedReader(inFile);
		int age, id;
		double gpa;
		String s1, s2, s3, s4;
		while (((s1 = inStream.readLine()) != null)
				&& ((s2 = inStream.readLine()) != null)
				&& ((s3 = inStream.readLine()) != null)
				&& ((s4 = inStream.readLine()) != null)) {
			String name = s1;
			id = Integer.parseInt(s2);
			age = Integer.parseInt(s3);
			gpa = Double.parseDouble(s4);
			student.add(new Person(name,id,age,gpa)); //infomation is added to the Arraylist
			@SuppressWarnings("unused")
			Person newKid = new Person(name, id, age, gpa);
			}
		inStream.close();
	}

	public void display(String listInfo) { //the information is displayed
		// This method requires that the toString method of the person class is
		// written
		
		System.out.println("\nDISPLAYING " + listInfo);
		System.out.println();

		for (int k = 0; k < student.size(); k++)
			System.out.println(student.get(k));
	  }

	public void pause() { //the program has a pause with this method
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		String dummy;
		System.out.println("\nPress <Enter> to continue.");
		dummy = input.nextLine();
	}

	private void swap(int x, int y) { //the swap for the sort method
		Person temp = (Person) student.get(x); 
		student.set(x,student.get(y)); 
		student.set(y,temp);
	}

	public void gpaSort() {
		// NOTE: This method is provided for you,
		// but it will not work if you have not written the swap method

		for (int p = 1; p < student.size(); p++)
			for (int q = 0; q < student.size() - p; q++) {
				Person thisOne = (Person) student.get(q);
				Person nextOne = (Person) student.get(q + 1);
				if (thisOne.gpa < nextOne.gpa)
					swap(q, q + 1);
			}
	}

	public int search(Person thisPerson) {//the search method, which search if thisPerson has a index
		return student.indexOf(thisPerson);
	}

	public void insert(Person newStudent) {//the new student is added to the Arraylist
		// precondition: The student list is not empty

		// NOTE: The 110 point version requires that the new student is inserted
		// into
		// its proper position in an ArrayList sorted by GPA in decending order.
		// All other versions, simply require that the new student is inserted
		// at the beginning of the list.
		student.add(0,newStudent);
	}

	public void removeFailing() {
		// HINT: Remember, the list will be sorted in DECENDING order.
		for (int p = 1; p < student.size(); p++)
			 {
				Person person = (Person) student.get(p); //if the gpa is less than 2
				if(person.gpa<2.00)                      //that index is deleted and 
				{                                        //and then next index is checked
					for (@SuppressWarnings("unused")
					int g = 0; p < student.size(); g++)
					student.remove(p);
				}
		}
	}
	public void removeAll() { //eveything is remved
		 student.clear(); 
	}
	public void compareTop3() { //compares students using the equals method
		// NOTE: This method is provided for you,
		// but it will not work if you have not written the equals method of the
		// Person class.

		Person first, second, third;
		first = (Person) student.get(0);
		second = (Person) student.get(1);
		third = (Person) student.get(2);

		if (first.equals(second))
			System.out.println(first.name + " and " + second.name
					+ " are equal.\n");
		if (first.equals(third))
			System.out.println(first.name + " and " + third.name
					+ " are equal.\n");
		if (third.equals(second))
			System.out.println(third.name + " and " + second.name
					+ " are equal.\n");
	}

	public void checkIfEmpty() { //checks to see if araylist is empty
		if (student.isEmpty()==false)
			System.out.print("This list is not empty.\n");
		else
			System.out.print("This list is empty.\n");
	}
}
