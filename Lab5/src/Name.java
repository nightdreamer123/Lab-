
public class Name {
	
	private String first, middle, last;
	
	public Name(String firstName, String middleName, String lastName){
		first = firstName;
		middle = middleName;
		last = lastName;
	}

	public String getFirst(){
		return first;
	}
	
	public String getMiddle(){
		return middle;
	}
	
	public String getLast(){
		return last;
	}
	
	public String firstMiddleLast(){	
		return first + " " + middle + " "+ last;
	}
	
	public String lastFirstMiddle(){
		return last + ", " + middle + " "+ first;
	}
	
	public boolean equals(Name otherName){
		return firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
	}
	
	public String initials(){
		return (first.substring(0, 1).toUpperCase() + middle .substring(0, 1).toUpperCase() + last.substring(0, 1).toUpperCase()).toUpperCase();
	}
	
	public int length(){
		return first.length() + middle.length() + last.length();
	}
}
