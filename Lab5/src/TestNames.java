
import java.util.Scanner;

public class TestNames {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Name firstName,secondName;
		
		String first1,middle1,last1;
		String first2, middle2, last2;
		
		System.out.print("First name of the first person:");
		first1 = scan.nextLine();
		System.out.print("Middle name of the first person:");
		middle1 = scan.nextLine();
		System.out.print("Last name of the first person:");
		last1 = scan.nextLine();
		
		System.out.print("First name of the second person:");
		first2 = scan.nextLine();
		System.out.print("Middle name of the second person:");
		middle2 = scan.nextLine();
		System.out.print("Last name of the second person:");
		last2 = scan.nextLine();
		
		firstName = new Name(first1,middle1,last1);
		secondName = new Name(first2,middle2,last2);
		
	
		
		System.out.println("First Person: ");
		System.out.println(firstName.firstMiddleLast());
		System.out.println(firstName.lastFirstMiddle());
		System.out.println(firstName.initials());
		System.out.println(firstName.length());
		
		
		System.out.println("Second Person: ");
		System.out.println(secondName.firstMiddleLast());
		System.out.println(secondName.lastFirstMiddle());
		System.out.println(secondName.initials());
		System.out.println(secondName.length());
		
		System.out.println("Are the names the same? " + firstName.equals(secondName));
	}
}
