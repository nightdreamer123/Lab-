
public class Compare3 {
	
	public static String largest(String first, String second, String third){
		
		if ((first.length()> second.length()) && (first.length() > third.length())){
			return first;
		}
		else if ((second.length()> first.length()) && (second.length() > third.length())){
			return second;
		}
		else {
			return third;
		}
	}
}

