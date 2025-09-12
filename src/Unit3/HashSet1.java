package Unit3;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        HashSet<String> hs1 = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in hs: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            hs.add(sc.next());
        }
        System.out.println("Enter number of element in hs1: ");
        int m = sc.nextInt();

        for(int i=0;i<m;i++){
            hs1.add(sc.next());
        }

        System.out.println(hs);
        System.out.println(hs1);
//        hs1.removeAll(hs);
//        System.out.println(hs1);
        hs1.removeIf(str->str.contains("a"));
        System.out.println(hs1);
    }
}
