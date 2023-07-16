package collection.practice.naveenlist.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConversionHashMapArrayList {
	
	public static void main(String[] args) {
		
		
		Map<String,Integer> companyMap =Collections.synchronizedMap(new HashMap<>());
		
		companyMap.put("google",10000);
		companyMap.put("facebook",30000);
		companyMap.put("Capgemini",50000);
		companyMap.put("cognizant",80000);
		companyMap.put("Infosys",90000);
		companyMap.put("Intex",25000);
		companyMap.put("Nvdia",40000);
		
		Iterator<Entry<String,Integer>> it = companyMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String,Integer> entry = it.next();
			System.out.println("the key is "+entry.getKey()+" "+"And the value is"+" "+entry.getValue());
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	
		
		//Alternate way for a iterator
		
		Iterator r = companyMap.entrySet().iterator();
		
		while(r.hasNext())
		{
			
			Map.Entry pair =(Map.Entry)r.next();
			
			System.out.println("the key is"+pair.getKey()+" "+"the value is"+pair.getValue());
		}
		
		
		/*
		 * Converting HashMap in to ArrayList
		 */
		
		ArrayList<String> list   = new ArrayList<>(companyMap.keySet());
		
	      for(String e: list)
	      {
	    	  System.out.println(e);
	      }
	      
	      System.out.println("########################################################################################################");
	      
	      ArrayList<Integer> valueList   = new ArrayList<>(companyMap.values());
			
	      for(Integer e: valueList)
	      {
	    	  System.out.println(e);
	      }
		
	      

		
	}

}
