package Methods;

import java.util.Scanner;

public class primeNumber {

    //method for checking prime number
    public boolean IsPrime(int a){
        //checking for 1 and negative number
        if(a<2){
            System.out.println("Enter a valid positive number which is greater than 1");
            return false ;
        }
        //int isprime = 1;
        for (int i =2;i<=(a*a);i++){
            if(a%i==0){
//isprime =0;
                return false;

            }
        }
      //  if (isprime!=0)
            return true;
//        else
//            return false;
    }
    //main method

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        primeNumber pn = new primeNumber();
        boolean bIsprime = pn.IsPrime(iNum);
        if(bIsprime)
            System.out.println(iNum+" is a prime number");
        else if(iNum>=2)
            System.out.println(iNum+" is not a  prime number");
    }
}
