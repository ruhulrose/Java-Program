package Reversing;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number= input.nextInt();
        int n=0;
        int k= number;
        while(number!=0){
            n= n*10+(number%10);
            number=number/10;
        }
        System.out.print("The reversing value of "+k+" is "+n);
    }
}
