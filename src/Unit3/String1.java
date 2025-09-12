package Unit3;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
//        System.out.println(str.substring(0,4));
//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());
        if(str1.compareTo(str2)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
