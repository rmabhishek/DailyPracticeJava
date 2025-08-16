package Methods;

import  java.util.Scanner;

public class sumOfTwoNumber {

    public int SumOf(int x, int y){
        int isum = x+y;
        return  isum;
    }

    public static void main(String[] args){
        System.out.println("Enter two number: ");
        Scanner sc =new Scanner(System.in);
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        sumOfTwoNumber sot = new sumOfTwoNumber();
        int sum = sot.SumOf(iNum1,iNum2);
        System.out.println("Sum of given number is: "+ sum);
    }
}
