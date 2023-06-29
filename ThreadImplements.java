
class T1 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("Hello vikash");
        }
        }



}
class  T2 implements  Runnable{
    public void run(){
        while (true) {
            System.out.println("Hello vikash kumar");
        }
    }
}
public class ThreadImplements {
    public static void main(String[] args) {
        T1 t=new T1();
        Thread th=new Thread(t);
        T2 t1=new T2();
        Thread th2=new Thread(t1);
        th.start();
        th2.start();
    }
}
