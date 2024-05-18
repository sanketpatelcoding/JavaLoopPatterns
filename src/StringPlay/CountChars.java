package StringPlay;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(s.length());
        char[] ch = s.toCharArray();
     //   System.out.println("your Strng is :"+ch.toString());

        for(char c:ch){
            System.out.print(c);

        }System.out.print(ch.length);


    }
}
