package com.kumar.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindItinerary {
    public static void main(String[] args) {
        FindItinerary itinerary = new FindItinerary();
        Cities c1 = new Cities("ABC","NYK");
        Cities c2 = new Cities("NYK","CHI");
        Cities c3 = new Cities("CHI","SF");
        List<Cities> citiesList = new ArrayList<>();
        citiesList.add(c1);
        citiesList.add(c2);
        citiesList.add(c3);
        itinerary.printItinerary(citiesList);
    }

    public void printItinerary(List<Cities> citiesList){
        Map<String,String> citiesMap = new HashMap<>();
        for(Cities c: citiesList){
            citiesMap.put(c.source,c.dest);
        }

        String start = "";
        //find the starting point by checking which key doesn't exists in the value
        for(Map.Entry<String,String> entry : citiesMap.entrySet()){
            if(!citiesMap.containsValue(entry.getKey())){
                start = entry.getKey();
            }
        }

        System.out.print(start);
        for(int i=0; i<citiesMap.size();i++) {
            System.out.print("->" + citiesMap.get(start));
            start = citiesMap.get(start);
        }

    }

}


class Cities{
    public String source;
    public String dest;

    public Cities(String source, String dest){
        this.source = source;
        this.dest = dest;
    }
}




