package com.kumar.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LogStorageSystem {
    List<String[]> timestamps = new LinkedList<>();

    public static void main(String[] args) {
        LogStorageSystem lss = new LogStorageSystem();
        lss.put(1, "2017:01:01:23:59:59");
        lss.put(2, "2017:01:01:22:59:59");
        lss.put(3, "2016:01:01:00:00:00");
        lss.put(4, "2018:01:02:00:00:00");

        System.out.println(lss.retrieve("2016:01:01:01:01:01","2018:01:01:23:00:00","Year"));
        System.out.println(lss.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour"));


   }

    public void put(int id, String timestamp) {
        timestamps.add(new String[]{Integer.toString(id), timestamp});
        //System.out.println("content of string array:"+ Arrays.toString(timestamps.get(0)));
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        List<Integer> res = new LinkedList<>();

        List<String> units = Arrays.asList("Year", "Month", "Day", "Hour", "Minute", "Second");
        int[] indices = new int[]{4,7,10,13,16,19};
        int idx = indices[units.indexOf(gra)];
        //System.out.println("idx:"+ idx);
        for (String[] timestamp : timestamps) {
//            System.out.println("timestamp[1]:"+timestamp[1]);
//            System.out.println("timestamp[1].substring(0, idx):" + timestamp[1].substring(0, idx));
//            System.out.println("s.substring(0, idx)"+ s.substring(0, idx));
//            System.out.println("timestamp[1].substring(0, idx)" + timestamp[1].substring(0, idx));
//            System.out.println("e.substring(0, idx)" + e.substring(0, idx));
//            System.out.println("Integer.parseInt(timestamp[0])"+ Integer.parseInt(timestamp[0]));
            if (timestamp[1].substring(0, idx).compareTo(s.substring(0, idx)) >= 0 &&
                    timestamp[1].substring(0, idx).compareTo(e.substring(0, idx)) <= 0) res.add(Integer.parseInt(timestamp[0]));
        }
        return res;
    }
}
