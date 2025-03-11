/*
Problem Statement:
Given 2D String array need to take the average of the marks if the same student present int List.
If No then return the Best / Highest Average .
* */

import java.util.*;

public class BestAverage {

    public static void main(String[] args) {
        String[][] studList={
                {"Guru","80.56"},
                {"Prasad","90.59"},
                {"Guru","75.6"},
                {"Raj","65.90"}
        };

        Map<String, List<Double>> map=new HashMap<>();
        Double maxValue=0.0;
        String name="";

        for(String[] stud:studList){
            map.putIfAbsent(stud[0],new ArrayList<>());
            map.get(stud[0]).add(Double.parseDouble(stud[1]));
        }

        for (Map.Entry<String,List<Double>> entry:map.entrySet()){
            List<Double> list=entry.getValue();
            double result=list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            map.put(entry.getKey(), Collections.singletonList(result));

            if(maxValue<result){
                maxValue=result;
                name=entry.getKey();
            }
        }
        System.out.println("Best Average: "+maxValue);
        System.out.println("Name of Student: "+name);
    }

}
