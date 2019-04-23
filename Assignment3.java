import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment3 {


	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList();

		numberList.add(3);
		numberList.add(7);
		numberList.add(3);
		numberList.add(-1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(7);
		numberList.add(2);
		numberList.add(15);
		numberList.add(15);
		
		System.out.println("Values in the list: "+ numberList);
		
		System.out.println(countUnique(numberList));
	}
		
	public static int countUnique(ArrayList<Integer> numbers) {
	
		Set<Integer> uniqueNumbers = new HashSet<Integer>(); 

				uniqueNumbers.addAll(numbers); 

				int countUnique = 0;

				for (Iterator<Integer> iterator = uniqueNumbers.iterator(); iterator.hasNext();) {
					Integer i = iterator.next();
					countUnique++;
				}


				return countUnique;

		}

	{

}
}
