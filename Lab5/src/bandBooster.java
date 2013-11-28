
import java.util.Scanner;

public class bandBooster {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			
		BandBoosterClass firstBB,secondBB;
		
		firstBB = new BandBoosterClass();
		secondBB = new BandBoosterClass();
		
		
		System.out.print("Name of the first band booster:");
		firstBB.newBandBooster(scan.nextLine());
		System.out.print("Name of the second band booster:");
		secondBB.newBandBooster(scan.nextLine());
	
		
		System.out.print("This is the second week: \nEnter the number of boxes sold by " + firstBB.getName() + " this week:");
		firstBB.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + secondBB.getName() + " this week:");
		secondBB.updateSales(scan.nextInt());
		
		System.out.print("This is the 2nd week: \nEnter the number of boxes sold by " + firstBB.getName() + " this week:");
		firstBB.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + secondBB.getName() + " this week:");
		secondBB.updateSales(scan.nextInt());
		
		System.out.print("This is the 3rd week: \nEnter the number of boxes sold by " + firstBB.getName() + " this week:");
		firstBB.updateSales(scan.nextInt());
		System.out.print("Enter the number of boxes sold by " + secondBB.getName() + " this week:");
		secondBB.updateSales(scan.nextInt());
		
		System.out.println("\n"+firstBB.toString());
		System.out.println(secondBB.toString());
	}

}
