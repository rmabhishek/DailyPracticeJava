package Methods;

import java.util.*;

public class tableOfaNumber {
    //method for displaying a table
    public void Table(int a){
        for (int i=1;i<11;i++){
            System.out.println(a + "*"+ i + "=" + a*i);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();

        //declaring object
        tableOfaNumber ton = new tableOfaNumber();
        ton.Table(iNum);
    }
}
