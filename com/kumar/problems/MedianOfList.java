package com.kumar.problems;

import java.util.ArrayList;
import java.util.List;

public class MedianOfList {
    public static void main(String[] args) {
        MedianOfList medianOfList = new MedianOfList();
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        System.out.println(medianOfList.median(values));
    }

    public double median (List<Integer> a){
        int middle = a.size()/2;

        if (a.size() % 2 == 1) {
            return a.get(middle);
        } else {
            return (a.get(middle-1) + a.get(middle)) / 2.0;
        }
    }
}
