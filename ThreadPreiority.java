class thr extends Thread{
    public thr(String Name){
        super(Name);
    }
    public void run (){
        int i=0;
        while (i<30) {
            System.out.println("Hello vikash kumar sharma " + this.getName());
            i++;
        }
    }
}
class thrs extends  Thread{
    @Override
    public void run() {
        int i=0;
        while (i<30) {

            System.out.println("Hello vikash kumar");
        i++;
        }
    }
}
public class ThreadPreiority {
    public static void main(String[] args) {
        thr  t1=new thr("vikash kumar");
        thrs t2=new thrs();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
    }

}
