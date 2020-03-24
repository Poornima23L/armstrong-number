package com.tgt.ignite.plus;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        int c=0,a,temp,n;
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        n = read.nextInt();
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c+=(a*a*a);
        }
        if(temp==c){
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
}
