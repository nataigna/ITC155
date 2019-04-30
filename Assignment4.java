   

import java.util.Collection;

import java.util.HashMap;

import java.util.HashSet;

import java.util.Map;

import java.util.Set;




public class Assignment4 {

	public static void main(String[] args) {

		// create two maps and populate it

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




		System.out.println(isUnique(namesMap));
		System.out.println(namesMap);

		System.out.println(isUnique(peopleMap));
		System.out.println(peopleMap);
		


	}


	public static boolean isUnique(Map<String, String> humanMap) {

		Collection<String> name = humanMap.values();

		Set<String> men = new HashSet<String>();

		for (String key : name) {

			men.add(key);

		}
		
		return men.size() == name.size();

	}



}