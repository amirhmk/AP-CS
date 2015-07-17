
public class Lab03 {

	/*********************************
	Lab03: The Time Display Program
    Name: Amir Mousavi
    Submitted: June 10, 2013
    Teacher: Christopher Slowley
	 *******************************/
	public static void main(String[] args) {
		
		int miliSecond = 10000123;
		System.out.print("10000123 miliseconds equals: ");
		System.out.println();
		System.out.println();
		System.out.print(miliSecond/3600000 + " hours");
		miliSecond = miliSecond %  360000;
		System.out.print(", " + miliSecond / 6000 + " minutes");
		miliSecond = miliSecond % 60000;
		System.out.print(", " + miliSecond /1000  + " seconds");
		miliSecond = miliSecond % 10000;
		System.out.print(", and " + miliSecond  + "  milisecond");
	}

}
