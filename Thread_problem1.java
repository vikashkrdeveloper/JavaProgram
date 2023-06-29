class  goodMorning extends  Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Good Morning");

        }
    }
}
class Welcome extends  Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Welcome");

        }
    }
}
public class Thread_problem1 {
    public static void main(String[] args) {
    goodMorning t1=new goodMorning();
    Welcome t2=new Welcome();
    t1.start();
    t2.start();
    }
}
