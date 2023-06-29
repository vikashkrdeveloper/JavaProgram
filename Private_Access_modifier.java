class AccessModifiers{
    private String Name;
    private int  salary;
    void setName(String name){
        Name=name;
    }
    String getName(){
        return Name;

    }
    void setSalary(int Salary){
        salary=Salary;

    }
    int getSalary(){
        return salary;
    }
}
public class Private_Access_modifier {
    public static void main(String[] args) {
        AccessModifiers Access=new AccessModifiers();
//        Access.Name="vikash kumar";
//        Access.salary=5000;  it's line will be through an error because this name will be private Access modifier
        String Name="vikash kumar";
        Access.setName(Name);
        System.out.println(Access.getName());
        int Salary=50000;
        Access.setSalary(Salary);
        System.out.println(Access.getSalary());

    }
}
