abstract class Telephone{
   abstract void ring();
   abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("Ringing......");
    }

    @Override
    void lift() {
        System.out.println("Lifting.....");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting......");
    }
    void smartPhone(){
        System.out.println("I am a smartPhone...");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Telephone tl= new smartTelephone();
        tl.disconnect();
//        tl.smartPhone();//This is a polymorphism
    }
}
