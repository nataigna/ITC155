import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestcaseAssignment3 {

	@Test

	public void test() {

		ArrayList<Integer> numberList = new ArrayList<Integer>(); 

		

		numberList.add(1);

		numberList.add(1);

		numberList.add(2);

		numberList.add(2);

		numberList.add(3);

		numberList.add(3);

		numberList.add(4);

		numberList.add(5);

		numberList.add(6);

		numberList.add(7);

	

		assertEquals(Assignment3.countUnique(numberList), 7);

		

	}

}
