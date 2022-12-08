package com.tsioncode;
public class Loop2 {
    public static void main(String[] args) {
        tsion://using for loop and labeled continue statement
        for(int n =2; n<5;++n){
            System.out.println("n value's are "+n);
            for(int m=1;m<3;m++){
                if(m>2)
                   continue tsion;
                System.out.println("the value of m are  "+m);

            }
        }
    }
}
