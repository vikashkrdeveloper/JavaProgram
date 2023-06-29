class  goodMorning1 extends  Thread{
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");

        }
    }
}
class Welcome1 extends  Thread{
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");

        }
    }
}
public class ThreadDealy{
    public static void main(String[] args) {
        goodMorning1 t1=new goodMorning1();
        Welcome1 t2=new Welcome1();
        t1.start();
        t2.start();
    }
}
