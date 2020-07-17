package com.leonardo.learning.searchs;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(60);
        numbers.add(83);
        numbers.add(17);
        numbers.add(59);

        //Unsorted list
        for(int n : numbers){
            System.out.print(n +", ");
        }

        //Sorted list
        //sortList(numbers);
        System.out.println();
        Collections.sort(numbers);  //Java built-in to sort Lists.
        for(int n : numbers){
            System.out.print(n +", ");
        }

    }

    public static void sortList(int[] list) {

        int index;
        for(int i = 0; i < list.length - 1; i++) {  //"-1" because the last element will be correct.

            index = i;
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] < list[index]) {
                    index = j;
                }
            }

            //swap(list, index, i); //That's a method that is not implemented yet.
        }
    }
}
