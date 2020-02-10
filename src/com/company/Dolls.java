package com.company;

import java.util.*;

public class Dolls {

    /*
    *   you have a collection of Babushka dolls and they are going to be stock
        up to decrease the amount of space. We need an algorithm which
        will decrease the space that the rag doll takes up. base on the size of the dolls.
    */
    public static Integer dolls(int[] dolls){
        int count = 0;
        Map<Integer, Integer> dollStock = new HashMap<Integer, Integer>();
        for (int i = 0; i < dolls.length; i++){
            if (dollStock.containsKey(dolls[i])) {
                continue;
            } else {
                for (int j = i; j < dolls.length; j++) {
                    if (dolls[i] == dolls[j]) {
                        dollStock.put(dolls[i], count += 1);
                    }
                }
            }
            count = 0;
        }
        Integer max = 0;
        Set dollSet = dollStock.entrySet();
        Iterator iter = dollSet.iterator();
        while (iter.hasNext()) {
            Map.Entry me = (Map.Entry) iter.next();
            Integer elem = (Integer) me.getValue();
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] test = new int[] {1,2,3,4,3,2,4,5};
        System.out.println(Dolls.dolls(test));
    }


}
