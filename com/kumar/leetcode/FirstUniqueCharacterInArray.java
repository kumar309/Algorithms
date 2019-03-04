package com.kumar.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class FirstUniqueCharacterInArray {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> myMap = new LinkedHashMap<>();
        char[] c = s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            //Character c = s.char(i);
            if(!myMap.containsKey(c[i])){
                myMap.put(c[i],1);
            }else{
                count = myMap.get(c[i]);
                myMap.put(c[i],count+1);
            }
        }

        for(Character character: myMap.keySet() ){
            count++;
            if(myMap.containsValue(1)){

            }

        }
        return count;
    }
}