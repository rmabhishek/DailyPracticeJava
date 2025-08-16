package DailyPracticeFromSheet;
//7.	Count the Total Number of Vowels in a String


import java.util.Scanner;

public class vowelInString {
    //method for counting vowel
    public int VowelsCountInString(String s){
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' )
                count++;
        }
        return count;
    }

    //main method
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a String: ");
        String s ="welcome to Java Selenium Automation" ;
        vowelInString vis = new vowelInString();
        int count = vis.VowelsCountInString(s);
        System.out.println("Total number of vowels present in String is: "+count);
    }
}
