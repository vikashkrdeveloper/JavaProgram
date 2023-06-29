class monkey1{
    void jump(){
        System.out.println("This is a jump classes");
    }
    void bite(){
        System.out.println("This is a bite classes ");
    }
}
interface BasicAnimals1{
    void eat();
    void sleep();
}
class Human1 extends monkey1 implements BasicAnimals1{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("I am a Animal to eating this food");
    }

    @Override
    public void sleep() {
        System.out.println("I am a animal to sleeping ....");
    }
}
public class Demostract{
    public static void main(String[] args) {
        monkey1 hm=new Human1();
/*//        hm.eat();
    //    hm.speak();
//        hm.sleep();
This line throws an error this is a polymorphism
*/
        hm.jump();
        hm.bite();

    }
}
