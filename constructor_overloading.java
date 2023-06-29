
class Constructors{
    public String Name;
    public int id;
    public int Salary;

    //To be declared by the constructor overloading
    public Constructors(String name, int ids){//This statement is constructor
        Name=name;
        id=ids;
        Salary= 50000;
    }

    public Constructors( int ids,int salary){//This statement is constructor
        Name="EasyLearnVikash";
        id=ids;
        Salary= salary;
    }

    public Constructors(String name, int ids,int salary){//This statement is constructor
        Name=name;
        id=ids;
        Salary= salary;
    }
}
public class constructor_overloading {
    public static void main(String[] args) {
        Constructors constr=new Constructors("Vikash kumar",2,60000);
        Constructors constrs=new Constructors(3,55000);
        Constructors constres=new Constructors("Vikash kumar",4);
        System.out.println("Constructor overloading first Start");

        System.out.println("Constructor overloading first details : "+constr.Name);
        System.out.println("Constructor overloading first details  : "+constr.id);
        System.out.println("Constructor overloading first details : "+constr.Salary);

        System.out.println("Constructor overloading second Start");

        System.out.println("Constructor overloading second details : "+constrs.Name);
        System.out.println("Constructor overloading second details : "+constrs.id);
        System.out.println("Constructor overloading second details : "+constrs.Salary);

        System.out.println("Constructor overloading third Start");

        System.out.println("Constructor overloading third details : "+constres.Name);
        System.out.println("Constructor overloading third details : "+constres.id);
        System.out.println("Constructor overloading third details : "+constres.Salary);

    }
}
