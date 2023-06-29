
class Constructor{
   public String Name;
   public int id;
    public int Salary;
    public Constructor(String name, int ids,int salary){//This statement is constructor
        Name=name;
        id=ids;
        Salary= salary;
    }
}
public class constructure {
    public static void main(String[] args) {
        Constructor constr=new Constructor("Vikash kumar",4,50000);
        System.out.println(constr.Salary);
    }
}
