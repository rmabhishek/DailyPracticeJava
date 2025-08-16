package Methods;

import java.util.Scanner;
public class factorial  {
    //method to calculate factorial
    public static int countFact(int a){
        //checking for negative value
        if (a<0){
            System.out.println("Enter a positive vailid number");
            return 0;
        }
        else {
            //counting factorial
            int factorial = 1;
            for (int i = a; i > 0; i--) {
                factorial *= i;
            }

            return factorial;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum= sc.nextInt();
       long factorial = countFact(iNum);
        if(factorial !=0) {
            System.out.println("Factorial of number " + iNum + "is : " + factorial);
        }
    }
}
