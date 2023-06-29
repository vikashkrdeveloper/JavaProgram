
class Constructor{
    String Name;
    //Constructor method using
   String getName(){
       return Name;
   }
}
class Derived extends Constructor{//It is inheritances methods
    int id;
    int Salary;
    Derived(String Name,int id ,int Salary){ //It is a constructor methods for inheritance
      this.Name=Name;
      this.id=id;
      this.Salary=Salary;
    }
    int getId(){
        return id;
    }
    int getSalary(){
        return Salary;
    }
}
public class ConstructorToInheritance {
    public static void main(String[] args) {

    String Name="vikash kumar";
    int id=1;
    int Salary=60000;
         Derived dv=new Derived(Name,id,Salary);
        System.out.println(dv.getName());
        System.out.println(dv.getId());
        System.out.println(dv.getSalary());
    }
}
