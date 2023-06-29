abstract class pen{
    abstract void write();
    abstract  void refill();
}
class  copy extends pen{

    @Override
    void write() {
        System.out.println("write the copy use this pen");
    }

    @Override
    void refill() {
        System.out.println("write the copy to end the pen refill to change the refill");
    }
}
class FountainPen extends pen{


    @Override
    void write() {

    }

    @Override
    void refill() {

    }
    void changeNib(){
        System.out.println("Change nib method.....");
    }
}
public class Question1 {
    public static void main(String[] args) {
        copy cpy=new copy();
        FountainPen ftp=new FountainPen();
        cpy.refill();
        cpy.write();
        ftp.changeNib();
    }
}
