package com.kumar.test;

import java.util.*;

public class ObjectSorting {
    public static void main(String[] args) {
        int[] arr = {9,4,13,17,8,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"Zebra","Apple","Superman","Batman","IronMan"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        List<String> fruits = new ArrayList<>();
        fruits.add("Jackfruit");
        fruits.add("Raspberry");
        fruits.add("Grapes");
        fruits.add("Bananas"); //if banana in small , then it prints in last. interesting!
        fruits.add("Watermelon");

        Collections.sort(fruits);
        for(String fruit: fruits)
            System.out.print(" "+ fruit);

        System.out.println();

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("1","John","Adams",50,100);
        employees[1] = new Employee("2","James","Madison", 49,105);
        employees[2] = new Employee("3","James","Monroe", 49,105);
        employees[3] = new Employee("4","Abraham","Lincoln", 52,96);

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees,new EmployeeFirstNameComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });

        System.out.println(Arrays.toString(employees));
    }
}
