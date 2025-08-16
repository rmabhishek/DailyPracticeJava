package DailyPracticeFromSheet;

import java.util.Scanner;

public class revstring {

    //method for reversing
    public  String StringReverse(String x){
        String rev="";
        for (int i =x.length()-1;i>=0;i--){
            rev=rev+x.charAt(i);
        }
        return rev;
    }

//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        revstring rs = new revstring();
        String revstring = rs.StringReverse(s);
        System.out.println("After Reversing String ");
        System.out.println(revstring);
    }
}
