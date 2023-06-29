abstract class mobileDetails{
    abstract  void camera();
    abstract  void callFunction();
    abstract  void mp3Player();

}
class  vivoCenter extends mobileDetails{

    @Override
    void camera() {
        System.out.println("Click button to captaure the photo");

    }

    @Override
    void callFunction() {
        System.out.println("Calling  function impliment");
        System.out.println("Ringing....");
    }

    @Override
    void mp3Player() {
        System.out.println("Music player ....");
    }
}
class RealmeCenter extends  mobileDetails{

    @Override
    void camera() {
        System.out.println(" Realme mobile Click button to captaure the photo");

    }

    @Override
    void callFunction() {
        System.out.println(" Realme mobile Calling  function impliment");
        System.out.println("Ringing....");
    }

    @Override
    void mp3Player() {
        System.out.println("Realme mobile Music player ....");

    }
}
public class AbstractClasses {
    public static void main(String[] args) {
      vivoCenter vivo =new vivoCenter();
      RealmeCenter realme=new RealmeCenter();

      vivo.callFunction();
      vivo.camera();
      vivo.mp3Player();
      realme.callFunction();
      realme.camera();
      realme.mp3Player();

    }
}
