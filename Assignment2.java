import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException {

	
		// create an array list and add some words

		ArrayList<String> words= new ArrayList<String>();

		words.add("hello");

		words.add("Nataliia");

		words.add("John");

		words.add("password");

		words.add("register");

		words.add("important");
		
		words.add("programming");
		
		words.add("Carlton");
		
		words.add("Katya");

		System.out.println(words);
		
		removeEvenLength(words);
		System.out.println(words);
		
    }
	
	//writing method which removes all strings with the same length
	
	public static void removeEvenLength(ArrayList<String> array) {

	    for (int i = 0; i < array.size(); i++) {
	        String words = array.get(i);
	        if (words.length() % 2 == 0) {
	         array.remove(i);
	           i--;
	     }
	  }
	    
	}
}