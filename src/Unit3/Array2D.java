package Unit3;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int d[][]=new int[r][c];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }

        }

        System.out.println("Enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();}System.out.println();

        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }System.out.println();

        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();

        }
        }
}
