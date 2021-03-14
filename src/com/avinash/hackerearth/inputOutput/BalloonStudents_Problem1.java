/* IMPORTANT: Multiple classes and nested static classes are supported */
//import for Scanner and other utility classes
package com.avinash.hackerearth.inputOutput;
//imports for BufferedReader
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * uncomment this if you want to read input.
 */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class BalloonStudents_Problem1 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int testNums = Integer.valueOf(name);    // Writing output to STDOUT
        for(int i=1; i<=testNums; i++){
            String RPBalPriceStr = br.readLine();
            //System.out.println(RPBalPrices);
            String RPBalPrices [] = RPBalPriceStr.split(" ");
            String stdNum= br.readLine();
            int problem1Count=0;
            int problem2Count=0;
            for(int j=1; j<=Integer.valueOf(stdNum); j++){
                String tmp = br.readLine();
                String[] arr = tmp.split(" ");
                if(arr[0].equals("1")){
                    problem1Count = problem1Count+1;
                }
                if(arr[1].equals("1")){
                    problem2Count = problem2Count+1;
                }

            }
            if(Integer.valueOf(RPBalPrices[0])>Integer.valueOf(RPBalPrices[1])){
                if(problem1Count>problem2Count){
                    System.out.println(Integer.valueOf(RPBalPrices[1])*problem1Count +Integer.valueOf(RPBalPrices[0])*problem2Count);
                }else{
                    System.out.println(Integer.valueOf(RPBalPrices[0])*problem1Count +Integer.valueOf(RPBalPrices[1])*problem2Count);
                }
            } else if(Integer.valueOf(RPBalPrices[0])<Integer.valueOf(RPBalPrices[1])){
                if(problem1Count>problem2Count){
                    System.out.println(Integer.valueOf(RPBalPrices[0])*problem1Count +Integer.valueOf(RPBalPrices[1])*problem2Count);
                }else{
                    System.out.println(Integer.valueOf(RPBalPrices[1])*problem1Count +Integer.valueOf(RPBalPrices[0])*problem2Count);
                }
            }else{
                System.out.println(Integer.valueOf(RPBalPrices[1])*problem1Count +Integer.valueOf(RPBalPrices[0])*problem2Count);
            }
            //System.out.println(problem1Count+" "+problem2Count);
        }
        // Write your code here

    }
}
