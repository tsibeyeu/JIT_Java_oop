package com.tsioncode;
public class Loop3 {
    public static void main(String[] args) {
        int t=6;//using break with do while loop.
        do{
            System.out.println(" t = "+t);
            if(t%2!=0){
                break;
            }
            t++;
        }
        while(t>3);
    }
}