package Methods;

import java.util.Scanner;



public class productOfTwo {

    public static int calprod(int x, int y){
        int result = x*y;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = calprod(a,b);
        System.out.println("Product of two number is : " + prod);
    }
}
