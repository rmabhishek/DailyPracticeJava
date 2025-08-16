package DailyPracticeFromSheet;


import java.util.Scanner;

public class largestOfTwo {

    public int Biggest(int a,int b){
        if (a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        largestOfTwo lot = new largestOfTwo();
        int res = lot.Biggest(iNum1,iNum2);
        System.out.println("Biggest number is: "+res);
    }
}
