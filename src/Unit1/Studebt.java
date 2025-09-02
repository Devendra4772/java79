package Unit1;

public class Studebt {
    int roll_no;
    String name;
    int age;

    Studebt(int r, String n,int age) {
        roll_no = r;
        name = n;
    }
    Studebt(Studebt s){
        roll_no = s.roll_no;
        name = s.name;
    }
    public void display() {
        System.out.println("Roll No: "+roll_no+" "+age);
        System.out.println("Name: " + name+" " +age);
    }
}
