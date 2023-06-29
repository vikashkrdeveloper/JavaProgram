class Cylinders{
    private int radius;
    private int height;
    void setRadius(int Radius){
        radius=Radius;
    }
    int getRadius(){
        return radius;
    }
    double getVolumeOfCylinder(){
        return 3.14*radius*radius*height;
    }
    void setHeight(int Height){
        height=Height;

    }
    int getHeight(){
        return height;
    }

}
public class volume_of_cylinder_calculate{
    public static void main(String[] args) {
        Cylinders Cy=new Cylinders();
        Cy.setHeight(3);
        Cy.setRadius(5);
        System.out.println("volume 0f cylinder is : "+Cy.getVolumeOfCylinder());

    }
}

