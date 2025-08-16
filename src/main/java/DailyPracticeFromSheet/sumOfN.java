package DailyPracticeFromSheet;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number: ");
        int num= sc.nextInt();
        int sum =0;
        for (int i =0;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum is: "+sum);
    }
}
