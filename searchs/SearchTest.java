package com.leonardo.learning.searchs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {

    public static void main(String[] args) {

        ArrayList<Airport> airports = new ArrayList<Airport>();

        airports.add(new Airport("galeao", "rj", "gru"));
        airports.add(new Airport("portela", "lisboa", "lis"));
        airports.add(new Airport("carneiro", "porto", "opo"));

        Collections.sort(airports);

        System.out.println(findAirportCodeBinary("portela", airports));
        //System.out.println(findAirportCodeLinear("portela", airports));

    }

    //That is a Linear Search
    public static String findAirportCodeLinear(String name, ArrayList<Airport> airport) {

        for(Airport airports : airport) {
            if(airports.getName().equals(name)) {
                return airports.getCode();
            }
        }

        return "Airport not found";
        //return null;

    }

    //That's a Binary Search
    public static String findAirportCodeBinary(String name, ArrayList<Airport> airport) {

        int low = 0;
        int high = airport.size() - 1;
        int mid;
        int compare;

        while(low <= high) {

            mid = (low + high)/2;
            compare = name.compareTo(airport.get(mid).getName());
            if(compare < 0 ) {
                high = mid - 1;
            }

            else if(compare > 0) {
                low = mid + 1;
            }

            else {
                return airport.get(mid).getCode();
            }
        }

        return "Airport not found";
        //return null;

    }

}
