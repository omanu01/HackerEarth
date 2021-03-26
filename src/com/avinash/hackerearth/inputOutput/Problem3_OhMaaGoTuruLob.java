package com.avinash.hackerearth.inputOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem3_OhMaaGoTuruLob {

    public static void main (String [] avi){

        Scanner s = new Scanner(System.in);
        int testCount = s.nextInt();
        int smallFlg=0, bigFlg =0;
        Set<Character> bigSet = new HashSet<>();
        Set<Character> smallSet = new HashSet<>();
        for(int i=0; i<testCount;i++) {
            String name = s.next();
            //String name = br.readLine();
            //name = name.toLowerCase();
            if (name.contains("a"))
                smallSet.add('a');
            if (name.contains("e"))
                smallSet.add('e');
            if (name.contains("i"))
                smallSet.add('i');
            if (name.contains("o"))
                smallSet.add('o');
            if (name.contains("u"))
                smallSet.add('u');

            if (name.contains("A"))
                bigSet.add('A');
            if (name.contains("E"))
                bigSet.add('E');
            if (name.contains("I"))
                bigSet.add('I');
            if (name.contains("O"))
                bigSet.add('O');
            if (name.contains("U"))
                bigSet.add('U');

            if (smallSet.size() >= 5 || bigSet.size() >= 5) {
                System.out.println("lovely string");
            } else {
                System.out.println("ugly string");
            }
        }
    }
}
