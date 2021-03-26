package com.avinash.hackerearth.inputOutput;

import java.util.Scanner;

public class SeatingArrengement_Problem2 {
    public static void main(String [] avi){

        Scanner s = new Scanner(System.in);
        int testCaseNum = s.nextInt();
        int initWSNum = 1;//1,6,7,12,13,18,19,24,25,30,31,36,37
        int initMSNum = 2;//2,5,8,11,14,17,20,23,26,29,32,35,38
        int initASNum = 3;//3,4,9,10,15,16,21,22,27,28,33,34,39
        for(int i = 0; i < testCaseNum; i++){
            int seatNum = s.nextInt();
            if(seatNum==initWSNum || seatNum % 6 ==0 || seatNum % 6 ==1){
                if(seatNum%12 == 0){
                    System.out.println((seatNum-11)+" WS");
                }
                else if(seatNum%12 == 1){
                    System.out.println((seatNum+11)+" WS");
                }else if(seatNum%6 == 0){
                    System.out.println((seatNum+1)+" WS");
                }else if(seatNum%6 == 1){
                    System.out.println((seatNum-1)+" WS");
                }
            }else if(seatNum==initMSNum || seatNum % 6 ==2 || seatNum % 6 ==5){
                if(seatNum%12 == 11){
                    System.out.println((seatNum-9)+" MS");
                }else if(seatNum%12 == 2){
                    System.out.println((seatNum+9)+" MS");
                }else if(seatNum%12 == 8){
                    System.out.println((seatNum-3)+" MS");
                }else if(seatNum%12 == 5){
                    System.out.println((seatNum+3)+" MS");
                }
                //System.out.println(seatNum+" MS");
            }else if(seatNum==initASNum || seatNum % 6 ==3 || seatNum % 6 ==4){
                //System.out.println(seatNum+" MS");
                if(seatNum%12 == 10){
                    System.out.println((seatNum-7)+" AS");
                }else if(seatNum%12 == 3){
                    System.out.println((seatNum+7)+" AS");
                }else if(seatNum%12 == 9){
                    System.out.println((seatNum-5)+" AS");
                }else if(seatNum%12 == 4){
                    System.out.println((seatNum+5)+" AS");
                }
            }
        }
    }
}
