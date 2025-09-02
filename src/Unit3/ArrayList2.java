package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            product.add(sc.next());
        }
        Collections.sort(product);
        Iterator itr=product.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        product.add(1,"Apple");
        product.addLast("Banana");
        product.addFirst("Orange");
        System.out.println(product.get(1));
    }
}
