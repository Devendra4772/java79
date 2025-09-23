package Unit2;

public class Thread2 extends Thread {
    public void run() {
        for(int i=0;i<10;i++){
//            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
