package DailyPracticeFromSheet;

//1.	Check Even or Odd Number

import java.util.Scanner;

public class evenodd {

    public boolean EvenOdd(int a){
        if(a%2==0)
            return true;
        else
            return false;
    }

    //main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int iNum = sc.nextInt();
        evenodd eo = new evenodd();
        boolean res = eo.EvenOdd(iNum);
        if (res)
            System.out.println(iNum+" is a even number...");
        else
            System.out.println(iNum+" is not a even number...");

    }
}
