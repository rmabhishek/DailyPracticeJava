package DailyPracticeFromSheet;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch+" is a vowel character");
                break;

            default:
                System.out.println(ch+" is a consonant character...");
        }

    }


}
