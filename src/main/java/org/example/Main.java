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
        //b
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        System.out.println(list);
        //c
        Collections.sort(list);
        System.out.println(list);
        //d
        Collections.reverse(list);
        System.out.println(list);
        //e
        Collections.shuffle(list);
        System.out.println(list);
        //f
    }
}