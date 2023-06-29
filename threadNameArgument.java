class c1 extends Thread{
    public c1(String Name ){
        super("vikash kumar");
    }

    @Override
    public void run() {
        System.out.println("Sort Methods to print ");
    }
}
class c2 extends  Thread{

    @Override
    public void run() {
        System.out.println("vikash  jbxhjbd");
    }
}
public class threadNameArgument {
    public static void main(String[] args) {
        c1 c=new c1("vikash kumar");
        c2 c3=new c2();
        c.start();
        c3.start();
        System.out.println(c.getName());
        System.out.println(c.getId());
        System.out.println(c3.getId());
    }
}
