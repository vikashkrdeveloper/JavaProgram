package Oops.src;
class Employee{
    String name;
    int id;
    int salary;

}
public class classes_defied {
    public static void main(String[] args) {
        Employee vikash=new Employee();//create new object on this class
        Employee vishal=new Employee();//create new object on this class

//        setting attribute for vikash  object
        vikash.name="vikash kumar";//seating attributes
        vikash.id=2;
vikash.salary=50000;
//        setting attribute for vishal object
        vishal.name="vishal kumar";
        vishal.id=3;
        vishal.salary=50000;
        System.out.println(vikash.name);
        System.out.println(vikash.id);
        System.out.println(vikash.salary);

        System.out.println(vishal.name);
        System.out.println(vishal.id);
        System.out.println(vishal.salary);



    }
}
