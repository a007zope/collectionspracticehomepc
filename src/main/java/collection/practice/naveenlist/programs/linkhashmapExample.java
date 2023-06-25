package collection.practice.naveenlist.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkhashmapExample {

	public static void main(String[] args) {

		Map<String,Integer> companyMap = new LinkedHashMap<>();

		companyMap.put("Google",45);
		companyMap.put("facebook",35);
		companyMap.put("Capgemini",89);
		companyMap.put("Ness",56);

		Iterator ir = companyMap.entrySet().iterator();

		while(ir.hasNext())
		{
			Map.Entry pair =  (Map.Entry)ir.next();

			System.out.println(pair.getKey()+"and"+pair.getValue());	        		   
		}
		

	}
}
