class monkey{
    void jump(){
        System.out.println("This is a jump classes");
    }
    void bite(){
        System.out.println("This is a bite classes ");
    }
}
interface BasicAnimals{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimals{
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
public class Question3 {
    public static void main(String[] args) {
        Human hm=new Human();
        hm.eat();
        hm.jump();
        hm.bite();
        hm.speak();
        hm.sleep();
    }
}
