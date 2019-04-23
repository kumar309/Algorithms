package com.kumar.problems;

import java.util.*;

public class Insurance {

    public static void main(String[] args) {
        Insurance ins = new Insurance();
        Map<String,Double> agentCommissionMap = new HashMap<>();
        agentCommissionMap.put("Agent Bob", 2.0);
        agentCommissionMap.put("Super Agent A",3.25);
        agentCommissionMap.put("Super Agent C",2.25);
        agentCommissionMap.put("Super Agent D",2.75);
        agentCommissionMap.put("Super Agent X",2.5);
        agentCommissionMap.put("Super Agent Z",1.75);

        String[] h1 = {"Agent Bob","Super Agent X","Super Agent A","Super Agent C"};
        String[] h2 = {"Agent Bob","Super Agent A","Super Agent X","Super Agent D","Super Agent Z"};

        double[] planA = {50,5};
        double[] planB = {70,8,4};

        double result = ins.getTotalCommission(100000,h1,planA,agentCommissionMap);
        System.out.println("planA:" +result);

        double result1 = ins.getTotalCommission(100000,h2,planB,agentCommissionMap);
        System.out.println("planB:" +result1);
    }


    public double getTotalCommission(double amt, String[] hierarchy, double[] planType,Map<String,Double> commission){
        double result = 0;

        for(int i=0;i<planType.length;i++){
            double commAgent = commission.get(hierarchy[i])/100;
            double plan = planType[i]/100;

            result+= plan * commAgent * amt;

        }

        return  result;
    }
}
