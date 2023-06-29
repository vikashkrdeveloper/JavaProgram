class Circle{
String name;
int id;
int Salary;

}
class Cylinder extends Circle{
    String CompanyName;
}
public class practices {
    public static void main(String[] args) {
        Cylinder cl=new Cylinder();
        cl.CompanyName="Google";
        cl.name="Vikash kumar";
        cl.id=2;
        cl.Salary=60000;
        System.out.println(cl.name);
        System.out.println(cl.CompanyName);
        System.out.println(cl.id);
        System.out.println(cl.Salary);
    }
}
