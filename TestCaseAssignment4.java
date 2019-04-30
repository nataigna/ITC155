import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class TestCaseAssignment4 {

	@Test
	void test() {
		
		Map<String, String> namesMap = new HashMap<String, String>();

		Map<String, String> peopleMap = new HashMap<String, String>();

		


		namesMap.put("Marty", "Stepp");

		namesMap.put("Stuart", "Reges");

		namesMap.put("Jessica", "Miller");

		namesMap.put("Amanda", "Camp");

		namesMap.put("Hal", "Perkins");




		peopleMap.put("Kendrick", "Perkins");

		peopleMap.put("Stuart", "Reges");

		peopleMap.put("Jessica", "Miller");

		peopleMap.put("Bruse", "Reges");

		peopleMap.put("Hal", "Perkins");
		
		assertTrue(Assignment4.isUnique(namesMap));
		
	}

}
