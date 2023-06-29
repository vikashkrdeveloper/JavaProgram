class methodOverriding{
    void A(){//This function is method overriding
        System.out.println(" not method overriding");
    }
}
class Derivesed extends methodOverriding{
void B(){
    System.out.println("Method");
}

    @Override
    void A() {//This function is method overriding
        System.out.println("Hello Method overriding");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
methodOverriding a=new methodOverriding();
Derivesed b=new Derivesed();
a.A();
b.A();
b.B();
    }
}
