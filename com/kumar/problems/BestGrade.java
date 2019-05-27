package com.kumar.problems;


import java.util.*;

//Coderpad: given an array scores [][] = {“jerry”,”65”},{“bob”,”91”}, {“jerry”,”23”}, {“Eric”,”83”}} Find the student with highest average score
public class BestGrade {

    public static void main(String[] args) {
        String student[][] = {{"jerry", "65"}, {"bob", "1"}, {"jerry", "23"}, {"jerry", "23"}, {"jerry", "100"}, {"Eric", "83"}};
        //Map counter = new HashMap();

        List<Integer> score = new ArrayList<>();

        Map<String, List> map = new HashMap<>();
        for (int i = 0; i < student.length; i++) {
            score.add(Integer.parseInt(student[i][1]));
            map.put(student[i][0], score);
        }

        List grade = new ArrayList();
        for (String key : map.keySet()) {
            score = map.get(key);
            int sum = 0;
            for (int num : score) {
                sum += num;
            }
            int average = sum / score.size();
            grade.add(average);
        }

        Collections.sort(grade);

        System.out.println(grade.get(grade.size() - 1));

    }


}


