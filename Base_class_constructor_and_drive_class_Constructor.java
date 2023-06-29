
class Base{
    String Name;
    Base(){
        System.out.println("This is a base Constructor");
    }
    Base(int a){


        System.out.println("This is a base constructor "+a);
    }
}

class Derives extends Base{
    int id;
    Derives(){
        super(8);//It is a calling a constructor overloaded
        System.out.println("This is a Derives Constructor");
    }

}
public class Base_class_constructor_and_drive_class_Constructor {
    public static void main(String[] args) {
Derives Der=new Derives();
    }
}
