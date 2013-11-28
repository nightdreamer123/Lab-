
import java.util.Scanner;

public class Compare3Test {

    public static void main(String args[]){
    
        String first, second, third;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the first parameter?: ");
        first = scan.nextLine();
        System.out.print("What is the second parameter?: ");
        second = scan.nextLine();
        System.out.print("What is the third parameter?: ");
        third = scan.nextLine();

        System.out.print("The largest of the three is: " + 
                Compare3.largest(first,second,third));

    }
}
