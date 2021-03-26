package com.avinash.BXTest;

import java.util.*;

public class TriangleCration implements  Comparable{
    public static void main(String [] args){

        //String name = "avinash kumar";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace(" ","");
        //char[] cArr = input.toCharArray();
        //Arrays.sort(cArr);
        Map<Character, Integer> charCountMp = new HashMap<>();


        for(int i=0; i<input.length();i++){
            if(charCountMp.containsKey(input.charAt(i))){
                charCountMp.put(input.charAt(i), charCountMp.get(input.charAt(i))+1);
            }else{
                charCountMp.put(input.charAt(i),1);

            }
        }

        for(Map.Entry<Character,Integer> e : charCountMp.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
