package com.tsioncode;
public class Loop1 {
    public static void main(String[] args) {
        int i =2;
        int j =1;
        // display i & j using continue statement and nested while loop.
        while(i<6){
            System.out.println("the value of i are  " +i);
        while(j<10){

            if(j%2!=0){
                j++;
                continue;
            }
            System.out.println("the j value are even "+j);
                j++;
        }
            i++;
    }
}
}
