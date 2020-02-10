package com.company;

import java.util.LinkedList;

public class Dolls {

    /*
    *   you have a collection of Babushka dolls and they are going to be stock
        up to decrease the amount of space. We need an algorithm which
        will decrease the space that the rag doll takes up. base on the size of the dolls.
    */
    public static Integer dolls(int[] dolls){
        int count = 0;
        LinkedList<Integer> dollStock = new LinkedList<Integer>();
        for (int i = 0; i < dolls.length; i++){
            for (int j = i; j < dolls.length; j++) {
                if (dolls[i] == dolls[j]) {
                    count += 1;
                }
            }
            dollStock.add(count);
            count = 0;
        }
        int max = 0;
        for (Integer elem : dollStock) {
            if(elem > max) {
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
