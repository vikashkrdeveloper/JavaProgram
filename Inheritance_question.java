class Inheritance{
  private  String Name;
    void setName(String Name){
        this.Name=Name;
    }
    String getName(){
        return Name;
    }
}
class Derive extends Inheritance{//It is a inheritances  line of code inheritances use a extends new keyword
   private int id ;
    private int Salary;
    void setSalary(int Salary){
        this.Salary=Salary;
    }
    void  setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    int getSalary(){
        return Salary;
    }
}
public class Inheritance_question {
    public static void main(String[] args) {
        Derive derive=new Derive();
        derive.setName("vikash kumar");
        derive.setId(2);
        derive.setSalary(60000);

        System.out.println(derive.getName());
        System.out.println(derive.getId());
        System.out.println(derive.getSalary());
    }
}
