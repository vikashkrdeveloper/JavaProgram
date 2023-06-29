package Oops.src;
class Employees{
    String Name;
    int Salary;
    String getName(){
       return Name;
    }
    int getSalary(){
        return Salary;
    }
    String setName( String changeName){
        return Name=changeName;
    }

}
public class first_question_solved {
    public static void main(String[] args) {
        Employees vikash=new Employees();
        vikash.Name="vikash kumar";
        vikash.Salary=50000;
  System.out.println(vikash.getName());
        System.out.println(vikash.getSalary());
        System.out.println(vikash.setName("vikashkumar"));

    }
}
