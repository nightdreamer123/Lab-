
public class BandBoosterClass {

	private String name;
	private int boxesSold;

	public void newBandBooster (String newName){
		name = newName;
		boxesSold = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public void updateSales(int additionalBoxesSold){
		boxesSold += additionalBoxesSold;
	}
	
	public String toString(){
		return name + ": " + boxesSold + " boxes";
	}

}
