package collection.practice.naveenlist.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToArrayList {
/*
Conversion of Array to ArrayList
Method 1: Using Arrays.asList
 */
    public static void main(String[] args) {
        String [] p = {"Aditya","Sanjay","Zope"};

        ArrayList namelist = new ArrayList(List.of(p));

        List nl = Arrays.asList(p);

        System.out.println(nl);

        System.out.println(namelist);


        /*
        Method 2 : Using Collections.addAll() method
         */
        String [] nameArray = {"Aditya","Zope"};

        List<String> al = new ArrayList<>();

        Collections.addAll(al,nameArray);

        System.out.println(al);

        /*
         using manual method to convert array to arraylist using add() method
         */


        String [] compList = {"Capgemini","Cognizant"};
        List<String> compAL = new ArrayList<>();

        for(String r :compList)
        {
            compAL.add(r);


        }



    }
}
