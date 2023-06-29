class My1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("I have Chat to my mom and dad");
        }
    }
}
class My2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("I have cook to my mom and dad");
        }
    }
}
public class threadingExtands {
    public static void main(String[] args) {
My1 m=new My1();
My2 m2=new My2();
m.start();
m2.start();
    }
}
