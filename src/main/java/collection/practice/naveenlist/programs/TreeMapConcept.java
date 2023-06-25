package collection.practice.naveenlist.programs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer,String> employeeMap = new TreeMap<>();

		employeeMap.put(100,"Aditya");
		employeeMap.put(2000,"darshana");
		employeeMap.put(1400,"Namdeo");
		employeeMap.put(3000,"Sanjay");
		employeeMap.put(5000,"Rahul");

		employeeMap.forEach((k,v)-> System.out.println("key ="+ k +"value ="+ v));

		System.out.println(employeeMap.lastKey());
		System.out.println(employeeMap.firstKey());
/*
    To find key less than 3000
 */
		Set<Integer> keyLessThan3000 =employeeMap.headMap(3000).keySet();

		System.out.println(keyLessThan3000);


		/* to find key greater than 2000
		 */
		Set<Integer> keyGreaterThan3000 =employeeMap.tailMap(2000).keySet();

		System.out.println(keyGreaterThan3000);

		/* if you want to print the reverse order then use comparator as below
		 */

		TreeMap<String,Integer> languageMap = new TreeMap<>(Comparator.reverseOrder());

		languageMap.put("java",11);
		languageMap.put("javascript",12);
		languageMap.put("python",3);
		languageMap.put("selenese",5);

		System.out.println(languageMap);

	}

}
