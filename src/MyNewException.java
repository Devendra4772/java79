public class MyNewException {
    public static void main(String[] args) {
        UserDefineException ue = new UserDefineException();
        try {
            ue.validate(19);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
