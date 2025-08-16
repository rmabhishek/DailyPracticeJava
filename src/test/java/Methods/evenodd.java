package Methods;

import java.util.Scanner;

public class evenodd {
    //method to say number is odd or even
    public static boolean Evenodd(int a){
        if(a%2==0) {
            return true;
        }
        else {
            return false;
            }
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int iNum= sc.nextInt();
        boolean result = Evenodd(iNum);
        if(true)
            System.out.println(iNum+" is a even number!!!!");
        else
            System.out.println(iNum+" is a odd number!!!");
    }
}
