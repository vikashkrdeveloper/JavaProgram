 abstract class Employee{
abstract  void greet();
Employee(){
    System.out.println("Hello Abstract");
}
 Employee(int a){
    System.out.println("hello vikash "+a);
}
}

class to extends Employee{
    void  vk(){
        System.out.println("dfds");

    }
    to(){
        super(5);
        
        System.out.println("gfkfgmb n bn bnvc b");

    }
    void greet() {

        System.out.println("hello greate abstract method ");
    }

}
public class First {
    public static void main(String[] args) {
        to t=new to();
        t.greet();

    }
}
