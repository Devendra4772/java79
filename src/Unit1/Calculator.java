package Unit1;

public class Calculator {
    double ar;

    public void Area(double a,double b){
        ar=a*b;
        System.out.println("Area of rectangle "+ar);
    }
    public void Area(double r){
        ar=Math.PI*r*r;
        System.out.println("Area of rectangle "+ar);
    }
    public void Area(double a,double b,double h){
        ar=2*(a*b+a*h+b*h);
        System.out.println("Area of rectangle "+ar);
    }
}
