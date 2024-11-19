package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //Collection collection= new ArrayList<>();
        //a
        int N=10;
        Integer[] array = new Integer[N];
        for (int i = 0; i < N; ++i) {
            array[i]=(int) (Math.random() * 101);
        }
        System.out.println("a: " + Arrays.toString(array));
        //b
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        System.out.println("b: " + list);
        //c
        Collections.sort(list);
        System.out.println("c: " + list);
        //d
        Collections.reverse(list);
        System.out.println("d: " + list);
        //e
        Collections.shuffle(list);
        System.out.println("e: " + list);
        //f
        Collections.rotate(list,1);
        System.out.println("f: " + list);
        //g
        List<Integer> unEqueList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) == 1) {
                unEqueList.add(num);
            }
        }
        List<Integer> list1 = new ArrayList<>(list);
        list.clear();
        list.addAll(unEqueList);
        System.out.println("g: " + list);
        //h
        list.clear();
        //Collections.copy(list,list1);
        //list=(ArrayList<Integer>) ((ArrayList<Integer>) list1).clone();
        list.addAll(list1);
        List<Integer> equeList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1) {
                equeList.add(num);
            }
        }
        list.clear();
        list.addAll(equeList);
        System.out.println("e: " + list);
        //i
        Integer[] array1 = new Integer[list1.size()];
        Collections.copy(Arrays.asList(array1), list1);
        System.out.println("a: " + Arrays.toString(array1));
        //j
        list.clear();
        for (Integer num : array) {
            if(!list.contains(num)) {
                System.out.println(num + " : " + Collections.frequency(List.of(array), num));
                list.add(num);
            }
        }

    }
}