package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        String [] City = {"Paris", "London", "New York", "Stockholm"};

        Arrays.sort(City);


        for(String string : City){
            System.out.println(string);
        }
       // System.out.println( "Sorted Array :- " + Arrays.toString(City));
    }
}
