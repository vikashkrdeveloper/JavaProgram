class Sub{
void phone(){
    System.out.println("I am a phone");
}
 void Smartphone(){
    System.out.println("I am a smart phone.....");
}
}
 class SuperSub extends Sub{
@Override
void Smartphone(){
    System.out.println("I am a smart phone");
}

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Sub obj =new SuperSub();
        obj.phone();
        obj.Smartphone();
    }
}