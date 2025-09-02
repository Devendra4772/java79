package Unit1;

public class CollegeStudent extends Student {
    public CollegeStudent(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class(){
        System.out.println(name +" Attend Class on Smart Board");
    }
    public void give_exam(){
        System.out.println(name +" Give Exam in Online mode");
    }
}
