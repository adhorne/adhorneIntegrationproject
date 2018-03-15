Integ. Pdi 2 
public class whileloop {

	public static void main(String[] args) {
		int counter = 0;
		
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}
	}

}

public class forloop {

	public static void main(String[] args) {
		for(int counter=1;counter<=10;counter++) {
			System.out.println(counter);
		}

	}

}

public class Stringbuilder {

	public static void main(String[] args) {
		
		        String palindrome = "Racecar";
		         
		        StringBuilder sb = new StringBuilder(palindrome);
		        
		        sb.reverse();  // reverse it
		        
		        System.out.println(sb);
		    }
		}
		
		
	
